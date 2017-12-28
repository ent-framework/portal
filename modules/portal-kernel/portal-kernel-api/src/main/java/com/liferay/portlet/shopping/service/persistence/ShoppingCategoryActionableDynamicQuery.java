package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingCategory;
import com.liferay.portlet.shopping.service.ShoppingCategoryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingCategoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingCategoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingCategoryLocalServiceUtil.getService());
        setClass(ShoppingCategory.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("categoryId");
    }
}
