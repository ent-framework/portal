package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseProgressBarTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:progress-bar:";
  private static final String _PAGE = "/html/taglib/alloy/progress_bar/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:progress-bar:");
    
    return super.doStartTag();
  }
  
  public String getBoundingBox() {
    return this._boundingBox;
  }
  
  public String getContentBox() {
    return this._contentBox;
  }
  
  public String getCssClass() {
    return this._cssClass;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public boolean getDisabled() {
    return this._disabled;
  }
  
  public boolean getFocused() {
    return this._focused;
  }
  
  public int getHeight() {
    return this._height;
  }
  
  public String getHideClass() {
    return this._hideClass;
  }
  
  public String getProgressbarId() {
    return this._progressbarId;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public String getLabel() {
    return this._label;
  }
  
  public int getMax() {
    return this._max;
  }
  
  public int getMin() {
    return this._min;
  }
  
  public String getOrientation() {
    return this._orientation;
  }
  
  public Object getRatio() {
    return this._ratio;
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
  
  public String getStatusNode() {
    return this._statusNode;
  }
  
  public Object getStep() {
    return this._step;
  }
  
  public Object getStrings() {
    return this._strings;
  }
  
  public Object getTabIndex() {
    return this._tabIndex;
  }
  
  public String getTextNode() {
    return this._textNode;
  }
  
  public boolean getUseARIA() {
    return this._useARIA;
  }
  
  public int getProgressbarValue() {
    return this._progressbarValue;
  }
  
  public boolean getVisible() {
    return this._visible;
  }
  
  public Object getWidth() {
    return this._width;
  }
  
  public Object getAfterBoundingBoxChange() {
    return this._afterBoundingBoxChange;
  }
  
  public Object getAfterContentBoxChange() {
    return this._afterContentBoxChange;
  }
  
  public Object getAfterCssClassChange() {
    return this._afterCssClassChange;
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
  
  public Object getAfterFocusedChange() {
    return this._afterFocusedChange;
  }
  
  public Object getAfterHeightChange() {
    return this._afterHeightChange;
  }
  
  public Object getAfterHideClassChange() {
    return this._afterHideClassChange;
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
  
  public Object getAfterLabelChange() {
    return this._afterLabelChange;
  }
  
  public Object getAfterMaxChange() {
    return this._afterMaxChange;
  }
  
  public Object getAfterMinChange() {
    return this._afterMinChange;
  }
  
  public Object getAfterOrientationChange() {
    return this._afterOrientationChange;
  }
  
  public Object getAfterRatioChange() {
    return this._afterRatioChange;
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
  
  public Object getAfterStatusNodeChange() {
    return this._afterStatusNodeChange;
  }
  
  public Object getAfterStepChange() {
    return this._afterStepChange;
  }
  
  public Object getAfterStringsChange() {
    return this._afterStringsChange;
  }
  
  public Object getAfterTabIndexChange() {
    return this._afterTabIndexChange;
  }
  
  public Object getAfterTextNodeChange() {
    return this._afterTextNodeChange;
  }
  
  public Object getAfterUseARIAChange() {
    return this._afterUseARIAChange;
  }
  
  public Object getAfterValueChange() {
    return this._afterValueChange;
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
  
  public Object getOnBoundingBoxChange() {
    return this._onBoundingBoxChange;
  }
  
  public Object getOnContentBoxChange() {
    return this._onContentBoxChange;
  }
  
  public Object getOnCssClassChange() {
    return this._onCssClassChange;
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
  
  public Object getOnFocusedChange() {
    return this._onFocusedChange;
  }
  
  public Object getOnHeightChange() {
    return this._onHeightChange;
  }
  
  public Object getOnHideClassChange() {
    return this._onHideClassChange;
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
  
  public Object getOnLabelChange() {
    return this._onLabelChange;
  }
  
  public Object getOnMaxChange() {
    return this._onMaxChange;
  }
  
  public Object getOnMinChange() {
    return this._onMinChange;
  }
  
  public Object getOnOrientationChange() {
    return this._onOrientationChange;
  }
  
  public Object getOnRatioChange() {
    return this._onRatioChange;
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
  
  public Object getOnStatusNodeChange() {
    return this._onStatusNodeChange;
  }
  
  public Object getOnStepChange() {
    return this._onStepChange;
  }
  
  public Object getOnStringsChange() {
    return this._onStringsChange;
  }
  
  public Object getOnTabIndexChange() {
    return this._onTabIndexChange;
  }
  
  public Object getOnTextNodeChange() {
    return this._onTextNodeChange;
  }
  
  public Object getOnUseARIAChange() {
    return this._onUseARIAChange;
  }
  
  public Object getOnValueChange() {
    return this._onValueChange;
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
  
  public void setBoundingBox(String boundingBox) {
    this._boundingBox = boundingBox;
    
    setScopedAttribute("boundingBox", boundingBox);
  }
  
  public void setContentBox(String contentBox) {
    this._contentBox = contentBox;
    
    setScopedAttribute("contentBox", contentBox);
  }
  
  public void setCssClass(String cssClass) {
    this._cssClass = cssClass;
    
    setScopedAttribute("cssClass", cssClass);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setDisabled(boolean disabled) {
    this._disabled = disabled;
    
    setScopedAttribute("disabled", Boolean.valueOf(disabled));
  }
  
  public void setFocused(boolean focused) {
    this._focused = focused;
    
    setScopedAttribute("focused", Boolean.valueOf(focused));
  }
  
  public void setHeight(int height) {
    this._height = height;
    
    setScopedAttribute("height", Integer.valueOf(height));
  }
  
  public void setHideClass(String hideClass) {
    this._hideClass = hideClass;
    
    setScopedAttribute("hideClass", hideClass);
  }
  
  public void setProgressbarId(String progressbarId) {
    this._progressbarId = progressbarId;
    
    setScopedAttribute("progressbarId", progressbarId);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setLabel(String label) {
    this._label = label;
    
    setScopedAttribute("label", label);
  }
  
  public void setMax(int max) {
    this._max = max;
    
    setScopedAttribute("max", Integer.valueOf(max));
  }
  
  public void setMin(int min) {
    this._min = min;
    
    setScopedAttribute("min", Integer.valueOf(min));
  }
  
  public void setOrientation(String orientation) {
    this._orientation = orientation;
    
    setScopedAttribute("orientation", orientation);
  }
  
  public void setRatio(Object ratio) {
    this._ratio = ratio;
    
    setScopedAttribute("ratio", ratio);
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
  
  public void setStatusNode(String statusNode) {
    this._statusNode = statusNode;
    
    setScopedAttribute("statusNode", statusNode);
  }
  
  public void setStep(Object step) {
    this._step = step;
    
    setScopedAttribute("step", step);
  }
  
  public void setStrings(Object strings) {
    this._strings = strings;
    
    setScopedAttribute("strings", strings);
  }
  
  public void setTabIndex(Object tabIndex) {
    this._tabIndex = tabIndex;
    
    setScopedAttribute("tabIndex", tabIndex);
  }
  
  public void setTextNode(String textNode) {
    this._textNode = textNode;
    
    setScopedAttribute("textNode", textNode);
  }
  
  public void setUseARIA(boolean useARIA) {
    this._useARIA = useARIA;
    
    setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
  }
  
  public void setProgressbarValue(int progressbarValue) {
    this._progressbarValue = progressbarValue;
    
    setScopedAttribute("progressbarValue", Integer.valueOf(progressbarValue));
  }
  
  public void setVisible(boolean visible) {
    this._visible = visible;
    
    setScopedAttribute("visible", Boolean.valueOf(visible));
  }
  
  public void setWidth(Object width) {
    this._width = width;
    
    setScopedAttribute("width", width);
  }
  
  public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
    this._afterBoundingBoxChange = afterBoundingBoxChange;
    
    setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
  }
  
  public void setAfterContentBoxChange(Object afterContentBoxChange) {
    this._afterContentBoxChange = afterContentBoxChange;
    
    setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
  }
  
  public void setAfterCssClassChange(Object afterCssClassChange) {
    this._afterCssClassChange = afterCssClassChange;
    
    setScopedAttribute("afterCssClassChange", afterCssClassChange);
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
  
  public void setAfterFocusedChange(Object afterFocusedChange) {
    this._afterFocusedChange = afterFocusedChange;
    
    setScopedAttribute("afterFocusedChange", afterFocusedChange);
  }
  
  public void setAfterHeightChange(Object afterHeightChange) {
    this._afterHeightChange = afterHeightChange;
    
    setScopedAttribute("afterHeightChange", afterHeightChange);
  }
  
  public void setAfterHideClassChange(Object afterHideClassChange) {
    this._afterHideClassChange = afterHideClassChange;
    
    setScopedAttribute("afterHideClassChange", afterHideClassChange);
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
  
  public void setAfterLabelChange(Object afterLabelChange) {
    this._afterLabelChange = afterLabelChange;
    
    setScopedAttribute("afterLabelChange", afterLabelChange);
  }
  
  public void setAfterMaxChange(Object afterMaxChange) {
    this._afterMaxChange = afterMaxChange;
    
    setScopedAttribute("afterMaxChange", afterMaxChange);
  }
  
  public void setAfterMinChange(Object afterMinChange) {
    this._afterMinChange = afterMinChange;
    
    setScopedAttribute("afterMinChange", afterMinChange);
  }
  
  public void setAfterOrientationChange(Object afterOrientationChange) {
    this._afterOrientationChange = afterOrientationChange;
    
    setScopedAttribute("afterOrientationChange", afterOrientationChange);
  }
  
  public void setAfterRatioChange(Object afterRatioChange) {
    this._afterRatioChange = afterRatioChange;
    
    setScopedAttribute("afterRatioChange", afterRatioChange);
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
  
  public void setAfterStatusNodeChange(Object afterStatusNodeChange) {
    this._afterStatusNodeChange = afterStatusNodeChange;
    
    setScopedAttribute("afterStatusNodeChange", afterStatusNodeChange);
  }
  
  public void setAfterStepChange(Object afterStepChange) {
    this._afterStepChange = afterStepChange;
    
    setScopedAttribute("afterStepChange", afterStepChange);
  }
  
  public void setAfterStringsChange(Object afterStringsChange) {
    this._afterStringsChange = afterStringsChange;
    
    setScopedAttribute("afterStringsChange", afterStringsChange);
  }
  
  public void setAfterTabIndexChange(Object afterTabIndexChange) {
    this._afterTabIndexChange = afterTabIndexChange;
    
    setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
  }
  
  public void setAfterTextNodeChange(Object afterTextNodeChange) {
    this._afterTextNodeChange = afterTextNodeChange;
    
    setScopedAttribute("afterTextNodeChange", afterTextNodeChange);
  }
  
  public void setAfterUseARIAChange(Object afterUseARIAChange) {
    this._afterUseARIAChange = afterUseARIAChange;
    
    setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
  }
  
  public void setAfterValueChange(Object afterValueChange) {
    this._afterValueChange = afterValueChange;
    
    setScopedAttribute("afterValueChange", afterValueChange);
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
  
  public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
    this._onBoundingBoxChange = onBoundingBoxChange;
    
    setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
  }
  
  public void setOnContentBoxChange(Object onContentBoxChange) {
    this._onContentBoxChange = onContentBoxChange;
    
    setScopedAttribute("onContentBoxChange", onContentBoxChange);
  }
  
  public void setOnCssClassChange(Object onCssClassChange) {
    this._onCssClassChange = onCssClassChange;
    
    setScopedAttribute("onCssClassChange", onCssClassChange);
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
  
  public void setOnFocusedChange(Object onFocusedChange) {
    this._onFocusedChange = onFocusedChange;
    
    setScopedAttribute("onFocusedChange", onFocusedChange);
  }
  
  public void setOnHeightChange(Object onHeightChange) {
    this._onHeightChange = onHeightChange;
    
    setScopedAttribute("onHeightChange", onHeightChange);
  }
  
  public void setOnHideClassChange(Object onHideClassChange) {
    this._onHideClassChange = onHideClassChange;
    
    setScopedAttribute("onHideClassChange", onHideClassChange);
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
  
  public void setOnLabelChange(Object onLabelChange) {
    this._onLabelChange = onLabelChange;
    
    setScopedAttribute("onLabelChange", onLabelChange);
  }
  
  public void setOnMaxChange(Object onMaxChange) {
    this._onMaxChange = onMaxChange;
    
    setScopedAttribute("onMaxChange", onMaxChange);
  }
  
  public void setOnMinChange(Object onMinChange) {
    this._onMinChange = onMinChange;
    
    setScopedAttribute("onMinChange", onMinChange);
  }
  
  public void setOnOrientationChange(Object onOrientationChange) {
    this._onOrientationChange = onOrientationChange;
    
    setScopedAttribute("onOrientationChange", onOrientationChange);
  }
  
  public void setOnRatioChange(Object onRatioChange) {
    this._onRatioChange = onRatioChange;
    
    setScopedAttribute("onRatioChange", onRatioChange);
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
  
  public void setOnStatusNodeChange(Object onStatusNodeChange) {
    this._onStatusNodeChange = onStatusNodeChange;
    
    setScopedAttribute("onStatusNodeChange", onStatusNodeChange);
  }
  
  public void setOnStepChange(Object onStepChange) {
    this._onStepChange = onStepChange;
    
    setScopedAttribute("onStepChange", onStepChange);
  }
  
  public void setOnStringsChange(Object onStringsChange) {
    this._onStringsChange = onStringsChange;
    
    setScopedAttribute("onStringsChange", onStringsChange);
  }
  
  public void setOnTabIndexChange(Object onTabIndexChange) {
    this._onTabIndexChange = onTabIndexChange;
    
    setScopedAttribute("onTabIndexChange", onTabIndexChange);
  }
  
  public void setOnTextNodeChange(Object onTextNodeChange) {
    this._onTextNodeChange = onTextNodeChange;
    
    setScopedAttribute("onTextNodeChange", onTextNodeChange);
  }
  
  public void setOnUseARIAChange(Object onUseARIAChange) {
    this._onUseARIAChange = onUseARIAChange;
    
    setScopedAttribute("onUseARIAChange", onUseARIAChange);
  }
  
  public void setOnValueChange(Object onValueChange) {
    this._onValueChange = onValueChange;
    
    setScopedAttribute("onValueChange", onValueChange);
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
    
    this._boundingBox = null;
    this._contentBox = null;
    this._cssClass = null;
    this._destroyed = false;
    this._disabled = false;
    this._focused = false;
    this._height = 25;
    this._hideClass = "aui-helper-hidden";
    this._progressbarId = null;
    this._initialized = false;
    this._label = null;
    this._max = 100;
    this._min = 0;
    this._orientation = "horizontal";
    this._ratio = Integer.valueOf(0);
    this._render = null;
    this._rendered = false;
    this._srcNode = null;
    this._statusNode = null;
    this._step = Integer.valueOf(0);
    this._strings = null;
    this._tabIndex = Integer.valueOf(0);
    this._textNode = null;
    this._useARIA = true;
    this._progressbarValue = 0;
    this._visible = true;
    this._width = null;
    this._afterBoundingBoxChange = null;
    this._afterContentBoxChange = null;
    this._afterCssClassChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterDisabledChange = null;
    this._afterFocusedChange = null;
    this._afterHeightChange = null;
    this._afterHideClassChange = null;
    this._afterIdChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterLabelChange = null;
    this._afterMaxChange = null;
    this._afterMinChange = null;
    this._afterOrientationChange = null;
    this._afterRatioChange = null;
    this._afterRenderChange = null;
    this._afterRenderedChange = null;
    this._afterSrcNodeChange = null;
    this._afterStatusNodeChange = null;
    this._afterStepChange = null;
    this._afterStringsChange = null;
    this._afterTabIndexChange = null;
    this._afterTextNodeChange = null;
    this._afterUseARIAChange = null;
    this._afterValueChange = null;
    this._afterVisibleChange = null;
    this._afterContentUpdate = null;
    this._afterRender = null;
    this._afterWidthChange = null;
    this._onBoundingBoxChange = null;
    this._onContentBoxChange = null;
    this._onCssClassChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onDisabledChange = null;
    this._onFocusedChange = null;
    this._onHeightChange = null;
    this._onHideClassChange = null;
    this._onIdChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onLabelChange = null;
    this._onMaxChange = null;
    this._onMinChange = null;
    this._onOrientationChange = null;
    this._onRatioChange = null;
    this._onRenderChange = null;
    this._onRenderedChange = null;
    this._onSrcNodeChange = null;
    this._onStatusNodeChange = null;
    this._onStepChange = null;
    this._onStringsChange = null;
    this._onTabIndexChange = null;
    this._onTextNodeChange = null;
    this._onUseARIAChange = null;
    this._onValueChange = null;
    this._onVisibleChange = null;
    this._onContentUpdate = null;
    this._onRender = null;
    this._onWidthChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/progress_bar/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "boundingBox", this._boundingBox);
    setNamespacedAttribute(request, "contentBox", this._contentBox);
    setNamespacedAttribute(request, "cssClass", this._cssClass);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
    setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
    setNamespacedAttribute(request, "height", Integer.valueOf(this._height));
    setNamespacedAttribute(request, "hideClass", this._hideClass);
    setNamespacedAttribute(request, "progressbarId", this._progressbarId);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "label", this._label);
    setNamespacedAttribute(request, "max", Integer.valueOf(this._max));
    setNamespacedAttribute(request, "min", Integer.valueOf(this._min));
    setNamespacedAttribute(request, "orientation", this._orientation);
    setNamespacedAttribute(request, "ratio", this._ratio);
    setNamespacedAttribute(request, "render", this._render);
    setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
    setNamespacedAttribute(request, "srcNode", this._srcNode);
    setNamespacedAttribute(request, "statusNode", this._statusNode);
    setNamespacedAttribute(request, "step", this._step);
    setNamespacedAttribute(request, "strings", this._strings);
    setNamespacedAttribute(request, "tabIndex", this._tabIndex);
    setNamespacedAttribute(request, "textNode", this._textNode);
    setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
    setNamespacedAttribute(request, "progressbarValue", Integer.valueOf(this._progressbarValue));
    setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
    setNamespacedAttribute(request, "width", this._width);
    setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
    setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
    setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
    setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
    setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
    setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
    setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterLabelChange", this._afterLabelChange);
    setNamespacedAttribute(request, "afterMaxChange", this._afterMaxChange);
    setNamespacedAttribute(request, "afterMinChange", this._afterMinChange);
    setNamespacedAttribute(request, "afterOrientationChange", this._afterOrientationChange);
    setNamespacedAttribute(request, "afterRatioChange", this._afterRatioChange);
    setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
    setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
    setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
    setNamespacedAttribute(request, "afterStatusNodeChange", this._afterStatusNodeChange);
    setNamespacedAttribute(request, "afterStepChange", this._afterStepChange);
    setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
    setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
    setNamespacedAttribute(request, "afterTextNodeChange", this._afterTextNodeChange);
    setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
    setNamespacedAttribute(request, "afterValueChange", this._afterValueChange);
    setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
    setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
    setNamespacedAttribute(request, "afterRender", this._afterRender);
    setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
    setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
    setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
    setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
    setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
    setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
    setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
    setNamespacedAttribute(request, "onIdChange", this._onIdChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onLabelChange", this._onLabelChange);
    setNamespacedAttribute(request, "onMaxChange", this._onMaxChange);
    setNamespacedAttribute(request, "onMinChange", this._onMinChange);
    setNamespacedAttribute(request, "onOrientationChange", this._onOrientationChange);
    setNamespacedAttribute(request, "onRatioChange", this._onRatioChange);
    setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
    setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
    setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
    setNamespacedAttribute(request, "onStatusNodeChange", this._onStatusNodeChange);
    setNamespacedAttribute(request, "onStepChange", this._onStepChange);
    setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
    setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
    setNamespacedAttribute(request, "onTextNodeChange", this._onTextNodeChange);
    setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
    setNamespacedAttribute(request, "onValueChange", this._onValueChange);
    setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
    setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
    setNamespacedAttribute(request, "onRender", this._onRender);
    setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
  }
  





  private String _boundingBox = null;
  private String _contentBox = null;
  private String _cssClass = null;
  private boolean _destroyed = false;
  private boolean _disabled = false;
  private boolean _focused = false;
  private int _height = 25;
  private String _hideClass = "aui-helper-hidden";
  private String _progressbarId = null;
  private boolean _initialized = false;
  private String _label = null;
  private int _max = 100;
  private int _min = 0;
  private String _orientation = "horizontal";
  private Object _ratio = Integer.valueOf(0);
  private Object _render = null;
  private boolean _rendered = false;
  private String _srcNode = null;
  private String _statusNode = null;
  private Object _step = Integer.valueOf(0);
  private Object _strings = null;
  private Object _tabIndex = Integer.valueOf(0);
  private String _textNode = null;
  private boolean _useARIA = true;
  private int _progressbarValue = 0;
  private boolean _visible = true;
  private Object _width = null;
  private Object _afterBoundingBoxChange = null;
  private Object _afterContentBoxChange = null;
  private Object _afterCssClassChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterDisabledChange = null;
  private Object _afterFocusedChange = null;
  private Object _afterHeightChange = null;
  private Object _afterHideClassChange = null;
  private Object _afterIdChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterLabelChange = null;
  private Object _afterMaxChange = null;
  private Object _afterMinChange = null;
  private Object _afterOrientationChange = null;
  private Object _afterRatioChange = null;
  private Object _afterRenderChange = null;
  private Object _afterRenderedChange = null;
  private Object _afterSrcNodeChange = null;
  private Object _afterStatusNodeChange = null;
  private Object _afterStepChange = null;
  private Object _afterStringsChange = null;
  private Object _afterTabIndexChange = null;
  private Object _afterTextNodeChange = null;
  private Object _afterUseARIAChange = null;
  private Object _afterValueChange = null;
  private Object _afterVisibleChange = null;
  private Object _afterContentUpdate = null;
  private Object _afterRender = null;
  private Object _afterWidthChange = null;
  private Object _onBoundingBoxChange = null;
  private Object _onContentBoxChange = null;
  private Object _onCssClassChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onDisabledChange = null;
  private Object _onFocusedChange = null;
  private Object _onHeightChange = null;
  private Object _onHideClassChange = null;
  private Object _onIdChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onLabelChange = null;
  private Object _onMaxChange = null;
  private Object _onMinChange = null;
  private Object _onOrientationChange = null;
  private Object _onRatioChange = null;
  private Object _onRenderChange = null;
  private Object _onRenderedChange = null;
  private Object _onSrcNodeChange = null;
  private Object _onStatusNodeChange = null;
  private Object _onStepChange = null;
  private Object _onStringsChange = null;
  private Object _onTabIndexChange = null;
  private Object _onTextNodeChange = null;
  private Object _onUseARIAChange = null;
  private Object _onValueChange = null;
  private Object _onVisibleChange = null;
  private Object _onContentUpdate = null;
  private Object _onRender = null;
  private Object _onWidthChange = null;
}
