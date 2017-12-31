package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Shard service. Represents a row in the &quot;Shard&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ShardModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ShardImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Shard
 * @see com.liferay.portal.model.impl.ShardImpl
 * @see com.liferay.portal.model.impl.ShardModelImpl
 * @generated
 */
@ProviderType
public interface ShardModel extends AttachedModel, BaseModel<Shard> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a shard model instance should use the {@link Shard} interface instead.
     */

    /**
     * Returns the primary key of this shard.
     *
     * @return the primary key of this shard
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this shard.
     *
     * @param primaryKey the primary key of this shard
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the shard ID of this shard.
     *
     * @return the shard ID of this shard
     */
    public long getShardId();

    /**
     * Sets the shard ID of this shard.
     *
     * @param shardId the shard ID of this shard
     */
    public void setShardId(Long shardId);

    /**
     * Returns the fully qualified class name of this shard.
     *
     * @return the fully qualified class name of this shard
     */
    @Override
    public String getClassName();

    public void setClassName(String className);

    /**
     * Returns the class name ID of this shard.
     *
     * @return the class name ID of this shard
     */
    @Override
    public long getClassNameId();

    /**
     * Sets the class name ID of this shard.
     *
     * @param classNameId the class name ID of this shard
     */
    @Override
    public void setClassNameId(Long classNameId);

    /**
     * Returns the class p k of this shard.
     *
     * @return the class p k of this shard
     */
    @Override
    public long getClassPK();

    /**
     * Sets the class p k of this shard.
     *
     * @param classPK the class p k of this shard
     */
    @Override
    public void setClassPK(Long classPK);

    /**
     * Returns the name of this shard.
     *
     * @return the name of this shard
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this shard.
     *
     * @param name the name of this shard
     */
    public void setName(String name);

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
    public int compareTo(com.liferay.portal.model.Shard shard);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.Shard> toCacheModel();

    @Override
    public com.liferay.portal.model.Shard toEscapedModel();

    @Override
    public com.liferay.portal.model.Shard toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
