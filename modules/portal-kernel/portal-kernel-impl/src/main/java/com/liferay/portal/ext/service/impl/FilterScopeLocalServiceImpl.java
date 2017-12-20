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

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.ext.service.base.FilterScopeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

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
 * @see com.liferay.portal.ext.service.base.FilterScopeLocalServiceBaseImpl
 * @see com.liferay.portal.ext.service.FilterScopeLocalServiceUtil
 */
public class FilterScopeLocalServiceImpl extends FilterScopeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.portal.ext.service.FilterScopeLocalServiceUtil} to access the filter scope local service.
	 */
	public FilterScope query(String filterName, String className){
		return query(filterName, className, "");
	}
	
	public FilterScope query(String filterName, String className, String contextPath){
		FilterScope fs = null;
		try {
			fs = this.filterScopePersistence.findByFCC(filterName, className, contextPath);
		} catch (Exception e) {
		}
		return fs;
	}
	
	public List<FilterScope> findByContextPath(String contextPath) throws SystemException {
		return this.filterScopePersistence.findByContextPath(contextPath);
	}
	
	public List<FilterScope> findByContextPath(String contextPath, int start, int end) throws SystemException {
		return this.filterScopePersistence.findByContextPath(contextPath, start, end);
	}
	
	public int countByContextPath(String contextPath) throws SystemException {
		return this.filterScopePersistence.countByContextPath(contextPath);
	}
	
	public FilterScope createIfNotExist(String filterName, String className, String contextPath){
		FilterScope fs = null;
		try {
			fs = this.filterScopePersistence.findByFCC(filterName, className, contextPath);
		} catch (Exception e) {
		}
		
		if (fs!=null) return fs;
		
		try {

			fs = this.createFilterScope(this.counterLocalService.increment(FilterScope.class.getName()));
			fs.setClassName(className);
			fs.setFilterName(filterName);
			fs.setContextPath(contextPath);
			return this.addFilterScope(fs);

		} catch (Exception ex) {
			
		}
		return null;
	}		
}