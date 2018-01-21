package com.liferay.portal.search.lucene;

import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.cluster.ClusterExecutorUtil;
import com.liferay.portal.kernel.cluster.ClusterLink;
import com.liferay.portal.kernel.cluster.ClusterRequest;
import com.liferay.portal.kernel.concurrent.ThreadPoolExecutor;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.executor.PortalExecutorManagerUtil;
import com.liferay.portal.kernel.messaging.BaseAsyncDestination;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.messaging.proxy.MessageValuesThreadLocal;
import com.liferay.portal.kernel.search.BaseSearchEngine;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.search.lucene.cluster.LuceneClusterUtil;
import com.liferay.portal.search.lucene.props.PropsValues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LuceneSearchEngine extends BaseSearchEngine {

    @Override
    public void startup(long companyId) {
        LuceneHelperUtil.startup(companyId);
    }

    @Override
    public void shutdown() {
        LuceneHelperUtil.shutdown();
    }

    @Override
    public void shutdown(long companyId) {
        LuceneHelperUtil.shutdown(companyId);

    }

    @Override
    public void delete(long companyId) {
        LuceneHelperUtil.delete(companyId);
    }

    @Override
    public void reindex(long companyId) {

        if (LuceneHelperUtil.isLoadIndexFromClusterEnabled()) {
			MessageValuesThreadLocal.setValue(ClusterLink.CLUSTER_FORWARD_MESSAGE, true);
		}

        Set<String> usedSearchEngineIds = new HashSet<String>();

        LuceneIndexer luceneIndexer = new LuceneIndexer(companyId);

        luceneIndexer.reindex();

        if (!LuceneHelperUtil.isLoadIndexFromClusterEnabled()) {
			return;
		}

        usedSearchEngineIds.addAll(luceneIndexer.getUsedSearchEngineIds());

        Set<BaseAsyncDestination> searchWriterDestinations =
                new HashSet<BaseAsyncDestination>();

        MessageBus messageBus = MessageBusUtil.getMessageBus();

        for (String usedSearchEngineId : usedSearchEngineIds) {
            String searchWriterDestinationName = SearchEngineUtil.getSearchWriterDestinationName(
                            usedSearchEngineId);

            Destination destination = messageBus.getDestination(
                    searchWriterDestinationName);

            if (destination instanceof BaseAsyncDestination) {
                BaseAsyncDestination baseAsyncDestination =
                        (BaseAsyncDestination)destination;

                searchWriterDestinations.add(baseAsyncDestination);
            }
        }

        submitClusterIndexLoadingSyncJob(searchWriterDestinations, companyId);
    }

    protected void submitClusterIndexLoadingSyncJob(Set<BaseAsyncDestination> baseAsyncDestinations, long companyId) {

        if (_log.isInfoEnabled()) {
            StringBundler sb = new StringBundler(
                    baseAsyncDestinations.size() + 1);

            sb.append("[");

            for (BaseAsyncDestination baseAsyncDestination :
                    baseAsyncDestinations) {

                sb.append(baseAsyncDestination.getName());
                sb.append(", ");
            }

            sb.setStringAt("]", sb.index() - 1);

            _log.info(
                    "Synchronizecluster index loading for destinations " +
                            sb.toString());
        }

        int totalWorkersMaxSize = 0;

        for (BaseAsyncDestination baseAsyncDestination :
                baseAsyncDestinations) {

            totalWorkersMaxSize += baseAsyncDestination.getWorkersMaxSize();
        }

        if (_log.isInfoEnabled()) {
            _log.info(
                    "There are " + totalWorkersMaxSize +
                            " synchronization threads");
        }

        CountDownLatch countDownLatch = new CountDownLatch(
                totalWorkersMaxSize + 1);

        ClusterLoadingSyncJob slaveClusterLoadingSyncJob =
                new ClusterLoadingSyncJob(companyId, countDownLatch, false);

        for (BaseAsyncDestination baseAsyncDestination :
                baseAsyncDestinations) {

            ThreadPoolExecutor threadPoolExecutor =
                    PortalExecutorManagerUtil.getPortalExecutor(
                            baseAsyncDestination.getName());

            for (int i = 0; i < baseAsyncDestination.getWorkersMaxSize(); i++) {
                threadPoolExecutor.execute(slaveClusterLoadingSyncJob);
            }
        }

        ClusterLoadingSyncJob masterClusterLoadingSyncJob =
                new ClusterLoadingSyncJob(companyId, countDownLatch, true);

        ThreadPoolExecutor threadPoolExecutor =
                PortalExecutorManagerUtil.getPortalExecutor(
                        LuceneSearchEngine.class.getName());

        threadPoolExecutor.execute(masterClusterLoadingSyncJob);
    }

    private static final Logger _log = LoggerFactory.getLogger(LuceneSearchEngine.class);

    private static MethodKey _loadIndexesFromClusterMethodKey = new MethodKey(LuceneClusterUtil.class, "loadIndexesFromCluster", long.class, Address.class);

    private static class ClusterLoadingSyncJob implements Runnable {

        public ClusterLoadingSyncJob(
                long companyId, CountDownLatch countDownLatch, boolean master) {

            _companyId = companyId;
            _countDownLatch = countDownLatch;
            _master = master;
        }

        @Override
        public void run() {
            _countDownLatch.countDown();

            String logPrefix = StringPool.BLANK;

            if (_log.isInfoEnabled()) {
                Thread currentThread = Thread.currentThread();

                if (_master) {
                    logPrefix =
                            "Monitor thread name " + currentThread.getName() +
                                    " with thread ID " + currentThread.getId();
                }
                else {
                    logPrefix =
                            "Thread name " + currentThread.getName() +
                                    " with thread ID " + currentThread.getId();
                }
            }

            if (!_master && _log.isInfoEnabled()) {
                _log.info(
                        logPrefix + " synchronized on latch. Waiting for others.");
            }

            try {
                if (_master) {
                    _countDownLatch.await();
                }
                else {
                    boolean result = _countDownLatch.await(
                            PropsValues.LUCENE_CLUSTER_INDEX_LOADING_SYNC_TIMEOUT,
                            TimeUnit.MILLISECONDS);

                    if (!result) {
                        _log.error(
                                logPrefix + " timed out. You may need to " +
                                        "re-trigger a reindex process.");
                    }
                }
            }
            catch (InterruptedException ie) {
                if (_master) {
                    _log.error(
                            logPrefix + " was interrupted. Skip cluster index " +
                                    "loading notification.",
                            ie);

                    return;
                }
                else {
                    _log.error(
                            logPrefix + " was interrupted. You may need to " +
                                    "re-trigger a reindex process.",
                            ie);
                }
            }

            if (_master) {
                Address localClusterNodeAddress =
                        ClusterExecutorUtil.getLocalClusterNodeAddress();

                ClusterRequest clusterRequest =
                        ClusterRequest.createMulticastRequest(
                                new MethodHandler(_loadIndexesFromClusterMethodKey, _companyId,
                                        localClusterNodeAddress),
                                true);

                try {
                    ClusterExecutorUtil.execute(clusterRequest);
                }
                catch (SystemException se) {
                    _log.error(
                            "Unable to notify peers to start index loading", se);
                }

                if (_log.isInfoEnabled()) {
                    _log.info(
                            logPrefix + " unlocked latch. Notified peers to " +
                                    "start index loading.");
                }
            }
        }

        private long _companyId;
        private CountDownLatch _countDownLatch;
        private boolean _master;

    }
}
