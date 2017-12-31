package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PasswordTracker service. Represents a row in the &quot;PasswordTracker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.PasswordTrackerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.PasswordTrackerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PasswordTracker
 * @see com.liferay.portal.model.impl.PasswordTrackerImpl
 * @see com.liferay.portal.model.impl.PasswordTrackerModelImpl
 * @generated
 */
@ProviderType
public interface PasswordTrackerModel extends BaseModel<PasswordTracker> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a password tracker model instance should use the {@link PasswordTracker} interface instead.
     */

    /**
     * Returns the primary key of this password tracker.
     *
     * @return the primary key of this password tracker
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this password tracker.
     *
     * @param primaryKey the primary key of this password tracker
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the password tracker ID of this password tracker.
     *
     * @return the password tracker ID of this password tracker
     */
    public long getPasswordTrackerId();

    /**
     * Sets the password tracker ID of this password tracker.
     *
     * @param passwordTrackerId the password tracker ID of this password tracker
     */
    public void setPasswordTrackerId(Long passwordTrackerId);

    /**
     * Returns the user ID of this password tracker.
     *
     * @return the user ID of this password tracker
     */
    public long getUserId();

    /**
     * Sets the user ID of this password tracker.
     *
     * @param userId the user ID of this password tracker
     */
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this password tracker.
     *
     * @return the user uuid of this password tracker
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this password tracker.
     *
     * @param userUuid the user uuid of this password tracker
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this password tracker.
     *
     * @return the create date of this password tracker
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this password tracker.
     *
     * @param createDate the create date of this password tracker
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the password of this password tracker.
     *
     * @return the password of this password tracker
     */
    @AutoEscape
    public String getPassword();

    /**
     * Sets the password of this password tracker.
     *
     * @param password the password of this password tracker
     */
    public void setPassword(String password);

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
        com.liferay.portal.model.PasswordTracker passwordTracker);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.PasswordTracker> toCacheModel();

    @Override
    public com.liferay.portal.model.PasswordTracker toEscapedModel();

    @Override
    public com.liferay.portal.model.PasswordTracker toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
