package com.liferay.portlet.mobiledevicerules.service.persistence;

public interface MDRRuleGroupFinder {
    public int countByKeywords(long groupId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_N(long groupId, java.lang.String name,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_N(long groupId, java.lang.String[] names,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByKeywords(
        long groupId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByG_N(
        long groupId, java.lang.String name,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByG_N(
        long groupId, java.lang.String name,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByG_N(
        long groupId, java.lang.String[] names,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
