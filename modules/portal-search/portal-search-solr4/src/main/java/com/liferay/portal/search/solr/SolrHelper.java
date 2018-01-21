/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

import com.liferay.portal.kernel.search.BooleanClauseOccur;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.util.Version;

import java.util.Set;

/**
 * @author Bruno Farache
 * @author Shuyang Zhou
 * @author Andrea Di Giorgi
 */
public interface SolrHelper {

    public void addExactTerm(
            BooleanQuery booleanQuery, String field, String value);

    public void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Integer startValue,
            Integer endValue);

    public void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Long startValue,
            Long endValue);

    /**
     * @deprecated As of 6.2.0, replaced by {@link
     *             #addNumericRangeTerm(BooleanQuery, String, Long, Long)}
     */
    public void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, String startValue,
            String endValue);

    public void addRangeTerm(
            BooleanQuery booleanQuery, String field, String startValue,
            String endValue);

    public void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like);

    public void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String[] values, boolean like);

    public void addTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like);

    public void addTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like,
            BooleanClauseOccur booleanClauseOccur);

    public void addTerm(
            BooleanQuery booleanQuery, String field, String[] values, boolean like);

    public int countScoredFieldNames(Query query, String[] fieldNames);

    public Analyzer getAnalyzer();

    public Set<String> getQueryTerms(Query query);

    public Version getVersion();
}