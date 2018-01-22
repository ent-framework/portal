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
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.*;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.search.highlight.QueryTermExtractor;
import org.apache.lucene.search.highlight.WeightedTerm;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 * @author Harry Mark
 * @author Bruno Farache
 * @author Shuyang Zhou
 * @author Tina Tian
 * @author Hugo Huijser
 * @author Andrea Di Giorgi
 */
public class SolrHelperImpl implements SolrHelper {

    @Override
    public void addExactTerm(
            BooleanQuery booleanQuery, String field, String value) {

        addTerm(booleanQuery, field, value, false);
    }

    @Override
    public void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Integer startValue,
            Integer endValue) {

        NumericRangeQuery<?> numericRangeQuery = NumericRangeQuery.newIntRange(
                field, startValue, endValue, true, true);

        booleanQuery.add(numericRangeQuery, BooleanClause.Occur.SHOULD);
    }

    @Override
    public void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Long startValue,
            Long endValue) {

        NumericRangeQuery<?> numericRangeQuery = NumericRangeQuery.newLongRange(
                field, startValue, endValue, true, true);

        booleanQuery.add(numericRangeQuery, BooleanClause.Occur.SHOULD);
    }

    /**
     * @deprecated As of 6.2.0, replaced by {@link
     *             #addNumericRangeTerm(BooleanQuery, String, Long, Long)}
     */
    @Override
    public void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, String startValue,
            String endValue) {

        addNumericRangeTerm(
                booleanQuery, field, GetterUtil.getLong(startValue),
                GetterUtil.getLong(endValue));
    }

    @Override
    public void addRangeTerm(
            BooleanQuery booleanQuery, String field, String startValue,
            String endValue) {

        boolean includesLower = true;

        if ((startValue != null) && startValue.equals(StringPool.STAR)) {
            includesLower = false;
        }

        boolean includesUpper = true;

        if ((endValue != null) && endValue.equals(StringPool.STAR)) {
            includesUpper = false;
        }

        TermRangeQuery termRangeQuery = new TermRangeQuery(field, new BytesRef(startValue), new BytesRef(endValue), includesLower, includesUpper);

        booleanQuery.add(termRangeQuery, BooleanClause.Occur.SHOULD);
    }

    @Override
    public void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like) {

        addRequiredTerm(booleanQuery, field, new String[]{value}, like);
    }

    @Override
    public void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String[] values,
            boolean like) {

        if (values == null) {
            return;
        }

        BooleanQuery query = new BooleanQuery();

        for (String value : values) {
            addTerm(query, field, value, like);
        }

        booleanQuery.add(query, BooleanClause.Occur.MUST);
    }

    @Override
    public void addTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like) {

        addTerm(booleanQuery, field, value, like, BooleanClauseOccur.SHOULD);
    }

    @Override
    public void addTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like,
            BooleanClauseOccur booleanClauseOccur) {

        if (Validator.isNull(value)) {
            return;
        }

        Analyzer analyzer = getAnalyzer();

        if ("path".equals(field) || "tag".equals(field) || "treePath".equals(field) || "userName".equals(field) || field.startsWith("assetCategoryTitles") || "assetTagNames".equals(field) || "emailAddress".equals(field)) {
            like = true;
        }

        if (like) {
            value = StringUtil.replace(
                    value, StringPool.PERCENT, StringPool.BLANK);
        }

        try {
            QueryParser queryParser = new QueryParser(getVersion(), field, analyzer);

            value = StringUtil.replace(
                    value, _KEYWORDS_LOWERCASE, _KEYWORDS_UPPERCASE);

            Query query = queryParser.parse(value);

            BooleanClause.Occur occur = null;

            if (booleanClauseOccur.equals(BooleanClauseOccur.MUST)) {
                occur = BooleanClause.Occur.MUST;
            } else if (booleanClauseOccur.equals(BooleanClauseOccur.MUST_NOT)) {
                occur = BooleanClause.Occur.MUST_NOT;
            } else {
                occur = BooleanClause.Occur.SHOULD;
            }

            _includeIfUnique(booleanQuery, like, queryParser, query, occur);
        } catch (Exception e) {
            if (_log.isWarnEnabled()) {
                _log.warn(e.getMessage(), e);
            }
        }
    }

    @Override
    public void addTerm(
            BooleanQuery booleanQuery, String field, String[] values,
            boolean like) {

        for (String value : values) {
            addTerm(booleanQuery, field, value, like);
        }
    }

    @Override
    public int countScoredFieldNames(Query query, String[] filedNames) {
        int count = 0;

        for (String fieldName : filedNames) {
            WeightedTerm[] weightedTerms = QueryTermExtractor.getTerms(
                    query, false, fieldName);

            if ((weightedTerms.length > 0) &&
                    !ArrayUtil.contains(Field.UNSCORED_FIELD_NAMES, fieldName)) {

                count++;
            }
        }

        return count;
    }

    @Override
    public Analyzer getAnalyzer() {
        return _analyzer;
    }

    @Override
    public Set<String> getQueryTerms(Query query) {
        String queryString = StringUtil.replace(
                query.toString(), StringPool.STAR, StringPool.BLANK);

        Query tempQuery = null;

        try {
            QueryParser queryParser = new QueryParser(
                    getVersion(), StringPool.BLANK, getAnalyzer());

            tempQuery = queryParser.parse(queryString);
        } catch (Exception e) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to parse " + queryString);
            }

            tempQuery = query;
        }

        WeightedTerm[] weightedTerms = null;

        for (String fieldName : Field.KEYWORDS) {
            weightedTerms = QueryTermExtractor.getTerms(
                    tempQuery, false, fieldName);

            if (weightedTerms.length > 0) {
                break;
            }
        }

        Set<String> queryTerms = new HashSet<String>();

        for (WeightedTerm weightedTerm : weightedTerms) {
            queryTerms.add(weightedTerm.getTerm());
        }

        return queryTerms;
    }

    public Version getVersion() {
        return _version;
    }


    public void setAnalyzer(Analyzer analyzer) {
        _analyzer = analyzer;
    }

    public void setVersion(Version version) {
        _version = version;
    }


    private void _includeIfUnique(
            BooleanQuery booleanQuery, boolean like, QueryParser queryParser,
            Query query, BooleanClause.Occur occur) {

        if (query instanceof TermQuery) {
            Set<Term> terms = new HashSet<Term>();

            TermQuery termQuery = (TermQuery) query;

            termQuery.extractTerms(terms);

            float boost = termQuery.getBoost();

            for (Term term : terms) {
                String termValue = term.text();

                if (like) {
                    termValue = termValue.toLowerCase(queryParser.getLocale());

                    term = new Term( term.field(), StringPool.STAR.concat(termValue).concat(
                                    StringPool.STAR));

                    query = new WildcardQuery(term);
                } else {
                    query = new TermQuery(term);
                }

                query.setBoost(boost);

                boolean included = false;

                for (BooleanClause booleanClause : booleanQuery.getClauses()) {
                    if (query.equals(booleanClause.getQuery())) {
                        included = true;
                    }
                }

                if (!included) {
                    booleanQuery.add(query, occur);
                }
            }
        } else if (query instanceof BooleanQuery) {
            BooleanQuery curBooleanQuery = (BooleanQuery) query;

            BooleanQuery containerBooleanQuery = new BooleanQuery();

            for (BooleanClause booleanClause : curBooleanQuery.getClauses()) {
                _includeIfUnique(
                        containerBooleanQuery, like, queryParser,
                        booleanClause.getQuery(), booleanClause.getOccur());
            }

            if (containerBooleanQuery.getClauses().length > 0) {
                booleanQuery.add(containerBooleanQuery, occur);
            }
        } else {
            boolean included = false;

            for (BooleanClause booleanClause : booleanQuery.getClauses()) {
                if (query.equals(booleanClause.getQuery())) {
                    included = true;
                }
            }

            if (!included) {
                booleanQuery.add(query, occur);
            }
        }
    }

    private static final String[] _KEYWORDS_LOWERCASE = {
            " and ", " not ", " or "
    };

    private static final String[] _KEYWORDS_UPPERCASE = {
            " AND ", " NOT ", " OR "
    };

    private static final Logger _log = LoggerFactory.getLogger(SolrHelperImpl.class);

    private Analyzer _analyzer;
    private Version _version;


}