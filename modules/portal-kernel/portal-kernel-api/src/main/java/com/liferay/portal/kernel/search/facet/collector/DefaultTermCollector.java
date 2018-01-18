package com.liferay.portal.kernel.search.facet.collector;

import com.liferay.portal.kernel.util.StringBundler;

public class DefaultTermCollector implements TermCollector {

    public DefaultTermCollector(String term, int frequency) {
        _term = term;
        _frequency = frequency;
    }

    @Override
    public int getFrequency() {
        return _frequency;
    }

    @Override
    public String getTerm() {
        return _term;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{frequency=");
        sb.append(_frequency);
        sb.append(", term=");
        sb.append(_term);
        sb.append("}");

        return sb.toString();
    }

    private final int _frequency;
    private final String _term;

}
