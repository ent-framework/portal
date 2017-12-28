package com.liferay.portlet.ratings.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface RatingsEntryFinder {
    public java.util.List<com.liferay.portlet.ratings.model.RatingsEntry> findByU_C_C(
        long userId, long classNameId, java.util.List<java.lang.Long> classPKs)
        throws com.liferay.portal.kernel.exception.SystemException;
}
