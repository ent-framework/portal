package com.liferay.mail.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for CyrusUser. This utility wraps
 * {@link com.liferay.mail.service.impl.CyrusUserServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUserService
 * @see com.liferay.mail.service.base.CyrusUserServiceBaseImpl
 * @see com.liferay.mail.service.impl.CyrusUserServiceImpl
 * @generated
 */
@ProviderType
public class CyrusUserServiceUtil {
    private static CyrusUserService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.mail.service.impl.CyrusUserServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static CyrusUserService getService() {
        if (_service == null) {
            _service = (CyrusUserService) PortalBeanLocatorUtil.locate(CyrusUserService.class.getName());

            ReferenceRegistry.registerReference(CyrusUserServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CyrusUserService service) {
    }
}
