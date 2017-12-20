package com.liferay.portal.ext.portlet;

import javax.servlet.jsp.PageContext;

public interface TemplatablePortletRuntime {

	public String transform(PageContext pageContext, String viewMode, String languageId, String script, String langType)
			throws Exception;
}
