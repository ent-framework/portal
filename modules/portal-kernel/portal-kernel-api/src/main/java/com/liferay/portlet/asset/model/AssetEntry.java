package com.liferay.portlet.asset.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AssetEntry service. Represents a row in the &quot;AssetEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntryModel
 * @see com.liferay.portlet.asset.model.impl.AssetEntryImpl
 * @see com.liferay.portlet.asset.model.impl.AssetEntryModelImpl
 * @generated
 */
public interface AssetEntry extends AssetEntryModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.asset.model.impl.AssetEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<AssetEntry, Long> ENTRY_ID_ACCESSOR = new Accessor<AssetEntry, Long>() {
            @Override
            public Long get(AssetEntry assetEntry) {
                return assetEntry.getEntryId();
            }
        };

    public com.liferay.portlet.asset.model.AssetRenderer getAssetRenderer();

    public com.liferay.portlet.asset.model.AssetRendererFactory getAssetRendererFactory();

    public java.util.List<com.liferay.portlet.asset.model.AssetCategory> getCategories()
        throws com.liferay.portal.kernel.exception.SystemException;

    public long[] getCategoryIds()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String[] getTagNames()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTag> getTags()
        throws com.liferay.portal.kernel.exception.SystemException;
}
