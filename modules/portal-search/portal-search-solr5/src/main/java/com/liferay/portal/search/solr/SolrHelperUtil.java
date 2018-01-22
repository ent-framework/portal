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

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.util.GetterUtil;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;

import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 * @author Harry Mark
 * @author Bruno Farache
 * @author Shuyang Zhou
 * @author Andrea Di Giorgi
 */
public class SolrHelperUtil {

    public static void addExactTerm(
            BooleanQuery booleanQuery, String field, boolean value) {

        addExactTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addExactTerm(
            BooleanQuery booleanQuery, String field, double value) {

        addExactTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addExactTerm(
            BooleanQuery booleanQuery, String field, int value) {

        addExactTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addExactTerm(
            BooleanQuery booleanQuery, String field, long value) {

        addExactTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addExactTerm(
            BooleanQuery booleanQuery, String field, short value) {

        addExactTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addExactTerm(
            BooleanQuery booleanQuery, String field, String value) {

        getSolrHelper().addExactTerm(booleanQuery, field, value);
    }

    public static void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, int startValue, int endValue) {

        getSolrHelper().addNumericRangeTerm(
                booleanQuery, field, startValue, endValue);
    }

    public static void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Integer startValue,
            Integer endValue) {

        getSolrHelper().addNumericRangeTerm(
                booleanQuery, field, startValue, endValue);
    }

    public static void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, long startValue,
            long endValue) {

        getSolrHelper().addNumericRangeTerm(
                booleanQuery, field, startValue, endValue);
    }

    public static void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Long startValue,
            Long endValue) {

        getSolrHelper().addNumericRangeTerm(
                booleanQuery, field, startValue, endValue);
    }

    public static void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, short startValue,
            short endValue) {

        getSolrHelper().addNumericRangeTerm(
                booleanQuery, field, (long) startValue, (long) endValue);
    }

    public static void addNumericRangeTerm(
            BooleanQuery booleanQuery, String field, Short startValue,
            Short endValue) {

        getSolrHelper().addNumericRangeTerm(
                booleanQuery, field, GetterUtil.getLong(startValue),
                GetterUtil.getLong(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, int startValue, int endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, String.valueOf(startValue),
                String.valueOf(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, Integer startValue,
            Integer endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, String.valueOf(startValue),
                String.valueOf(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, long startValue,
            long endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, String.valueOf(startValue),
                String.valueOf(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, Long startValue,
            Long endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, String.valueOf(startValue),
                String.valueOf(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, short startValue,
            short endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, String.valueOf(startValue),
                String.valueOf(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, Short startValue,
            Short endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, String.valueOf(startValue),
                String.valueOf(endValue));
    }

    public static void addRangeTerm(
            BooleanQuery booleanQuery, String field, String startValue,
            String endValue) {

        getSolrHelper().addRangeTerm(
                booleanQuery, field, startValue, endValue);
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, boolean value) {

        addRequiredTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, double value) {

        addRequiredTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, int value) {

        addRequiredTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, long value) {

        addRequiredTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, short value) {

        addRequiredTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String value) {

        addRequiredTerm(booleanQuery, field, value, false);
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like) {

        getSolrHelper().addRequiredTerm(booleanQuery, field, value, like);
    }

    public static void addRequiredTerm(
            BooleanQuery booleanQuery, String field, String[] values,
            boolean like) {

        getSolrHelper().addRequiredTerm(booleanQuery, field, values, like);
    }

    public static void addTerm(
            BooleanQuery booleanQuery, String field, long value) {

        addTerm(booleanQuery, field, String.valueOf(value));
    }

    public static void addTerm(
            BooleanQuery booleanQuery, String field, String value) {

        addTerm(booleanQuery, field, value, false);
    }

    public static void addTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like) {

        getSolrHelper().addTerm(booleanQuery, field, value, like);
    }

    public static void addTerm(
            BooleanQuery booleanQuery, String field, String value, boolean like,
            BooleanClauseOccur booleanClauseOccur) {

        getSolrHelper().addTerm(
                booleanQuery, field, value, like, booleanClauseOccur);
    }

    public static void addTerm(
            BooleanQuery booleanQuery, String field, String[] values,
            boolean like) {

        getSolrHelper().addTerm(booleanQuery, field, values, like);
    }

    public static SolrHelper getSolrHelper() {

        if (_solrHelper==null) {
            _solrHelper = (SolrHelper)PortalBeanLocatorUtil.locate("com.liferay.portal.search.solr.SolrHelper");
        }

        return _solrHelper;
    }

    public Set<String> getQueryTerms(Query query) {
        return getSolrHelper().getQueryTerms(query);
    }

    private static SolrHelper _solrHelper;

}