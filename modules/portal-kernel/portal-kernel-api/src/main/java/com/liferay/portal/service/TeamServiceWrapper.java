package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TeamService}.
 *
 * @author Brian Wing Shun Chan
 * @see TeamService
 * @generated
 */
public class TeamServiceWrapper implements TeamService,
    ServiceWrapper<TeamService> {
    private TeamService _teamService;

    public TeamServiceWrapper(TeamService teamService) {
        _teamService = teamService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teamService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teamService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.Team addTeam(long groupId,
        java.lang.String name, java.lang.String description)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.addTeam(groupId, name, description);
    }

    @Override
    public void deleteTeam(long teamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _teamService.deleteTeam(teamId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Team> getGroupTeams(
        long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.getGroupTeams(groupId);
    }

    @Override
    public com.liferay.portal.model.Team getTeam(long teamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.getTeam(teamId);
    }

    @Override
    public com.liferay.portal.model.Team getTeam(long groupId,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.getTeam(groupId, name);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Team> getUserTeams(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.getUserTeams(userId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Team> getUserTeams(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.getUserTeams(userId, groupId);
    }

    @Override
    public boolean hasUserTeam(long userId, long teamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.hasUserTeam(userId, teamId);
    }

    @Override
    public com.liferay.portal.model.Team updateTeam(long teamId,
        java.lang.String name, java.lang.String description)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamService.updateTeam(teamId, name, description);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TeamService getWrappedTeamService() {
        return _teamService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeamService(TeamService teamService) {
        _teamService = teamService;
    }

    @Override
    public TeamService getWrappedService() {
        return _teamService;
    }

    @Override
    public void setWrappedService(TeamService teamService) {
        _teamService = teamService;
    }
}
