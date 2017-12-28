package com.liferay.portlet.announcements.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for AnnouncementsDelivery. This utility wraps
 * {@link com.liferay.portlet.announcements.service.impl.AnnouncementsDeliveryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AnnouncementsDeliveryService
 * @see com.liferay.portlet.announcements.service.base.AnnouncementsDeliveryServiceBaseImpl
 * @see com.liferay.portlet.announcements.service.impl.AnnouncementsDeliveryServiceImpl
 * @generated
 */
@ProviderType
public class AnnouncementsDeliveryServiceUtil {
    private static AnnouncementsDeliveryService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.announcements.service.impl.AnnouncementsDeliveryServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portlet.announcements.model.AnnouncementsDelivery updateDelivery(
        long userId, java.lang.String type, boolean email, boolean sms,
        boolean website)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDelivery(userId, type, email, sms, website);
    }

    public static AnnouncementsDeliveryService getService() {
        if (_service == null) {
            _service = (AnnouncementsDeliveryService) PortalBeanLocatorUtil.locate(AnnouncementsDeliveryService.class.getName());

            ReferenceRegistry.registerReference(AnnouncementsDeliveryServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AnnouncementsDeliveryService service) {
    }
}
