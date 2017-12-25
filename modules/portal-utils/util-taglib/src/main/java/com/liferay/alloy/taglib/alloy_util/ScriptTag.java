package com.liferay.alloy.taglib.alloy_util;

import com.liferay.alloy.taglib.alloy_util.base.BaseScriptTag;
import com.liferay.portal.kernel.servlet.taglib.aui.ScriptData;
import com.liferay.portal.kernel.util.GetterUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTag;

public class ScriptTag
        extends BaseScriptTag
        implements BodyTag {
    private static final String _POSITION_AUTO = "auto";
    private static final String _POSITION_INLINE = "inline";

    public int doEndTag()
            throws JspException {
        HttpServletRequest request = (HttpServletRequest) this.pageContext.getRequest();


        String position = GetterUtil.getString(getPosition(), "auto");

        boolean printBuffer = GetterUtil.getBoolean(getPrintBuffer());

        if (printBuffer) {
            position = "inline";
        }
        try {
            if (position.equals("inline")) {
                ScriptData scriptData = null;

                if (printBuffer) {
                    scriptData = (ScriptData) getNamespacedAttribute(request, "script-data");
                }


                _updateScriptData(request, scriptData, position);

                return super.doEndTag();
            }

            ScriptData scriptData = (ScriptData) getNamespacedAttribute(request, "script-data");


            _updateScriptData(request, scriptData, position);


            return 6;
        } catch (Exception e) {
            throw new JspException(e);
        } finally {
            if (position.equals("inline")) {
                if (printBuffer) {
                    request.removeAttribute("alloy_util:script:".concat("script-data"));
                }


                request.removeAttribute("alloy_util:script:".concat("script-data-inline"));
            }
        }
    }

    public int doStartTag() throws JspException {
        super.doStartTag();

        return 2;
    }


    public Object getNamespacedAttribute(HttpServletRequest request, String key) {
        return request.getAttribute(getAttributeNamespace().concat(key));
    }


    private void _updateScriptData(HttpServletRequest request, ScriptData scriptData, String position) {
        if (scriptData == null) {
            scriptData = new ScriptData();
        }

        if (getBodyContent() != null) {
            scriptData.append("", getBodyContent().getString(), getUse());
        }


        String key = "script-data-inline";

        if (!position.equals("inline")) {
            key = "script-data";
        }

        setNamespacedAttribute(request, key, scriptData);
    }
}
