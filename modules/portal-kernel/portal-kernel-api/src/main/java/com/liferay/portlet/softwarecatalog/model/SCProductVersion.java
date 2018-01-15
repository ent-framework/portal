package com.liferay.portlet.softwarecatalog.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the SCProductVersion service. Represents a row in the &quot;SCProductVersion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SCProductVersionModel
 * @see com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionImpl
 * @see com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionModelImpl
 * @generated
 */
public interface SCProductVersion extends SCProductVersionModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion> getFrameworkVersions()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.softwarecatalog.model.SCProductEntry getProductEntry();
}
