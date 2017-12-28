package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Image service. Represents a row in the &quot;Image&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ImageModel
 * @see com.liferay.portal.model.impl.ImageImpl
 * @see com.liferay.portal.model.impl.ImageModelImpl
 * @generated
 */
@ProviderType
public interface Image extends ImageModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.ImageImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public byte[] getTextObj();

    public void setTextObj(byte[] textObj);
}
