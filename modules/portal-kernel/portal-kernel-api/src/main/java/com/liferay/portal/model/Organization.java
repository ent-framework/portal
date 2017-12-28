package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the Organization service. Represents a row in the &quot;Organization_&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OrganizationModel
 * @see com.liferay.portal.model.impl.OrganizationImpl
 * @see com.liferay.portal.model.impl.OrganizationModelImpl
 * @generated
 */
@ProviderType
public interface Organization extends OrganizationModel, PersistedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.OrganizationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<Organization, String> NAME_ACCESSOR = new Accessor<Organization, String>() {
            @Override
            public String get(Organization organization) {
                return organization.getName();
            }
        };

    public com.liferay.portal.model.Address getAddress();

    public java.util.List<com.liferay.portal.model.Address> getAddresses()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Organization> getAncestors()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String[] getChildrenTypes();

    public java.util.List<com.liferay.portal.model.Organization> getDescendants()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Group getGroup();

    public long getGroupId();

    public long getLogoId();

    public com.liferay.portal.model.Organization getParentOrganization()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public javax.portlet.PortletPreferences getPreferences()
        throws com.liferay.portal.kernel.exception.SystemException;

    public int getPrivateLayoutsPageCount();

    public int getPublicLayoutsPageCount();

    public java.util.Set<java.lang.String> getReminderQueryQuestions(
        java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.Set<java.lang.String> getReminderQueryQuestions(
        java.lang.String languageId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Organization> getSuborganizations()
        throws com.liferay.portal.kernel.exception.SystemException;

    public int getSuborganizationsSize()
        throws com.liferay.portal.kernel.exception.SystemException;

    public int getTypeOrder();

    public boolean hasPrivateLayouts();

    public boolean hasPublicLayouts();

    public boolean hasSuborganizations()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isParentable();

    public boolean isRoot();
}
