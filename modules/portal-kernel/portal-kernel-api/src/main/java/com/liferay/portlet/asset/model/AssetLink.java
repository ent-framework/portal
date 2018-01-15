package com.liferay.portlet.asset.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AssetLink service. Represents a row in the &quot;AssetLink&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLinkModel
 * @see com.liferay.portlet.asset.model.impl.AssetLinkImpl
 * @see com.liferay.portlet.asset.model.impl.AssetLinkModelImpl
 * @generated
 */
public interface AssetLink extends AssetLinkModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.asset.model.impl.AssetLinkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<AssetLink, Long> LINK_ID_ACCESSOR = new Accessor<AssetLink, Long>() {
            @Override
            public Long get(AssetLink assetLink) {
                return assetLink.getLinkId();
            }
        };

    public static final Accessor<AssetLink, Long> ENTRY_ID2_ACCESSOR = new Accessor<AssetLink, Long>() {
            @Override
            public Long get(AssetLink assetLink) {
                return assetLink.getEntryId2();
            }
        };
}
