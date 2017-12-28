package com.liferay.portlet.journal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class JournalFolderFinderUtil {
    private static JournalFolderFinder _finder;

    public static int countF_A_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countF_A_ByG_F(groupId, folderId, queryDefinition);
    }

    public static int filterCountF_A_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountF_A_ByG_F(groupId, folderId, queryDefinition);
    }

    public static java.util.List<java.lang.Object> filterFindF_A_ByG_F(
        long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindF_A_ByG_F(groupId, folderId, queryDefinition);
    }

    public static java.util.List<com.liferay.portlet.journal.model.JournalFolder> findF_ByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findF_ByNoAssets();
    }

    public static java.util.List<java.lang.Object> findF_A_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findF_A_ByG_F(groupId, folderId, queryDefinition);
    }

    public static JournalFolderFinder getFinder() {
        if (_finder == null) {
            _finder = (JournalFolderFinder) PortalBeanLocatorUtil.locate(JournalFolderFinder.class.getName());

            ReferenceRegistry.registerReference(JournalFolderFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(JournalFolderFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(JournalFolderFinderUtil.class,
            "_finder");
    }
}
