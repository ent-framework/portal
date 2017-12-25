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

package com.liferay.taglib.aui;

import com.liferay.portal.kernel.servlet.taglib.aui.ToolTag;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.base.BasePanelTag;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Julio Camarero
 * @author Brian Wing Shun Chan
 */
public class PanelTag extends BasePanelTag {

    private static final boolean _CLEAN_UP_SET_ATTRIBUTES = true;
    private List<ToolTag> _toolTags;

    public void addToolTag(ToolTag toolTag) {
        if (_toolTags == null) {
            _toolTags = new ArrayList<ToolTag>();
        }

        _toolTags.add(toolTag);
    }

    public List<ToolTag> getToolTags() {
        return _toolTags;
    }

    @Override
    protected void cleanUp() {
        super.cleanUp();

        if (_toolTags != null) {
            for (ToolTag toolTag : _toolTags) {
                toolTag.cleanUp();
            }

            _toolTags = null;
        }
    }

    @Override
    protected boolean isCleanUpSetAttributes() {
        return _CLEAN_UP_SET_ATTRIBUTES;
    }

    @Override
    protected void setAttributes(HttpServletRequest request) {
        super.setAttributes(request);

        String id = getId();

        if (Validator.isNull(id)) {
            id = StringUtil.randomId();
        }

        setNamespacedAttribute(request, "id", id);
        setNamespacedAttribute(request, "toolTags", _toolTags);
    }

}