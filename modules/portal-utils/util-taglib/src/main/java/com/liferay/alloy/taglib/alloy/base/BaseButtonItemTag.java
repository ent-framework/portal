package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseButtonItemTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:button-item:";
    private static final String _PAGE = "/html/taglib/alloy/button_item/page.jsp";
    private boolean _activeState = false;
    private String _boundingBox = null;
    private Object _classNames = null;
    private String _contentBox = null;
    private String _cssClass = null;
    private boolean _defaultState = true;
    private Object _depth = Integer.valueOf(-1);
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private boolean _focused = false;
    private Object _handler = null;
    private Object _height = null;
    private String _hideClass = "aui-helper-hidden";
    private boolean _hoverState = true;
    private String _icon = null;
    private String _iconNode = null;
    private String _buttonitemId = null;
    private Object _index = Integer.valueOf(0);
    private boolean _initialized = false;
    private String _label = null;
    private String _labelNode = null;
    private Object _buttonitemParent = null;
    private Object _render = null;
    private boolean _rendered = false;
    private Object _root = null;
    private Object _selected = Integer.valueOf(0);
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private String _title = null;
    private String _type = "button";
    private boolean _useARIA = true;
    private boolean _visible = true;
    private Object _width = null;
    private Object _afterActiveStateChange = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterClassNamesChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterCssClassChange = null;
    private Object _afterDefaultStateChange = null;
    private Object _afterDepthChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterHandlerChange = null;
    private Object _afterHeightChange = null;
    private Object _afterHideClassChange = null;
    private Object _afterHoverStateChange = null;
    private Object _afterIconChange = null;
    private Object _afterIconNodeChange = null;
    private Object _afterIdChange = null;
    private Object _afterIndexChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterLabelChange = null;
    private Object _afterLabelNodeChange = null;
    private Object _afterParentChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterRootChange = null;
    private Object _afterSelectedChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterTitleChange = null;
    private Object _afterTypeChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _onActiveStateChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onClassNamesChange = null;
    private Object _onContentBoxChange = null;
    private Object _onCssClassChange = null;
    private Object _onDefaultStateChange = null;
    private Object _onDepthChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onFocusedChange = null;
    private Object _onHandlerChange = null;
    private Object _onHeightChange = null;
    private Object _onHideClassChange = null;
    private Object _onHoverStateChange = null;
    private Object _onIconChange = null;
    private Object _onIconNodeChange = null;
    private Object _onIdChange = null;
    private Object _onIndexChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onLabelChange = null;
    private Object _onLabelNodeChange = null;
    private Object _onParentChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onRootChange = null;
    private Object _onSelectedChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onTitleChange = null;
    private Object _onTypeChange = null;
    private Object _onUseARIAChange = null;
    private Object _onVisibleChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:button-item:");

        return super.doStartTag();
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

    public Object getClassNames() {
        return this._classNames;
    }

    public void setClassNames(Object classNames) {
        this._classNames = classNames;

        setScopedAttribute("classNames", classNames);
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

    public boolean getDefaultState() {
        return this._defaultState;
    }

    public void setDefaultState(boolean defaultState) {
        this._defaultState = defaultState;

        setScopedAttribute("defaultState", Boolean.valueOf(defaultState));
    }

    public Object getDepth() {
        return this._depth;
    }

    public void setDepth(Object depth) {
        this._depth = depth;

        setScopedAttribute("depth", depth);
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

    public Object getHandler() {
        return this._handler;
    }

    public void setHandler(Object handler) {
        this._handler = handler;

        setScopedAttribute("handler", handler);
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

    public String getIcon() {
        return this._icon;
    }

    public void setIcon(String icon) {
        this._icon = icon;

        setScopedAttribute("icon", icon);
    }

    public String getIconNode() {
        return this._iconNode;
    }

    public void setIconNode(String iconNode) {
        this._iconNode = iconNode;

        setScopedAttribute("iconNode", iconNode);
    }

    public String getButtonitemId() {
        return this._buttonitemId;
    }

    public void setButtonitemId(String buttonitemId) {
        this._buttonitemId = buttonitemId;

        setScopedAttribute("buttonitemId", buttonitemId);
    }

    public Object getIndex() {
        return this._index;
    }

    public void setIndex(Object index) {
        this._index = index;

        setScopedAttribute("index", index);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public String getLabel() {
        return this._label;
    }

    public void setLabel(String label) {
        this._label = label;

        setScopedAttribute("label", label);
    }

    public String getLabelNode() {
        return this._labelNode;
    }

    public void setLabelNode(String labelNode) {
        this._labelNode = labelNode;

        setScopedAttribute("labelNode", labelNode);
    }

    public Object getButtonitemParent() {
        return this._buttonitemParent;
    }

    public void setButtonitemParent(Object buttonitemParent) {
        this._buttonitemParent = buttonitemParent;

        setScopedAttribute("buttonitemParent", buttonitemParent);
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

    public Object getRoot() {
        return this._root;
    }

    public void setRoot(Object root) {
        this._root = root;

        setScopedAttribute("root", root);
    }

    public Object getSelected() {
        return this._selected;
    }

    public void setSelected(Object selected) {
        this._selected = selected;

        setScopedAttribute("selected", selected);
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

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String title) {
        this._title = title;

        setScopedAttribute("title", title);
    }

    public String getType() {
        return this._type;
    }

    public void setType(String type) {
        this._type = type;

        setScopedAttribute("type", type);
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

    public Object getAfterActiveStateChange() {
        return this._afterActiveStateChange;
    }

    public void setAfterActiveStateChange(Object afterActiveStateChange) {
        this._afterActiveStateChange = afterActiveStateChange;

        setScopedAttribute("afterActiveStateChange", afterActiveStateChange);
    }

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterClassNamesChange() {
        return this._afterClassNamesChange;
    }

    public void setAfterClassNamesChange(Object afterClassNamesChange) {
        this._afterClassNamesChange = afterClassNamesChange;

        setScopedAttribute("afterClassNamesChange", afterClassNamesChange);
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

    public Object getAfterDefaultStateChange() {
        return this._afterDefaultStateChange;
    }

    public void setAfterDefaultStateChange(Object afterDefaultStateChange) {
        this._afterDefaultStateChange = afterDefaultStateChange;

        setScopedAttribute("afterDefaultStateChange", afterDefaultStateChange);
    }

    public Object getAfterDepthChange() {
        return this._afterDepthChange;
    }

    public void setAfterDepthChange(Object afterDepthChange) {
        this._afterDepthChange = afterDepthChange;

        setScopedAttribute("afterDepthChange", afterDepthChange);
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

    public Object getAfterHandlerChange() {
        return this._afterHandlerChange;
    }

    public void setAfterHandlerChange(Object afterHandlerChange) {
        this._afterHandlerChange = afterHandlerChange;

        setScopedAttribute("afterHandlerChange", afterHandlerChange);
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

    public Object getAfterIconChange() {
        return this._afterIconChange;
    }

    public void setAfterIconChange(Object afterIconChange) {
        this._afterIconChange = afterIconChange;

        setScopedAttribute("afterIconChange", afterIconChange);
    }

    public Object getAfterIconNodeChange() {
        return this._afterIconNodeChange;
    }

    public void setAfterIconNodeChange(Object afterIconNodeChange) {
        this._afterIconNodeChange = afterIconNodeChange;

        setScopedAttribute("afterIconNodeChange", afterIconNodeChange);
    }

    public Object getAfterIdChange() {
        return this._afterIdChange;
    }

    public void setAfterIdChange(Object afterIdChange) {
        this._afterIdChange = afterIdChange;

        setScopedAttribute("afterIdChange", afterIdChange);
    }

    public Object getAfterIndexChange() {
        return this._afterIndexChange;
    }

    public void setAfterIndexChange(Object afterIndexChange) {
        this._afterIndexChange = afterIndexChange;

        setScopedAttribute("afterIndexChange", afterIndexChange);
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

    public Object getAfterLabelChange() {
        return this._afterLabelChange;
    }

    public void setAfterLabelChange(Object afterLabelChange) {
        this._afterLabelChange = afterLabelChange;

        setScopedAttribute("afterLabelChange", afterLabelChange);
    }

    public Object getAfterLabelNodeChange() {
        return this._afterLabelNodeChange;
    }

    public void setAfterLabelNodeChange(Object afterLabelNodeChange) {
        this._afterLabelNodeChange = afterLabelNodeChange;

        setScopedAttribute("afterLabelNodeChange", afterLabelNodeChange);
    }

    public Object getAfterParentChange() {
        return this._afterParentChange;
    }

    public void setAfterParentChange(Object afterParentChange) {
        this._afterParentChange = afterParentChange;

        setScopedAttribute("afterParentChange", afterParentChange);
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

    public Object getAfterRootChange() {
        return this._afterRootChange;
    }

    public void setAfterRootChange(Object afterRootChange) {
        this._afterRootChange = afterRootChange;

        setScopedAttribute("afterRootChange", afterRootChange);
    }

    public Object getAfterSelectedChange() {
        return this._afterSelectedChange;
    }

    public void setAfterSelectedChange(Object afterSelectedChange) {
        this._afterSelectedChange = afterSelectedChange;

        setScopedAttribute("afterSelectedChange", afterSelectedChange);
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

    public Object getAfterTitleChange() {
        return this._afterTitleChange;
    }

    public void setAfterTitleChange(Object afterTitleChange) {
        this._afterTitleChange = afterTitleChange;

        setScopedAttribute("afterTitleChange", afterTitleChange);
    }

    public Object getAfterTypeChange() {
        return this._afterTypeChange;
    }

    public void setAfterTypeChange(Object afterTypeChange) {
        this._afterTypeChange = afterTypeChange;

        setScopedAttribute("afterTypeChange", afterTypeChange);
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

    public Object getOnActiveStateChange() {
        return this._onActiveStateChange;
    }

    public void setOnActiveStateChange(Object onActiveStateChange) {
        this._onActiveStateChange = onActiveStateChange;

        setScopedAttribute("onActiveStateChange", onActiveStateChange);
    }

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnClassNamesChange() {
        return this._onClassNamesChange;
    }

    public void setOnClassNamesChange(Object onClassNamesChange) {
        this._onClassNamesChange = onClassNamesChange;

        setScopedAttribute("onClassNamesChange", onClassNamesChange);
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

    public Object getOnDefaultStateChange() {
        return this._onDefaultStateChange;
    }

    public void setOnDefaultStateChange(Object onDefaultStateChange) {
        this._onDefaultStateChange = onDefaultStateChange;

        setScopedAttribute("onDefaultStateChange", onDefaultStateChange);
    }

    public Object getOnDepthChange() {
        return this._onDepthChange;
    }

    public void setOnDepthChange(Object onDepthChange) {
        this._onDepthChange = onDepthChange;

        setScopedAttribute("onDepthChange", onDepthChange);
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

    public Object getOnHandlerChange() {
        return this._onHandlerChange;
    }

    public void setOnHandlerChange(Object onHandlerChange) {
        this._onHandlerChange = onHandlerChange;

        setScopedAttribute("onHandlerChange", onHandlerChange);
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

    public Object getOnIconChange() {
        return this._onIconChange;
    }

    public void setOnIconChange(Object onIconChange) {
        this._onIconChange = onIconChange;

        setScopedAttribute("onIconChange", onIconChange);
    }

    public Object getOnIconNodeChange() {
        return this._onIconNodeChange;
    }

    public void setOnIconNodeChange(Object onIconNodeChange) {
        this._onIconNodeChange = onIconNodeChange;

        setScopedAttribute("onIconNodeChange", onIconNodeChange);
    }

    public Object getOnIdChange() {
        return this._onIdChange;
    }

    public void setOnIdChange(Object onIdChange) {
        this._onIdChange = onIdChange;

        setScopedAttribute("onIdChange", onIdChange);
    }

    public Object getOnIndexChange() {
        return this._onIndexChange;
    }

    public void setOnIndexChange(Object onIndexChange) {
        this._onIndexChange = onIndexChange;

        setScopedAttribute("onIndexChange", onIndexChange);
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

    public Object getOnLabelChange() {
        return this._onLabelChange;
    }

    public void setOnLabelChange(Object onLabelChange) {
        this._onLabelChange = onLabelChange;

        setScopedAttribute("onLabelChange", onLabelChange);
    }

    public Object getOnLabelNodeChange() {
        return this._onLabelNodeChange;
    }

    public void setOnLabelNodeChange(Object onLabelNodeChange) {
        this._onLabelNodeChange = onLabelNodeChange;

        setScopedAttribute("onLabelNodeChange", onLabelNodeChange);
    }

    public Object getOnParentChange() {
        return this._onParentChange;
    }

    public void setOnParentChange(Object onParentChange) {
        this._onParentChange = onParentChange;

        setScopedAttribute("onParentChange", onParentChange);
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

    public Object getOnRootChange() {
        return this._onRootChange;
    }

    public void setOnRootChange(Object onRootChange) {
        this._onRootChange = onRootChange;

        setScopedAttribute("onRootChange", onRootChange);
    }

    public Object getOnSelectedChange() {
        return this._onSelectedChange;
    }

    public void setOnSelectedChange(Object onSelectedChange) {
        this._onSelectedChange = onSelectedChange;

        setScopedAttribute("onSelectedChange", onSelectedChange);
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

    public Object getOnTitleChange() {
        return this._onTitleChange;
    }

    public void setOnTitleChange(Object onTitleChange) {
        this._onTitleChange = onTitleChange;

        setScopedAttribute("onTitleChange", onTitleChange);
    }

    public Object getOnTypeChange() {
        return this._onTypeChange;
    }

    public void setOnTypeChange(Object onTypeChange) {
        this._onTypeChange = onTypeChange;

        setScopedAttribute("onTypeChange", onTypeChange);
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

        this._activeState = false;
        this._boundingBox = null;
        this._classNames = null;
        this._contentBox = null;
        this._cssClass = null;
        this._defaultState = true;
        this._depth = Integer.valueOf(-1);
        this._destroyed = false;
        this._disabled = false;
        this._focused = false;
        this._handler = null;
        this._height = null;
        this._hideClass = "aui-helper-hidden";
        this._hoverState = true;
        this._icon = null;
        this._iconNode = null;
        this._buttonitemId = null;
        this._index = Integer.valueOf(0);
        this._initialized = false;
        this._label = null;
        this._labelNode = null;
        this._buttonitemParent = null;
        this._render = null;
        this._rendered = false;
        this._root = null;
        this._selected = Integer.valueOf(0);
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._title = null;
        this._type = "button";
        this._useARIA = true;
        this._visible = true;
        this._width = null;
        this._afterActiveStateChange = null;
        this._afterBoundingBoxChange = null;
        this._afterClassNamesChange = null;
        this._afterContentBoxChange = null;
        this._afterCssClassChange = null;
        this._afterDefaultStateChange = null;
        this._afterDepthChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterFocusedChange = null;
        this._afterHandlerChange = null;
        this._afterHeightChange = null;
        this._afterHideClassChange = null;
        this._afterHoverStateChange = null;
        this._afterIconChange = null;
        this._afterIconNodeChange = null;
        this._afterIdChange = null;
        this._afterIndexChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterLabelChange = null;
        this._afterLabelNodeChange = null;
        this._afterParentChange = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterRootChange = null;
        this._afterSelectedChange = null;
        this._afterSrcNodeChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterTitleChange = null;
        this._afterTypeChange = null;
        this._afterUseARIAChange = null;
        this._afterVisibleChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._onActiveStateChange = null;
        this._onBoundingBoxChange = null;
        this._onClassNamesChange = null;
        this._onContentBoxChange = null;
        this._onCssClassChange = null;
        this._onDefaultStateChange = null;
        this._onDepthChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onFocusedChange = null;
        this._onHandlerChange = null;
        this._onHeightChange = null;
        this._onHideClassChange = null;
        this._onHoverStateChange = null;
        this._onIconChange = null;
        this._onIconNodeChange = null;
        this._onIdChange = null;
        this._onIndexChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onLabelChange = null;
        this._onLabelNodeChange = null;
        this._onParentChange = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onRootChange = null;
        this._onSelectedChange = null;
        this._onSrcNodeChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onTitleChange = null;
        this._onTypeChange = null;
        this._onUseARIAChange = null;
        this._onVisibleChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/button_item/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "activeState", Boolean.valueOf(this._activeState));
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "classNames", this._classNames);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "cssClass", this._cssClass);
        setNamespacedAttribute(request, "defaultState", Boolean.valueOf(this._defaultState));
        setNamespacedAttribute(request, "depth", this._depth);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "handler", this._handler);
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "hideClass", this._hideClass);
        setNamespacedAttribute(request, "hoverState", Boolean.valueOf(this._hoverState));
        setNamespacedAttribute(request, "icon", this._icon);
        setNamespacedAttribute(request, "iconNode", this._iconNode);
        setNamespacedAttribute(request, "buttonitemId", this._buttonitemId);
        setNamespacedAttribute(request, "index", this._index);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "label", this._label);
        setNamespacedAttribute(request, "labelNode", this._labelNode);
        setNamespacedAttribute(request, "buttonitemParent", this._buttonitemParent);
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "root", this._root);
        setNamespacedAttribute(request, "selected", this._selected);
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "title", this._title);
        setNamespacedAttribute(request, "type", this._type);
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "afterActiveStateChange", this._afterActiveStateChange);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterClassNamesChange", this._afterClassNamesChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
        setNamespacedAttribute(request, "afterDefaultStateChange", this._afterDefaultStateChange);
        setNamespacedAttribute(request, "afterDepthChange", this._afterDepthChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterHandlerChange", this._afterHandlerChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
        setNamespacedAttribute(request, "afterHoverStateChange", this._afterHoverStateChange);
        setNamespacedAttribute(request, "afterIconChange", this._afterIconChange);
        setNamespacedAttribute(request, "afterIconNodeChange", this._afterIconNodeChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterIndexChange", this._afterIndexChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterLabelChange", this._afterLabelChange);
        setNamespacedAttribute(request, "afterLabelNodeChange", this._afterLabelNodeChange);
        setNamespacedAttribute(request, "afterParentChange", this._afterParentChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterRootChange", this._afterRootChange);
        setNamespacedAttribute(request, "afterSelectedChange", this._afterSelectedChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterTitleChange", this._afterTitleChange);
        setNamespacedAttribute(request, "afterTypeChange", this._afterTypeChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "onActiveStateChange", this._onActiveStateChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onClassNamesChange", this._onClassNamesChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
        setNamespacedAttribute(request, "onDefaultStateChange", this._onDefaultStateChange);
        setNamespacedAttribute(request, "onDepthChange", this._onDepthChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onHandlerChange", this._onHandlerChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
        setNamespacedAttribute(request, "onHoverStateChange", this._onHoverStateChange);
        setNamespacedAttribute(request, "onIconChange", this._onIconChange);
        setNamespacedAttribute(request, "onIconNodeChange", this._onIconNodeChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onIndexChange", this._onIndexChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onLabelChange", this._onLabelChange);
        setNamespacedAttribute(request, "onLabelNodeChange", this._onLabelNodeChange);
        setNamespacedAttribute(request, "onParentChange", this._onParentChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onRootChange", this._onRootChange);
        setNamespacedAttribute(request, "onSelectedChange", this._onSelectedChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onTitleChange", this._onTitleChange);
        setNamespacedAttribute(request, "onTypeChange", this._onTypeChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
    }
}
