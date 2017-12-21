package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseCharCounterTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:char-counter:";
  private static final String _PAGE = "/html/taglib/alloy/char_counter/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:char-counter:");
    
    return super.doStartTag();
  }
  
  public Object getCounter() {
    return this._counter;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public Object getInput() {
    return this._input;
  }
  
  public Object getMaxLength() {
    return this._maxLength;
  }
  
  public Object getAfterCounterChange() {
    return this._afterCounterChange;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterInit() {
    return this._afterInit;
  }
  
  public Object getAfterInitializedChange() {
    return this._afterInitializedChange;
  }
  
  public Object getAfterInputChange() {
    return this._afterInputChange;
  }
  
  public Object getAfterMaxLengthChange() {
    return this._afterMaxLengthChange;
  }
  
  public Object getOnCounterChange() {
    return this._onCounterChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnInit() {
    return this._onInit;
  }
  
  public Object getOnInitializedChange() {
    return this._onInitializedChange;
  }
  
  public Object getOnInputChange() {
    return this._onInputChange;
  }
  
  public Object getOnMaxLengthChange() {
    return this._onMaxLengthChange;
  }
  
  public void setCounter(Object counter) {
    this._counter = counter;
    
    setScopedAttribute("counter", counter);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setInput(Object input) {
    this._input = input;
    
    setScopedAttribute("input", input);
  }
  
  public void setMaxLength(Object maxLength) {
    this._maxLength = maxLength;
    
    setScopedAttribute("maxLength", maxLength);
  }
  
  public void setAfterCounterChange(Object afterCounterChange) {
    this._afterCounterChange = afterCounterChange;
    
    setScopedAttribute("afterCounterChange", afterCounterChange);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterInit(Object afterInit) {
    this._afterInit = afterInit;
    
    setScopedAttribute("afterInit", afterInit);
  }
  
  public void setAfterInitializedChange(Object afterInitializedChange) {
    this._afterInitializedChange = afterInitializedChange;
    
    setScopedAttribute("afterInitializedChange", afterInitializedChange);
  }
  
  public void setAfterInputChange(Object afterInputChange) {
    this._afterInputChange = afterInputChange;
    
    setScopedAttribute("afterInputChange", afterInputChange);
  }
  
  public void setAfterMaxLengthChange(Object afterMaxLengthChange) {
    this._afterMaxLengthChange = afterMaxLengthChange;
    
    setScopedAttribute("afterMaxLengthChange", afterMaxLengthChange);
  }
  
  public void setOnCounterChange(Object onCounterChange) {
    this._onCounterChange = onCounterChange;
    
    setScopedAttribute("onCounterChange", onCounterChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnInit(Object onInit) {
    this._onInit = onInit;
    
    setScopedAttribute("onInit", onInit);
  }
  
  public void setOnInitializedChange(Object onInitializedChange) {
    this._onInitializedChange = onInitializedChange;
    
    setScopedAttribute("onInitializedChange", onInitializedChange);
  }
  
  public void setOnInputChange(Object onInputChange) {
    this._onInputChange = onInputChange;
    
    setScopedAttribute("onInputChange", onInputChange);
  }
  
  public void setOnMaxLengthChange(Object onMaxLengthChange) {
    this._onMaxLengthChange = onMaxLengthChange;
    
    setScopedAttribute("onMaxLengthChange", onMaxLengthChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._counter = null;
    this._destroyed = false;
    this._initialized = false;
    this._input = null;
    this._maxLength = Integer.valueOf(Integer.MAX_VALUE);
    this._afterCounterChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterInputChange = null;
    this._afterMaxLengthChange = null;
    this._onCounterChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onInputChange = null;
    this._onMaxLengthChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/char_counter/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "counter", this._counter);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "input", this._input);
    setNamespacedAttribute(request, "maxLength", this._maxLength);
    setNamespacedAttribute(request, "afterCounterChange", this._afterCounterChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterInputChange", this._afterInputChange);
    setNamespacedAttribute(request, "afterMaxLengthChange", this._afterMaxLengthChange);
    setNamespacedAttribute(request, "onCounterChange", this._onCounterChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onInputChange", this._onInputChange);
    setNamespacedAttribute(request, "onMaxLengthChange", this._onMaxLengthChange);
  }
  





  private Object _counter = null;
  private boolean _destroyed = false;
  private boolean _initialized = false;
  private Object _input = null;
  private Object _maxLength = Integer.valueOf(Integer.MAX_VALUE);
  private Object _afterCounterChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterInputChange = null;
  private Object _afterMaxLengthChange = null;
  private Object _onCounterChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onInputChange = null;
  private Object _onMaxLengthChange = null;
}
