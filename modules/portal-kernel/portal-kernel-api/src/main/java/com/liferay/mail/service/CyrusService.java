package com.liferay.mail.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;

/**
 * Provides the remote service interface for Cyrus. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusServiceUtil
 * @see com.liferay.mail.service.base.CyrusServiceBaseImpl
 * @see com.liferay.mail.service.impl.CyrusServiceImpl
 * @generated
 */
@ProviderType
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface CyrusService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CyrusServiceUtil} to access the cyrus remote service. Add custom service methods to {@link com.liferay.mail.service.impl.CyrusServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    public void addUser(long userId, java.lang.String emailAddress,
        java.lang.String password)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void deleteEmailAddress(long companyId, long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void deleteUser(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void updatePassword(long companyId, long userId,
        java.lang.String password)
        throws com.liferay.portal.kernel.exception.SystemException;
}
