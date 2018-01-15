package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Ticket service. Represents a row in the &quot;Ticket&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TicketModel
 * @see com.liferay.portal.model.impl.TicketImpl
 * @see com.liferay.portal.model.impl.TicketModelImpl
 * @generated
 */
public interface Ticket extends TicketModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.TicketImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isExpired();
}
