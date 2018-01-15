package com.liferay.portlet.asset.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AssetTag service. Represents a row in the &quot;AssetTag&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetTagModel
 * @see com.liferay.portlet.asset.model.impl.AssetTagImpl
 * @see com.liferay.portlet.asset.model.impl.AssetTagModelImpl
 * @generated
 */
public interface AssetTag extends AssetTagModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.asset.model.impl.AssetTagImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<AssetTag, Long> TAG_ID_ACCESSOR = new Accessor<AssetTag, Long>() {
            @Override
            public Long get(AssetTag assetTag) {
                return assetTag.getTagId();
            }
        };

    public static final Accessor<AssetTag, String> NAME_ACCESSOR = new Accessor<AssetTag, String>() {
            @Override
            public String get(AssetTag assetTag) {
                return assetTag.getName();
            }
        };
}
