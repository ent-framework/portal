package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Image;
import com.liferay.portal.service.ImageLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ImageActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ImageActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ImageLocalServiceUtil.getService());
        setClass(Image.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("imageId");
    }
}
