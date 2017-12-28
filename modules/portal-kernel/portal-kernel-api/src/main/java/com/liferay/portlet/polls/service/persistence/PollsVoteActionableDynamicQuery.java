package com.liferay.portlet.polls.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.polls.model.PollsVote;
import com.liferay.portlet.polls.service.PollsVoteLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PollsVoteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PollsVoteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PollsVoteLocalServiceUtil.getService());
        setClass(PollsVote.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("voteId");
    }
}
