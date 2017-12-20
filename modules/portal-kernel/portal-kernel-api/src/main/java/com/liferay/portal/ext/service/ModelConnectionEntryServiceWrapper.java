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

package com.liferay.portal.ext.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ModelConnectionEntryService}.
 *
 * @author Jeff Qian
 * @see ModelConnectionEntryService
 * @generated
 */
@ProviderType
public class ModelConnectionEntryServiceWrapper
	implements ModelConnectionEntryService,
		ServiceWrapper<ModelConnectionEntryService> {
	public ModelConnectionEntryServiceWrapper(
		ModelConnectionEntryService modelConnectionEntryService) {
		_modelConnectionEntryService = modelConnectionEntryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _modelConnectionEntryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_modelConnectionEntryService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ModelConnectionEntryService getWrappedModelConnectionEntryService() {
		return _modelConnectionEntryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedModelConnectionEntryService(
		ModelConnectionEntryService modelConnectionEntryService) {
		_modelConnectionEntryService = modelConnectionEntryService;
	}

	@Override
	public ModelConnectionEntryService getWrappedService() {
		return _modelConnectionEntryService;
	}

	@Override
	public void setWrappedService(
		ModelConnectionEntryService modelConnectionEntryService) {
		_modelConnectionEntryService = modelConnectionEntryService;
	}

	private ModelConnectionEntryService _modelConnectionEntryService;
}