package com.liferay.portal.ext.portlet;

import java.util.Map;

import javax.servlet.jsp.PageContext;

import com.liferay.portal.theme.ThemeDisplay;

public class TemplatablePortletRuntimeUtil {

	
	public static String transform(
			PageContext pageContext, String viewMode, String languageId,
			String script, String langType)
		throws Exception {
		return getTemplatablePortletRuntime().transform(pageContext, viewMode, languageId, script, langType);
	}
	
	public static TemplatablePortletRuntime getTemplatablePortletRuntime() {
		return _runtime;
	}
	
	public void setTemplatablePortletRuntime(TemplatablePortletRuntime runtime) {
		_runtime = runtime;
	}

	private static TemplatablePortletRuntime _runtime;
}
