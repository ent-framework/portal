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

package com.liferay.taglib.portletext;

import com.liferay.portal.kernel.servlet.taglib.FileAvailabilityUtil;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.taglib.ui.IconTag;

/**
 * @author Brian Wing Shun Chan
 * @author Shuyang Zhou
 */
public class IconEditTag extends IconTag {

    private static final String _PAGE =
            "/html/taglib/portlet/icon_edit/page.jsp";

    @Override
    protected String getPage() {
        if (FileAvailabilityUtil.isAvailable(servletContext, _PAGE)) {
            return _PAGE;
        }

        PortletDisplay portletDisplay =
                (PortletDisplay) pageContext.getAttribute("portletDisplay");

        if (!portletDisplay.isShowEditIcon()) {
            return null;
        }

        setImage("../aui/edit");
        setMessage("preferences");
        setToolTip(false);
        setUrl(portletDisplay.getURLEdit());

        return super.getPage();
    }

}