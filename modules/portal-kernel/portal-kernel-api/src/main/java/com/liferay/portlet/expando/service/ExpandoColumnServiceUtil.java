package com.liferay.portlet.expando.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for ExpandoColumn. This utility wraps
 * {@link com.liferay.portlet.expando.service.impl.ExpandoColumnServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ExpandoColumnService
 * @see com.liferay.portlet.expando.service.base.ExpandoColumnServiceBaseImpl
 * @see com.liferay.portlet.expando.service.impl.ExpandoColumnServiceImpl
 * @generated
 */
public class ExpandoColumnServiceUtil {
    private static ExpandoColumnService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.expando.service.impl.ExpandoColumnServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portlet.expando.model.ExpandoColumn addColumn(
        long tableId, java.lang.String name, int type)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addColumn(tableId, name, type);
    }

    public static com.liferay.portlet.expando.model.ExpandoColumn addColumn(
        long tableId, java.lang.String name, int type,
        java.lang.Object defaultData)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addColumn(tableId, name, type, defaultData);
    }

    public static void deleteColumn(long columnId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteColumn(columnId);
    }

    public static com.liferay.portlet.expando.model.ExpandoColumn updateColumn(
        long columnId, java.lang.String name, int type)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateColumn(columnId, name, type);
    }

    public static com.liferay.portlet.expando.model.ExpandoColumn updateColumn(
        long columnId, java.lang.String name, int type,
        java.lang.Object defaultData)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateColumn(columnId, name, type, defaultData);
    }

    public static com.liferay.portlet.expando.model.ExpandoColumn updateTypeSettings(
        long columnId, java.lang.String typeSettings)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTypeSettings(columnId, typeSettings);
    }

    public static ExpandoColumnService getService() {
        if (_service == null) {
            _service = (ExpandoColumnService) PortalBeanLocatorUtil.locate(ExpandoColumnService.class.getName());

            ReferenceRegistry.registerReference(ExpandoColumnServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ExpandoColumnService service) {
    }
}
