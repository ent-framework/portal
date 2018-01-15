package com.liferay.portlet.expando.service;

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
 * Provides the remote service interface for ExpandoValue. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ExpandoValueServiceUtil
 * @see com.liferay.portlet.expando.service.base.ExpandoValueServiceBaseImpl
 * @see com.liferay.portlet.expando.service.impl.ExpandoValueServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface ExpandoValueService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ExpandoValueServiceUtil} to access the expando value remote service. Add custom service methods to {@link com.liferay.portlet.expando.service.impl.ExpandoValueServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    @com.liferay.portal.kernel.jsonwebservice.JSONWebService(mode = JSONWebServiceMode.IGNORE)
    public com.liferay.portlet.expando.model.ExpandoValue addValue(
        long companyId, java.lang.String className, java.lang.String tableName,
        java.lang.String columnName, long classPK, java.lang.Object data)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.expando.model.ExpandoValue addValue(
        long companyId, java.lang.String className, java.lang.String tableName,
        java.lang.String columnName, long classPK, java.lang.String data)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addValues(long companyId, java.lang.String className,
        java.lang.String tableName, long classPK,
        java.util.Map<java.lang.String, java.io.Serializable> attributeValues)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.Map<java.lang.String, java.io.Serializable> getData(
        long companyId, java.lang.String className, java.lang.String tableName,
        java.util.Collection<java.lang.String> columnNames, long classPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.io.Serializable getData(long companyId,
        java.lang.String className, java.lang.String tableName,
        java.lang.String columnName, long classPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.kernel.json.JSONObject getJSONData(
        long companyId, java.lang.String className, java.lang.String tableName,
        java.lang.String columnName, long classPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
