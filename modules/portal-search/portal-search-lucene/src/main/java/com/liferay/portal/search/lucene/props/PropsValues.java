package com.liferay.portal.search.lucene.props;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;

public class PropsValues {

    public static final boolean CLUSTER_LINK_ENABLED = GetterUtil.getBoolean(PropsUtil.get(com.liferay.portal.kernel.util.PropsKeys.CLUSTER_LINK_ENABLED));

    public static final String INDEX_DATE_FORMAT_PATTERN = PropsUtil.get(PropsKeys.INDEX_DATE_FORMAT_PATTERN);

    public static final boolean INDEX_DUMP_COMPRESSION_ENABLED = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_DUMP_COMPRESSION_ENABLED));

    public static final boolean INDEX_DUMP_PROCESS_DOCUMENTS_ENABLED = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_DUMP_PROCESS_DOCUMENTS_ENABLED));

    public static boolean INDEX_ON_STARTUP = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_ON_STARTUP));

    public static final int INDEX_ON_STARTUP_DELAY = GetterUtil.getInteger(PropsUtil.get(PropsKeys.INDEX_ON_STARTUP_DELAY));

    public static final boolean INDEX_ON_UPGRADE = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_ON_UPGRADE));

    public static boolean INDEX_READ_ONLY = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_READ_ONLY));

    public static final boolean INDEX_SEARCH_COLLATED_SPELL_CHECK_RESULT_ENABLED = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_SEARCH_COLLATED_SPELL_CHECK_RESULT_ENABLED));

    public static final int INDEX_SEARCH_COLLATED_SPELL_CHECK_RESULT_SCORES_THRESHOLD = GetterUtil.getInteger(PropsUtil.get(PropsKeys.INDEX_SEARCH_COLLATED_SPELL_CHECK_RESULT_SCORES_THRESHOLD));

    public static final int INDEX_SEARCH_LIMIT = GetterUtil.getInteger(PropsUtil.get(PropsKeys.INDEX_SEARCH_LIMIT));

    public static final boolean INDEX_SEARCH_QUERY_INDEXING_ENABLED = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_SEARCH_QUERY_INDEXING_ENABLED));

    public static final int INDEX_SEARCH_QUERY_INDEXING_THRESHOLD = GetterUtil.getInteger(PropsUtil.get(PropsKeys.INDEX_SEARCH_QUERY_INDEXING_THRESHOLD));

    public static final boolean INDEX_SEARCH_QUERY_SUGGESTION_ENABLED = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_SEARCH_QUERY_SUGGESTION_ENABLED));

    public static final int INDEX_SEARCH_QUERY_SUGGESTION_MAX = GetterUtil.getInteger(PropsUtil.get(PropsKeys.INDEX_SEARCH_QUERY_SUGGESTION_MAX));

    public static final int INDEX_SEARCH_QUERY_SUGGESTION_SCORES_THRESHOLD = GetterUtil.getInteger(PropsUtil.get(PropsKeys.INDEX_SEARCH_QUERY_SUGGESTION_SCORES_THRESHOLD));

    public static final boolean INDEX_WITH_THREAD = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.INDEX_WITH_THREAD));

    public static final int LUCENE_ANALYZER_MAX_TOKENS = GetterUtil.getInteger(PropsUtil.get(PropsKeys.LUCENE_ANALYZER_MAX_TOKENS));

    public static final int LUCENE_BUFFER_SIZE = GetterUtil.getInteger(PropsUtil.get(PropsKeys.LUCENE_BUFFER_SIZE));

    public static final long LUCENE_CLUSTER_INDEX_LOADING_SYNC_TIMEOUT = GetterUtil.getLong(PropsUtil.get(PropsKeys.LUCENE_CLUSTER_INDEX_LOADING_SYNC_TIMEOUT));

    public static final boolean LUCENE_CLUSTER_INDEX_USE_CANONICAL_HOST_NAME = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.LUCENE_CLUSTER_INDEX_LOADING_USE_CANONICAL_HOST_NAME));

    public static final int LUCENE_COMMIT_BATCH_SIZE = GetterUtil.getInteger(PropsUtil.get(PropsKeys.LUCENE_COMMIT_BATCH_SIZE));

    public static final int LUCENE_COMMIT_TIME_INTERVAL = GetterUtil.getInteger(PropsUtil.get(PropsKeys.LUCENE_COMMIT_TIME_INTERVAL));

    public static final String LUCENE_DIR = PropsUtil.get(PropsKeys.LUCENE_DIR);

    public static final String LUCENE_FILE_EXTRACTOR = PropsUtil.get(PropsKeys.LUCENE_FILE_EXTRACTOR);

    public static final String LUCENE_FILE_EXTRACTOR_REGEXP_STRIP = PropsUtil.get(PropsKeys.LUCENE_FILE_EXTRACTOR_REGEXP_STRIP);

    public static final int LUCENE_MERGE_FACTOR = GetterUtil.getInteger(PropsUtil.get(PropsKeys.LUCENE_MERGE_FACTOR));

    public static String LUCENE_MERGE_POLICY = PropsUtil.get(PropsKeys.LUCENE_MERGE_POLICY);

    public static String LUCENE_MERGE_SCHEDULER = PropsUtil.get(PropsKeys.LUCENE_MERGE_SCHEDULER);

    public static final boolean LUCENE_REPLICATE_WRITE = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.LUCENE_REPLICATE_WRITE));

    public static final String LUCENE_STORE_TYPE = PropsUtil.get(PropsKeys.LUCENE_STORE_TYPE);

    public static final boolean LUCENE_STORE_TYPE_FILE_FORCE_MMAP = GetterUtil.getBoolean(PropsUtil.get(PropsKeys.LUCENE_STORE_TYPE_FILE_FORCE_MMAP));

}
