/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.taglib.theme;

import com.liferay.portal.model.*;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author Brian Wing Shun Chan
 */
public class DefineObjectsTei extends TagExtraInfo {

    private static VariableInfo[] _variableInfo = new VariableInfo[]{
            new VariableInfo(
                    "themeDisplay", ThemeDisplay.class.getName(), true,
                    VariableInfo.AT_END),
            new VariableInfo(
                    "company", Company.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "account", Account.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "user", User.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "realUser", User.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "contact", Contact.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "layout", Layout.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "layouts", List.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "plid", Long.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "layoutTypePortlet", LayoutTypePortlet.class.getName(), true,
                    VariableInfo.AT_END),
            new VariableInfo(
                    "scopeGroupId", Long.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "permissionChecker", PermissionChecker.class.getName(), true,
                    VariableInfo.AT_END),
            new VariableInfo(
                    "locale", Locale.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "timeZone", TimeZone.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "theme", Theme.class.getName(), true, VariableInfo.AT_END),
            new VariableInfo(
                    "colorScheme", ColorScheme.class.getName(), true,
                    VariableInfo.AT_END),
            new VariableInfo(
                    "portletDisplay", PortletDisplay.class.getName(), true,
                    VariableInfo.AT_END),

            // Deprecated

            new VariableInfo(
                    "portletGroupId", Long.class.getName(), true, VariableInfo.AT_END)
    };

    @Override
    public VariableInfo[] getVariableInfo(TagData tagData) {
        return _variableInfo;
    }

}