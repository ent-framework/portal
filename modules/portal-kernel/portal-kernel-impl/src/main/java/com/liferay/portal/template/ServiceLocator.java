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

package com.liferay.portal.template;

import com.liferay.portal.bean.BeanLocatorImpl;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Brian Wing Shun Chan
 */
public class ServiceLocator {

	public static ServiceLocator getInstance() {
		return _instance;
	}

	public Object findService(String serviceName) {
		Object bean = null;

		try {
			bean = PortalBeanLocatorUtil.locate(_getServiceName(serviceName));
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return bean;
	}

	public Object findService(String servletContextName, String serviceName) {
		return findService(serviceName);
	}

	private ServiceLocator() {
	}

	private String _getServiceName(String serviceName) {
		if (!serviceName.endsWith(BeanLocatorImpl.VELOCITY_SUFFIX)) {
			serviceName += BeanLocatorImpl.VELOCITY_SUFFIX;
		}

		return serviceName;
	}

	private static final Logger _log = LoggerFactory.getLogger(ServiceLocator.class);

	private static ServiceLocator _instance = new ServiceLocator();

}