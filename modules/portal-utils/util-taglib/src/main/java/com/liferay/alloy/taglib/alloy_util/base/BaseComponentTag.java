package com.liferay.alloy.taglib.alloy_util.base;

import com.liferay.taglib.util.IncludeTag;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;














public abstract class BaseComponentTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy_util:component:";
  private static final String _PAGE = "/html/taglib/alloy_util/component/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy_util:component:");
    
    return super.doStartTag();
  }
  
  public boolean getDefineVar() {
    return this._defineVar;
  }
  
  public String getExcludeAttributes() {
    return this._excludeAttributes;
  }
  
  public String getJavaScriptAttributes() {
    return this._javaScriptAttributes;
  }
  
  public Object getTagPageContext() {
    return this._tagPageContext;
  }
  
  public String getVar() {
    return this._var;
  }
  
  public String getModule() {
    return this._module;
  }
  
  public String getName() {
    return this._name;
  }
  
  public Map getOptions() {
    return this._options;
  }
  
  public void setDefineVar(boolean defineVar) {
    this._defineVar = defineVar;
    
    setScopedAttribute("defineVar", Boolean.valueOf(defineVar));
  }
  
  public void setExcludeAttributes(String excludeAttributes) {
    this._excludeAttributes = excludeAttributes;
    
    setScopedAttribute("excludeAttributes", excludeAttributes);
  }
  
  public void setJavaScriptAttributes(String javaScriptAttributes) {
    this._javaScriptAttributes = javaScriptAttributes;
    
    setScopedAttribute("javaScriptAttributes", javaScriptAttributes);
  }
  
  public void setTagPageContext(Object tagPageContext) {
    this._tagPageContext = tagPageContext;
    
    setScopedAttribute("tagPageContext", tagPageContext);
  }
  
  public void setVar(String var) {
    this._var = var;
    
    setScopedAttribute("var", var);
  }
  
  public void setModule(String module) {
    this._module = module;
    
    setScopedAttribute("module", module);
  }
  
  public void setName(String name) {
    this._name = name;
    
    setScopedAttribute("name", name);
  }
  
  public void setOptions(Map options) {
    this._options = options;
    
    setScopedAttribute("options", options);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._defineVar = true;
    this._excludeAttributes = null;
    this._javaScriptAttributes = null;
    this._tagPageContext = null;
    this._var = null;
    this._module = null;
    this._name = null;
    this._options = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy_util/component/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "defineVar", Boolean.valueOf(this._defineVar));
    setNamespacedAttribute(request, "excludeAttributes", this._excludeAttributes);
    setNamespacedAttribute(request, "javaScriptAttributes", this._javaScriptAttributes);
    setNamespacedAttribute(request, "tagPageContext", this._tagPageContext);
    setNamespacedAttribute(request, "var", this._var);
    setNamespacedAttribute(request, "module", this._module);
    setNamespacedAttribute(request, "name", this._name);
    setNamespacedAttribute(request, "options", this._options);
  }
  





  private boolean _defineVar = true;
  private String _excludeAttributes = null;
  private String _javaScriptAttributes = null;
  private Object _tagPageContext = null;
  private String _var = null;
  private String _module = null;
  private String _name = null;
  private Map _options = null;
}
