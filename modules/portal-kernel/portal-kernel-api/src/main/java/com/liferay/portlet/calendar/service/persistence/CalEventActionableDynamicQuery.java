package com.liferay.portlet.calendar.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.calendar.model.CalEvent;
import com.liferay.portlet.calendar.service.CalEventLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CalEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CalEventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CalEventLocalServiceUtil.getService());
        setClass(CalEvent.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("eventId");
    }
}
