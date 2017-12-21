package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseLiveSearchTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:live-search:";
  private static final String _PAGE = "/html/taglib/alloy/live_search/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:live-search:");
    
    return super.doStartTag();
  }
  
  public Object getData() {
    return this._data;
  }
  
  public Object getDelay() {
    return this._delay;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public Object getHide() {
    return this._hide;
  }
  
  public Object getIndex() {
    return this._index;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public String getInput() {
    return this._input;
  }
  
  public Object getMatchRegex() {
    return this._matchRegex;
  }
  
  public Object getNodes() {
    return this._nodes;
  }
  
  public String getSearchValue() {
    return this._searchValue;
  }
  
  public Object getShow() {
    return this._show;
  }
  
  public Object getAfterDataChange() {
    return this._afterDataChange;
  }
  
  public Object getAfterDelayChange() {
    return this._afterDelayChange;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterHideChange() {
    return this._afterHideChange;
  }
  
  public Object getAfterIndexChange() {
    return this._afterIndexChange;
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
  
  public Object getAfterMatchRegexChange() {
    return this._afterMatchRegexChange;
  }
  
  public Object getAfterNodesChange() {
    return this._afterNodesChange;
  }
  
  public Object getAfterSearchValueChange() {
    return this._afterSearchValueChange;
  }
  
  public Object getAfterShowChange() {
    return this._afterShowChange;
  }
  
  public Object getOnDataChange() {
    return this._onDataChange;
  }
  
  public Object getOnDelayChange() {
    return this._onDelayChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnHideChange() {
    return this._onHideChange;
  }
  
  public Object getOnIndexChange() {
    return this._onIndexChange;
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
  
  public Object getOnMatchRegexChange() {
    return this._onMatchRegexChange;
  }
  
  public Object getOnNodesChange() {
    return this._onNodesChange;
  }
  
  public Object getOnSearchValueChange() {
    return this._onSearchValueChange;
  }
  
  public Object getOnShowChange() {
    return this._onShowChange;
  }
  
  public void setData(Object data) {
    this._data = data;
    
    setScopedAttribute("data", data);
  }
  
  public void setDelay(Object delay) {
    this._delay = delay;
    
    setScopedAttribute("delay", delay);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setHide(Object hide) {
    this._hide = hide;
    
    setScopedAttribute("hide", hide);
  }
  
  public void setIndex(Object index) {
    this._index = index;
    
    setScopedAttribute("index", index);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setInput(String input) {
    this._input = input;
    
    setScopedAttribute("input", input);
  }
  
  public void setMatchRegex(Object matchRegex) {
    this._matchRegex = matchRegex;
    
    setScopedAttribute("matchRegex", matchRegex);
  }
  
  public void setNodes(Object nodes) {
    this._nodes = nodes;
    
    setScopedAttribute("nodes", nodes);
  }
  
  public void setSearchValue(String searchValue) {
    this._searchValue = searchValue;
    
    setScopedAttribute("searchValue", searchValue);
  }
  
  public void setShow(Object show) {
    this._show = show;
    
    setScopedAttribute("show", show);
  }
  
  public void setAfterDataChange(Object afterDataChange) {
    this._afterDataChange = afterDataChange;
    
    setScopedAttribute("afterDataChange", afterDataChange);
  }
  
  public void setAfterDelayChange(Object afterDelayChange) {
    this._afterDelayChange = afterDelayChange;
    
    setScopedAttribute("afterDelayChange", afterDelayChange);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterHideChange(Object afterHideChange) {
    this._afterHideChange = afterHideChange;
    
    setScopedAttribute("afterHideChange", afterHideChange);
  }
  
  public void setAfterIndexChange(Object afterIndexChange) {
    this._afterIndexChange = afterIndexChange;
    
    setScopedAttribute("afterIndexChange", afterIndexChange);
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
  
  public void setAfterMatchRegexChange(Object afterMatchRegexChange) {
    this._afterMatchRegexChange = afterMatchRegexChange;
    
    setScopedAttribute("afterMatchRegexChange", afterMatchRegexChange);
  }
  
  public void setAfterNodesChange(Object afterNodesChange) {
    this._afterNodesChange = afterNodesChange;
    
    setScopedAttribute("afterNodesChange", afterNodesChange);
  }
  
  public void setAfterSearchValueChange(Object afterSearchValueChange) {
    this._afterSearchValueChange = afterSearchValueChange;
    
    setScopedAttribute("afterSearchValueChange", afterSearchValueChange);
  }
  
  public void setAfterShowChange(Object afterShowChange) {
    this._afterShowChange = afterShowChange;
    
    setScopedAttribute("afterShowChange", afterShowChange);
  }
  
  public void setOnDataChange(Object onDataChange) {
    this._onDataChange = onDataChange;
    
    setScopedAttribute("onDataChange", onDataChange);
  }
  
  public void setOnDelayChange(Object onDelayChange) {
    this._onDelayChange = onDelayChange;
    
    setScopedAttribute("onDelayChange", onDelayChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnHideChange(Object onHideChange) {
    this._onHideChange = onHideChange;
    
    setScopedAttribute("onHideChange", onHideChange);
  }
  
  public void setOnIndexChange(Object onIndexChange) {
    this._onIndexChange = onIndexChange;
    
    setScopedAttribute("onIndexChange", onIndexChange);
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
  
  public void setOnMatchRegexChange(Object onMatchRegexChange) {
    this._onMatchRegexChange = onMatchRegexChange;
    
    setScopedAttribute("onMatchRegexChange", onMatchRegexChange);
  }
  
  public void setOnNodesChange(Object onNodesChange) {
    this._onNodesChange = onNodesChange;
    
    setScopedAttribute("onNodesChange", onNodesChange);
  }
  
  public void setOnSearchValueChange(Object onSearchValueChange) {
    this._onSearchValueChange = onSearchValueChange;
    
    setScopedAttribute("onSearchValueChange", onSearchValueChange);
  }
  
  public void setOnShowChange(Object onShowChange) {
    this._onShowChange = onShowChange;
    
    setScopedAttribute("onShowChange", onShowChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._data = null;
    this._delay = Integer.valueOf(250);
    this._destroyed = false;
    this._hide = null;
    this._index = null;
    this._initialized = false;
    this._input = null;
    this._matchRegex = null;
    this._nodes = null;
    this._searchValue = null;
    this._show = null;
    this._afterDataChange = null;
    this._afterDelayChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterHideChange = null;
    this._afterIndexChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterInputChange = null;
    this._afterMatchRegexChange = null;
    this._afterNodesChange = null;
    this._afterSearchValueChange = null;
    this._afterShowChange = null;
    this._onDataChange = null;
    this._onDelayChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onHideChange = null;
    this._onIndexChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onInputChange = null;
    this._onMatchRegexChange = null;
    this._onNodesChange = null;
    this._onSearchValueChange = null;
    this._onShowChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/live_search/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "data", this._data);
    setNamespacedAttribute(request, "delay", this._delay);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "hide", this._hide);
    setNamespacedAttribute(request, "index", this._index);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "input", this._input);
    setNamespacedAttribute(request, "matchRegex", this._matchRegex);
    setNamespacedAttribute(request, "nodes", this._nodes);
    setNamespacedAttribute(request, "searchValue", this._searchValue);
    setNamespacedAttribute(request, "show", this._show);
    setNamespacedAttribute(request, "afterDataChange", this._afterDataChange);
    setNamespacedAttribute(request, "afterDelayChange", this._afterDelayChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterHideChange", this._afterHideChange);
    setNamespacedAttribute(request, "afterIndexChange", this._afterIndexChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterInputChange", this._afterInputChange);
    setNamespacedAttribute(request, "afterMatchRegexChange", this._afterMatchRegexChange);
    setNamespacedAttribute(request, "afterNodesChange", this._afterNodesChange);
    setNamespacedAttribute(request, "afterSearchValueChange", this._afterSearchValueChange);
    setNamespacedAttribute(request, "afterShowChange", this._afterShowChange);
    setNamespacedAttribute(request, "onDataChange", this._onDataChange);
    setNamespacedAttribute(request, "onDelayChange", this._onDelayChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onHideChange", this._onHideChange);
    setNamespacedAttribute(request, "onIndexChange", this._onIndexChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onInputChange", this._onInputChange);
    setNamespacedAttribute(request, "onMatchRegexChange", this._onMatchRegexChange);
    setNamespacedAttribute(request, "onNodesChange", this._onNodesChange);
    setNamespacedAttribute(request, "onSearchValueChange", this._onSearchValueChange);
    setNamespacedAttribute(request, "onShowChange", this._onShowChange);
  }
  





  private Object _data = null;
  private Object _delay = Integer.valueOf(250);
  private boolean _destroyed = false;
  private Object _hide = null;
  private Object _index = null;
  private boolean _initialized = false;
  private String _input = null;
  private Object _matchRegex = null;
  private Object _nodes = null;
  private String _searchValue = null;
  private Object _show = null;
  private Object _afterDataChange = null;
  private Object _afterDelayChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterHideChange = null;
  private Object _afterIndexChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterInputChange = null;
  private Object _afterMatchRegexChange = null;
  private Object _afterNodesChange = null;
  private Object _afterSearchValueChange = null;
  private Object _afterShowChange = null;
  private Object _onDataChange = null;
  private Object _onDelayChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onHideChange = null;
  private Object _onIndexChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onInputChange = null;
  private Object _onMatchRegexChange = null;
  private Object _onNodesChange = null;
  private Object _onSearchValueChange = null;
  private Object _onShowChange = null;
}
