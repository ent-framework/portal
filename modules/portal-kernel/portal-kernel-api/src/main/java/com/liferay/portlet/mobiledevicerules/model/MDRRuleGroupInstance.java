package com.liferay.portlet.mobiledevicerules.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the MDRRuleGroupInstance service. Represents a row in the &quot;MDRRuleGroupInstance&quot; database table, with each column mapped to a property of this class.
 *
 * @author Edward C. Han
 * @see MDRRuleGroupInstanceModel
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceImpl
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceModelImpl
 * @generated
 */
public interface MDRRuleGroupInstance extends MDRRuleGroupInstanceModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRAction> getActions()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup getRuleGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
