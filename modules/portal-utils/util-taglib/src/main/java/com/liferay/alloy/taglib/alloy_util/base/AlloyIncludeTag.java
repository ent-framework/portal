package com.liferay.alloy.taglib.alloy_util.base;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;


















public class AlloyIncludeTag
  extends IncludeTag
{
  protected boolean isDirectServletContextEnabled()
  {
    return false;
  }
  
  protected boolean isWARFile(HttpServletRequest request)
    throws SystemException
  {
    return false;
  }
  
  protected boolean themeResourceExists(String page)
    throws Exception
  {
    return false;
  }
}
