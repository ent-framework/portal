package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.ExportImportHelperUtil;
import com.liferay.portal.kernel.lar.ManifestSummary;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.StagedModelDataHandler;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerRegistryUtil;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.documentlibrary.model.DLFolder;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DLFolderExportActionableDynamicQuery
    extends DLFolderActionableDynamicQuery {
    private PortletDataContext _portletDataContext;

    public DLFolderExportActionableDynamicQuery(
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
        Criterion modifiedDateCriterion = _portletDataContext.getDateRangeCriteria(
                "modifiedDate");
        Criterion statusDateCriterion = _portletDataContext.getDateRangeCriteria(
                "statusDate");

        if ((modifiedDateCriterion != null) && (statusDateCriterion != null)) {
            Disjunction disjunction = RestrictionsFactoryUtil.disjunction();

            disjunction.add(modifiedDateCriterion);
            disjunction.add(statusDateCriterion);

            dynamicQuery.add(disjunction);
        }

        Property workflowStatusProperty = PropertyFactoryUtil.forName("status");

        if (_portletDataContext.isInitialPublication()) {
            dynamicQuery.add(workflowStatusProperty.ne(
                    WorkflowConstants.STATUS_IN_TRASH));
        } else {
            StagedModelDataHandler<?> stagedModelDataHandler = StagedModelDataHandlerRegistryUtil.getStagedModelDataHandler(DLFolder.class.getName());

            dynamicQuery.add(workflowStatusProperty.in(
                    stagedModelDataHandler.getExportableStatuses()));
        }
    }

    protected StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                DLFolder.class.getName()));
    }

    @Override
    @SuppressWarnings("unused")
    protected void performAction(Object object)
        throws PortalException, SystemException {
        DLFolder stagedModel = (DLFolder) object;

        StagedModelDataHandlerUtil.exportStagedModel(_portletDataContext,
            stagedModel);
    }
}
