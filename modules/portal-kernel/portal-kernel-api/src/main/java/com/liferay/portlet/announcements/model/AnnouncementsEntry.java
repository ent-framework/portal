package com.liferay.portlet.announcements.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AnnouncementsEntry service. Represents a row in the &quot;AnnouncementsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AnnouncementsEntryModel
 * @see com.liferay.portlet.announcements.model.impl.AnnouncementsEntryImpl
 * @see com.liferay.portlet.announcements.model.impl.AnnouncementsEntryModelImpl
 * @generated
 */
@ProviderType
public interface AnnouncementsEntry extends AnnouncementsEntryModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.announcements.model.impl.AnnouncementsEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public long getGroupId()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
