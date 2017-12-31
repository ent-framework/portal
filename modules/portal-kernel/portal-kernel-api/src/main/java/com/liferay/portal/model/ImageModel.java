package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Image service. Represents a row in the &quot;Image&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ImageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ImageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Image
 * @see com.liferay.portal.model.impl.ImageImpl
 * @see com.liferay.portal.model.impl.ImageModelImpl
 * @generated
 */
@ProviderType
public interface ImageModel extends BaseModel<Image> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a image model instance should use the {@link Image} interface instead.
     */

    /**
     * Returns the primary key of this image.
     *
     * @return the primary key of this image
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this image.
     *
     * @param primaryKey the primary key of this image
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the image ID of this image.
     *
     * @return the image ID of this image
     */
    public long getImageId();

    /**
     * Sets the image ID of this image.
     *
     * @param imageId the image ID of this image
     */
    public void setImageId(Long imageId);

    /**
     * Returns the modified date of this image.
     *
     * @return the modified date of this image
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this image.
     *
     * @param modifiedDate the modified date of this image
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the type of this image.
     *
     * @return the type of this image
     */
    @AutoEscape
    public String getType();

    /**
     * Sets the type of this image.
     *
     * @param type the type of this image
     */
    public void setType(String type);

    /**
     * Returns the height of this image.
     *
     * @return the height of this image
     */
    public int getHeight();

    /**
     * Sets the height of this image.
     *
     * @param height the height of this image
     */
    public void setHeight(Integer height);

    /**
     * Returns the width of this image.
     *
     * @return the width of this image
     */
    public int getWidth();

    /**
     * Sets the width of this image.
     *
     * @param width the width of this image
     */
    public void setWidth(Integer width);

    /**
     * Returns the size of this image.
     *
     * @return the size of this image
     */
    public int getSize();

    /**
     * Sets the size of this image.
     *
     * @param size the size of this image
     */
    public void setSize(Integer size);

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
    public int compareTo(com.liferay.portal.model.Image image);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.Image> toCacheModel();

    @Override
    public com.liferay.portal.model.Image toEscapedModel();

    @Override
    public com.liferay.portal.model.Image toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
