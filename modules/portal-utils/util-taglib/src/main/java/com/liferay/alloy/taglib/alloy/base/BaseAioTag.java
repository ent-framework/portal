package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseAioTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:a-io:";
  private static final String _PAGE = "/html/taglib/alloy/a_io/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:a-io:");
    
    return super.doStartTag();
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
  }
  

  protected String getPage()
  {
    return "/html/taglib/alloy/a_io/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request) {}
}
