package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Ticket;
import com.liferay.portal.service.TicketLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class TicketActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TicketActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TicketLocalServiceUtil.getService());
        setClass(Ticket.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("ticketId");
    }
}
