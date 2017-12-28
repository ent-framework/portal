package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ServiceComponent service. Represents a row in the &quot;ServiceComponent&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ServiceComponentModel
 * @see com.liferay.portal.model.impl.ServiceComponentImpl
 * @see com.liferay.portal.model.impl.ServiceComponentModelImpl
 * @generated
 */
@ProviderType
public interface ServiceComponent extends ServiceComponentModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.ServiceComponentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getIndexesSQL();

    public java.lang.String getSequencesSQL();

    public java.lang.String getTablesSQL();
}
