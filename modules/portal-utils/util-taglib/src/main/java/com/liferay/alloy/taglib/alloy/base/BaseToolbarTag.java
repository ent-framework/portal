package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseToolbarTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:toolbar:";
    private static final String _PAGE = "/html/taglib/alloy/toolbar/page.jsp";
    private Object _activeDescendant = null;
    private boolean _activeState = false;
    private String _boundingBox = null;
    private Object _children = null;
    private String _contentBox = null;
    private String _cssClass = null;
    private Object _defaultChildType = null;
    private boolean _defaultState = false;
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private boolean _focused = false;
    private Object _height = null;
    private String _hideClass = "aui-helper-hidden";
    private boolean _hoverState = false;
    private String _toolbarId = null;
    private boolean _initialized = false;
    private boolean _multiple = false;
    private String _orientation = "horizontal";
    private Object _render = null;
    private boolean _rendered = false;
    private Object _selection = null;
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private boolean _useARIA = true;
    private boolean _visible = true;
    private Object _width = null;
    private Object _afterActiveDescendantChange = null;
    private Object _afterActiveStateChange = null;
    private Object _afterAddChild = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterChildrenChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterCssClassChange = null;
    private Object _afterDefaultChildTypeChange = null;
    private Object _afterDefaultStateChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterHeightChange = null;
    private Object _afterHideClassChange = null;
    private Object _afterHoverStateChange = null;
    private Object _afterIdChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterMultipleChange = null;
    private Object _afterOrientationChange = null;
    private Object _afterRemoveChild = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterSelectionChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _onActiveDescendantChange = null;
    private Object _onActiveStateChange = null;
    private Object _onAddChild = null;
    private Object _onBoundingBoxChange = null;
    private Object _onChildrenChange = null;
    private Object _onContentBoxChange = null;
    private Object _onCssClassChange = null;
    private Object _onDefaultChildTypeChange = null;
    private Object _onDefaultStateChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onFocusedChange = null;
    private Object _onHeightChange = null;
    private Object _onHideClassChange = null;
    private Object _onHoverStateChange = null;
    private Object _onIdChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onMultipleChange = null;
    private Object _onOrientationChange = null;
    private Object _onRemoveChild = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onSelectionChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onUseARIAChange = null;
    private Object _onVisibleChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:toolbar:");

        return super.doStartTag();
    }

    public Object getActiveDescendant() {
        return this._activeDescendant;
    }

    public void setActiveDescendant(Object activeDescendant) {
        this._activeDescendant = activeDescendant;

        setScopedAttribute("activeDescendant", activeDescendant);
    }

    public boolean getActiveState() {
        return this._activeState;
    }

    public void setActiveState(boolean activeState) {
        this._activeState = activeState;

        setScopedAttribute("activeState", Boolean.valueOf(activeState));
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public Object getChildren() {
        return this._children;
    }

    public void setChildren(Object children) {
        this._children = children;

        setScopedAttribute("children", children);
    }

    public String getContentBox() {
        return this._contentBox;
    }

    public void setContentBox(String contentBox) {
        this._contentBox = contentBox;

        setScopedAttribute("contentBox", contentBox);
    }

    public String getCssClass() {
        return this._cssClass;
    }

    public void setCssClass(String cssClass) {
        this._cssClass = cssClass;

        setScopedAttribute("cssClass", cssClass);
    }

    public Object getDefaultChildType() {
        return this._defaultChildType;
    }

    public void setDefaultChildType(Object defaultChildType) {
        this._defaultChildType = defaultChildType;

        setScopedAttribute("defaultChildType", defaultChildType);
    }

    public boolean getDefaultState() {
        return this._defaultState;
    }

    public void setDefaultState(boolean defaultState) {
        this._defaultState = defaultState;

        setScopedAttribute("defaultState", Boolean.valueOf(defaultState));
    }

    public boolean getDestroyed() {
        return this._destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this._destroyed = destroyed;

        setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
    }

    public boolean getDisabled() {
        return this._disabled;
    }

    public void setDisabled(boolean disabled) {
        this._disabled = disabled;

        setScopedAttribute("disabled", Boolean.valueOf(disabled));
    }

    public boolean getFocused() {
        return this._focused;
    }

    public void setFocused(boolean focused) {
        this._focused = focused;

        setScopedAttribute("focused", Boolean.valueOf(focused));
    }

    public Object getHeight() {
        return this._height;
    }

    public void setHeight(Object height) {
        this._height = height;

        setScopedAttribute("height", height);
    }

    public String getHideClass() {
        return this._hideClass;
    }

    public void setHideClass(String hideClass) {
        this._hideClass = hideClass;

        setScopedAttribute("hideClass", hideClass);
    }

    public boolean getHoverState() {
        return this._hoverState;
    }

    public void setHoverState(boolean hoverState) {
        this._hoverState = hoverState;

        setScopedAttribute("hoverState", Boolean.valueOf(hoverState));
    }

    public String getToolbarId() {
        return this._toolbarId;
    }

    public void setToolbarId(String toolbarId) {
        this._toolbarId = toolbarId;

        setScopedAttribute("toolbarId", toolbarId);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public boolean getMultiple() {
        return this._multiple;
    }

    public void setMultiple(boolean multiple) {
        this._multiple = multiple;

        setScopedAttribute("multiple", Boolean.valueOf(multiple));
    }

    public String getOrientation() {
        return this._orientation;
    }

    public void setOrientation(String orientation) {
        this._orientation = orientation;

        setScopedAttribute("orientation", orientation);
    }

    public Object getRender() {
        return this._render;
    }

    public void setRender(Object render) {
        this._render = render;

        setScopedAttribute("render", render);
    }

    public boolean getRendered() {
        return this._rendered;
    }

    public void setRendered(boolean rendered) {
        this._rendered = rendered;

        setScopedAttribute("rendered", Boolean.valueOf(rendered));
    }

    public Object getSelection() {
        return this._selection;
    }

    public void setSelection(Object selection) {
        this._selection = selection;

        setScopedAttribute("selection", selection);
    }

    public String getSrcNode() {
        return this._srcNode;
    }

    public void setSrcNode(String srcNode) {
        this._srcNode = srcNode;

        setScopedAttribute("srcNode", srcNode);
    }

    public Object getStrings() {
        return this._strings;
    }

    public void setStrings(Object strings) {
        this._strings = strings;

        setScopedAttribute("strings", strings);
    }

    public Object getTabIndex() {
        return this._tabIndex;
    }

    public void setTabIndex(Object tabIndex) {
        this._tabIndex = tabIndex;

        setScopedAttribute("tabIndex", tabIndex);
    }

    public boolean getUseARIA() {
        return this._useARIA;
    }

    public void setUseARIA(boolean useARIA) {
        this._useARIA = useARIA;

        setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
    }

    public boolean getVisible() {
        return this._visible;
    }

    public void setVisible(boolean visible) {
        this._visible = visible;

        setScopedAttribute("visible", Boolean.valueOf(visible));
    }

    public Object getWidth() {
        return this._width;
    }

    public void setWidth(Object width) {
        this._width = width;

        setScopedAttribute("width", width);
    }

    public Object getAfterActiveDescendantChange() {
        return this._afterActiveDescendantChange;
    }

    public void setAfterActiveDescendantChange(Object afterActiveDescendantChange) {
        this._afterActiveDescendantChange = afterActiveDescendantChange;

        setScopedAttribute("afterActiveDescendantChange", afterActiveDescendantChange);
    }

    public Object getAfterActiveStateChange() {
        return this._afterActiveStateChange;
    }

    public void setAfterActiveStateChange(Object afterActiveStateChange) {
        this._afterActiveStateChange = afterActiveStateChange;

        setScopedAttribute("afterActiveStateChange", afterActiveStateChange);
    }

    public Object getAfterAddChild() {
        return this._afterAddChild;
    }

    public void setAfterAddChild(Object afterAddChild) {
        this._afterAddChild = afterAddChild;

        setScopedAttribute("afterAddChild", afterAddChild);
    }

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterChildrenChange() {
        return this._afterChildrenChange;
    }

    public void setAfterChildrenChange(Object afterChildrenChange) {
        this._afterChildrenChange = afterChildrenChange;

        setScopedAttribute("afterChildrenChange", afterChildrenChange);
    }

    public Object getAfterContentBoxChange() {
        return this._afterContentBoxChange;
    }

    public void setAfterContentBoxChange(Object afterContentBoxChange) {
        this._afterContentBoxChange = afterContentBoxChange;

        setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
    }

    public Object getAfterCssClassChange() {
        return this._afterCssClassChange;
    }

    public void setAfterCssClassChange(Object afterCssClassChange) {
        this._afterCssClassChange = afterCssClassChange;

        setScopedAttribute("afterCssClassChange", afterCssClassChange);
    }

    public Object getAfterDefaultChildTypeChange() {
        return this._afterDefaultChildTypeChange;
    }

    public void setAfterDefaultChildTypeChange(Object afterDefaultChildTypeChange) {
        this._afterDefaultChildTypeChange = afterDefaultChildTypeChange;

        setScopedAttribute("afterDefaultChildTypeChange", afterDefaultChildTypeChange);
    }

    public Object getAfterDefaultStateChange() {
        return this._afterDefaultStateChange;
    }

    public void setAfterDefaultStateChange(Object afterDefaultStateChange) {
        this._afterDefaultStateChange = afterDefaultStateChange;

        setScopedAttribute("afterDefaultStateChange", afterDefaultStateChange);
    }

    public Object getAfterDestroy() {
        return this._afterDestroy;
    }

    public void setAfterDestroy(Object afterDestroy) {
        this._afterDestroy = afterDestroy;

        setScopedAttribute("afterDestroy", afterDestroy);
    }

    public Object getAfterDestroyedChange() {
        return this._afterDestroyedChange;
    }

    public void setAfterDestroyedChange(Object afterDestroyedChange) {
        this._afterDestroyedChange = afterDestroyedChange;

        setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
    }

    public Object getAfterDisabledChange() {
        return this._afterDisabledChange;
    }

    public void setAfterDisabledChange(Object afterDisabledChange) {
        this._afterDisabledChange = afterDisabledChange;

        setScopedAttribute("afterDisabledChange", afterDisabledChange);
    }

    public Object getAfterFocusedChange() {
        return this._afterFocusedChange;
    }

    public void setAfterFocusedChange(Object afterFocusedChange) {
        this._afterFocusedChange = afterFocusedChange;

        setScopedAttribute("afterFocusedChange", afterFocusedChange);
    }

    public Object getAfterHeightChange() {
        return this._afterHeightChange;
    }

    public void setAfterHeightChange(Object afterHeightChange) {
        this._afterHeightChange = afterHeightChange;

        setScopedAttribute("afterHeightChange", afterHeightChange);
    }

    public Object getAfterHideClassChange() {
        return this._afterHideClassChange;
    }

    public void setAfterHideClassChange(Object afterHideClassChange) {
        this._afterHideClassChange = afterHideClassChange;

        setScopedAttribute("afterHideClassChange", afterHideClassChange);
    }

    public Object getAfterHoverStateChange() {
        return this._afterHoverStateChange;
    }

    public void setAfterHoverStateChange(Object afterHoverStateChange) {
        this._afterHoverStateChange = afterHoverStateChange;

        setScopedAttribute("afterHoverStateChange", afterHoverStateChange);
    }

    public Object getAfterIdChange() {
        return this._afterIdChange;
    }

    public void setAfterIdChange(Object afterIdChange) {
        this._afterIdChange = afterIdChange;

        setScopedAttribute("afterIdChange", afterIdChange);
    }

    public Object getAfterInit() {
        return this._afterInit;
    }

    public void setAfterInit(Object afterInit) {
        this._afterInit = afterInit;

        setScopedAttribute("afterInit", afterInit);
    }

    public Object getAfterInitializedChange() {
        return this._afterInitializedChange;
    }

    public void setAfterInitializedChange(Object afterInitializedChange) {
        this._afterInitializedChange = afterInitializedChange;

        setScopedAttribute("afterInitializedChange", afterInitializedChange);
    }

    public Object getAfterMultipleChange() {
        return this._afterMultipleChange;
    }

    public void setAfterMultipleChange(Object afterMultipleChange) {
        this._afterMultipleChange = afterMultipleChange;

        setScopedAttribute("afterMultipleChange", afterMultipleChange);
    }

    public Object getAfterOrientationChange() {
        return this._afterOrientationChange;
    }

    public void setAfterOrientationChange(Object afterOrientationChange) {
        this._afterOrientationChange = afterOrientationChange;

        setScopedAttribute("afterOrientationChange", afterOrientationChange);
    }

    public Object getAfterRemoveChild() {
        return this._afterRemoveChild;
    }

    public void setAfterRemoveChild(Object afterRemoveChild) {
        this._afterRemoveChild = afterRemoveChild;

        setScopedAttribute("afterRemoveChild", afterRemoveChild);
    }

    public Object getAfterRenderChange() {
        return this._afterRenderChange;
    }

    public void setAfterRenderChange(Object afterRenderChange) {
        this._afterRenderChange = afterRenderChange;

        setScopedAttribute("afterRenderChange", afterRenderChange);
    }

    public Object getAfterRenderedChange() {
        return this._afterRenderedChange;
    }

    public void setAfterRenderedChange(Object afterRenderedChange) {
        this._afterRenderedChange = afterRenderedChange;

        setScopedAttribute("afterRenderedChange", afterRenderedChange);
    }

    public Object getAfterSelectionChange() {
        return this._afterSelectionChange;
    }

    public void setAfterSelectionChange(Object afterSelectionChange) {
        this._afterSelectionChange = afterSelectionChange;

        setScopedAttribute("afterSelectionChange", afterSelectionChange);
    }

    public Object getAfterSrcNodeChange() {
        return this._afterSrcNodeChange;
    }

    public void setAfterSrcNodeChange(Object afterSrcNodeChange) {
        this._afterSrcNodeChange = afterSrcNodeChange;

        setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
    }

    public Object getAfterStringsChange() {
        return this._afterStringsChange;
    }

    public void setAfterStringsChange(Object afterStringsChange) {
        this._afterStringsChange = afterStringsChange;

        setScopedAttribute("afterStringsChange", afterStringsChange);
    }

    public Object getAfterTabIndexChange() {
        return this._afterTabIndexChange;
    }

    public void setAfterTabIndexChange(Object afterTabIndexChange) {
        this._afterTabIndexChange = afterTabIndexChange;

        setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
    }

    public Object getAfterUseARIAChange() {
        return this._afterUseARIAChange;
    }

    public void setAfterUseARIAChange(Object afterUseARIAChange) {
        this._afterUseARIAChange = afterUseARIAChange;

        setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
    }

    public Object getAfterVisibleChange() {
        return this._afterVisibleChange;
    }

    public void setAfterVisibleChange(Object afterVisibleChange) {
        this._afterVisibleChange = afterVisibleChange;

        setScopedAttribute("afterVisibleChange", afterVisibleChange);
    }

    public Object getAfterContentUpdate() {
        return this._afterContentUpdate;
    }

    public void setAfterContentUpdate(Object afterContentUpdate) {
        this._afterContentUpdate = afterContentUpdate;

        setScopedAttribute("afterContentUpdate", afterContentUpdate);
    }

    public Object getAfterRender() {
        return this._afterRender;
    }

    public void setAfterRender(Object afterRender) {
        this._afterRender = afterRender;

        setScopedAttribute("afterRender", afterRender);
    }

    public Object getAfterWidthChange() {
        return this._afterWidthChange;
    }

    public void setAfterWidthChange(Object afterWidthChange) {
        this._afterWidthChange = afterWidthChange;

        setScopedAttribute("afterWidthChange", afterWidthChange);
    }

    public Object getOnActiveDescendantChange() {
        return this._onActiveDescendantChange;
    }

    public void setOnActiveDescendantChange(Object onActiveDescendantChange) {
        this._onActiveDescendantChange = onActiveDescendantChange;

        setScopedAttribute("onActiveDescendantChange", onActiveDescendantChange);
    }

    public Object getOnActiveStateChange() {
        return this._onActiveStateChange;
    }

    public void setOnActiveStateChange(Object onActiveStateChange) {
        this._onActiveStateChange = onActiveStateChange;

        setScopedAttribute("onActiveStateChange", onActiveStateChange);
    }

    public Object getOnAddChild() {
        return this._onAddChild;
    }

    public void setOnAddChild(Object onAddChild) {
        this._onAddChild = onAddChild;

        setScopedAttribute("onAddChild", onAddChild);
    }

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnChildrenChange() {
        return this._onChildrenChange;
    }

    public void setOnChildrenChange(Object onChildrenChange) {
        this._onChildrenChange = onChildrenChange;

        setScopedAttribute("onChildrenChange", onChildrenChange);
    }

    public Object getOnContentBoxChange() {
        return this._onContentBoxChange;
    }

    public void setOnContentBoxChange(Object onContentBoxChange) {
        this._onContentBoxChange = onContentBoxChange;

        setScopedAttribute("onContentBoxChange", onContentBoxChange);
    }

    public Object getOnCssClassChange() {
        return this._onCssClassChange;
    }

    public void setOnCssClassChange(Object onCssClassChange) {
        this._onCssClassChange = onCssClassChange;

        setScopedAttribute("onCssClassChange", onCssClassChange);
    }

    public Object getOnDefaultChildTypeChange() {
        return this._onDefaultChildTypeChange;
    }

    public void setOnDefaultChildTypeChange(Object onDefaultChildTypeChange) {
        this._onDefaultChildTypeChange = onDefaultChildTypeChange;

        setScopedAttribute("onDefaultChildTypeChange", onDefaultChildTypeChange);
    }

    public Object getOnDefaultStateChange() {
        return this._onDefaultStateChange;
    }

    public void setOnDefaultStateChange(Object onDefaultStateChange) {
        this._onDefaultStateChange = onDefaultStateChange;

        setScopedAttribute("onDefaultStateChange", onDefaultStateChange);
    }

    public Object getOnDestroy() {
        return this._onDestroy;
    }

    public void setOnDestroy(Object onDestroy) {
        this._onDestroy = onDestroy;

        setScopedAttribute("onDestroy", onDestroy);
    }

    public Object getOnDestroyedChange() {
        return this._onDestroyedChange;
    }

    public void setOnDestroyedChange(Object onDestroyedChange) {
        this._onDestroyedChange = onDestroyedChange;

        setScopedAttribute("onDestroyedChange", onDestroyedChange);
    }

    public Object getOnDisabledChange() {
        return this._onDisabledChange;
    }

    public void setOnDisabledChange(Object onDisabledChange) {
        this._onDisabledChange = onDisabledChange;

        setScopedAttribute("onDisabledChange", onDisabledChange);
    }

    public Object getOnFocusedChange() {
        return this._onFocusedChange;
    }

    public void setOnFocusedChange(Object onFocusedChange) {
        this._onFocusedChange = onFocusedChange;

        setScopedAttribute("onFocusedChange", onFocusedChange);
    }

    public Object getOnHeightChange() {
        return this._onHeightChange;
    }

    public void setOnHeightChange(Object onHeightChange) {
        this._onHeightChange = onHeightChange;

        setScopedAttribute("onHeightChange", onHeightChange);
    }

    public Object getOnHideClassChange() {
        return this._onHideClassChange;
    }

    public void setOnHideClassChange(Object onHideClassChange) {
        this._onHideClassChange = onHideClassChange;

        setScopedAttribute("onHideClassChange", onHideClassChange);
    }

    public Object getOnHoverStateChange() {
        return this._onHoverStateChange;
    }

    public void setOnHoverStateChange(Object onHoverStateChange) {
        this._onHoverStateChange = onHoverStateChange;

        setScopedAttribute("onHoverStateChange", onHoverStateChange);
    }

    public Object getOnIdChange() {
        return this._onIdChange;
    }

    public void setOnIdChange(Object onIdChange) {
        this._onIdChange = onIdChange;

        setScopedAttribute("onIdChange", onIdChange);
    }

    public Object getOnInit() {
        return this._onInit;
    }

    public void setOnInit(Object onInit) {
        this._onInit = onInit;

        setScopedAttribute("onInit", onInit);
    }

    public Object getOnInitializedChange() {
        return this._onInitializedChange;
    }

    public void setOnInitializedChange(Object onInitializedChange) {
        this._onInitializedChange = onInitializedChange;

        setScopedAttribute("onInitializedChange", onInitializedChange);
    }

    public Object getOnMultipleChange() {
        return this._onMultipleChange;
    }

    public void setOnMultipleChange(Object onMultipleChange) {
        this._onMultipleChange = onMultipleChange;

        setScopedAttribute("onMultipleChange", onMultipleChange);
    }

    public Object getOnOrientationChange() {
        return this._onOrientationChange;
    }

    public void setOnOrientationChange(Object onOrientationChange) {
        this._onOrientationChange = onOrientationChange;

        setScopedAttribute("onOrientationChange", onOrientationChange);
    }

    public Object getOnRemoveChild() {
        return this._onRemoveChild;
    }

    public void setOnRemoveChild(Object onRemoveChild) {
        this._onRemoveChild = onRemoveChild;

        setScopedAttribute("onRemoveChild", onRemoveChild);
    }

    public Object getOnRenderChange() {
        return this._onRenderChange;
    }

    public void setOnRenderChange(Object onRenderChange) {
        this._onRenderChange = onRenderChange;

        setScopedAttribute("onRenderChange", onRenderChange);
    }

    public Object getOnRenderedChange() {
        return this._onRenderedChange;
    }

    public void setOnRenderedChange(Object onRenderedChange) {
        this._onRenderedChange = onRenderedChange;

        setScopedAttribute("onRenderedChange", onRenderedChange);
    }

    public Object getOnSelectionChange() {
        return this._onSelectionChange;
    }

    public void setOnSelectionChange(Object onSelectionChange) {
        this._onSelectionChange = onSelectionChange;

        setScopedAttribute("onSelectionChange", onSelectionChange);
    }

    public Object getOnSrcNodeChange() {
        return this._onSrcNodeChange;
    }

    public void setOnSrcNodeChange(Object onSrcNodeChange) {
        this._onSrcNodeChange = onSrcNodeChange;

        setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
    }

    public Object getOnStringsChange() {
        return this._onStringsChange;
    }

    public void setOnStringsChange(Object onStringsChange) {
        this._onStringsChange = onStringsChange;

        setScopedAttribute("onStringsChange", onStringsChange);
    }

    public Object getOnTabIndexChange() {
        return this._onTabIndexChange;
    }

    public void setOnTabIndexChange(Object onTabIndexChange) {
        this._onTabIndexChange = onTabIndexChange;

        setScopedAttribute("onTabIndexChange", onTabIndexChange);
    }

    public Object getOnUseARIAChange() {
        return this._onUseARIAChange;
    }

    public void setOnUseARIAChange(Object onUseARIAChange) {
        this._onUseARIAChange = onUseARIAChange;

        setScopedAttribute("onUseARIAChange", onUseARIAChange);
    }

    public Object getOnVisibleChange() {
        return this._onVisibleChange;
    }

    public void setOnVisibleChange(Object onVisibleChange) {
        this._onVisibleChange = onVisibleChange;

        setScopedAttribute("onVisibleChange", onVisibleChange);
    }

    public Object getOnContentUpdate() {
        return this._onContentUpdate;
    }

    public void setOnContentUpdate(Object onContentUpdate) {
        this._onContentUpdate = onContentUpdate;

        setScopedAttribute("onContentUpdate", onContentUpdate);
    }

    public Object getOnRender() {
        return this._onRender;
    }

    public void setOnRender(Object onRender) {
        this._onRender = onRender;

        setScopedAttribute("onRender", onRender);
    }

    public Object getOnWidthChange() {
        return this._onWidthChange;
    }

    public void setOnWidthChange(Object onWidthChange) {
        this._onWidthChange = onWidthChange;

        setScopedAttribute("onWidthChange", onWidthChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._activeDescendant = null;
        this._activeState = false;
        this._boundingBox = null;
        this._children = null;
        this._contentBox = null;
        this._cssClass = null;
        this._defaultChildType = null;
        this._defaultState = false;
        this._destroyed = false;
        this._disabled = false;
        this._focused = false;
        this._height = null;
        this._hideClass = "aui-helper-hidden";
        this._hoverState = false;
        this._toolbarId = null;
        this._initialized = false;
        this._multiple = false;
        this._orientation = "horizontal";
        this._render = null;
        this._rendered = false;
        this._selection = null;
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._useARIA = true;
        this._visible = true;
        this._width = null;
        this._afterActiveDescendantChange = null;
        this._afterActiveStateChange = null;
        this._afterAddChild = null;
        this._afterBoundingBoxChange = null;
        this._afterChildrenChange = null;
        this._afterContentBoxChange = null;
        this._afterCssClassChange = null;
        this._afterDefaultChildTypeChange = null;
        this._afterDefaultStateChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterFocusedChange = null;
        this._afterHeightChange = null;
        this._afterHideClassChange = null;
        this._afterHoverStateChange = null;
        this._afterIdChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterMultipleChange = null;
        this._afterOrientationChange = null;
        this._afterRemoveChild = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterSelectionChange = null;
        this._afterSrcNodeChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterUseARIAChange = null;
        this._afterVisibleChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._onActiveDescendantChange = null;
        this._onActiveStateChange = null;
        this._onAddChild = null;
        this._onBoundingBoxChange = null;
        this._onChildrenChange = null;
        this._onContentBoxChange = null;
        this._onCssClassChange = null;
        this._onDefaultChildTypeChange = null;
        this._onDefaultStateChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onFocusedChange = null;
        this._onHeightChange = null;
        this._onHideClassChange = null;
        this._onHoverStateChange = null;
        this._onIdChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onMultipleChange = null;
        this._onOrientationChange = null;
        this._onRemoveChild = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onSelectionChange = null;
        this._onSrcNodeChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onUseARIAChange = null;
        this._onVisibleChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/toolbar/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "activeDescendant", this._activeDescendant);
        setNamespacedAttribute(request, "activeState", Boolean.valueOf(this._activeState));
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "children", this._children);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "cssClass", this._cssClass);
        setNamespacedAttribute(request, "defaultChildType", this._defaultChildType);
        setNamespacedAttribute(request, "defaultState", Boolean.valueOf(this._defaultState));
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "hideClass", this._hideClass);
        setNamespacedAttribute(request, "hoverState", Boolean.valueOf(this._hoverState));
        setNamespacedAttribute(request, "toolbarId", this._toolbarId);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "multiple", Boolean.valueOf(this._multiple));
        setNamespacedAttribute(request, "orientation", this._orientation);
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "selection", this._selection);
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "afterActiveDescendantChange", this._afterActiveDescendantChange);
        setNamespacedAttribute(request, "afterActiveStateChange", this._afterActiveStateChange);
        setNamespacedAttribute(request, "afterAddChild", this._afterAddChild);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterChildrenChange", this._afterChildrenChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
        setNamespacedAttribute(request, "afterDefaultChildTypeChange", this._afterDefaultChildTypeChange);
        setNamespacedAttribute(request, "afterDefaultStateChange", this._afterDefaultStateChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
        setNamespacedAttribute(request, "afterHoverStateChange", this._afterHoverStateChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterMultipleChange", this._afterMultipleChange);
        setNamespacedAttribute(request, "afterOrientationChange", this._afterOrientationChange);
        setNamespacedAttribute(request, "afterRemoveChild", this._afterRemoveChild);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterSelectionChange", this._afterSelectionChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "onActiveDescendantChange", this._onActiveDescendantChange);
        setNamespacedAttribute(request, "onActiveStateChange", this._onActiveStateChange);
        setNamespacedAttribute(request, "onAddChild", this._onAddChild);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onChildrenChange", this._onChildrenChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
        setNamespacedAttribute(request, "onDefaultChildTypeChange", this._onDefaultChildTypeChange);
        setNamespacedAttribute(request, "onDefaultStateChange", this._onDefaultStateChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
        setNamespacedAttribute(request, "onHoverStateChange", this._onHoverStateChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onMultipleChange", this._onMultipleChange);
        setNamespacedAttribute(request, "onOrientationChange", this._onOrientationChange);
        setNamespacedAttribute(request, "onRemoveChild", this._onRemoveChild);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onSelectionChange", this._onSelectionChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
    }
}
