package com.liferay.portlet.mobiledevicerules.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.ExportImportHelperUtil;
import com.liferay.portal.kernel.lar.ManifestSummary;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance;

/**
 * @author Edward C. Han
 * @generated
 */
public class MDRRuleGroupInstanceExportActionableDynamicQuery
    extends MDRRuleGroupInstanceActionableDynamicQuery {
    private PortletDataContext _portletDataContext;

    public MDRRuleGroupInstanceExportActionableDynamicQuery(
        PortletDataContext portletDataContext) throws SystemException {
        _portletDataContext = portletDataContext;

        setCompanyId(_portletDataContext.getCompanyId());

        setGroupId(_portletDataContext.getScopeGroupId());
    }

    @Override
    public long performCount() throws PortalException, SystemException {
        ManifestSummary manifestSummary = _portletDataContext.getManifestSummary();

        StagedModelType stagedModelType = getStagedModelType();

        long modelAdditionCount = super.performCount();

        manifestSummary.addModelAdditionCount(stagedModelType.toString(),
            modelAdditionCount);

        long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(_portletDataContext,
                stagedModelType);

        manifestSummary.addModelDeletionCount(stagedModelType.toString(),
            modelDeletionCount);

        return modelAdditionCount;
    }

    @Override
    protected void addCriteria(DynamicQuery dynamicQuery) {
        _portletDataContext.addDateRangeCriteria(dynamicQuery, "modifiedDate");

        if (getStagedModelType().getReferrerClassNameId() >= 0) {
            Property classNameIdProperty = PropertyFactoryUtil.forName(
                    "classNameId");

            dynamicQuery.add(classNameIdProperty.eq(getStagedModelType()
                                                        .getReferrerClassNameId()));
        }
    }

    protected StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                MDRRuleGroupInstance.class.getName()));
    }

    @Override
    @SuppressWarnings("unused")
    protected void performAction(Object object)
        throws PortalException, SystemException {
        MDRRuleGroupInstance stagedModel = (MDRRuleGroupInstance) object;

        StagedModelDataHandlerUtil.exportStagedModel(_portletDataContext,
            stagedModel);
    }
}
