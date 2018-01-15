package com.liferay.portlet.expando.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ExpandoTable service. Represents a row in the &quot;ExpandoTable&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExpandoTableModel
 * @see com.liferay.portlet.expando.model.impl.ExpandoTableImpl
 * @see com.liferay.portlet.expando.model.impl.ExpandoTableModelImpl
 * @generated
 */
public interface ExpandoTable extends ExpandoTableModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.expando.model.impl.ExpandoTableImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isDefaultTable();
}
