package com.liferay.portal.search.lucene.props;

public interface PropsKeys extends com.liferay.portal.kernel.util.PropsKeys {

    public static final String LUCENE_ANALYZER_MAX_TOKENS = "lucene.analyzer.max.tokens";

    public static final String LUCENE_BOOLEAN_QUERY_CLAUSE_MAX_SIZE = "lucene.boolean.query.clause.max.size";

    public static final String LUCENE_BUFFER_SIZE = "lucene.buffer.size";

    public static final String LUCENE_CLUSTER_INDEX_LOADING_SYNC_TIMEOUT = "lucene.cluster.index.loading.sync.timeout";

    public static final String LUCENE_CLUSTER_INDEX_LOADING_USE_CANONICAL_HOST_NAME = "lucene.cluster.index.loading.use.canonical.host.name";

    public static final String LUCENE_COMMIT_BATCH_SIZE = "lucene.commit.batch.size";

    public static final String LUCENE_COMMIT_TIME_INTERVAL = "lucene.commit.time.interval";

    public static final String LUCENE_DIR = "lucene.dir";

    public static final String LUCENE_FILE_EXTRACTOR = "lucene.file.extractor";

    public static final String LUCENE_FILE_EXTRACTOR_REGEXP_STRIP = "lucene.file.extractor.regexp.strip";

    public static final String LUCENE_MERGE_FACTOR = "lucene.merge.factor";

    public static final String LUCENE_MERGE_POLICY = "lucene.merge.policy";

    public static final String LUCENE_MERGE_SCHEDULER = "lucene.merge.scheduler";

    public static final String LUCENE_REPLICATE_WRITE = "lucene.replicate.write";

    public static final String LUCENE_STORE_TYPE = "lucene.store.type";

    public static final String LUCENE_STORE_TYPE_FILE_FORCE_MMAP = "lucene.store.type.file.force.mmap";
}
