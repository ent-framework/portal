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

package com.liferay.portlet.assetpublisher.util;

import com.liferay.portal.kernel.bean.Util;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portlet.asset.model.AssetEntry;

/**
 * @author Juan Fernández
 */
@Util
public class AssetPublisherHelperUtil {

	public static AssetPublisherHelper getAssetPublisherHelper() {
		return _assetPublisherHelper;
	}

	public static String getAssetViewURL(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse, AssetEntry assetEntry) {

		return getAssetPublisherHelper().getAssetViewURL(
			liferayPortletRequest, liferayPortletResponse, assetEntry);
	}

	public void setAssetPublisherHelper(
		AssetPublisherHelper assetPublisherHelper) {

		_assetPublisherHelper = assetPublisherHelper;
	}

	private static AssetPublisherHelper _assetPublisherHelper;

}