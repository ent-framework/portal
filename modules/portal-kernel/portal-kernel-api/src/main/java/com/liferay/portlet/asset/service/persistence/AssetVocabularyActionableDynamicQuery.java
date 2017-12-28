package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetVocabularyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetVocabularyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AssetVocabularyLocalServiceUtil.getService());
        setClass(AssetVocabulary.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("vocabularyId");
    }
}
