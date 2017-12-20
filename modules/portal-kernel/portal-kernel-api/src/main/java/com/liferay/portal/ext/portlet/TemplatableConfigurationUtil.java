package com.liferay.portal.ext.portlet;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.template.StringTemplateResource;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateManagerUtil;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.kernel.template.TemplateVariableDefinition;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UniqueList;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupService;
import com.liferay.portal.service.LayoutLocalService;
import com.liferay.portal.service.LayoutService;
import com.liferay.portal.service.OrganizationLocalService;
import com.liferay.portal.service.OrganizationService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.dynamicdatamapping.util.DDMTemplateHelperUtil;




public class TemplatableConfigurationUtil {
	
	
	public final static String TEMPLATABLE_CONFIGURATION_PREFIX = "TPL_MODE_";
	
	public final static String[] PORTLET_VIEW_MODES = {"about","config","edit","edit-defaults","edit-guest","help","preview","print","view"};
	
	/**
	 * determine liferay portlet whether templatable
	 * @param portlet
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean isTemplatableConfiguration(Portlet portlet) {
				
		String portletId = portlet.getPortletId();
		String instanceId = portlet.getInstanceId();
		String orginalPortletId = StringUtil.remove(portletId, instanceId, StringPool.UNDERLINE);
		orginalPortletId = StringUtil.remove(orginalPortletId, "INSTANCE", StringPool.UNDERLINE);
		
		if (StringUtil.endsWith(orginalPortletId, StringPool.UNDERLINE)) {
			orginalPortletId = orginalPortletId.substring(0, orginalPortletId.length()-1);
		}
		
		try {
			Class portletImpl = PortletClassLoaderUtil.getClassLoader(orginalPortletId).loadClass(portlet.getPortletClass());
			if (TemplatablePortlet.class.isAssignableFrom(portletImpl)) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static List<TemplatableConfigurationParam> getTemplatableConfigurationParams(PortletConfig portletConfig, PortletPreferences preferences ) {
		List<TemplatableConfigurationParam> params = new ArrayList<TemplatableConfigurationParam>();
		
		for (String mode : PORTLET_VIEW_MODES) {
			String configParam = mode + "-template";
			String configParamValue = GetterUtil.getString(portletConfig.getInitParameter(configParam), StringPool.BLANK);
			if (configParamValue.length()==0 || !(configParamValue.endsWith(".vm") || configParamValue.endsWith(".ftl"))) {
				configParam = mode + "-template.tpl";
				configParamValue = GetterUtil.getString(portletConfig.getInitParameter(configParam), StringPool.BLANK);
			}
			
			if (configParamValue.length()==0) continue;
			
			String preferenceName = TEMPLATABLE_CONFIGURATION_PREFIX + mode;
			TemplatableConfigurationParam param = new TemplatableConfigurationParam();
			param.setViewMode(mode);
			param.setPreferenceName(preferenceName);
			param.setTemplatePath(configParamValue);
			param.setOverride(false);
			
			param.setTemplateLanguage(configParamValue.endsWith(".vm") ? TemplateConstants.LANG_TYPE_VM:TemplateConstants.LANG_TYPE_FTL );

			String preferenceValue = preferences.getValue(preferenceName, StringPool.BLANK);
			if (preferenceValue.length()>0) {
				param.setOverride(true);
			}
			param.setPreferenceValue(preferenceValue);
			
			params.add(param);
		}
		
		return params;
	}
	
	public static TemplatableConfigurationParam getTemplatableConfigurationParam(PortletConfig portletConfig, PortletPreferences preferences, String preferenceName) {
		
		String mode = preferenceName.substring(TEMPLATABLE_CONFIGURATION_PREFIX.length());		
		return getTemplatableConfigurationParamByMode(portletConfig, preferences, mode);
	}
	
	public static TemplatableConfigurationParam getTemplatableConfigurationParamByMode(PortletConfig portletConfig, PortletPreferences preferences, String mode) {
		
		String preferenceName = TEMPLATABLE_CONFIGURATION_PREFIX + mode;
		String configParam = mode + "-template";
		String configParamValue = GetterUtil.getString(portletConfig.getInitParameter(configParam), StringPool.BLANK);
		if (configParamValue.length()==0 || !(configParamValue.endsWith(".vm") || configParamValue.endsWith(".ftl"))) {
			configParam = mode + "-template.tpl";
			configParamValue =  GetterUtil.getString(portletConfig.getInitParameter(configParam), StringPool.BLANK);
		}
		
		TemplatableConfigurationParam param = new TemplatableConfigurationParam();
		param.setViewMode(mode);
		param.setPreferenceName(preferenceName);
		param.setTemplatePath(configParamValue);
		param.setOverride(false);
		String preferenceKey = preferenceName;
		String preferenceValue = preferences.getValue(preferenceKey, StringPool.BLANK);
		if (preferenceValue.length()>0) {
			param.setOverride(true);
		}
		param.setPreferenceValue(preferenceValue);
		param.setTemplateLanguage(configParamValue.endsWith(".vm") ? TemplateConstants.LANG_TYPE_VM:TemplateConstants.LANG_TYPE_FTL );
		
		try {
			param.setTemplateContent(FileUtil.read(portletConfig.getPortletContext().getRealPath(configParamValue)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return param;		
	}
	
	
	public static String getAutocompleteJSON(
			HttpServletRequest request, String language)
		throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		JSONObject typesJSONObject = JSONFactoryUtil.createJSONObject();
		JSONObject variablesJSONObject = JSONFactoryUtil.createJSONObject();

		for (TemplateVariableDefinition templateVariableDefinition :
				getAutocompleteTemplateVariableDefinitions(request, language)) {

			Class<?> clazz = templateVariableDefinition.getClazz();

			if (clazz == null) {
				variablesJSONObject.put(
					templateVariableDefinition.getName(), StringPool.BLANK);
			}
			else {
				if (!typesJSONObject.has(clazz.getName())) {
					typesJSONObject.put(
						clazz.getName(), getAutocompleteClassJSONObject(clazz));
				}

				variablesJSONObject.put(
					templateVariableDefinition.getName(),
					getAutocompleteVariableJSONObject(clazz));
			}
		}

		jsonObject.put("types", typesJSONObject);
		jsonObject.put("variables", variablesJSONObject);

		return jsonObject.toString();
	}

	protected static List<TemplateVariableDefinition> getAutocompleteTemplateVariableDefinitions(
			HttpServletRequest request, String language) throws Exception {

		if (!DDMTemplateHelperUtil.isAutocompleteEnabled(language)) {
			return Collections.emptyList();
		}

		List<TemplateVariableDefinition> templateVariableDefinitions = new UniqueList<TemplateVariableDefinition>();

		// Declared variables

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);


		Map<String, TemplateVariableGroup> templateVariableGroups = getTemplateVariableGroups(language, themeDisplay.getLocale());

		for (TemplateVariableGroup templateVariableGroup : templateVariableGroups
				.values()) {

			if (!templateVariableGroup.isAutocompleteEnabled()) {
				continue;
			}

			templateVariableDefinitions.addAll(templateVariableGroup
					.getTemplateVariableDefinitions());
		}

		// Other variables

		TemplateResource templateResource = new StringTemplateResource(_TEMPLATE_ID, _TEMPLATE_CONTENT);

		Template template = TemplateManagerUtil.getTemplate(language, templateResource, false);

		for (String key : template.getKeys()) {
			Object value = template.get(key);

			if (value == null) {
				continue;
			}

			TemplateVariableDefinition variableDefinition = new TemplateVariableDefinition(
					key, value.getClass(), key, (String) null);

			templateVariableDefinitions.add(variableDefinition);
		}

		return templateVariableDefinitions;
	}
	
	protected static JSONObject getAutocompleteClassJSONObject(Class<?> clazz) {
		JSONObject typeJSONObject = JSONFactoryUtil.createJSONObject();

		for (Field field : clazz.getFields()) {
			JSONObject fieldJSONObject = getAutocompleteVariableJSONObject(
				field.getType());

			typeJSONObject.put(field.getName(), fieldJSONObject);
		}

		for (Method method : clazz.getMethods()) {
			JSONObject methodJSONObject = JSONFactoryUtil.createJSONObject();

			JSONArray parametersTypesArray = JSONFactoryUtil.createJSONArray();

			Class<?>[] parameterTypes = method.getParameterTypes();

			for (Class<?> parameterType : parameterTypes) {
				parametersTypesArray.put(parameterType.getCanonicalName());
			}

			methodJSONObject.put("argumentTypes", parametersTypesArray);

			Class<?> returnTypeClass = method.getReturnType();

			methodJSONObject.put("returnType", returnTypeClass.getName());

			methodJSONObject.put("type", "Method");

			typeJSONObject.put(method.getName(), methodJSONObject);
		}

		return typeJSONObject;
	}
	
	protected static JSONObject getAutocompleteVariableJSONObject(Class<?> clazz) {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put("type", clazz.getName());

		return jsonObject;
	}

	public static Map<String, TemplateVariableGroup> getTemplateVariableGroups(String language, Locale locale)
		throws Exception {

		/**
		TemplateHandler templateHandler =
			TemplateHandlerRegistryUtil.getTemplateHandler(classNameId);

		if (templateHandler == null) {
			return Collections.emptyMap();
		}

		Map<String, TemplateVariableGroup> templateVariableGroups = templateHandler.getTemplateVariableGroups(classPK, language, locale);
		
		*/
		
		Map<String, TemplateVariableGroup> templateVariableGroups = new HashMap<String, TemplateVariableGroup>();
		
		//String[] restrictedVariables = templateHandler.getRestrictedVariables(language);

		String[] restrictedVariables = {};
		
		TemplateVariableGroup portalServicesTemplateVariableGroup = new TemplateVariableGroup("portal-services", restrictedVariables);

		//setAutocompleteEnabled to true
		portalServicesTemplateVariableGroup.setAutocompleteEnabled(true);

		portalServicesTemplateVariableGroup.addServiceLocatorVariables(
			GroupLocalService.class, GroupService.class,
			LayoutLocalService.class, LayoutService.class,
			OrganizationLocalService.class, OrganizationService.class,
			UserLocalService.class, UserService.class);

		templateVariableGroups.put(
			portalServicesTemplateVariableGroup.getLabel(),
			portalServicesTemplateVariableGroup);

		return templateVariableGroups;
	}
	
	private static final String _TEMPLATE_CONTENT = "# Placeholder";

	private static final String _TEMPLATE_ID = "0";	
}
