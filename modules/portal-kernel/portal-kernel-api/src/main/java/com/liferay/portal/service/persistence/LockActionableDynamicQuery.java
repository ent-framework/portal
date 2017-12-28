package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Lock;
import com.liferay.portal.service.LockLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LockActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LockActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LockLocalServiceUtil.getService());
        setClass(Lock.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("lockId");
    }
}
