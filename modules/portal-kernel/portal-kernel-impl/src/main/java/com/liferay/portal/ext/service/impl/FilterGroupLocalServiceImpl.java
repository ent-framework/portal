/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.ext.service.impl;

import java.util.List;

import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.ext.service.base.FilterGroupLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the filter group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portal.ext.service.FilterGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilterGroupLocalServiceBaseImpl
 * @see com.liferay.portal.ext.service.FilterGroupLocalServiceUtil
 */
public class FilterGroupLocalServiceImpl extends FilterGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.portal.ext.service.FilterGroupLocalServiceUtil} to access the filter group local service.
	 */
	public boolean isInScope(long groupId, long filterScopeId) {
		boolean ret = false;
		
		try {
			int total = this.filterGroupPersistence.countByFilterScopeId(filterScopeId);
			
			if (total==0) return true;
		
			ret = (this.filterGroupPersistence.countByF_G(groupId, filterScopeId)>0);
		} catch (SystemException e) {
			ret = false;
		}
		return ret;
	}
	
	
	public void addFilterGroup(long filterScopeId, long[] groupIds) throws Exception {
		List<FilterGroup> filterGroups = this.filterGroupPersistence.findByFilterScopeId(filterScopeId);
		if (filterGroups!=null) {
			for (FilterGroup fg : filterGroups) {
				this.deleteFilterGroup(fg);
			}
		}
		
		for (long groupId : groupIds) {
			FilterGroup fg = this.createFilterGroup(this.counterLocalService.increment(getModelClassName()));
			fg.setGroupId(groupId);
			fg.setFilterScopeId(filterScopeId);
			this.addFilterGroup(fg);
		}
	}
	
	public List<FilterGroup> findByFilterScopeId(long filterScopeId) throws SystemException {
		return this.filterGroupPersistence.findByFilterScopeId(filterScopeId);
	}	
}