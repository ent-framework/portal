package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseTreeNodeTaskTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:tree-node-task:";
  private static final String _PAGE = "/html/taglib/alloy/tree_node_task/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:tree-node-task:");
    
    return super.doStartTag();
  }
  
  public boolean getAlwaysShowHitArea() {
    return this._alwaysShowHitArea;
  }
  
  public boolean getCache() {
    return this._cache;
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
  
  public boolean getDraggable() {
    return this._draggable;
  }
  
  public boolean getExpanded() {
    return this._expanded;
  }
  
  public String getHitAreaEl() {
    return this._hitAreaEl;
  }
  
  public String getIconEl() {
    return this._iconEl;
  }
  
  public String getTreenodetaskId() {
    return this._treenodetaskId;
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
  
  public String getLabel() {
    return this._label;
  }
  
  public String getLabelEl() {
    return this._labelEl;
  }
  
  public boolean getLeaf() {
    return this._leaf;
  }
  
  public boolean getLoaded() {
    return this._loaded;
  }
  
  public boolean getLoading() {
    return this._loading;
  }
  
  public Object getNextSibling() {
    return this._nextSibling;
  }
  
  public Object getOwnerTree() {
    return this._ownerTree;
  }
  
  public Object getParentNode() {
    return this._parentNode;
  }
  
  public Object getPrevSibling() {
    return this._prevSibling;
  }
  
  public Object getAfterAlwaysShowHitAreaChange() {
    return this._afterAlwaysShowHitAreaChange;
  }
  
  public Object getAfterCacheChange() {
    return this._afterCacheChange;
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
  
  public Object getAfterDraggableChange() {
    return this._afterDraggableChange;
  }
  
  public Object getAfterExpandedChange() {
    return this._afterExpandedChange;
  }
  
  public Object getAfterHitAreaElChange() {
    return this._afterHitAreaElChange;
  }
  
  public Object getAfterIconElChange() {
    return this._afterIconElChange;
  }
  
  public Object getAfterIdChange() {
    return this._afterIdChange;
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
  
  public Object getAfterLabelChange() {
    return this._afterLabelChange;
  }
  
  public Object getAfterLabelElChange() {
    return this._afterLabelElChange;
  }
  
  public Object getAfterLeafChange() {
    return this._afterLeafChange;
  }
  
  public Object getAfterLoadedChange() {
    return this._afterLoadedChange;
  }
  
  public Object getAfterLoadingChange() {
    return this._afterLoadingChange;
  }
  
  public Object getAfterNextSiblingChange() {
    return this._afterNextSiblingChange;
  }
  
  public Object getAfterOwnerTreeChange() {
    return this._afterOwnerTreeChange;
  }
  
  public Object getAfterParentNodeChange() {
    return this._afterParentNodeChange;
  }
  
  public Object getAfterPrevSiblingChange() {
    return this._afterPrevSiblingChange;
  }
  
  public Object getOnAlwaysShowHitAreaChange() {
    return this._onAlwaysShowHitAreaChange;
  }
  
  public Object getOnCacheChange() {
    return this._onCacheChange;
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
  
  public Object getOnDraggableChange() {
    return this._onDraggableChange;
  }
  
  public Object getOnExpandedChange() {
    return this._onExpandedChange;
  }
  
  public Object getOnHitAreaElChange() {
    return this._onHitAreaElChange;
  }
  
  public Object getOnIconElChange() {
    return this._onIconElChange;
  }
  
  public Object getOnIdChange() {
    return this._onIdChange;
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
  
  public Object getOnLabelChange() {
    return this._onLabelChange;
  }
  
  public Object getOnLabelElChange() {
    return this._onLabelElChange;
  }
  
  public Object getOnLeafChange() {
    return this._onLeafChange;
  }
  
  public Object getOnLoadedChange() {
    return this._onLoadedChange;
  }
  
  public Object getOnLoadingChange() {
    return this._onLoadingChange;
  }
  
  public Object getOnNextSiblingChange() {
    return this._onNextSiblingChange;
  }
  
  public Object getOnOwnerTreeChange() {
    return this._onOwnerTreeChange;
  }
  
  public Object getOnParentNodeChange() {
    return this._onParentNodeChange;
  }
  
  public Object getOnPrevSiblingChange() {
    return this._onPrevSiblingChange;
  }
  
  public void setAlwaysShowHitArea(boolean alwaysShowHitArea) {
    this._alwaysShowHitArea = alwaysShowHitArea;
    
    setScopedAttribute("alwaysShowHitArea", Boolean.valueOf(alwaysShowHitArea));
  }
  
  public void setCache(boolean cache) {
    this._cache = cache;
    
    setScopedAttribute("cache", Boolean.valueOf(cache));
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
  
  public void setDraggable(boolean draggable) {
    this._draggable = draggable;
    
    setScopedAttribute("draggable", Boolean.valueOf(draggable));
  }
  
  public void setExpanded(boolean expanded) {
    this._expanded = expanded;
    
    setScopedAttribute("expanded", Boolean.valueOf(expanded));
  }
  
  public void setHitAreaEl(String hitAreaEl) {
    this._hitAreaEl = hitAreaEl;
    
    setScopedAttribute("hitAreaEl", hitAreaEl);
  }
  
  public void setIconEl(String iconEl) {
    this._iconEl = iconEl;
    
    setScopedAttribute("iconEl", iconEl);
  }
  
  public void setTreenodetaskId(String treenodetaskId) {
    this._treenodetaskId = treenodetaskId;
    
    setScopedAttribute("treenodetaskId", treenodetaskId);
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
  
  public void setLabel(String label) {
    this._label = label;
    
    setScopedAttribute("label", label);
  }
  
  public void setLabelEl(String labelEl) {
    this._labelEl = labelEl;
    
    setScopedAttribute("labelEl", labelEl);
  }
  
  public void setLeaf(boolean leaf) {
    this._leaf = leaf;
    
    setScopedAttribute("leaf", Boolean.valueOf(leaf));
  }
  
  public void setLoaded(boolean loaded) {
    this._loaded = loaded;
    
    setScopedAttribute("loaded", Boolean.valueOf(loaded));
  }
  
  public void setLoading(boolean loading) {
    this._loading = loading;
    
    setScopedAttribute("loading", Boolean.valueOf(loading));
  }
  
  public void setNextSibling(Object nextSibling) {
    this._nextSibling = nextSibling;
    
    setScopedAttribute("nextSibling", nextSibling);
  }
  
  public void setOwnerTree(Object ownerTree) {
    this._ownerTree = ownerTree;
    
    setScopedAttribute("ownerTree", ownerTree);
  }
  
  public void setParentNode(Object parentNode) {
    this._parentNode = parentNode;
    
    setScopedAttribute("parentNode", parentNode);
  }
  
  public void setPrevSibling(Object prevSibling) {
    this._prevSibling = prevSibling;
    
    setScopedAttribute("prevSibling", prevSibling);
  }
  
  public void setAfterAlwaysShowHitAreaChange(Object afterAlwaysShowHitAreaChange) {
    this._afterAlwaysShowHitAreaChange = afterAlwaysShowHitAreaChange;
    
    setScopedAttribute("afterAlwaysShowHitAreaChange", afterAlwaysShowHitAreaChange);
  }
  
  public void setAfterCacheChange(Object afterCacheChange) {
    this._afterCacheChange = afterCacheChange;
    
    setScopedAttribute("afterCacheChange", afterCacheChange);
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
  
  public void setAfterDraggableChange(Object afterDraggableChange) {
    this._afterDraggableChange = afterDraggableChange;
    
    setScopedAttribute("afterDraggableChange", afterDraggableChange);
  }
  
  public void setAfterExpandedChange(Object afterExpandedChange) {
    this._afterExpandedChange = afterExpandedChange;
    
    setScopedAttribute("afterExpandedChange", afterExpandedChange);
  }
  
  public void setAfterHitAreaElChange(Object afterHitAreaElChange) {
    this._afterHitAreaElChange = afterHitAreaElChange;
    
    setScopedAttribute("afterHitAreaElChange", afterHitAreaElChange);
  }
  
  public void setAfterIconElChange(Object afterIconElChange) {
    this._afterIconElChange = afterIconElChange;
    
    setScopedAttribute("afterIconElChange", afterIconElChange);
  }
  
  public void setAfterIdChange(Object afterIdChange) {
    this._afterIdChange = afterIdChange;
    
    setScopedAttribute("afterIdChange", afterIdChange);
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
  
  public void setAfterLabelChange(Object afterLabelChange) {
    this._afterLabelChange = afterLabelChange;
    
    setScopedAttribute("afterLabelChange", afterLabelChange);
  }
  
  public void setAfterLabelElChange(Object afterLabelElChange) {
    this._afterLabelElChange = afterLabelElChange;
    
    setScopedAttribute("afterLabelElChange", afterLabelElChange);
  }
  
  public void setAfterLeafChange(Object afterLeafChange) {
    this._afterLeafChange = afterLeafChange;
    
    setScopedAttribute("afterLeafChange", afterLeafChange);
  }
  
  public void setAfterLoadedChange(Object afterLoadedChange) {
    this._afterLoadedChange = afterLoadedChange;
    
    setScopedAttribute("afterLoadedChange", afterLoadedChange);
  }
  
  public void setAfterLoadingChange(Object afterLoadingChange) {
    this._afterLoadingChange = afterLoadingChange;
    
    setScopedAttribute("afterLoadingChange", afterLoadingChange);
  }
  
  public void setAfterNextSiblingChange(Object afterNextSiblingChange) {
    this._afterNextSiblingChange = afterNextSiblingChange;
    
    setScopedAttribute("afterNextSiblingChange", afterNextSiblingChange);
  }
  
  public void setAfterOwnerTreeChange(Object afterOwnerTreeChange) {
    this._afterOwnerTreeChange = afterOwnerTreeChange;
    
    setScopedAttribute("afterOwnerTreeChange", afterOwnerTreeChange);
  }
  
  public void setAfterParentNodeChange(Object afterParentNodeChange) {
    this._afterParentNodeChange = afterParentNodeChange;
    
    setScopedAttribute("afterParentNodeChange", afterParentNodeChange);
  }
  
  public void setAfterPrevSiblingChange(Object afterPrevSiblingChange) {
    this._afterPrevSiblingChange = afterPrevSiblingChange;
    
    setScopedAttribute("afterPrevSiblingChange", afterPrevSiblingChange);
  }
  
  public void setOnAlwaysShowHitAreaChange(Object onAlwaysShowHitAreaChange) {
    this._onAlwaysShowHitAreaChange = onAlwaysShowHitAreaChange;
    
    setScopedAttribute("onAlwaysShowHitAreaChange", onAlwaysShowHitAreaChange);
  }
  
  public void setOnCacheChange(Object onCacheChange) {
    this._onCacheChange = onCacheChange;
    
    setScopedAttribute("onCacheChange", onCacheChange);
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
  
  public void setOnDraggableChange(Object onDraggableChange) {
    this._onDraggableChange = onDraggableChange;
    
    setScopedAttribute("onDraggableChange", onDraggableChange);
  }
  
  public void setOnExpandedChange(Object onExpandedChange) {
    this._onExpandedChange = onExpandedChange;
    
    setScopedAttribute("onExpandedChange", onExpandedChange);
  }
  
  public void setOnHitAreaElChange(Object onHitAreaElChange) {
    this._onHitAreaElChange = onHitAreaElChange;
    
    setScopedAttribute("onHitAreaElChange", onHitAreaElChange);
  }
  
  public void setOnIconElChange(Object onIconElChange) {
    this._onIconElChange = onIconElChange;
    
    setScopedAttribute("onIconElChange", onIconElChange);
  }
  
  public void setOnIdChange(Object onIdChange) {
    this._onIdChange = onIdChange;
    
    setScopedAttribute("onIdChange", onIdChange);
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
  
  public void setOnLabelChange(Object onLabelChange) {
    this._onLabelChange = onLabelChange;
    
    setScopedAttribute("onLabelChange", onLabelChange);
  }
  
  public void setOnLabelElChange(Object onLabelElChange) {
    this._onLabelElChange = onLabelElChange;
    
    setScopedAttribute("onLabelElChange", onLabelElChange);
  }
  
  public void setOnLeafChange(Object onLeafChange) {
    this._onLeafChange = onLeafChange;
    
    setScopedAttribute("onLeafChange", onLeafChange);
  }
  
  public void setOnLoadedChange(Object onLoadedChange) {
    this._onLoadedChange = onLoadedChange;
    
    setScopedAttribute("onLoadedChange", onLoadedChange);
  }
  
  public void setOnLoadingChange(Object onLoadingChange) {
    this._onLoadingChange = onLoadingChange;
    
    setScopedAttribute("onLoadingChange", onLoadingChange);
  }
  
  public void setOnNextSiblingChange(Object onNextSiblingChange) {
    this._onNextSiblingChange = onNextSiblingChange;
    
    setScopedAttribute("onNextSiblingChange", onNextSiblingChange);
  }
  
  public void setOnOwnerTreeChange(Object onOwnerTreeChange) {
    this._onOwnerTreeChange = onOwnerTreeChange;
    
    setScopedAttribute("onOwnerTreeChange", onOwnerTreeChange);
  }
  
  public void setOnParentNodeChange(Object onParentNodeChange) {
    this._onParentNodeChange = onParentNodeChange;
    
    setScopedAttribute("onParentNodeChange", onParentNodeChange);
  }
  
  public void setOnPrevSiblingChange(Object onPrevSiblingChange) {
    this._onPrevSiblingChange = onPrevSiblingChange;
    
    setScopedAttribute("onPrevSiblingChange", onPrevSiblingChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._alwaysShowHitArea = true;
    this._cache = true;
    this._checkContainerEl = null;
    this._checkEl = null;
    this._checkName = "tree-node-check";
    this._checked = false;
    this._children = null;
    this._container = null;
    this._destroyed = false;
    this._draggable = true;
    this._expanded = false;
    this._hitAreaEl = null;
    this._iconEl = null;
    this._treenodetaskId = null;
    this._index = null;
    this._initialized = false;
    this._io = null;
    this._label = null;
    this._labelEl = null;
    this._leaf = true;
    this._loaded = false;
    this._loading = false;
    this._nextSibling = null;
    this._ownerTree = null;
    this._parentNode = null;
    this._prevSibling = null;
    this._afterAlwaysShowHitAreaChange = null;
    this._afterCacheChange = null;
    this._afterCheckContainerElChange = null;
    this._afterCheckElChange = null;
    this._afterCheckNameChange = null;
    this._afterCheckedChange = null;
    this._afterChildrenChange = null;
    this._afterContainerChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterDraggableChange = null;
    this._afterExpandedChange = null;
    this._afterHitAreaElChange = null;
    this._afterIconElChange = null;
    this._afterIdChange = null;
    this._afterIndexChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterIoChange = null;
    this._afterLabelChange = null;
    this._afterLabelElChange = null;
    this._afterLeafChange = null;
    this._afterLoadedChange = null;
    this._afterLoadingChange = null;
    this._afterNextSiblingChange = null;
    this._afterOwnerTreeChange = null;
    this._afterParentNodeChange = null;
    this._afterPrevSiblingChange = null;
    this._onAlwaysShowHitAreaChange = null;
    this._onCacheChange = null;
    this._onCheckContainerElChange = null;
    this._onCheckElChange = null;
    this._onCheckNameChange = null;
    this._onCheckedChange = null;
    this._onChildrenChange = null;
    this._onContainerChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onDraggableChange = null;
    this._onExpandedChange = null;
    this._onHitAreaElChange = null;
    this._onIconElChange = null;
    this._onIdChange = null;
    this._onIndexChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onIoChange = null;
    this._onLabelChange = null;
    this._onLabelElChange = null;
    this._onLeafChange = null;
    this._onLoadedChange = null;
    this._onLoadingChange = null;
    this._onNextSiblingChange = null;
    this._onOwnerTreeChange = null;
    this._onParentNodeChange = null;
    this._onPrevSiblingChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/tree_node_task/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "alwaysShowHitArea", Boolean.valueOf(this._alwaysShowHitArea));
    setNamespacedAttribute(request, "cache", Boolean.valueOf(this._cache));
    setNamespacedAttribute(request, "checkContainerEl", this._checkContainerEl);
    setNamespacedAttribute(request, "checkEl", this._checkEl);
    setNamespacedAttribute(request, "checkName", this._checkName);
    setNamespacedAttribute(request, "checked", Boolean.valueOf(this._checked));
    setNamespacedAttribute(request, "children", this._children);
    setNamespacedAttribute(request, "container", this._container);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "draggable", Boolean.valueOf(this._draggable));
    setNamespacedAttribute(request, "expanded", Boolean.valueOf(this._expanded));
    setNamespacedAttribute(request, "hitAreaEl", this._hitAreaEl);
    setNamespacedAttribute(request, "iconEl", this._iconEl);
    setNamespacedAttribute(request, "treenodetaskId", this._treenodetaskId);
    setNamespacedAttribute(request, "index", this._index);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "io", this._io);
    setNamespacedAttribute(request, "label", this._label);
    setNamespacedAttribute(request, "labelEl", this._labelEl);
    setNamespacedAttribute(request, "leaf", Boolean.valueOf(this._leaf));
    setNamespacedAttribute(request, "loaded", Boolean.valueOf(this._loaded));
    setNamespacedAttribute(request, "loading", Boolean.valueOf(this._loading));
    setNamespacedAttribute(request, "nextSibling", this._nextSibling);
    setNamespacedAttribute(request, "ownerTree", this._ownerTree);
    setNamespacedAttribute(request, "parentNode", this._parentNode);
    setNamespacedAttribute(request, "prevSibling", this._prevSibling);
    setNamespacedAttribute(request, "afterAlwaysShowHitAreaChange", this._afterAlwaysShowHitAreaChange);
    setNamespacedAttribute(request, "afterCacheChange", this._afterCacheChange);
    setNamespacedAttribute(request, "afterCheckContainerElChange", this._afterCheckContainerElChange);
    setNamespacedAttribute(request, "afterCheckElChange", this._afterCheckElChange);
    setNamespacedAttribute(request, "afterCheckNameChange", this._afterCheckNameChange);
    setNamespacedAttribute(request, "afterCheckedChange", this._afterCheckedChange);
    setNamespacedAttribute(request, "afterChildrenChange", this._afterChildrenChange);
    setNamespacedAttribute(request, "afterContainerChange", this._afterContainerChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterDraggableChange", this._afterDraggableChange);
    setNamespacedAttribute(request, "afterExpandedChange", this._afterExpandedChange);
    setNamespacedAttribute(request, "afterHitAreaElChange", this._afterHitAreaElChange);
    setNamespacedAttribute(request, "afterIconElChange", this._afterIconElChange);
    setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
    setNamespacedAttribute(request, "afterIndexChange", this._afterIndexChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterIoChange", this._afterIoChange);
    setNamespacedAttribute(request, "afterLabelChange", this._afterLabelChange);
    setNamespacedAttribute(request, "afterLabelElChange", this._afterLabelElChange);
    setNamespacedAttribute(request, "afterLeafChange", this._afterLeafChange);
    setNamespacedAttribute(request, "afterLoadedChange", this._afterLoadedChange);
    setNamespacedAttribute(request, "afterLoadingChange", this._afterLoadingChange);
    setNamespacedAttribute(request, "afterNextSiblingChange", this._afterNextSiblingChange);
    setNamespacedAttribute(request, "afterOwnerTreeChange", this._afterOwnerTreeChange);
    setNamespacedAttribute(request, "afterParentNodeChange", this._afterParentNodeChange);
    setNamespacedAttribute(request, "afterPrevSiblingChange", this._afterPrevSiblingChange);
    setNamespacedAttribute(request, "onAlwaysShowHitAreaChange", this._onAlwaysShowHitAreaChange);
    setNamespacedAttribute(request, "onCacheChange", this._onCacheChange);
    setNamespacedAttribute(request, "onCheckContainerElChange", this._onCheckContainerElChange);
    setNamespacedAttribute(request, "onCheckElChange", this._onCheckElChange);
    setNamespacedAttribute(request, "onCheckNameChange", this._onCheckNameChange);
    setNamespacedAttribute(request, "onCheckedChange", this._onCheckedChange);
    setNamespacedAttribute(request, "onChildrenChange", this._onChildrenChange);
    setNamespacedAttribute(request, "onContainerChange", this._onContainerChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onDraggableChange", this._onDraggableChange);
    setNamespacedAttribute(request, "onExpandedChange", this._onExpandedChange);
    setNamespacedAttribute(request, "onHitAreaElChange", this._onHitAreaElChange);
    setNamespacedAttribute(request, "onIconElChange", this._onIconElChange);
    setNamespacedAttribute(request, "onIdChange", this._onIdChange);
    setNamespacedAttribute(request, "onIndexChange", this._onIndexChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onIoChange", this._onIoChange);
    setNamespacedAttribute(request, "onLabelChange", this._onLabelChange);
    setNamespacedAttribute(request, "onLabelElChange", this._onLabelElChange);
    setNamespacedAttribute(request, "onLeafChange", this._onLeafChange);
    setNamespacedAttribute(request, "onLoadedChange", this._onLoadedChange);
    setNamespacedAttribute(request, "onLoadingChange", this._onLoadingChange);
    setNamespacedAttribute(request, "onNextSiblingChange", this._onNextSiblingChange);
    setNamespacedAttribute(request, "onOwnerTreeChange", this._onOwnerTreeChange);
    setNamespacedAttribute(request, "onParentNodeChange", this._onParentNodeChange);
    setNamespacedAttribute(request, "onPrevSiblingChange", this._onPrevSiblingChange);
  }
  





  private boolean _alwaysShowHitArea = true;
  private boolean _cache = true;
  private String _checkContainerEl = null;
  private String _checkEl = null;
  private String _checkName = "tree-node-check";
  private boolean _checked = false;
  private Object _children = null;
  private String _container = null;
  private boolean _destroyed = false;
  private boolean _draggable = true;
  private boolean _expanded = false;
  private String _hitAreaEl = null;
  private String _iconEl = null;
  private String _treenodetaskId = null;
  private Object _index = null;
  private boolean _initialized = false;
  private Object _io = null;
  private String _label = null;
  private String _labelEl = null;
  private boolean _leaf = true;
  private boolean _loaded = false;
  private boolean _loading = false;
  private Object _nextSibling = null;
  private Object _ownerTree = null;
  private Object _parentNode = null;
  private Object _prevSibling = null;
  private Object _afterAlwaysShowHitAreaChange = null;
  private Object _afterCacheChange = null;
  private Object _afterCheckContainerElChange = null;
  private Object _afterCheckElChange = null;
  private Object _afterCheckNameChange = null;
  private Object _afterCheckedChange = null;
  private Object _afterChildrenChange = null;
  private Object _afterContainerChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterDraggableChange = null;
  private Object _afterExpandedChange = null;
  private Object _afterHitAreaElChange = null;
  private Object _afterIconElChange = null;
  private Object _afterIdChange = null;
  private Object _afterIndexChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterIoChange = null;
  private Object _afterLabelChange = null;
  private Object _afterLabelElChange = null;
  private Object _afterLeafChange = null;
  private Object _afterLoadedChange = null;
  private Object _afterLoadingChange = null;
  private Object _afterNextSiblingChange = null;
  private Object _afterOwnerTreeChange = null;
  private Object _afterParentNodeChange = null;
  private Object _afterPrevSiblingChange = null;
  private Object _onAlwaysShowHitAreaChange = null;
  private Object _onCacheChange = null;
  private Object _onCheckContainerElChange = null;
  private Object _onCheckElChange = null;
  private Object _onCheckNameChange = null;
  private Object _onCheckedChange = null;
  private Object _onChildrenChange = null;
  private Object _onContainerChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onDraggableChange = null;
  private Object _onExpandedChange = null;
  private Object _onHitAreaElChange = null;
  private Object _onIconElChange = null;
  private Object _onIdChange = null;
  private Object _onIndexChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onIoChange = null;
  private Object _onLabelChange = null;
  private Object _onLabelElChange = null;
  private Object _onLeafChange = null;
  private Object _onLoadedChange = null;
  private Object _onLoadingChange = null;
  private Object _onNextSiblingChange = null;
  private Object _onOwnerTreeChange = null;
  private Object _onParentNodeChange = null;
  private Object _onPrevSiblingChange = null;
}
