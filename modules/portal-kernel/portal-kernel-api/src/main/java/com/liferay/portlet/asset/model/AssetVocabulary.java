package com.liferay.portlet.asset.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AssetVocabulary service. Represents a row in the &quot;AssetVocabulary&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetVocabularyModel
 * @see com.liferay.portlet.asset.model.impl.AssetVocabularyImpl
 * @see com.liferay.portlet.asset.model.impl.AssetVocabularyModelImpl
 * @generated
 */
public interface AssetVocabulary extends AssetVocabularyModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.asset.model.impl.AssetVocabularyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<com.liferay.portlet.asset.model.AssetCategory> getCategories()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.util.UnicodeProperties getSettingsProperties();

    public boolean isMultiValued();

    public boolean isRequired(long classNameId);

    public void setSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties settingsProperties);
}
