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

import com.liferay.taglib.aui.base.BaseLayoutTag;

import javax.servlet.jsp.JspWriter;

/**
 * @author Julio Camarero
 * @author Jorge Ferrer
 * @author Brian Wing Shun Chan
 */
public class LayoutTag extends BaseLayoutTag {

    private static final boolean _CLEAN_UP_SET_ATTRIBUTES = true;

    @Override
    protected boolean isCleanUpSetAttributes() {
        return _CLEAN_UP_SET_ATTRIBUTES;
    }

    @Override
    protected int processEndTag() throws Exception {
        JspWriter jspWriter = pageContext.getOut();

        jspWriter.write("</div></div>");

        return EVAL_PAGE;
    }

}