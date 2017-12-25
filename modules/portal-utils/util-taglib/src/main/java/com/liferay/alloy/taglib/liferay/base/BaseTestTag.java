package com.liferay.alloy.taglib.liferay.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseTestTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "liferay:test:";
    private static final String _PAGE = "/html/taglib/liferay/test/page.jsp";
    private String _test = null;
    private boolean _attrBooleanPrimitive = false;
    private Boolean _attrBoolean = null;
    private int _attrIntPrimitive = 0;
    private Integer _attrInteger = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("liferay:test:");

        return super.doStartTag();
    }

    public String getTest() {
        return this._test;
    }

    public void setTest(String test) {
        this._test = test;

        setScopedAttribute("test", test);
    }

    public boolean getAttrBooleanPrimitive() {
        return this._attrBooleanPrimitive;
    }

    public void setAttrBooleanPrimitive(boolean attrBooleanPrimitive) {
        this._attrBooleanPrimitive = attrBooleanPrimitive;

        setScopedAttribute("attrBooleanPrimitive", Boolean.valueOf(attrBooleanPrimitive));
    }

    public Boolean getAttrBoolean() {
        return this._attrBoolean;
    }

    public void setAttrBoolean(Boolean attrBoolean) {
        this._attrBoolean = attrBoolean;

        setScopedAttribute("attrBoolean", attrBoolean);
    }

    public int getAttrIntPrimitive() {
        return this._attrIntPrimitive;
    }

    public void setAttrIntPrimitive(int attrIntPrimitive) {
        this._attrIntPrimitive = attrIntPrimitive;

        setScopedAttribute("attrIntPrimitive", Integer.valueOf(attrIntPrimitive));
    }

    public Integer getAttrInteger() {
        return this._attrInteger;
    }

    public void setAttrInteger(Integer attrInteger) {
        this._attrInteger = attrInteger;

        setScopedAttribute("attrInteger", attrInteger);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._test = null;
        this._attrBooleanPrimitive = false;
        this._attrBoolean = null;
        this._attrIntPrimitive = 0;
        this._attrInteger = null;
    }

    protected String getPage() {
        return "/html/taglib/liferay/test/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "test", this._test);
        setNamespacedAttribute(request, "attrBooleanPrimitive", Boolean.valueOf(this._attrBooleanPrimitive));
        setNamespacedAttribute(request, "attrBoolean", this._attrBoolean);
        setNamespacedAttribute(request, "attrIntPrimitive", Integer.valueOf(this._attrIntPrimitive));
        setNamespacedAttribute(request, "attrInteger", this._attrInteger);
    }
}
