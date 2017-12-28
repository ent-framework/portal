package com.liferay.portlet.polls.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.polls.model.PollsChoice;
import com.liferay.portlet.polls.service.PollsChoiceLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PollsChoiceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PollsChoiceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PollsChoiceLocalServiceUtil.getService());
        setClass(PollsChoice.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("choiceId");
    }
}
