package com.liferay.portlet.documentlibrary.model;

import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the DLFileVersion service. Represents a row in the &quot;DLFileVersion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileVersionModel
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileVersionImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileVersionModelImpl
 * @generated
 */
public interface DLFileVersion extends DLFileVersionModel, PersistedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.documentlibrary.model.impl.DLFileVersionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @Override
    public java.lang.String buildTreePath()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.io.InputStream getContentStream(boolean incrementCounter)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.util.UnicodeProperties getExtraSettingsProperties();

    public com.liferay.portlet.documentlibrary.model.DLFileEntry getFileEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFolder getFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getIcon();

    public void setExtraSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties extraSettingsProperties);
}
