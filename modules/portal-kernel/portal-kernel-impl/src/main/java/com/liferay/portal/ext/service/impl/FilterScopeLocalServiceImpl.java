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

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.ext.service.base.FilterScopeLocalServiceBaseImpl;

/**
 * The implementation of the filter scope local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portal.ext.service.FilterScopeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilterScopeLocalServiceBaseImpl
 * @see com.liferay.portal.ext.service.FilterScopeLocalServiceUtil
 */
public class FilterScopeLocalServiceImpl extends FilterScopeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.portal.ext.service.FilterScopeLocalServiceUtil} to access the filter scope local service.
	 */
	public FilterScope queryOrNew(String filterName, String className){
		FilterScope fs = null;
		boolean exist = false;
		try {
			exist = (this.filterScopePersistence.countByFC(className, filterName)>0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if (!exist) {
				fs = this.createFilterScope(this.counterLocalService.increment(FilterScope.class.getName()));
				fs.setClassName(className);
				fs.setFilterName(filterName);
				return this.addFilterScope(fs);
			} else {
				return this.filterScopePersistence.findByFC(className, filterName);
			}
		} catch (Exception ex) {
			
		}
		return null;
	}	
}