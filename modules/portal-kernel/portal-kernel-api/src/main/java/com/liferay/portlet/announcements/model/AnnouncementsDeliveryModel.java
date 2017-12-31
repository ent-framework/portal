package com.liferay.portlet.announcements.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the AnnouncementsDelivery service. Represents a row in the &quot;AnnouncementsDelivery&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnouncementsDelivery
 * @see com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryImpl
 * @see com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryModelImpl
 * @generated
 */
@ProviderType
public interface AnnouncementsDeliveryModel extends BaseModel<AnnouncementsDelivery> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a announcements delivery model instance should use the {@link AnnouncementsDelivery} interface instead.
     */

    /**
     * Returns the primary key of this announcements delivery.
     *
     * @return the primary key of this announcements delivery
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this announcements delivery.
     *
     * @param primaryKey the primary key of this announcements delivery
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the delivery ID of this announcements delivery.
     *
     * @return the delivery ID of this announcements delivery
     */
    public long getDeliveryId();

    /**
     * Sets the delivery ID of this announcements delivery.
     *
     * @param deliveryId the delivery ID of this announcements delivery
     */
    public void setDeliveryId(Long deliveryId);

    /**
     * Returns the company ID of this announcements delivery.
     *
     * @return the company ID of this announcements delivery
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this announcements delivery.
     *
     * @param companyId the company ID of this announcements delivery
     */
    public void setCompanyId(Long companyId);

    /**
     * Returns the user ID of this announcements delivery.
     *
     * @return the user ID of this announcements delivery
     */
    public long getUserId();

    /**
     * Sets the user ID of this announcements delivery.
     *
     * @param userId the user ID of this announcements delivery
     */
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this announcements delivery.
     *
     * @return the user uuid of this announcements delivery
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this announcements delivery.
     *
     * @param userUuid the user uuid of this announcements delivery
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the type of this announcements delivery.
     *
     * @return the type of this announcements delivery
     */
    @AutoEscape
    public String getType();

    /**
     * Sets the type of this announcements delivery.
     *
     * @param type the type of this announcements delivery
     */
    public void setType(String type);

    /**
     * Returns the email of this announcements delivery.
     *
     * @return the email of this announcements delivery
     */
    public boolean getEmail();

    /**
     * Returns <code>true</code> if this announcements delivery is email.
     *
     * @return <code>true</code> if this announcements delivery is email; <code>false</code> otherwise
     */
    public boolean isEmail();

    /**
     * Sets whether this announcements delivery is email.
     *
     * @param email the email of this announcements delivery
     */
    public void setEmail(Boolean email);

    /**
     * Returns the sms of this announcements delivery.
     *
     * @return the sms of this announcements delivery
     */
    public boolean getSms();

    /**
     * Returns <code>true</code> if this announcements delivery is sms.
     *
     * @return <code>true</code> if this announcements delivery is sms; <code>false</code> otherwise
     */
    public boolean isSms();

    /**
     * Sets whether this announcements delivery is sms.
     *
     * @param sms the sms of this announcements delivery
     */
    public void setSms(Boolean sms);

    /**
     * Returns the website of this announcements delivery.
     *
     * @return the website of this announcements delivery
     */
    public boolean getWebsite();

    /**
     * Returns <code>true</code> if this announcements delivery is website.
     *
     * @return <code>true</code> if this announcements delivery is website; <code>false</code> otherwise
     */
    public boolean isWebsite();

    /**
     * Sets whether this announcements delivery is website.
     *
     * @param website the website of this announcements delivery
     */
    public void setWebsite(Boolean website);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.liferay.portlet.announcements.model.AnnouncementsDelivery announcementsDelivery);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portlet.announcements.model.AnnouncementsDelivery> toCacheModel();

    @Override
    public com.liferay.portlet.announcements.model.AnnouncementsDelivery toEscapedModel();

    @Override
    public com.liferay.portlet.announcements.model.AnnouncementsDelivery toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
