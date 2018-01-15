package com.liferay.portlet.asset.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for AssetCategoryProperty. This utility wraps
 * {@link com.liferay.portlet.asset.service.impl.AssetCategoryPropertyServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategoryPropertyService
 * @see com.liferay.portlet.asset.service.base.AssetCategoryPropertyServiceBaseImpl
 * @see com.liferay.portlet.asset.service.impl.AssetCategoryPropertyServiceImpl
 * @generated
 */
public class AssetCategoryPropertyServiceUtil {
    private static AssetCategoryPropertyService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.asset.service.impl.AssetCategoryPropertyServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static com.liferay.portlet.asset.model.AssetCategoryProperty addCategoryProperty(
        long entryId, java.lang.String key, java.lang.String value)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addCategoryProperty(entryId, key, value);
    }

    public static void deleteCategoryProperty(long categoryPropertyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteCategoryProperty(categoryPropertyId);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetCategoryProperty> getCategoryProperties(
        long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCategoryProperties(entryId);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetCategoryProperty> getCategoryPropertyValues(
        long companyId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCategoryPropertyValues(companyId, key);
    }

    public static com.liferay.portlet.asset.model.AssetCategoryProperty updateCategoryProperty(
        long categoryPropertyId, java.lang.String key, java.lang.String value)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateCategoryProperty(categoryPropertyId, key, value);
    }

    public static AssetCategoryPropertyService getService() {
        if (_service == null) {
            _service = (AssetCategoryPropertyService) PortalBeanLocatorUtil.locate(AssetCategoryPropertyService.class.getName());

            ReferenceRegistry.registerReference(AssetCategoryPropertyServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AssetCategoryPropertyService service) {
    }
}
