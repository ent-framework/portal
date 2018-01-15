package com.liferay.portal.model;

/**
 * The extended model interface for the Country service. Represents a row in the &quot;Country&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CountryModel
 * @see com.liferay.portal.model.impl.CountryImpl
 * @see com.liferay.portal.model.impl.CountryModelImpl
 * @generated
 */
public interface Country extends CountryModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.CountryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getName(java.util.Locale locale);

    public java.lang.String getNameCurrentLanguageId();

    @com.liferay.portal.kernel.json.JSON()
    public java.lang.String getNameCurrentValue();

    public void setNameCurrentLanguageId(java.lang.String languageId);
}
