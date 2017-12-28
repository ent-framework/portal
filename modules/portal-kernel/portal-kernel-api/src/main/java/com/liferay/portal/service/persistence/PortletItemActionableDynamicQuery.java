package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PortletItem;
import com.liferay.portal.service.PortletItemLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PortletItemActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PortletItemActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PortletItemLocalServiceUtil.getService());
        setClass(PortletItem.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("portletItemId");
    }
}
