package com.liferay.portal.ext.srvdef;

import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.struts.JSONAction;

public class PublishServiceAction extends JSONAction {

	@Override
	public String getJSON(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		boolean debug = ParamUtil.getBoolean(request, "debug");

		String path = GetterUtil.getString(request.getPathInfo());

		String code = null;
		if (Validator.isNotNull(path) && !StringPool.SLASH.equals(path)) {
			code = path.substring(1);
			int slash = code.lastIndexOf(StringPool.SLASH);
			if (slash > 0) {
				code = code.substring(0, slash);
			}
		}

		RenderRequest renderRequest = (RenderRequest) request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

		if (Validator.isNotNull(path)) {
			JSONObject ret =  ServiceManageUtil.runPublishService(StringPool.SLASH + path, renderRequest, debug);
			
			if (ret!=null) {
				return ret.toString();
			}
		}

		return null;
	}

}
