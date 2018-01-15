package com.liferay.portal.workflow.kaleo.designer.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition;
import com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionLocalServiceUtil;

/**
 * @author Eduardo Lundgren
 * @generated
 */
public abstract class KaleoDraftDefinitionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public KaleoDraftDefinitionActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(KaleoDraftDefinitionLocalServiceUtil.getService());
        setClass(KaleoDraftDefinition.class);

        setClassLoader(com.liferay.portal.workflow.kaleo.designer.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("kaleoDraftDefinitionId");
    }
}
