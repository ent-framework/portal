package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Company service. Represents a row in the &quot;Company&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyModel
 * @see com.liferay.portal.model.impl.CompanyImpl
 * @see com.liferay.portal.model.impl.CompanyModelImpl
 * @generated
 */
public interface Company extends CompanyModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.CompanyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.Account getAccount()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getAdminName();

    public java.lang.String getAuthType()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.User getDefaultUser()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getDefaultWebId();

    public java.lang.String getEmailAddress();

    public com.liferay.portal.model.Group getGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public long getGroupId()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.security.Key getKeyObj();

    public java.util.Locale getLocale()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.bean.AutoEscape()
    public java.lang.String getName()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getPortalURL(long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getShardName()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getShortName()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.TimeZone getTimeZone()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getVirtualHostname();

    public boolean hasCompanyMx(java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isAutoLogin()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isSendPassword()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isSendPasswordResetLink()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isSiteLogo()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isStrangers()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isStrangersVerify()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isStrangersWithMx()
        throws com.liferay.portal.kernel.exception.SystemException;

    public void setKeyObj(java.security.Key keyObj);

    public void setVirtualHostname(java.lang.String virtualHostname);
}
