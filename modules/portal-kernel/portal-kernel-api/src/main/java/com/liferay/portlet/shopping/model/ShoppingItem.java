package com.liferay.portlet.shopping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ShoppingItem service. Represents a row in the &quot;ShoppingItem&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingItemModel
 * @see com.liferay.portlet.shopping.model.impl.ShoppingItemImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingItemModelImpl
 * @generated
 */
@ProviderType
public interface ShoppingItem extends ShoppingItemModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.shopping.model.impl.ShoppingItemImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.shopping.model.ShoppingCategory getCategory();

    public java.lang.String[] getFieldsQuantitiesArray();

    public java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> getItemPrices()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean isInfiniteStock();

    public void setFieldsQuantitiesArray(
        java.lang.String[] fieldsQuantitiesArray);
}
