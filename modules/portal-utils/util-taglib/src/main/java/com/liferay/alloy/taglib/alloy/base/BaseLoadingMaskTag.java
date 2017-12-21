package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseLoadingMaskTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:loading-mask:";
  private static final String _PAGE = "/html/taglib/alloy/loading_mask/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:loading-mask:");
    
    return super.doStartTag();
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public Object getHost() {
    return this._host;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public String getMessageEl() {
    return this._messageEl;
  }
  
  public Object getStrings() {
    return this._strings;
  }
  
  public Object getTarget() {
    return this._target;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterHostChange() {
    return this._afterHostChange;
  }
  
  public Object getAfterInit() {
    return this._afterInit;
  }
  
  public Object getAfterInitializedChange() {
    return this._afterInitializedChange;
  }
  
  public Object getAfterMessageElChange() {
    return this._afterMessageElChange;
  }
  
  public Object getAfterStringsChange() {
    return this._afterStringsChange;
  }
  
  public Object getAfterTargetChange() {
    return this._afterTargetChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnHostChange() {
    return this._onHostChange;
  }
  
  public Object getOnInit() {
    return this._onInit;
  }
  
  public Object getOnInitializedChange() {
    return this._onInitializedChange;
  }
  
  public Object getOnMessageElChange() {
    return this._onMessageElChange;
  }
  
  public Object getOnStringsChange() {
    return this._onStringsChange;
  }
  
  public Object getOnTargetChange() {
    return this._onTargetChange;
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setHost(Object host) {
    this._host = host;
    
    setScopedAttribute("host", host);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setMessageEl(String messageEl) {
    this._messageEl = messageEl;
    
    setScopedAttribute("messageEl", messageEl);
  }
  
  public void setStrings(Object strings) {
    this._strings = strings;
    
    setScopedAttribute("strings", strings);
  }
  
  public void setTarget(Object target) {
    this._target = target;
    
    setScopedAttribute("target", target);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterHostChange(Object afterHostChange) {
    this._afterHostChange = afterHostChange;
    
    setScopedAttribute("afterHostChange", afterHostChange);
  }
  
  public void setAfterInit(Object afterInit) {
    this._afterInit = afterInit;
    
    setScopedAttribute("afterInit", afterInit);
  }
  
  public void setAfterInitializedChange(Object afterInitializedChange) {
    this._afterInitializedChange = afterInitializedChange;
    
    setScopedAttribute("afterInitializedChange", afterInitializedChange);
  }
  
  public void setAfterMessageElChange(Object afterMessageElChange) {
    this._afterMessageElChange = afterMessageElChange;
    
    setScopedAttribute("afterMessageElChange", afterMessageElChange);
  }
  
  public void setAfterStringsChange(Object afterStringsChange) {
    this._afterStringsChange = afterStringsChange;
    
    setScopedAttribute("afterStringsChange", afterStringsChange);
  }
  
  public void setAfterTargetChange(Object afterTargetChange) {
    this._afterTargetChange = afterTargetChange;
    
    setScopedAttribute("afterTargetChange", afterTargetChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnHostChange(Object onHostChange) {
    this._onHostChange = onHostChange;
    
    setScopedAttribute("onHostChange", onHostChange);
  }
  
  public void setOnInit(Object onInit) {
    this._onInit = onInit;
    
    setScopedAttribute("onInit", onInit);
  }
  
  public void setOnInitializedChange(Object onInitializedChange) {
    this._onInitializedChange = onInitializedChange;
    
    setScopedAttribute("onInitializedChange", onInitializedChange);
  }
  
  public void setOnMessageElChange(Object onMessageElChange) {
    this._onMessageElChange = onMessageElChange;
    
    setScopedAttribute("onMessageElChange", onMessageElChange);
  }
  
  public void setOnStringsChange(Object onStringsChange) {
    this._onStringsChange = onStringsChange;
    
    setScopedAttribute("onStringsChange", onStringsChange);
  }
  
  public void setOnTargetChange(Object onTargetChange) {
    this._onTargetChange = onTargetChange;
    
    setScopedAttribute("onTargetChange", onTargetChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._destroyed = false;
    this._host = null;
    this._initialized = false;
    this._messageEl = null;
    this._strings = null;
    this._target = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterHostChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterMessageElChange = null;
    this._afterStringsChange = null;
    this._afterTargetChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onHostChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onMessageElChange = null;
    this._onStringsChange = null;
    this._onTargetChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/loading_mask/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "host", this._host);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "messageEl", this._messageEl);
    setNamespacedAttribute(request, "strings", this._strings);
    setNamespacedAttribute(request, "target", this._target);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterHostChange", this._afterHostChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterMessageElChange", this._afterMessageElChange);
    setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
    setNamespacedAttribute(request, "afterTargetChange", this._afterTargetChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onHostChange", this._onHostChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onMessageElChange", this._onMessageElChange);
    setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
    setNamespacedAttribute(request, "onTargetChange", this._onTargetChange);
  }
  





  private boolean _destroyed = false;
  private Object _host = null;
  private boolean _initialized = false;
  private String _messageEl = null;
  private Object _strings = null;
  private Object _target = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterHostChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterMessageElChange = null;
  private Object _afterStringsChange = null;
  private Object _afterTargetChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onHostChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onMessageElChange = null;
  private Object _onStringsChange = null;
  private Object _onTargetChange = null;
}
