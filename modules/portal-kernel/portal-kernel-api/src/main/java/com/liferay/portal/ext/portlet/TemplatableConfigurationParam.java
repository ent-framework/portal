package com.liferay.portal.ext.portlet;

public class TemplatableConfigurationParam {

	public String getViewMode() {
		return viewMode;
	}

	public void setViewMode(String viewMode) {
		this.viewMode = viewMode;
	}

	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	public boolean isOverride() {
		return override;
	}

	public void setOverride(boolean override) {
		this.override = override;
	}

	public String getPreferenceName() {
		return preferenceName;
	}

	public void setPreferenceName(String preferenceName) {
		this.preferenceName = preferenceName;
	}

	public String getPreferenceValue() {
		return preferenceValue;
	}

	public void setPreferenceValue(String preferenceValue) {
		this.preferenceValue = preferenceValue;
	}

	
	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}


	public String getTemplateLanguage() {
		return templateLanguage;
	}

	public void setTemplateLanguage(String templateLanguage) {
		this.templateLanguage = templateLanguage;
	}




	private String viewMode;
	
	private String templatePath;
	
	private String templateLanguage;
	
	private boolean override;
	
	private String templateContent;
	
	private String preferenceName;
	
	private String preferenceValue;
}
