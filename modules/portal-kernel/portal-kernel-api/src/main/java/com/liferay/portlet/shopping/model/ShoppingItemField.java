package com.liferay.portlet.shopping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ShoppingItemField service. Represents a row in the &quot;ShoppingItemField&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingItemFieldModel
 * @see com.liferay.portlet.shopping.model.impl.ShoppingItemFieldImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingItemFieldModelImpl
 * @generated
 */
@ProviderType
public interface ShoppingItemField extends ShoppingItemFieldModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.shopping.model.impl.ShoppingItemFieldImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String[] getValuesArray();

    public void setValuesArray(java.lang.String[] valuesArray);
}
