package com.liferay.portal.ext.srvdef;

import javax.portlet.PortletRequest;

import com.liferay.portal.ext.model.ServicePublishDef;
import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;

public interface ServiceManage {

	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, boolean isDebug) throws PortalException, SystemException;
	
	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef) throws PortalException, SystemException;
	
	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, PortletRequest request) throws PortalException, SystemException;

	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, PortletRequest request, boolean isDebug) throws PortalException, SystemException;

	public JSONObject runRemoteService(String code, PortletRequest request, boolean isDebug) throws PortalException, SystemException;
	
	public JSONObject runRemoteService(String code, PortletRequest request) throws PortalException, SystemException;
	

	public JSONObject runPublishService(ServicePublishDef servicePublishDef, boolean isDebug) throws PortalException, SystemException;
	
	public JSONObject runPublishService(ServicePublishDef servicePublishDef) throws PortalException, SystemException;
	
	public JSONObject runPublishService(ServicePublishDef servicePublishDef, PortletRequest request) throws PortalException, SystemException;

	public JSONObject runPublishService(ServicePublishDef servicePublishDef, PortletRequest request, boolean isDebug) throws PortalException, SystemException;

	public JSONObject runPublishService(String path, PortletRequest request, boolean isDebug) throws PortalException, SystemException;
	
	public JSONObject runPublishService(String path, PortletRequest request) throws PortalException, SystemException;
}
