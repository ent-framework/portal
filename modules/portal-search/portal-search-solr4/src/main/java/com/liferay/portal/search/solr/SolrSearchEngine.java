package com.liferay.portal.search.solr;

import com.liferay.portal.kernel.search.BaseSearchEngine;

public class SolrSearchEngine extends BaseSearchEngine {
    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    public void shutdown(long companyId) {
        super.shutdown(companyId);
    }

    @Override
    public void delete(long companyId) {
        super.delete(companyId);
    }

    @Override
    public void reindex(long companyId) {

        SolrIndexer solrIndexer = new SolrIndexer(companyId);
        solrIndexer.reindex();
    }
}
