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

import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Tokenizer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.cjk.CJKBigramFilter;
import org.apache.lucene.analysis.cjk.CJKTokenizer;
import org.apache.lucene.analysis.cjk.CJKWidthFilter;
import org.apache.lucene.analysis.core.LowerCaseFilter;
import org.apache.lucene.analysis.core.StopFilter;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.analysis.util.StopwordAnalyzerBase;
import org.apache.lucene.util.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Raymond Augé
 * @author Mate Thurzo
 */
public class PerFieldAnalyzer extends StopwordAnalyzerBase implements Tokenizer {


	public PerFieldAnalyzer(Version version, CharArraySet stopwords) {
		super(version, stopwords);
	}

	public PerFieldAnalyzer(Version version) {
		super(version);
	}

	@Override
	protected TokenStreamComponents createComponents(String fieldName, Reader reader) {
		if (matchVersion.onOrAfter(Version.LUCENE_36)) {
			final org.apache.lucene.analysis.Tokenizer source = new StandardTokenizer(matchVersion, reader);
			// run the widthfilter first before bigramming, it sometimes combines characters.
			TokenStream result = new CJKWidthFilter(source);
			//result = new LowerCaseFilter(matchVersion, result);
			result = new CJKBigramFilter(result);
			return new TokenStreamComponents(source, new StopFilter(matchVersion, result, stopwords));
		} else {
			final org.apache.lucene.analysis.Tokenizer source = new CJKTokenizer(reader);
			return new TokenStreamComponents(source, new StopFilter(matchVersion, source, stopwords));
		}
	}

	@Override
	public List<String> tokenize(
			String fieldName, String input, String languageId)
		throws SearchException {

		List<String> tokens = new ArrayList<String>();
		TokenStream tokenStream = null;

		try {
			String localizedFieldName = DocumentImpl.getLocalizedName(languageId, fieldName);

			tokenStream = super.tokenStream(
				localizedFieldName, new StringReader(input));

			CharTermAttribute charTermAttribute = tokenStream.addAttribute(
				CharTermAttribute.class);

			tokenStream.reset();

			while (tokenStream.incrementToken()) {
				tokens.add(charTermAttribute.toString());
			}

			tokenStream.end();
		}
		catch (IOException ioe) {
			throw new SearchException(ioe);
		}
		finally {
			if (tokenStream != null) {
				try {
					tokenStream.close();
				}
				catch (IOException ioe) {
					if (_log.isWarnEnabled()) {
						_log.warn("Unable to close token stream", ioe);
					}
				}
			}
		}

		return tokens;
	}

	private static final Logger _log = LoggerFactory.getLogger(PerFieldAnalyzer.class);

}