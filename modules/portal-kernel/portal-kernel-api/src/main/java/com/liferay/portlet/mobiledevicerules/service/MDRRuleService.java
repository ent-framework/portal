package com.liferay.portlet.mobiledevicerules.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.jsonwebservice.JSONWebServiceMode;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;

/**
 * Provides the remote service interface for MDRRule. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Edward C. Han
 * @see MDRRuleServiceUtil
 * @see com.liferay.portlet.mobiledevicerules.service.base.MDRRuleServiceBaseImpl
 * @see com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleServiceImpl
 * @generated
 */
@ProviderType
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface MDRRuleService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MDRRuleServiceUtil} to access the m d r rule remote service. Add custom service methods to {@link com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public com.liferay.portlet.mobiledevicerules.model.MDRRule addRule(
        long ruleGroupId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type, java.lang.String typeSettings,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.jsonwebservice.JSONWebService(mode = JSONWebServiceMode.IGNORE)
    public com.liferay.portlet.mobiledevicerules.model.MDRRule addRule(
        long ruleGroupId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type,
        com.liferay.portal.kernel.util.UnicodeProperties typeSettings,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void deleteRule(long ruleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portlet.mobiledevicerules.model.MDRRule fetchRule(
        long ruleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portlet.mobiledevicerules.model.MDRRule getRule(
        long ruleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.mobiledevicerules.model.MDRRule updateRule(
        long ruleId, java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type, java.lang.String typeSettings,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.mobiledevicerules.model.MDRRule updateRule(
        long ruleId, java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type,
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
