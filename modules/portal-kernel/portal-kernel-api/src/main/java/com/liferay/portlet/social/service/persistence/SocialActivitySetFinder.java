package com.liferay.portlet.social.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface SocialActivitySetFinder {
    public int countByRelation(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByRelationType(long userId, int type)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByUser(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByUserGroups(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivitySet> findByRelation(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivitySet> findByRelationType(
        long userId, int type, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivitySet> findByUser(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivitySet> findByUserGroups(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
