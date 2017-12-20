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

package com.liferay.portal.ext.model.impl;

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FilterScope in entity cache.
 *
 * @author Jeff Qian
 * @see FilterScope
 * @generated
 */
public class FilterScopeCacheModel implements CacheModel<FilterScope>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{filterScopeId=");
		sb.append(filterScopeId);
		sb.append(", filterName=");
		sb.append(filterName);
		sb.append(", className=");
		sb.append(className);
		sb.append(", contextPath=");
		sb.append(contextPath);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilterScope toEntityModel() {
		FilterScopeImpl filterScopeImpl = new FilterScopeImpl();

		filterScopeImpl.setFilterScopeId(filterScopeId);

		if (filterName == null) {
			filterScopeImpl.setFilterName(StringPool.BLANK);
		}
		else {
			filterScopeImpl.setFilterName(filterName);
		}

		if (className == null) {
			filterScopeImpl.setClassName(StringPool.BLANK);
		}
		else {
			filterScopeImpl.setClassName(className);
		}

		if (contextPath == null) {
			filterScopeImpl.setContextPath(StringPool.BLANK);
		}
		else {
			filterScopeImpl.setContextPath(contextPath);
		}

		filterScopeImpl.resetOriginalValues();

		return filterScopeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filterScopeId = objectInput.readLong();
		filterName = objectInput.readUTF();
		className = objectInput.readUTF();
		contextPath = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(filterScopeId);

		if (filterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filterName);
		}

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}

		if (contextPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contextPath);
		}
	}

	public long filterScopeId;
	public String filterName;
	public String className;
	public String contextPath;
}