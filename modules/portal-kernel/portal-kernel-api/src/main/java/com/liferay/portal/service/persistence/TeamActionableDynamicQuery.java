package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Team;
import com.liferay.portal.service.TeamLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class TeamActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TeamActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TeamLocalServiceUtil.getService());
        setClass(Team.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("teamId");
    }
}
