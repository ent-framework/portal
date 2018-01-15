package com.liferay.portlet.calendar.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the CalEvent service. Represents a row in the &quot;CalEvent&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CalEventModel
 * @see com.liferay.portlet.calendar.model.impl.CalEventImpl
 * @see com.liferay.portlet.calendar.model.impl.CalEventModelImpl
 * @generated
 */
public interface CalEvent extends CalEventModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.calendar.model.impl.CalEventImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.cal.TZSRecurrence getRecurrenceObj();

    public void setRecurrenceObj(
        com.liferay.portal.kernel.cal.TZSRecurrence recurrenceObj);
}
