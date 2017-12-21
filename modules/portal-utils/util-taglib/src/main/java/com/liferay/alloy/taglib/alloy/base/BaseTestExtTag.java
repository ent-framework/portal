package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseTestExtTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:test-ext:";
  private static final String _PAGE = "/html/taglib/alloy/test_ext/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:test-ext:");
    
    return super.doStartTag();
  }
  
  public String getTest() {
    return this._test;
  }
  
  public void setTest(String test) {
    this._test = test;
    
    setScopedAttribute("test", test);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._test = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/test_ext/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "test", this._test);
  }
  





  private String _test = null;
}
