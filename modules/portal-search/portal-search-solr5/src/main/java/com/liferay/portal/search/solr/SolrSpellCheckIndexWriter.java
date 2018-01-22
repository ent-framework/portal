/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.solr;

import com.liferay.portal.kernel.search.*;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortletKeys;
import org.apache.solr.client.solrj.SolrServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Daniela Zapata Riesco
 * @author David Gonzalez
 * @author Michael C. Han
 */
public class SolrSpellCheckIndexWriter
        extends BaseGenericSpellCheckIndexWriter {

    @Override
    public void clearQuerySuggestionDictionaryIndexes(
            SearchContext searchContext)
            throws SearchException {

        String deleteQuery = buildDeleteQuery(
                searchContext, SuggestionConstants.TYPE_QUERY_SUGGESTION);

        try {
            _solrServer.deleteByQuery(deleteQuery);

            if (_commit) {
                _solrServer.commit();
            }
        } catch (Exception e) {
            if (_log.isDebugEnabled()) {
                _log.debug(e.getMessage(), e);
            }

            throw new SearchException(e.getMessage(), e);
        }
    }

    @Override
    public void clearSpellCheckerDictionaryIndexes(SearchContext searchContext)
            throws SearchException {

        String deleteQuery = buildDeleteQuery(
                searchContext, SuggestionConstants.TYPE_SPELL_CHECKER);

        try {
            _solrServer.deleteByQuery(deleteQuery);

            if (_commit) {
                _solrServer.commit();
            }
        } catch (Exception e) {
            if (_log.isDebugEnabled()) {
                _log.debug(e.getMessage(), e);
            }

            throw new SearchException(e.getMessage(), e);
        }
    }

    public void setCommit(boolean commit) {
        _commit = commit;
    }

    public void setSolrServer(SolrServer solrServer) {
        _solrServer = solrServer;
    }

    protected void addQuerySeparator(StringBundler sb) {
        sb.append(StringPool.SPACE);
        sb.append(StringPool.PLUS);
    }

    protected void addQueryType(StringBundler sb, String type) {
        sb.append(Field.TYPE);
        sb.append(StringPool.COLON);
        sb.append(type);
    }

    protected String buildDeleteQuery(
            SearchContext searchContext, String type) {

        StringBundler sb = new StringBundler(14);

        sb.append(StringPool.PLUS);
        sb.append(Field.COMPANY_ID);
        sb.append(StringPool.COLON);
        sb.append(searchContext.getCompanyId());

        addQuerySeparator(sb);

        sb.append(Field.PORTLET_ID);
        sb.append(StringPool.COLON);
        sb.append(PortletKeys.SEARCH);

        addQuerySeparator(sb);

        addQueryType(sb, type);

        return sb.toString();
    }

    private static Logger _log = LoggerFactory.getLogger(
            SolrSpellCheckIndexWriter.class);

    private boolean _commit;
    private SolrServer _solrServer;

}