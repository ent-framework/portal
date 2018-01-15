package com.liferay.portlet.journal.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the JournalArticle service. Represents a row in the &quot;JournalArticle&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JournalArticleModel
 * @see com.liferay.portlet.journal.model.impl.JournalArticleImpl
 * @see com.liferay.portlet.journal.model.impl.JournalArticleModelImpl
 * @generated
 */
public interface JournalArticle extends JournalArticleModel, PersistedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.journal.model.impl.JournalArticleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<JournalArticle, String> ARTICLE_ID_ACCESSOR = new Accessor<JournalArticle, String>() {
            @Override
            public String get(JournalArticle journalArticle) {
                return journalArticle.getArticleId();
            }
        };

    @Override
    public java.lang.String buildTreePath()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getArticleImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay);

    public com.liferay.portlet.journal.model.JournalArticleResource getArticleResource()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getArticleResourceUuid()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * @deprecated As of 6.2.0, replaced by {@link #getAvailableLanguageIds}
    */
    public java.lang.String[] getAvailableLocales();

    public java.lang.String getContentByLocale(java.lang.String languageId);

    /**
    * @deprecated As of 6.2.0, replaced by {@link #getDefaultLanguageId}
    */
    public java.lang.String getDefaultLocale();

    public com.liferay.portlet.journal.model.JournalFolder getFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getSmallImageType()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean hasApprovedVersion()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isInTrashExplicitly()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isTemplateDriven();

    public void setSmallImageType(java.lang.String smallImageType);
}
