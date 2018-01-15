package com.liferay.portlet.softwarecatalog.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;

/**
 * Provides the remote service interface for SCProductVersion. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SCProductVersionServiceUtil
 * @see com.liferay.portlet.softwarecatalog.service.base.SCProductVersionServiceBaseImpl
 * @see com.liferay.portlet.softwarecatalog.service.impl.SCProductVersionServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface SCProductVersionService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SCProductVersionServiceUtil} to access the s c product version remote service. Add custom service methods to {@link com.liferay.portlet.softwarecatalog.service.impl.SCProductVersionServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    public com.liferay.portlet.softwarecatalog.model.SCProductVersion addProductVersion(
        long productEntryId, java.lang.String version,
        java.lang.String changeLog, java.lang.String downloadPageURL,
        java.lang.String directDownloadURL, boolean testDirectDownloadURL,
        boolean repoStoreArtifact, long[] frameworkVersionIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void deleteProductVersion(long productVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portlet.softwarecatalog.model.SCProductVersion getProductVersion(
        long productVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCProductVersion> getProductVersions(
        long productEntryId, int start, int end)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getProductVersionsCount(long productEntryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.softwarecatalog.model.SCProductVersion updateProductVersion(
        long productVersionId, java.lang.String version,
        java.lang.String changeLog, java.lang.String downloadPageURL,
        java.lang.String directDownloadURL, boolean testDirectDownloadURL,
        boolean repoStoreArtifact, long[] frameworkVersionIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
