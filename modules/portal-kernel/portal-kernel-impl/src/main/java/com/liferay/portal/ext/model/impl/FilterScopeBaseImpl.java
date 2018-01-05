package com.liferay.portal.ext.model.impl;

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.ext.service.FilterScopeLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the FilterScope service. Represents a row in the &quot;FilterScope&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FilterScopeImpl}.
 * </p>
 *
 * @author Jeff Qian
 * @see FilterScopeImpl
 * @see com.liferay.portal.ext.model.FilterScope
 * @generated
 */
public abstract class FilterScopeBaseImpl extends FilterScopeModelImpl
    implements FilterScope {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a filter scope model instance should use the {@link FilterScope} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FilterScopeLocalServiceUtil.addFilterScope(this);
        } else {
            FilterScopeLocalServiceUtil.updateFilterScope(this);
        }
    }
}