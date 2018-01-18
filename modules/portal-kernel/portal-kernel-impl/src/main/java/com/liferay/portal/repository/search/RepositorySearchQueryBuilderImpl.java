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

package com.liferay.portal.repository.search;

import com.liferay.portal.kernel.search.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.repository.search.RepositorySearchQueryBuilder;
import com.liferay.portal.kernel.security.pacl.DoPrivileged;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.util.lucene.KeywordsUtil;

import java.util.HashSet;
import java.util.Set;

//import org.apache.lucene.analysis.Analyzer;
//import org.apache.lucene.index.Term;
//import org.apache.lucene.queryParser.QueryParser;

/**
 * @author Mika Koivisto
 */
@DoPrivileged
public class RepositorySearchQueryBuilderImpl
	implements RepositorySearchQueryBuilder {

	@Override
	public BooleanQuery getFullQuery(SearchContext searchContext)
		throws SearchException {

		try {
			BooleanQuery contextQuery = BooleanQueryFactoryUtil.create(
				searchContext);

//			addContext(contextQuery, searchContext);

			BooleanQuery searchQuery = BooleanQueryFactoryUtil.create(
				searchContext);

		//	addSearchKeywords(searchQuery, searchContext);

			BooleanQuery fullQuery = BooleanQueryFactoryUtil.create(
				searchContext);

			if (contextQuery.hasClauses()) {
				fullQuery.add(contextQuery, BooleanClauseOccur.MUST);
			}

			if (searchQuery.hasClauses()) {
				fullQuery.add(searchQuery, BooleanClauseOccur.MUST);
			}

			BooleanClause[] booleanClauses = searchContext.getBooleanClauses();

			if (booleanClauses != null) {
				for (BooleanClause booleanClause : booleanClauses) {
					fullQuery.add(
						booleanClause.getQuery(),
						booleanClause.getBooleanClauseOccur());
				}
			}

			fullQuery.setQueryConfig(searchContext.getQueryConfig());

			return fullQuery;
		}
		catch (Exception e) {
			throw new SearchException(e);
		}
	}



	private static final Logger _log = LoggerFactory.getLogger(
		RepositorySearchQueryBuilderImpl.class);


}