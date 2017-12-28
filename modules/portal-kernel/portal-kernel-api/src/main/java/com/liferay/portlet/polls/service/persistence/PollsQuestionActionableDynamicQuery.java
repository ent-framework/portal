package com.liferay.portlet.polls.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.polls.model.PollsQuestion;
import com.liferay.portlet.polls.service.PollsQuestionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PollsQuestionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PollsQuestionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PollsQuestionLocalServiceUtil.getService());
        setClass(PollsQuestion.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("questionId");
    }
}
