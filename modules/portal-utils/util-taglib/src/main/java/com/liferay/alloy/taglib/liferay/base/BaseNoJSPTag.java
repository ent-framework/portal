package com.liferay.alloy.taglib.liferay.base;

import com.liferay.portal.kernel.servlet.taglib.TagSupport;
import javax.servlet.jsp.JspException;















public abstract class BaseNoJSPTag
  extends TagSupport
{
  private static final String _END_PAGE = "/html/taglib/liferay/no_jsp/end.jsp";
  private static final String _START_PAGE = "/html/taglib/liferay/no_jsp/start.jsp";
  
  public int doStartTag()
    throws JspException
  {
    return super.doStartTag();
  }
  
  public String getTest() {
    return this._test;
  }
  
  public void setTest(String test) {
    this._test = test;
  }
  
  protected void cleanUp() {
    this._test = null;
  }
  
  protected String getEndPage() {
    return "/html/taglib/liferay/no_jsp/end.jsp";
  }
  
  protected String getStartPage() {
    return "/html/taglib/liferay/no_jsp/start.jsp";
  }
  






  private String _test = null;
}
