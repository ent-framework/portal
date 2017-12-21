package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseTreeViewDDTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:tree-view-dd:";
  private static final String _PAGE = "/html/taglib/alloy/tree_view_dd/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:tree-view-dd:");
    
    return super.doStartTag();
  }
  
  public String getCheckContainerEl() {
    return this._checkContainerEl;
  }
  
  public String getCheckEl() {
    return this._checkEl;
  }
  
  public String getCheckName() {
    return this._checkName;
  }
  
  public boolean getChecked() {
    return this._checked;
  }
  
  public Object getChildren() {
    return this._children;
  }
  
  public String getContainer() {
    return this._container;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public String getDropAction() {
    return this._dropAction;
  }
  
  public String getHelper() {
    return this._helper;
  }
  
  public Object getIndex() {
    return this._index;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public Object getIo() {
    return this._io;
  }
  
  public Object getLastSelected() {
    return this._lastSelected;
  }
  
  public Object getLastY() {
    return this._lastY;
  }
  
  public Object getNodeContent() {
    return this._nodeContent;
  }
  
  public Object getScrollDelay() {
    return this._scrollDelay;
  }
  
  public String getType() {
    return this._type;
  }
  
  public Object getAfterCheckContainerElChange() {
    return this._afterCheckContainerElChange;
  }
  
  public Object getAfterCheckElChange() {
    return this._afterCheckElChange;
  }
  
  public Object getAfterCheckNameChange() {
    return this._afterCheckNameChange;
  }
  
  public Object getAfterCheckedChange() {
    return this._afterCheckedChange;
  }
  
  public Object getAfterChildrenChange() {
    return this._afterChildrenChange;
  }
  
  public Object getAfterContainerChange() {
    return this._afterContainerChange;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterDropActionChange() {
    return this._afterDropActionChange;
  }
  
  public Object getAfterHelperChange() {
    return this._afterHelperChange;
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
  
  public Object getAfterIoChange() {
    return this._afterIoChange;
  }
  
  public Object getAfterLastSelectedChange() {
    return this._afterLastSelectedChange;
  }
  
  public Object getAfterLastYChange() {
    return this._afterLastYChange;
  }
  
  public Object getAfterNodeContentChange() {
    return this._afterNodeContentChange;
  }
  
  public Object getAfterScrollDelayChange() {
    return this._afterScrollDelayChange;
  }
  
  public Object getAfterTypeChange() {
    return this._afterTypeChange;
  }
  
  public Object getOnCheckContainerElChange() {
    return this._onCheckContainerElChange;
  }
  
  public Object getOnCheckElChange() {
    return this._onCheckElChange;
  }
  
  public Object getOnCheckNameChange() {
    return this._onCheckNameChange;
  }
  
  public Object getOnCheckedChange() {
    return this._onCheckedChange;
  }
  
  public Object getOnChildrenChange() {
    return this._onChildrenChange;
  }
  
  public Object getOnContainerChange() {
    return this._onContainerChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnDropActionChange() {
    return this._onDropActionChange;
  }
  
  public Object getOnHelperChange() {
    return this._onHelperChange;
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
  
  public Object getOnIoChange() {
    return this._onIoChange;
  }
  
  public Object getOnLastSelectedChange() {
    return this._onLastSelectedChange;
  }
  
  public Object getOnLastYChange() {
    return this._onLastYChange;
  }
  
  public Object getOnNodeContentChange() {
    return this._onNodeContentChange;
  }
  
  public Object getOnScrollDelayChange() {
    return this._onScrollDelayChange;
  }
  
  public Object getOnTypeChange() {
    return this._onTypeChange;
  }
  
  public void setCheckContainerEl(String checkContainerEl) {
    this._checkContainerEl = checkContainerEl;
    
    setScopedAttribute("checkContainerEl", checkContainerEl);
  }
  
  public void setCheckEl(String checkEl) {
    this._checkEl = checkEl;
    
    setScopedAttribute("checkEl", checkEl);
  }
  
  public void setCheckName(String checkName) {
    this._checkName = checkName;
    
    setScopedAttribute("checkName", checkName);
  }
  
  public void setChecked(boolean checked) {
    this._checked = checked;
    
    setScopedAttribute("checked", Boolean.valueOf(checked));
  }
  
  public void setChildren(Object children) {
    this._children = children;
    
    setScopedAttribute("children", children);
  }
  
  public void setContainer(String container) {
    this._container = container;
    
    setScopedAttribute("container", container);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setDropAction(String dropAction) {
    this._dropAction = dropAction;
    
    setScopedAttribute("dropAction", dropAction);
  }
  
  public void setHelper(String helper) {
    this._helper = helper;
    
    setScopedAttribute("helper", helper);
  }
  
  public void setIndex(Object index) {
    this._index = index;
    
    setScopedAttribute("index", index);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setIo(Object io) {
    this._io = io;
    
    setScopedAttribute("io", io);
  }
  
  public void setLastSelected(Object lastSelected) {
    this._lastSelected = lastSelected;
    
    setScopedAttribute("lastSelected", lastSelected);
  }
  
  public void setLastY(Object lastY) {
    this._lastY = lastY;
    
    setScopedAttribute("lastY", lastY);
  }
  
  public void setNodeContent(Object nodeContent) {
    this._nodeContent = nodeContent;
    
    setScopedAttribute("nodeContent", nodeContent);
  }
  
  public void setScrollDelay(Object scrollDelay) {
    this._scrollDelay = scrollDelay;
    
    setScopedAttribute("scrollDelay", scrollDelay);
  }
  
  public void setType(String type) {
    this._type = type;
    
    setScopedAttribute("type", type);
  }
  
  public void setAfterCheckContainerElChange(Object afterCheckContainerElChange) {
    this._afterCheckContainerElChange = afterCheckContainerElChange;
    
    setScopedAttribute("afterCheckContainerElChange", afterCheckContainerElChange);
  }
  
  public void setAfterCheckElChange(Object afterCheckElChange) {
    this._afterCheckElChange = afterCheckElChange;
    
    setScopedAttribute("afterCheckElChange", afterCheckElChange);
  }
  
  public void setAfterCheckNameChange(Object afterCheckNameChange) {
    this._afterCheckNameChange = afterCheckNameChange;
    
    setScopedAttribute("afterCheckNameChange", afterCheckNameChange);
  }
  
  public void setAfterCheckedChange(Object afterCheckedChange) {
    this._afterCheckedChange = afterCheckedChange;
    
    setScopedAttribute("afterCheckedChange", afterCheckedChange);
  }
  
  public void setAfterChildrenChange(Object afterChildrenChange) {
    this._afterChildrenChange = afterChildrenChange;
    
    setScopedAttribute("afterChildrenChange", afterChildrenChange);
  }
  
  public void setAfterContainerChange(Object afterContainerChange) {
    this._afterContainerChange = afterContainerChange;
    
    setScopedAttribute("afterContainerChange", afterContainerChange);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterDropActionChange(Object afterDropActionChange) {
    this._afterDropActionChange = afterDropActionChange;
    
    setScopedAttribute("afterDropActionChange", afterDropActionChange);
  }
  
  public void setAfterHelperChange(Object afterHelperChange) {
    this._afterHelperChange = afterHelperChange;
    
    setScopedAttribute("afterHelperChange", afterHelperChange);
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
  
  public void setAfterIoChange(Object afterIoChange) {
    this._afterIoChange = afterIoChange;
    
    setScopedAttribute("afterIoChange", afterIoChange);
  }
  
  public void setAfterLastSelectedChange(Object afterLastSelectedChange) {
    this._afterLastSelectedChange = afterLastSelectedChange;
    
    setScopedAttribute("afterLastSelectedChange", afterLastSelectedChange);
  }
  
  public void setAfterLastYChange(Object afterLastYChange) {
    this._afterLastYChange = afterLastYChange;
    
    setScopedAttribute("afterLastYChange", afterLastYChange);
  }
  
  public void setAfterNodeContentChange(Object afterNodeContentChange) {
    this._afterNodeContentChange = afterNodeContentChange;
    
    setScopedAttribute("afterNodeContentChange", afterNodeContentChange);
  }
  
  public void setAfterScrollDelayChange(Object afterScrollDelayChange) {
    this._afterScrollDelayChange = afterScrollDelayChange;
    
    setScopedAttribute("afterScrollDelayChange", afterScrollDelayChange);
  }
  
  public void setAfterTypeChange(Object afterTypeChange) {
    this._afterTypeChange = afterTypeChange;
    
    setScopedAttribute("afterTypeChange", afterTypeChange);
  }
  
  public void setOnCheckContainerElChange(Object onCheckContainerElChange) {
    this._onCheckContainerElChange = onCheckContainerElChange;
    
    setScopedAttribute("onCheckContainerElChange", onCheckContainerElChange);
  }
  
  public void setOnCheckElChange(Object onCheckElChange) {
    this._onCheckElChange = onCheckElChange;
    
    setScopedAttribute("onCheckElChange", onCheckElChange);
  }
  
  public void setOnCheckNameChange(Object onCheckNameChange) {
    this._onCheckNameChange = onCheckNameChange;
    
    setScopedAttribute("onCheckNameChange", onCheckNameChange);
  }
  
  public void setOnCheckedChange(Object onCheckedChange) {
    this._onCheckedChange = onCheckedChange;
    
    setScopedAttribute("onCheckedChange", onCheckedChange);
  }
  
  public void setOnChildrenChange(Object onChildrenChange) {
    this._onChildrenChange = onChildrenChange;
    
    setScopedAttribute("onChildrenChange", onChildrenChange);
  }
  
  public void setOnContainerChange(Object onContainerChange) {
    this._onContainerChange = onContainerChange;
    
    setScopedAttribute("onContainerChange", onContainerChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnDropActionChange(Object onDropActionChange) {
    this._onDropActionChange = onDropActionChange;
    
    setScopedAttribute("onDropActionChange", onDropActionChange);
  }
  
  public void setOnHelperChange(Object onHelperChange) {
    this._onHelperChange = onHelperChange;
    
    setScopedAttribute("onHelperChange", onHelperChange);
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
  
  public void setOnIoChange(Object onIoChange) {
    this._onIoChange = onIoChange;
    
    setScopedAttribute("onIoChange", onIoChange);
  }
  
  public void setOnLastSelectedChange(Object onLastSelectedChange) {
    this._onLastSelectedChange = onLastSelectedChange;
    
    setScopedAttribute("onLastSelectedChange", onLastSelectedChange);
  }
  
  public void setOnLastYChange(Object onLastYChange) {
    this._onLastYChange = onLastYChange;
    
    setScopedAttribute("onLastYChange", onLastYChange);
  }
  
  public void setOnNodeContentChange(Object onNodeContentChange) {
    this._onNodeContentChange = onNodeContentChange;
    
    setScopedAttribute("onNodeContentChange", onNodeContentChange);
  }
  
  public void setOnScrollDelayChange(Object onScrollDelayChange) {
    this._onScrollDelayChange = onScrollDelayChange;
    
    setScopedAttribute("onScrollDelayChange", onScrollDelayChange);
  }
  
  public void setOnTypeChange(Object onTypeChange) {
    this._onTypeChange = onTypeChange;
    
    setScopedAttribute("onTypeChange", onTypeChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._checkContainerEl = null;
    this._checkEl = null;
    this._checkName = "tree-node-check";
    this._checked = false;
    this._children = null;
    this._container = null;
    this._destroyed = false;
    this._dropAction = null;
    this._helper = null;
    this._index = null;
    this._initialized = false;
    this._io = null;
    this._lastSelected = null;
    this._lastY = Integer.valueOf(0);
    this._nodeContent = null;
    this._scrollDelay = Integer.valueOf(100);
    this._type = "file";
    this._afterCheckContainerElChange = null;
    this._afterCheckElChange = null;
    this._afterCheckNameChange = null;
    this._afterCheckedChange = null;
    this._afterChildrenChange = null;
    this._afterContainerChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterDropActionChange = null;
    this._afterHelperChange = null;
    this._afterIndexChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterIoChange = null;
    this._afterLastSelectedChange = null;
    this._afterLastYChange = null;
    this._afterNodeContentChange = null;
    this._afterScrollDelayChange = null;
    this._afterTypeChange = null;
    this._onCheckContainerElChange = null;
    this._onCheckElChange = null;
    this._onCheckNameChange = null;
    this._onCheckedChange = null;
    this._onChildrenChange = null;
    this._onContainerChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onDropActionChange = null;
    this._onHelperChange = null;
    this._onIndexChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onIoChange = null;
    this._onLastSelectedChange = null;
    this._onLastYChange = null;
    this._onNodeContentChange = null;
    this._onScrollDelayChange = null;
    this._onTypeChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/tree_view_dd/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "checkContainerEl", this._checkContainerEl);
    setNamespacedAttribute(request, "checkEl", this._checkEl);
    setNamespacedAttribute(request, "checkName", this._checkName);
    setNamespacedAttribute(request, "checked", Boolean.valueOf(this._checked));
    setNamespacedAttribute(request, "children", this._children);
    setNamespacedAttribute(request, "container", this._container);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "dropAction", this._dropAction);
    setNamespacedAttribute(request, "helper", this._helper);
    setNamespacedAttribute(request, "index", this._index);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "io", this._io);
    setNamespacedAttribute(request, "lastSelected", this._lastSelected);
    setNamespacedAttribute(request, "lastY", this._lastY);
    setNamespacedAttribute(request, "nodeContent", this._nodeContent);
    setNamespacedAttribute(request, "scrollDelay", this._scrollDelay);
    setNamespacedAttribute(request, "type", this._type);
    setNamespacedAttribute(request, "afterCheckContainerElChange", this._afterCheckContainerElChange);
    setNamespacedAttribute(request, "afterCheckElChange", this._afterCheckElChange);
    setNamespacedAttribute(request, "afterCheckNameChange", this._afterCheckNameChange);
    setNamespacedAttribute(request, "afterCheckedChange", this._afterCheckedChange);
    setNamespacedAttribute(request, "afterChildrenChange", this._afterChildrenChange);
    setNamespacedAttribute(request, "afterContainerChange", this._afterContainerChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterDropActionChange", this._afterDropActionChange);
    setNamespacedAttribute(request, "afterHelperChange", this._afterHelperChange);
    setNamespacedAttribute(request, "afterIndexChange", this._afterIndexChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterIoChange", this._afterIoChange);
    setNamespacedAttribute(request, "afterLastSelectedChange", this._afterLastSelectedChange);
    setNamespacedAttribute(request, "afterLastYChange", this._afterLastYChange);
    setNamespacedAttribute(request, "afterNodeContentChange", this._afterNodeContentChange);
    setNamespacedAttribute(request, "afterScrollDelayChange", this._afterScrollDelayChange);
    setNamespacedAttribute(request, "afterTypeChange", this._afterTypeChange);
    setNamespacedAttribute(request, "onCheckContainerElChange", this._onCheckContainerElChange);
    setNamespacedAttribute(request, "onCheckElChange", this._onCheckElChange);
    setNamespacedAttribute(request, "onCheckNameChange", this._onCheckNameChange);
    setNamespacedAttribute(request, "onCheckedChange", this._onCheckedChange);
    setNamespacedAttribute(request, "onChildrenChange", this._onChildrenChange);
    setNamespacedAttribute(request, "onContainerChange", this._onContainerChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onDropActionChange", this._onDropActionChange);
    setNamespacedAttribute(request, "onHelperChange", this._onHelperChange);
    setNamespacedAttribute(request, "onIndexChange", this._onIndexChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onIoChange", this._onIoChange);
    setNamespacedAttribute(request, "onLastSelectedChange", this._onLastSelectedChange);
    setNamespacedAttribute(request, "onLastYChange", this._onLastYChange);
    setNamespacedAttribute(request, "onNodeContentChange", this._onNodeContentChange);
    setNamespacedAttribute(request, "onScrollDelayChange", this._onScrollDelayChange);
    setNamespacedAttribute(request, "onTypeChange", this._onTypeChange);
  }
  





  private String _checkContainerEl = null;
  private String _checkEl = null;
  private String _checkName = "tree-node-check";
  private boolean _checked = false;
  private Object _children = null;
  private String _container = null;
  private boolean _destroyed = false;
  private String _dropAction = null;
  private String _helper = null;
  private Object _index = null;
  private boolean _initialized = false;
  private Object _io = null;
  private Object _lastSelected = null;
  private Object _lastY = Integer.valueOf(0);
  private Object _nodeContent = null;
  private Object _scrollDelay = Integer.valueOf(100);
  private String _type = "file";
  private Object _afterCheckContainerElChange = null;
  private Object _afterCheckElChange = null;
  private Object _afterCheckNameChange = null;
  private Object _afterCheckedChange = null;
  private Object _afterChildrenChange = null;
  private Object _afterContainerChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterDropActionChange = null;
  private Object _afterHelperChange = null;
  private Object _afterIndexChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterIoChange = null;
  private Object _afterLastSelectedChange = null;
  private Object _afterLastYChange = null;
  private Object _afterNodeContentChange = null;
  private Object _afterScrollDelayChange = null;
  private Object _afterTypeChange = null;
  private Object _onCheckContainerElChange = null;
  private Object _onCheckElChange = null;
  private Object _onCheckNameChange = null;
  private Object _onCheckedChange = null;
  private Object _onChildrenChange = null;
  private Object _onContainerChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onDropActionChange = null;
  private Object _onHelperChange = null;
  private Object _onIndexChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onIoChange = null;
  private Object _onLastSelectedChange = null;
  private Object _onLastYChange = null;
  private Object _onNodeContentChange = null;
  private Object _onScrollDelayChange = null;
  private Object _onTypeChange = null;
}
