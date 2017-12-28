package com.liferay.portlet.shopping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ShoppingCoupon service. Represents a row in the &quot;ShoppingCoupon&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCouponModel
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCouponImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCouponModelImpl
 * @generated
 */
@ProviderType
public interface ShoppingCoupon extends ShoppingCouponModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.shopping.model.impl.ShoppingCouponImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean hasValidDateRange();

    public boolean hasValidEndDate();

    public boolean hasValidStartDate();
}
