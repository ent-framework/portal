/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.portal.workflow.kaleo.designer.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition;
import com.liferay.portal.workflow.kaleo.designer.service.base.KaleoDraftDefinitionServiceBaseImpl;
import com.liferay.portal.workflow.kaleo.designer.service.permission.KaleoDraftDefinitionPermission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author Gregory Amerson
 * @author Eduardo Lundgren
 */
public class KaleoDraftDefinitionServiceImpl extends
		KaleoDraftDefinitionServiceBaseImpl {

	public KaleoDraftDefinition addKaleoDraftDefinition(long userId,
			String name, Map<Locale, String> titleMap, String content,
			int version, int draftVersion, ServiceContext serviceContext)
			throws PortalException, SystemException {

		return kaleoDraftDefinitionLocalService.addKaleoDraftDefinition(userId,
				name, titleMap, content, version, draftVersion, serviceContext);
	}

	public KaleoDraftDefinition getKaleoDraftDefinition(String name,
			int version, int draftVersion, ServiceContext serviceContext)
			throws PortalException, SystemException {

		return kaleoDraftDefinitionLocalService.getKaleoDraftDefinition(name,
				version, draftVersion, serviceContext);
	}

	public List<KaleoDraftDefinition> getLatestKaleoDraftDefinitions(
			long companyId, int version, int start, int end,
			OrderByComparator orderByComparator) throws PortalException,
			SystemException {
		List<KaleoDraftDefinition> latestKaleoDraftDefinitions = this.kaleoDraftDefinitionLocalService
				.getLatestKaleoDraftDefinitions(companyId, version, start, end,
						orderByComparator);

		return filterKaleoDraftDefinitions(latestKaleoDraftDefinitions, "VIEW");
	}

	public List<KaleoDraftDefinition> getKaleoDraftDefinitions()
			throws SystemException {

		return kaleoDraftDefinitionLocalService.getKaleoDraftDefinitions(
				QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public KaleoDraftDefinition getLatestKaleoDraftDefinition(String name,
			int version, ServiceContext serviceContext) throws PortalException,
			SystemException {

		return kaleoDraftDefinitionLocalService.getLatestKaleoDraftDefinition(
				name, version, serviceContext);
	}

	public KaleoDraftDefinition publishKaleoDraftDefinition(long userId,
			String name, Map<Locale, String> titleMap, String content,
			ServiceContext serviceContext) throws PortalException,
			SystemException {

		return kaleoDraftDefinitionLocalService.publishKaleoDraftDefinition(
				userId, name, titleMap, content, serviceContext);
	}

	public KaleoDraftDefinition updateKaleoDraftDefinition(long userId,
			String name, Map<Locale, String> titleMap, String content,
			int version, ServiceContext serviceContext) throws PortalException,
			SystemException {

		KaleoDraftDefinition kaleoDraftDefinition = kaleoDraftDefinitionLocalService
				.updateKaleoDraftDefinition(userId, name, titleMap, content,
						version, serviceContext);

		return kaleoDraftDefinition;
	}

	protected List<KaleoDraftDefinition> filterKaleoDraftDefinitions(
			List<KaleoDraftDefinition> kaleoDraftDefinitions, String actionId)
			throws PrincipalException {
		List<KaleoDraftDefinition> filteredKaleoDraftDefinitions = new ArrayList<KaleoDraftDefinition>();

		Iterator<KaleoDraftDefinition> localIterator = kaleoDraftDefinitions.iterator();

		while (localIterator.hasNext()) {
			KaleoDraftDefinition kaleoDraftDefinition = (KaleoDraftDefinition) localIterator
					.next();

			if (KaleoDraftDefinitionPermission.contains(getPermissionChecker(),
					kaleoDraftDefinition, actionId)) {
				filteredKaleoDraftDefinitions.add(kaleoDraftDefinition);
			}
		}

		return Collections.unmodifiableList(filteredKaleoDraftDefinitions);
	}
}