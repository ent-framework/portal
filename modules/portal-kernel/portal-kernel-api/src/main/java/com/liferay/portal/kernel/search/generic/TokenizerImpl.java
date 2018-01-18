package com.liferay.portal.kernel.search.generic;

import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Tokenizer;

import java.util.List;

public class TokenizerImpl implements Tokenizer {
    @Override
    public List<String> tokenize(String fieldName, String input, String languageId) throws SearchException {
        return null;
    }
}
