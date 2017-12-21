package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BasePanelTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:panel:";
  private static final String _PAGE = "/html/taglib/alloy/panel/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:panel:");
    
    return super.doStartTag();
  }
  
  public Object getPanelBodyContent() {
    return this._panelBodyContent;
  }
  
  public String getBoundingBox() {
    return this._boundingBox;
  }
  
  public boolean getCollapsed() {
    return this._collapsed;
  }
  
  public boolean getCollapsible() {
    return this._collapsible;
  }
  
  public String getContentBox() {
    return this._contentBox;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public boolean getDisabled() {
    return this._disabled;
  }
  
  public Object getFillHeight() {
    return this._fillHeight;
  }
  
  public boolean getFocused() {
    return this._focused;
  }
  
  public Object getFooterContent() {
    return this._footerContent;
  }
  
  public Object getHeaderContent() {
    return this._headerContent;
  }
  
  public Object getHeight() {
    return this._height;
  }
  
  public Object getIcons() {
    return this._icons;
  }
  
  public String getPanelId() {
    return this._panelId;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public Object getRender() {
    return this._render;
  }
  
  public boolean getRendered() {
    return this._rendered;
  }
  
  public String getSrcNode() {
    return this._srcNode;
  }
  
  public Object getStrings() {
    return this._strings;
  }
  
  public Object getTabIndex() {
    return this._tabIndex;
  }
  
  public Object getTitle() {
    return this._title;
  }
  
  public boolean getUseARIA() {
    return this._useARIA;
  }
  
  public boolean getVisible() {
    return this._visible;
  }
  
  public Object getWidth() {
    return this._width;
  }
  
  public Object getAfterBodyContentChange() {
    return this._afterBodyContentChange;
  }
  
  public Object getAfterBoundingBoxChange() {
    return this._afterBoundingBoxChange;
  }
  
  public Object getAfterCollapsedChange() {
    return this._afterCollapsedChange;
  }
  
  public Object getAfterCollapsibleChange() {
    return this._afterCollapsibleChange;
  }
  
  public Object getAfterContentBoxChange() {
    return this._afterContentBoxChange;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterDisabledChange() {
    return this._afterDisabledChange;
  }
  
  public Object getAfterFillHeightChange() {
    return this._afterFillHeightChange;
  }
  
  public Object getAfterFocusedChange() {
    return this._afterFocusedChange;
  }
  
  public Object getAfterFooterContentChange() {
    return this._afterFooterContentChange;
  }
  
  public Object getAfterHeaderContentChange() {
    return this._afterHeaderContentChange;
  }
  
  public Object getAfterHeightChange() {
    return this._afterHeightChange;
  }
  
  public Object getAfterIconsChange() {
    return this._afterIconsChange;
  }
  
  public Object getAfterIdChange() {
    return this._afterIdChange;
  }
  
  public Object getAfterInit() {
    return this._afterInit;
  }
  
  public Object getAfterInitializedChange() {
    return this._afterInitializedChange;
  }
  
  public Object getAfterRenderChange() {
    return this._afterRenderChange;
  }
  
  public Object getAfterRenderedChange() {
    return this._afterRenderedChange;
  }
  
  public Object getAfterSrcNodeChange() {
    return this._afterSrcNodeChange;
  }
  
  public Object getAfterStringsChange() {
    return this._afterStringsChange;
  }
  
  public Object getAfterTabIndexChange() {
    return this._afterTabIndexChange;
  }
  
  public Object getAfterTitleChange() {
    return this._afterTitleChange;
  }
  
  public Object getAfterUseARIAChange() {
    return this._afterUseARIAChange;
  }
  
  public Object getAfterVisibleChange() {
    return this._afterVisibleChange;
  }
  
  public Object getAfterContentUpdate() {
    return this._afterContentUpdate;
  }
  
  public Object getAfterRender() {
    return this._afterRender;
  }
  
  public Object getAfterWidthChange() {
    return this._afterWidthChange;
  }
  
  public Object getOnBodyContentChange() {
    return this._onBodyContentChange;
  }
  
  public Object getOnBoundingBoxChange() {
    return this._onBoundingBoxChange;
  }
  
  public Object getOnCollapsedChange() {
    return this._onCollapsedChange;
  }
  
  public Object getOnCollapsibleChange() {
    return this._onCollapsibleChange;
  }
  
  public Object getOnContentBoxChange() {
    return this._onContentBoxChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnDisabledChange() {
    return this._onDisabledChange;
  }
  
  public Object getOnFillHeightChange() {
    return this._onFillHeightChange;
  }
  
  public Object getOnFocusedChange() {
    return this._onFocusedChange;
  }
  
  public Object getOnFooterContentChange() {
    return this._onFooterContentChange;
  }
  
  public Object getOnHeaderContentChange() {
    return this._onHeaderContentChange;
  }
  
  public Object getOnHeightChange() {
    return this._onHeightChange;
  }
  
  public Object getOnIconsChange() {
    return this._onIconsChange;
  }
  
  public Object getOnIdChange() {
    return this._onIdChange;
  }
  
  public Object getOnInit() {
    return this._onInit;
  }
  
  public Object getOnInitializedChange() {
    return this._onInitializedChange;
  }
  
  public Object getOnRenderChange() {
    return this._onRenderChange;
  }
  
  public Object getOnRenderedChange() {
    return this._onRenderedChange;
  }
  
  public Object getOnSrcNodeChange() {
    return this._onSrcNodeChange;
  }
  
  public Object getOnStringsChange() {
    return this._onStringsChange;
  }
  
  public Object getOnTabIndexChange() {
    return this._onTabIndexChange;
  }
  
  public Object getOnTitleChange() {
    return this._onTitleChange;
  }
  
  public Object getOnUseARIAChange() {
    return this._onUseARIAChange;
  }
  
  public Object getOnVisibleChange() {
    return this._onVisibleChange;
  }
  
  public Object getOnContentUpdate() {
    return this._onContentUpdate;
  }
  
  public Object getOnRender() {
    return this._onRender;
  }
  
  public Object getOnWidthChange() {
    return this._onWidthChange;
  }
  
  public void setPanelBodyContent(Object panelBodyContent) {
    this._panelBodyContent = panelBodyContent;
    
    setScopedAttribute("panelBodyContent", panelBodyContent);
  }
  
  public void setBoundingBox(String boundingBox) {
    this._boundingBox = boundingBox;
    
    setScopedAttribute("boundingBox", boundingBox);
  }
  
  public void setCollapsed(boolean collapsed) {
    this._collapsed = collapsed;
    
    setScopedAttribute("collapsed", Boolean.valueOf(collapsed));
  }
  
  public void setCollapsible(boolean collapsible) {
    this._collapsible = collapsible;
    
    setScopedAttribute("collapsible", Boolean.valueOf(collapsible));
  }
  
  public void setContentBox(String contentBox) {
    this._contentBox = contentBox;
    
    setScopedAttribute("contentBox", contentBox);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setDisabled(boolean disabled) {
    this._disabled = disabled;
    
    setScopedAttribute("disabled", Boolean.valueOf(disabled));
  }
  
  public void setFillHeight(Object fillHeight) {
    this._fillHeight = fillHeight;
    
    setScopedAttribute("fillHeight", fillHeight);
  }
  
  public void setFocused(boolean focused) {
    this._focused = focused;
    
    setScopedAttribute("focused", Boolean.valueOf(focused));
  }
  
  public void setFooterContent(Object footerContent) {
    this._footerContent = footerContent;
    
    setScopedAttribute("footerContent", footerContent);
  }
  
  public void setHeaderContent(Object headerContent) {
    this._headerContent = headerContent;
    
    setScopedAttribute("headerContent", headerContent);
  }
  
  public void setHeight(Object height) {
    this._height = height;
    
    setScopedAttribute("height", height);
  }
  
  public void setIcons(Object icons) {
    this._icons = icons;
    
    setScopedAttribute("icons", icons);
  }
  
  public void setPanelId(String panelId) {
    this._panelId = panelId;
    
    setScopedAttribute("panelId", panelId);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setRender(Object render) {
    this._render = render;
    
    setScopedAttribute("render", render);
  }
  
  public void setRendered(boolean rendered) {
    this._rendered = rendered;
    
    setScopedAttribute("rendered", Boolean.valueOf(rendered));
  }
  
  public void setSrcNode(String srcNode) {
    this._srcNode = srcNode;
    
    setScopedAttribute("srcNode", srcNode);
  }
  
  public void setStrings(Object strings) {
    this._strings = strings;
    
    setScopedAttribute("strings", strings);
  }
  
  public void setTabIndex(Object tabIndex) {
    this._tabIndex = tabIndex;
    
    setScopedAttribute("tabIndex", tabIndex);
  }
  
  public void setTitle(Object title) {
    this._title = title;
    
    setScopedAttribute("title", title);
  }
  
  public void setUseARIA(boolean useARIA) {
    this._useARIA = useARIA;
    
    setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
  }
  
  public void setVisible(boolean visible) {
    this._visible = visible;
    
    setScopedAttribute("visible", Boolean.valueOf(visible));
  }
  
  public void setWidth(Object width) {
    this._width = width;
    
    setScopedAttribute("width", width);
  }
  
  public void setAfterBodyContentChange(Object afterBodyContentChange) {
    this._afterBodyContentChange = afterBodyContentChange;
    
    setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
  }
  
  public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
    this._afterBoundingBoxChange = afterBoundingBoxChange;
    
    setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
  }
  
  public void setAfterCollapsedChange(Object afterCollapsedChange) {
    this._afterCollapsedChange = afterCollapsedChange;
    
    setScopedAttribute("afterCollapsedChange", afterCollapsedChange);
  }
  
  public void setAfterCollapsibleChange(Object afterCollapsibleChange) {
    this._afterCollapsibleChange = afterCollapsibleChange;
    
    setScopedAttribute("afterCollapsibleChange", afterCollapsibleChange);
  }
  
  public void setAfterContentBoxChange(Object afterContentBoxChange) {
    this._afterContentBoxChange = afterContentBoxChange;
    
    setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterDisabledChange(Object afterDisabledChange) {
    this._afterDisabledChange = afterDisabledChange;
    
    setScopedAttribute("afterDisabledChange", afterDisabledChange);
  }
  
  public void setAfterFillHeightChange(Object afterFillHeightChange) {
    this._afterFillHeightChange = afterFillHeightChange;
    
    setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
  }
  
  public void setAfterFocusedChange(Object afterFocusedChange) {
    this._afterFocusedChange = afterFocusedChange;
    
    setScopedAttribute("afterFocusedChange", afterFocusedChange);
  }
  
  public void setAfterFooterContentChange(Object afterFooterContentChange) {
    this._afterFooterContentChange = afterFooterContentChange;
    
    setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
  }
  
  public void setAfterHeaderContentChange(Object afterHeaderContentChange) {
    this._afterHeaderContentChange = afterHeaderContentChange;
    
    setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
  }
  
  public void setAfterHeightChange(Object afterHeightChange) {
    this._afterHeightChange = afterHeightChange;
    
    setScopedAttribute("afterHeightChange", afterHeightChange);
  }
  
  public void setAfterIconsChange(Object afterIconsChange) {
    this._afterIconsChange = afterIconsChange;
    
    setScopedAttribute("afterIconsChange", afterIconsChange);
  }
  
  public void setAfterIdChange(Object afterIdChange) {
    this._afterIdChange = afterIdChange;
    
    setScopedAttribute("afterIdChange", afterIdChange);
  }
  
  public void setAfterInit(Object afterInit) {
    this._afterInit = afterInit;
    
    setScopedAttribute("afterInit", afterInit);
  }
  
  public void setAfterInitializedChange(Object afterInitializedChange) {
    this._afterInitializedChange = afterInitializedChange;
    
    setScopedAttribute("afterInitializedChange", afterInitializedChange);
  }
  
  public void setAfterRenderChange(Object afterRenderChange) {
    this._afterRenderChange = afterRenderChange;
    
    setScopedAttribute("afterRenderChange", afterRenderChange);
  }
  
  public void setAfterRenderedChange(Object afterRenderedChange) {
    this._afterRenderedChange = afterRenderedChange;
    
    setScopedAttribute("afterRenderedChange", afterRenderedChange);
  }
  
  public void setAfterSrcNodeChange(Object afterSrcNodeChange) {
    this._afterSrcNodeChange = afterSrcNodeChange;
    
    setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
  }
  
  public void setAfterStringsChange(Object afterStringsChange) {
    this._afterStringsChange = afterStringsChange;
    
    setScopedAttribute("afterStringsChange", afterStringsChange);
  }
  
  public void setAfterTabIndexChange(Object afterTabIndexChange) {
    this._afterTabIndexChange = afterTabIndexChange;
    
    setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
  }
  
  public void setAfterTitleChange(Object afterTitleChange) {
    this._afterTitleChange = afterTitleChange;
    
    setScopedAttribute("afterTitleChange", afterTitleChange);
  }
  
  public void setAfterUseARIAChange(Object afterUseARIAChange) {
    this._afterUseARIAChange = afterUseARIAChange;
    
    setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
  }
  
  public void setAfterVisibleChange(Object afterVisibleChange) {
    this._afterVisibleChange = afterVisibleChange;
    
    setScopedAttribute("afterVisibleChange", afterVisibleChange);
  }
  
  public void setAfterContentUpdate(Object afterContentUpdate) {
    this._afterContentUpdate = afterContentUpdate;
    
    setScopedAttribute("afterContentUpdate", afterContentUpdate);
  }
  
  public void setAfterRender(Object afterRender) {
    this._afterRender = afterRender;
    
    setScopedAttribute("afterRender", afterRender);
  }
  
  public void setAfterWidthChange(Object afterWidthChange) {
    this._afterWidthChange = afterWidthChange;
    
    setScopedAttribute("afterWidthChange", afterWidthChange);
  }
  
  public void setOnBodyContentChange(Object onBodyContentChange) {
    this._onBodyContentChange = onBodyContentChange;
    
    setScopedAttribute("onBodyContentChange", onBodyContentChange);
  }
  
  public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
    this._onBoundingBoxChange = onBoundingBoxChange;
    
    setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
  }
  
  public void setOnCollapsedChange(Object onCollapsedChange) {
    this._onCollapsedChange = onCollapsedChange;
    
    setScopedAttribute("onCollapsedChange", onCollapsedChange);
  }
  
  public void setOnCollapsibleChange(Object onCollapsibleChange) {
    this._onCollapsibleChange = onCollapsibleChange;
    
    setScopedAttribute("onCollapsibleChange", onCollapsibleChange);
  }
  
  public void setOnContentBoxChange(Object onContentBoxChange) {
    this._onContentBoxChange = onContentBoxChange;
    
    setScopedAttribute("onContentBoxChange", onContentBoxChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnDisabledChange(Object onDisabledChange) {
    this._onDisabledChange = onDisabledChange;
    
    setScopedAttribute("onDisabledChange", onDisabledChange);
  }
  
  public void setOnFillHeightChange(Object onFillHeightChange) {
    this._onFillHeightChange = onFillHeightChange;
    
    setScopedAttribute("onFillHeightChange", onFillHeightChange);
  }
  
  public void setOnFocusedChange(Object onFocusedChange) {
    this._onFocusedChange = onFocusedChange;
    
    setScopedAttribute("onFocusedChange", onFocusedChange);
  }
  
  public void setOnFooterContentChange(Object onFooterContentChange) {
    this._onFooterContentChange = onFooterContentChange;
    
    setScopedAttribute("onFooterContentChange", onFooterContentChange);
  }
  
  public void setOnHeaderContentChange(Object onHeaderContentChange) {
    this._onHeaderContentChange = onHeaderContentChange;
    
    setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
  }
  
  public void setOnHeightChange(Object onHeightChange) {
    this._onHeightChange = onHeightChange;
    
    setScopedAttribute("onHeightChange", onHeightChange);
  }
  
  public void setOnIconsChange(Object onIconsChange) {
    this._onIconsChange = onIconsChange;
    
    setScopedAttribute("onIconsChange", onIconsChange);
  }
  
  public void setOnIdChange(Object onIdChange) {
    this._onIdChange = onIdChange;
    
    setScopedAttribute("onIdChange", onIdChange);
  }
  
  public void setOnInit(Object onInit) {
    this._onInit = onInit;
    
    setScopedAttribute("onInit", onInit);
  }
  
  public void setOnInitializedChange(Object onInitializedChange) {
    this._onInitializedChange = onInitializedChange;
    
    setScopedAttribute("onInitializedChange", onInitializedChange);
  }
  
  public void setOnRenderChange(Object onRenderChange) {
    this._onRenderChange = onRenderChange;
    
    setScopedAttribute("onRenderChange", onRenderChange);
  }
  
  public void setOnRenderedChange(Object onRenderedChange) {
    this._onRenderedChange = onRenderedChange;
    
    setScopedAttribute("onRenderedChange", onRenderedChange);
  }
  
  public void setOnSrcNodeChange(Object onSrcNodeChange) {
    this._onSrcNodeChange = onSrcNodeChange;
    
    setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
  }
  
  public void setOnStringsChange(Object onStringsChange) {
    this._onStringsChange = onStringsChange;
    
    setScopedAttribute("onStringsChange", onStringsChange);
  }
  
  public void setOnTabIndexChange(Object onTabIndexChange) {
    this._onTabIndexChange = onTabIndexChange;
    
    setScopedAttribute("onTabIndexChange", onTabIndexChange);
  }
  
  public void setOnTitleChange(Object onTitleChange) {
    this._onTitleChange = onTitleChange;
    
    setScopedAttribute("onTitleChange", onTitleChange);
  }
  
  public void setOnUseARIAChange(Object onUseARIAChange) {
    this._onUseARIAChange = onUseARIAChange;
    
    setScopedAttribute("onUseARIAChange", onUseARIAChange);
  }
  
  public void setOnVisibleChange(Object onVisibleChange) {
    this._onVisibleChange = onVisibleChange;
    
    setScopedAttribute("onVisibleChange", onVisibleChange);
  }
  
  public void setOnContentUpdate(Object onContentUpdate) {
    this._onContentUpdate = onContentUpdate;
    
    setScopedAttribute("onContentUpdate", onContentUpdate);
  }
  
  public void setOnRender(Object onRender) {
    this._onRender = onRender;
    
    setScopedAttribute("onRender", onRender);
  }
  
  public void setOnWidthChange(Object onWidthChange) {
    this._onWidthChange = onWidthChange;
    
    setScopedAttribute("onWidthChange", onWidthChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._panelBodyContent = null;
    this._boundingBox = null;
    this._collapsed = false;
    this._collapsible = false;
    this._contentBox = null;
    this._destroyed = false;
    this._disabled = false;
    this._fillHeight = null;
    this._focused = false;
    this._footerContent = null;
    this._headerContent = null;
    this._height = null;
    this._icons = null;
    this._panelId = null;
    this._initialized = false;
    this._render = null;
    this._rendered = false;
    this._srcNode = null;
    this._strings = null;
    this._tabIndex = Integer.valueOf(0);
    this._title = null;
    this._useARIA = true;
    this._visible = true;
    this._width = null;
    this._afterBodyContentChange = null;
    this._afterBoundingBoxChange = null;
    this._afterCollapsedChange = null;
    this._afterCollapsibleChange = null;
    this._afterContentBoxChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterDisabledChange = null;
    this._afterFillHeightChange = null;
    this._afterFocusedChange = null;
    this._afterFooterContentChange = null;
    this._afterHeaderContentChange = null;
    this._afterHeightChange = null;
    this._afterIconsChange = null;
    this._afterIdChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterRenderChange = null;
    this._afterRenderedChange = null;
    this._afterSrcNodeChange = null;
    this._afterStringsChange = null;
    this._afterTabIndexChange = null;
    this._afterTitleChange = null;
    this._afterUseARIAChange = null;
    this._afterVisibleChange = null;
    this._afterContentUpdate = null;
    this._afterRender = null;
    this._afterWidthChange = null;
    this._onBodyContentChange = null;
    this._onBoundingBoxChange = null;
    this._onCollapsedChange = null;
    this._onCollapsibleChange = null;
    this._onContentBoxChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onDisabledChange = null;
    this._onFillHeightChange = null;
    this._onFocusedChange = null;
    this._onFooterContentChange = null;
    this._onHeaderContentChange = null;
    this._onHeightChange = null;
    this._onIconsChange = null;
    this._onIdChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onRenderChange = null;
    this._onRenderedChange = null;
    this._onSrcNodeChange = null;
    this._onStringsChange = null;
    this._onTabIndexChange = null;
    this._onTitleChange = null;
    this._onUseARIAChange = null;
    this._onVisibleChange = null;
    this._onContentUpdate = null;
    this._onRender = null;
    this._onWidthChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/panel/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "panelBodyContent", this._panelBodyContent);
    setNamespacedAttribute(request, "boundingBox", this._boundingBox);
    setNamespacedAttribute(request, "collapsed", Boolean.valueOf(this._collapsed));
    setNamespacedAttribute(request, "collapsible", Boolean.valueOf(this._collapsible));
    setNamespacedAttribute(request, "contentBox", this._contentBox);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
    setNamespacedAttribute(request, "fillHeight", this._fillHeight);
    setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
    setNamespacedAttribute(request, "footerContent", this._footerContent);
    setNamespacedAttribute(request, "headerContent", this._headerContent);
    setNamespacedAttribute(request, "height", this._height);
    setNamespacedAttribute(request, "icons", this._icons);
    setNamespacedAttribute(request, "panelId", this._panelId);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "render", this._render);
    setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
    setNamespacedAttribute(request, "srcNode", this._srcNode);
    setNamespacedAttribute(request, "strings", this._strings);
    setNamespacedAttribute(request, "tabIndex", this._tabIndex);
    setNamespacedAttribute(request, "title", this._title);
    setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
    setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
    setNamespacedAttribute(request, "width", this._width);
    setNamespacedAttribute(request, "afterBodyContentChange", this._afterBodyContentChange);
    setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
    setNamespacedAttribute(request, "afterCollapsedChange", this._afterCollapsedChange);
    setNamespacedAttribute(request, "afterCollapsibleChange", this._afterCollapsibleChange);
    setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
    setNamespacedAttribute(request, "afterFillHeightChange", this._afterFillHeightChange);
    setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
    setNamespacedAttribute(request, "afterFooterContentChange", this._afterFooterContentChange);
    setNamespacedAttribute(request, "afterHeaderContentChange", this._afterHeaderContentChange);
    setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
    setNamespacedAttribute(request, "afterIconsChange", this._afterIconsChange);
    setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
    setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
    setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
    setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
    setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
    setNamespacedAttribute(request, "afterTitleChange", this._afterTitleChange);
    setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
    setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
    setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
    setNamespacedAttribute(request, "afterRender", this._afterRender);
    setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
    setNamespacedAttribute(request, "onBodyContentChange", this._onBodyContentChange);
    setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
    setNamespacedAttribute(request, "onCollapsedChange", this._onCollapsedChange);
    setNamespacedAttribute(request, "onCollapsibleChange", this._onCollapsibleChange);
    setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
    setNamespacedAttribute(request, "onFillHeightChange", this._onFillHeightChange);
    setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
    setNamespacedAttribute(request, "onFooterContentChange", this._onFooterContentChange);
    setNamespacedAttribute(request, "onHeaderContentChange", this._onHeaderContentChange);
    setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
    setNamespacedAttribute(request, "onIconsChange", this._onIconsChange);
    setNamespacedAttribute(request, "onIdChange", this._onIdChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
    setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
    setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
    setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
    setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
    setNamespacedAttribute(request, "onTitleChange", this._onTitleChange);
    setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
    setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
    setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
    setNamespacedAttribute(request, "onRender", this._onRender);
    setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
  }
  





  private Object _panelBodyContent = null;
  private String _boundingBox = null;
  private boolean _collapsed = false;
  private boolean _collapsible = false;
  private String _contentBox = null;
  private boolean _destroyed = false;
  private boolean _disabled = false;
  private Object _fillHeight = null;
  private boolean _focused = false;
  private Object _footerContent = null;
  private Object _headerContent = null;
  private Object _height = null;
  private Object _icons = null;
  private String _panelId = null;
  private boolean _initialized = false;
  private Object _render = null;
  private boolean _rendered = false;
  private String _srcNode = null;
  private Object _strings = null;
  private Object _tabIndex = Integer.valueOf(0);
  private Object _title = null;
  private boolean _useARIA = true;
  private boolean _visible = true;
  private Object _width = null;
  private Object _afterBodyContentChange = null;
  private Object _afterBoundingBoxChange = null;
  private Object _afterCollapsedChange = null;
  private Object _afterCollapsibleChange = null;
  private Object _afterContentBoxChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterDisabledChange = null;
  private Object _afterFillHeightChange = null;
  private Object _afterFocusedChange = null;
  private Object _afterFooterContentChange = null;
  private Object _afterHeaderContentChange = null;
  private Object _afterHeightChange = null;
  private Object _afterIconsChange = null;
  private Object _afterIdChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterRenderChange = null;
  private Object _afterRenderedChange = null;
  private Object _afterSrcNodeChange = null;
  private Object _afterStringsChange = null;
  private Object _afterTabIndexChange = null;
  private Object _afterTitleChange = null;
  private Object _afterUseARIAChange = null;
  private Object _afterVisibleChange = null;
  private Object _afterContentUpdate = null;
  private Object _afterRender = null;
  private Object _afterWidthChange = null;
  private Object _onBodyContentChange = null;
  private Object _onBoundingBoxChange = null;
  private Object _onCollapsedChange = null;
  private Object _onCollapsibleChange = null;
  private Object _onContentBoxChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onDisabledChange = null;
  private Object _onFillHeightChange = null;
  private Object _onFocusedChange = null;
  private Object _onFooterContentChange = null;
  private Object _onHeaderContentChange = null;
  private Object _onHeightChange = null;
  private Object _onIconsChange = null;
  private Object _onIdChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onRenderChange = null;
  private Object _onRenderedChange = null;
  private Object _onSrcNodeChange = null;
  private Object _onStringsChange = null;
  private Object _onTabIndexChange = null;
  private Object _onTitleChange = null;
  private Object _onUseARIAChange = null;
  private Object _onVisibleChange = null;
  private Object _onContentUpdate = null;
  private Object _onRender = null;
  private Object _onWidthChange = null;
}
