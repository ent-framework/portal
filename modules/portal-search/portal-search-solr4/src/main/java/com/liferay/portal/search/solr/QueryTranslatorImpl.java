/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.solr;

import com.liferay.portal.kernel.search.*;
import com.liferay.portal.kernel.security.pacl.DoPrivileged;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.WildcardQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Brian Wing Shun Chan
 */
@DoPrivileged
public class QueryTranslatorImpl implements QueryTranslator {

	@Override
	public Object translate(Query query) throws ParseException {

		if (query instanceof BooleanQueryImpl) {
			return ((BooleanQueryImpl)query).getBooleanQuery();
		}
		else if (query instanceof StringQueryImpl) {
			QueryParser queryParser = new QueryParser(
					solrHelper.getVersion(), StringPool.BLANK,
					solrHelper.getAnalyzer());

			try {
				return queryParser.parse(query.toString());
			} catch (org.apache.lucene.queryparser.classic.ParseException e) {
				e.printStackTrace();
			}
		}
		else if (query instanceof TermQueryImpl) {
			return ((TermQueryImpl)query).getTermQuery();
		}
		else if (query instanceof TermRangeQueryImpl) {
			return ((TermRangeQueryImpl)query).getTermRangeQuery();
		}
		else {
			return null;
		}
		return null;
	}

	@Override
	public Object translateForSolr(Query query) {
		Object queryObject = query.getWrappedQuery();

		if (queryObject instanceof org.apache.lucene.search.Query) {
			adjustQuery((org.apache.lucene.search.Query)queryObject);
		}

		return query;
	}

	protected void adjustQuery(org.apache.lucene.search.Query query) {
		if (query instanceof BooleanQuery) {
			BooleanQuery booleanQuery = (BooleanQuery)query;

			for (BooleanClause booleanClause : booleanQuery.getClauses()) {
				adjustQuery(booleanClause.getQuery());
			}
		}
		else if (query instanceof TermQuery) {
			TermQuery termQuery = (TermQuery)query;

			Term term = termQuery.getTerm();

			try {
				String text = term.text();

				if (text.matches("^\\s*[^\"].*\\s+.*[^\"]\\s*$(?m)")) {
					text = StringPool.QUOTE.concat(text).concat(
						StringPool.QUOTE);

					_textField.set(term, text);
				}
			}
			catch (Exception e) {
				_log.error(e.getMessage(), e);
			}
		}
		else if (query instanceof WildcardQuery) {
			WildcardQuery wildcardQuery = (WildcardQuery)query;

			Term term = wildcardQuery.getTerm();

			try {
				String text = term.text();

				if (Validator.equals(term.field(), Field.TREE_PATH)) {
					text = text.replaceAll("/", "\\\\/");
				}

				if (text.matches("^\\s*\\*.*(?m)")) {
					text = text.replaceFirst("\\*", StringPool.BLANK);

					//_textField.set(term, text);
				}
			}
			catch (Exception e) {
				_log.error(e.getMessage(), e);
			}
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(QueryTranslatorImpl.class);

	private static java.lang.reflect.Field _textField = null;

	static {
		try {
			_textField = Term.class.getDeclaredField("bytes");

			_textField.setAccessible(true);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}
	}

	private SolrHelper solrHelper;

	public void setSolrHelper(SolrHelper solrHelper) {
		this.solrHelper = solrHelper;
	}
}