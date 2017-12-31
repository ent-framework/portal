package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Ticket service. Represents a row in the &quot;Ticket&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.TicketModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.TicketImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Ticket
 * @see com.liferay.portal.model.impl.TicketImpl
 * @see com.liferay.portal.model.impl.TicketModelImpl
 * @generated
 */
@ProviderType
public interface TicketModel extends AttachedModel, BaseModel<Ticket> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a ticket model instance should use the {@link Ticket} interface instead.
     */

    /**
     * Returns the primary key of this ticket.
     *
     * @return the primary key of this ticket
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this ticket.
     *
     * @param primaryKey the primary key of this ticket
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ticket ID of this ticket.
     *
     * @return the ticket ID of this ticket
     */
    public long getTicketId();

    /**
     * Sets the ticket ID of this ticket.
     *
     * @param ticketId the ticket ID of this ticket
     */
    public void setTicketId(Long ticketId);

    /**
     * Returns the company ID of this ticket.
     *
     * @return the company ID of this ticket
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this ticket.
     *
     * @param companyId the company ID of this ticket
     */
    public void setCompanyId(Long companyId);

    /**
     * Returns the create date of this ticket.
     *
     * @return the create date of this ticket
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this ticket.
     *
     * @param createDate the create date of this ticket
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the fully qualified class name of this ticket.
     *
     * @return the fully qualified class name of this ticket
     */
    @Override
    public String getClassName();

    public void setClassName(String className);

    /**
     * Returns the class name ID of this ticket.
     *
     * @return the class name ID of this ticket
     */
    @Override
    public long getClassNameId();

    /**
     * Sets the class name ID of this ticket.
     *
     * @param classNameId the class name ID of this ticket
     */
    @Override
    public void setClassNameId(Long classNameId);

    /**
     * Returns the class p k of this ticket.
     *
     * @return the class p k of this ticket
     */
    @Override
    public long getClassPK();

    /**
     * Sets the class p k of this ticket.
     *
     * @param classPK the class p k of this ticket
     */
    @Override
    public void setClassPK(Long classPK);

    /**
     * Returns the key of this ticket.
     *
     * @return the key of this ticket
     */
    @AutoEscape
    public String getKey();

    /**
     * Sets the key of this ticket.
     *
     * @param key the key of this ticket
     */
    public void setKey(String key);

    /**
     * Returns the type of this ticket.
     *
     * @return the type of this ticket
     */
    public int getType();

    /**
     * Sets the type of this ticket.
     *
     * @param type the type of this ticket
     */
    public void setType(Integer type);

    /**
     * Returns the extra info of this ticket.
     *
     * @return the extra info of this ticket
     */
    @AutoEscape
    public String getExtraInfo();

    /**
     * Sets the extra info of this ticket.
     *
     * @param extraInfo the extra info of this ticket
     */
    public void setExtraInfo(String extraInfo);

    /**
     * Returns the expiration date of this ticket.
     *
     * @return the expiration date of this ticket
     */
    public Date getExpirationDate();

    /**
     * Sets the expiration date of this ticket.
     *
     * @param expirationDate the expiration date of this ticket
     */
    public void setExpirationDate(Date expirationDate);

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
    public int compareTo(com.liferay.portal.model.Ticket ticket);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.Ticket> toCacheModel();

    @Override
    public com.liferay.portal.model.Ticket toEscapedModel();

    @Override
    public com.liferay.portal.model.Ticket toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
