package com.liferay.portlet.mobiledevicerules.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the MDRRuleGroup service. Represents a row in the &quot;MDRRuleGroup&quot; database table, with each column mapped to a property of this class.
 *
 * @author Edward C. Han
 * @see MDRRuleGroupModel
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupImpl
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupModelImpl
 * @generated
 */
public interface MDRRuleGroup extends MDRRuleGroupModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRule> getRules()
        throws com.liferay.portal.kernel.exception.SystemException;
}
