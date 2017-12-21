package com.liferay.alloy.taglib.alloy_util.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseScriptTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy_util:script:";
  private static final String _PAGE = "/html/taglib/alloy_util/script/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy_util:script:");
    
    return super.doStartTag();
  }
  
  public String getPosition() {
    return this._position;
  }
  
  public Boolean getPrintBuffer() {
    return this._printBuffer;
  }
  
  public String getUse() {
    return this._use;
  }
  
  public void setPosition(String position) {
    this._position = position;
    
    setScopedAttribute("position", position);
  }
  
  public void setPrintBuffer(Boolean printBuffer) {
    this._printBuffer = printBuffer;
    
    setScopedAttribute("printBuffer", printBuffer);
  }
  
  public void setUse(String use) {
    this._use = use;
    
    setScopedAttribute("use", use);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._position = null;
    this._printBuffer = null;
    this._use = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy_util/script/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "position", this._position);
    setNamespacedAttribute(request, "printBuffer", this._printBuffer);
    setNamespacedAttribute(request, "use", this._use);
  }
  





  private String _position = null;
  private Boolean _printBuffer = null;
  private String _use = null;
}
