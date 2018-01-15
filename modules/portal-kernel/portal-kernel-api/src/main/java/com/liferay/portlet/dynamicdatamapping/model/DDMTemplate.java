package com.liferay.portlet.dynamicdatamapping.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DDMTemplate service. Represents a row in the &quot;DDMTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DDMTemplateModel
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMTemplateImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMTemplateModelImpl
 * @generated
 */
public interface DDMTemplate extends DDMTemplateModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMTemplateImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getSmallImageType()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the WebDAV URL to access the template.
    *
    * @param themeDisplay the theme display needed to build the URL. It can
    set HTTPS access, the server name, the server port, the path
    context, and the scope group.
    * @param webDAVToken the WebDAV token for the URL
    * @return the WebDAV URL
    */
    public java.lang.String getWebDavURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay,
        java.lang.String webDAVToken);

    public void setSmallImageType(java.lang.String smallImageType);
}
