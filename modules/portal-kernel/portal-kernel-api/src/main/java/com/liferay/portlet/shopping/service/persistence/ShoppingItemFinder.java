package com.liferay.portlet.shopping.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface ShoppingItemFinder {
    public int countByG_C(long groupId,
        java.util.List<java.lang.Long> categoryIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByFeatured(long groupId, long[] categoryIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByKeywords(long groupId, long[] categoryIds,
        java.lang.String keywords)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countBySale(long groupId, long[] categoryIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_C(long groupId,
        java.util.List<java.lang.Long> categoryIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> findByFeatured(
        long groupId, long[] categoryIds, int numOfItems)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> findByKeywords(
        long groupId, long[] categoryIds, java.lang.String keywords, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> findBySale(
        long groupId, long[] categoryIds, int numOfItems)
        throws com.liferay.portal.kernel.exception.SystemException;
}
