package com.liferay.portlet.shopping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ShoppingCategory service. Represents a row in the &quot;ShoppingCategory&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCategoryModel
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCategoryImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCategoryModelImpl
 * @generated
 */
@ProviderType
public interface ShoppingCategory extends ShoppingCategoryModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.shopping.model.impl.ShoppingCategoryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isRoot();
}
