package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseAutoCompleteTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:auto-complete:";
    private static final String _PAGE = "/html/taglib/alloy/auto_complete/page.jsp";
    private String _test = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:auto-complete:");

        return super.doStartTag();
    }

    public String getTest() {
        return this._test;
    }

    public void setTest(String test) {
        this._test = test;

        setScopedAttribute("test", test);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._test = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/auto_complete/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "test", this._test);
    }
}
