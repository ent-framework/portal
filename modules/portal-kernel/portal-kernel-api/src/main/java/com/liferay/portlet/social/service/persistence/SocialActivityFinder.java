package com.liferay.portlet.social.service.persistence;

public interface SocialActivityFinder {
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByGroupUsers(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByOrganizationId(long organizationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByOrganizationUsers(long organizationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByRelation(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByRelationType(long userId, int type)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByUserGroups(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByUserGroupsAndOrganizations(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByUserOrganizations(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByGroupUsers(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByOrganizationId(
        long organizationId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByOrganizationUsers(
        long organizationId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByRelation(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByRelationType(
        long userId, int type, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByUserGroups(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByUserGroupsAndOrganizations(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivity> findByUserOrganizations(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
