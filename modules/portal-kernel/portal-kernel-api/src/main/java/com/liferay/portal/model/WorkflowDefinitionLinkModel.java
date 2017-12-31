package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WorkflowDefinitionLink service. Represents a row in the &quot;WorkflowDefinitionLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.WorkflowDefinitionLinkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.WorkflowDefinitionLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkflowDefinitionLink
 * @see com.liferay.portal.model.impl.WorkflowDefinitionLinkImpl
 * @see com.liferay.portal.model.impl.WorkflowDefinitionLinkModelImpl
 * @generated
 */
@ProviderType
public interface WorkflowDefinitionLinkModel extends AttachedModel,
    BaseModel<WorkflowDefinitionLink>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a workflow definition link model instance should use the {@link WorkflowDefinitionLink} interface instead.
     */

    /**
     * Returns the primary key of this workflow definition link.
     *
     * @return the primary key of this workflow definition link
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this workflow definition link.
     *
     * @param primaryKey the primary key of this workflow definition link
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the workflow definition link ID of this workflow definition link.
     *
     * @return the workflow definition link ID of this workflow definition link
     */
    public long getWorkflowDefinitionLinkId();

    /**
     * Sets the workflow definition link ID of this workflow definition link.
     *
     * @param workflowDefinitionLinkId the workflow definition link ID of this workflow definition link
     */
    public void setWorkflowDefinitionLinkId(Long workflowDefinitionLinkId);

    /**
     * Returns the group ID of this workflow definition link.
     *
     * @return the group ID of this workflow definition link
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this workflow definition link.
     *
     * @param groupId the group ID of this workflow definition link
     */
    @Override
    public void setGroupId(Long groupId);

    /**
     * Returns the company ID of this workflow definition link.
     *
     * @return the company ID of this workflow definition link
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this workflow definition link.
     *
     * @param companyId the company ID of this workflow definition link
     */
    @Override
    public void setCompanyId(Long companyId);

    /**
     * Returns the user ID of this workflow definition link.
     *
     * @return the user ID of this workflow definition link
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this workflow definition link.
     *
     * @param userId the user ID of this workflow definition link
     */
    @Override
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this workflow definition link.
     *
     * @return the user uuid of this workflow definition link
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this workflow definition link.
     *
     * @param userUuid the user uuid of this workflow definition link
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this workflow definition link.
     *
     * @return the user name of this workflow definition link
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this workflow definition link.
     *
     * @param userName the user name of this workflow definition link
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this workflow definition link.
     *
     * @return the create date of this workflow definition link
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this workflow definition link.
     *
     * @param createDate the create date of this workflow definition link
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this workflow definition link.
     *
     * @return the modified date of this workflow definition link
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this workflow definition link.
     *
     * @param modifiedDate the modified date of this workflow definition link
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the fully qualified class name of this workflow definition link.
     *
     * @return the fully qualified class name of this workflow definition link
     */
    @Override
    public String getClassName();

    public void setClassName(String className);

    /**
     * Returns the class name ID of this workflow definition link.
     *
     * @return the class name ID of this workflow definition link
     */
    @Override
    public long getClassNameId();

    /**
     * Sets the class name ID of this workflow definition link.
     *
     * @param classNameId the class name ID of this workflow definition link
     */
    @Override
    public void setClassNameId(Long classNameId);

    /**
     * Returns the class p k of this workflow definition link.
     *
     * @return the class p k of this workflow definition link
     */
    @Override
    public long getClassPK();

    /**
     * Sets the class p k of this workflow definition link.
     *
     * @param classPK the class p k of this workflow definition link
     */
    @Override
    public void setClassPK(Long classPK);

    /**
     * Returns the type p k of this workflow definition link.
     *
     * @return the type p k of this workflow definition link
     */
    public long getTypePK();

    /**
     * Sets the type p k of this workflow definition link.
     *
     * @param typePK the type p k of this workflow definition link
     */
    public void setTypePK(Long typePK);

    /**
     * Returns the workflow definition name of this workflow definition link.
     *
     * @return the workflow definition name of this workflow definition link
     */
    @AutoEscape
    public String getWorkflowDefinitionName();

    /**
     * Sets the workflow definition name of this workflow definition link.
     *
     * @param workflowDefinitionName the workflow definition name of this workflow definition link
     */
    public void setWorkflowDefinitionName(String workflowDefinitionName);

    /**
     * Returns the workflow definition version of this workflow definition link.
     *
     * @return the workflow definition version of this workflow definition link
     */
    public int getWorkflowDefinitionVersion();

    /**
     * Sets the workflow definition version of this workflow definition link.
     *
     * @param workflowDefinitionVersion the workflow definition version of this workflow definition link
     */
    public void setWorkflowDefinitionVersion(Integer workflowDefinitionVersion);

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
        com.liferay.portal.model.WorkflowDefinitionLink workflowDefinitionLink);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.WorkflowDefinitionLink> toCacheModel();

    @Override
    public com.liferay.portal.model.WorkflowDefinitionLink toEscapedModel();

    @Override
    public com.liferay.portal.model.WorkflowDefinitionLink toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
