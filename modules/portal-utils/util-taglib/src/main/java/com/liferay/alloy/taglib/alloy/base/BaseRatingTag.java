package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseRatingTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:rating:";
    private static final String _PAGE = "/html/taglib/alloy/rating/page.jsp";
    private String _boundingBox = null;
    private boolean _canReset = true;
    private String _contentBox = null;
    private String _cssClass = null;
    private Object _defaultSelected = Integer.valueOf(0);
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private Object _elements = null;
    private boolean _focused = false;
    private Object _height = null;
    private Object _hiddenInput = null;
    private String _hideClass = "aui-helper-hidden";
    private String _ratingId = null;
    private boolean _initialized = false;
    private String _inputName = null;
    private String _label = null;
    private String _labelNode = null;
    private Object _render = null;
    private boolean _rendered = false;
    private Object _selectedIndex = Integer.valueOf(-1);
    private boolean _showTitle = true;
    private Object _size = Integer.valueOf(5);
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private String _title = null;
    private boolean _useARIA = true;
    private String _ratingValue = null;
    private boolean _visible = true;
    private Object _width = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterCanResetChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterCssClassChange = null;
    private Object _afterDefaultSelectedChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterElementsChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterHeightChange = null;
    private Object _afterHiddenInputChange = null;
    private Object _afterHideClassChange = null;
    private Object _afterIdChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterInputNameChange = null;
    private Object _afterItemClick = null;
    private Object _afterItemOut = null;
    private Object _afterItemSelect = null;
    private Object _afterLabelChange = null;
    private Object _afterLabelNodeChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterSelectedIndexChange = null;
    private Object _afterShowTitleChange = null;
    private Object _afterSizeChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterTitleChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterValueChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onCanResetChange = null;
    private Object _onContentBoxChange = null;
    private Object _onCssClassChange = null;
    private Object _onDefaultSelectedChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onElementsChange = null;
    private Object _onFocusedChange = null;
    private Object _onHeightChange = null;
    private Object _onHiddenInputChange = null;
    private Object _onHideClassChange = null;
    private Object _onIdChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onInputNameChange = null;
    private Object _onItemClick = null;
    private Object _onItemOut = null;
    private Object _onItemSelect = null;
    private Object _onLabelChange = null;
    private Object _onLabelNodeChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onSelectedIndexChange = null;
    private Object _onShowTitleChange = null;
    private Object _onSizeChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onTitleChange = null;
    private Object _onUseARIAChange = null;
    private Object _onValueChange = null;
    private Object _onVisibleChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:rating:");

        return super.doStartTag();
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public boolean getCanReset() {
        return this._canReset;
    }

    public void setCanReset(boolean canReset) {
        this._canReset = canReset;

        setScopedAttribute("canReset", Boolean.valueOf(canReset));
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

    public Object getDefaultSelected() {
        return this._defaultSelected;
    }

    public void setDefaultSelected(Object defaultSelected) {
        this._defaultSelected = defaultSelected;

        setScopedAttribute("defaultSelected", defaultSelected);
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

    public Object getElements() {
        return this._elements;
    }

    public void setElements(Object elements) {
        this._elements = elements;

        setScopedAttribute("elements", elements);
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

    public Object getHiddenInput() {
        return this._hiddenInput;
    }

    public void setHiddenInput(Object hiddenInput) {
        this._hiddenInput = hiddenInput;

        setScopedAttribute("hiddenInput", hiddenInput);
    }

    public String getHideClass() {
        return this._hideClass;
    }

    public void setHideClass(String hideClass) {
        this._hideClass = hideClass;

        setScopedAttribute("hideClass", hideClass);
    }

    public String getRatingId() {
        return this._ratingId;
    }

    public void setRatingId(String ratingId) {
        this._ratingId = ratingId;

        setScopedAttribute("ratingId", ratingId);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public String getInputName() {
        return this._inputName;
    }

    public void setInputName(String inputName) {
        this._inputName = inputName;

        setScopedAttribute("inputName", inputName);
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

    public Object getSelectedIndex() {
        return this._selectedIndex;
    }

    public void setSelectedIndex(Object selectedIndex) {
        this._selectedIndex = selectedIndex;

        setScopedAttribute("selectedIndex", selectedIndex);
    }

    public boolean getShowTitle() {
        return this._showTitle;
    }

    public void setShowTitle(boolean showTitle) {
        this._showTitle = showTitle;

        setScopedAttribute("showTitle", Boolean.valueOf(showTitle));
    }

    public Object getSize() {
        return this._size;
    }

    public void setSize(Object size) {
        this._size = size;

        setScopedAttribute("size", size);
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

    public boolean getUseARIA() {
        return this._useARIA;
    }

    public void setUseARIA(boolean useARIA) {
        this._useARIA = useARIA;

        setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
    }

    public String getRatingValue() {
        return this._ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this._ratingValue = ratingValue;

        setScopedAttribute("ratingValue", ratingValue);
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

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterCanResetChange() {
        return this._afterCanResetChange;
    }

    public void setAfterCanResetChange(Object afterCanResetChange) {
        this._afterCanResetChange = afterCanResetChange;

        setScopedAttribute("afterCanResetChange", afterCanResetChange);
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

    public Object getAfterDefaultSelectedChange() {
        return this._afterDefaultSelectedChange;
    }

    public void setAfterDefaultSelectedChange(Object afterDefaultSelectedChange) {
        this._afterDefaultSelectedChange = afterDefaultSelectedChange;

        setScopedAttribute("afterDefaultSelectedChange", afterDefaultSelectedChange);
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

    public Object getAfterElementsChange() {
        return this._afterElementsChange;
    }

    public void setAfterElementsChange(Object afterElementsChange) {
        this._afterElementsChange = afterElementsChange;

        setScopedAttribute("afterElementsChange", afterElementsChange);
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

    public Object getAfterHiddenInputChange() {
        return this._afterHiddenInputChange;
    }

    public void setAfterHiddenInputChange(Object afterHiddenInputChange) {
        this._afterHiddenInputChange = afterHiddenInputChange;

        setScopedAttribute("afterHiddenInputChange", afterHiddenInputChange);
    }

    public Object getAfterHideClassChange() {
        return this._afterHideClassChange;
    }

    public void setAfterHideClassChange(Object afterHideClassChange) {
        this._afterHideClassChange = afterHideClassChange;

        setScopedAttribute("afterHideClassChange", afterHideClassChange);
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

    public Object getAfterInputNameChange() {
        return this._afterInputNameChange;
    }

    public void setAfterInputNameChange(Object afterInputNameChange) {
        this._afterInputNameChange = afterInputNameChange;

        setScopedAttribute("afterInputNameChange", afterInputNameChange);
    }

    public Object getAfterItemClick() {
        return this._afterItemClick;
    }

    public void setAfterItemClick(Object afterItemClick) {
        this._afterItemClick = afterItemClick;

        setScopedAttribute("afterItemClick", afterItemClick);
    }

    public Object getAfterItemOut() {
        return this._afterItemOut;
    }

    public void setAfterItemOut(Object afterItemOut) {
        this._afterItemOut = afterItemOut;

        setScopedAttribute("afterItemOut", afterItemOut);
    }

    public Object getAfterItemSelect() {
        return this._afterItemSelect;
    }

    public void setAfterItemSelect(Object afterItemSelect) {
        this._afterItemSelect = afterItemSelect;

        setScopedAttribute("afterItemSelect", afterItemSelect);
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

    public Object getAfterSelectedIndexChange() {
        return this._afterSelectedIndexChange;
    }

    public void setAfterSelectedIndexChange(Object afterSelectedIndexChange) {
        this._afterSelectedIndexChange = afterSelectedIndexChange;

        setScopedAttribute("afterSelectedIndexChange", afterSelectedIndexChange);
    }

    public Object getAfterShowTitleChange() {
        return this._afterShowTitleChange;
    }

    public void setAfterShowTitleChange(Object afterShowTitleChange) {
        this._afterShowTitleChange = afterShowTitleChange;

        setScopedAttribute("afterShowTitleChange", afterShowTitleChange);
    }

    public Object getAfterSizeChange() {
        return this._afterSizeChange;
    }

    public void setAfterSizeChange(Object afterSizeChange) {
        this._afterSizeChange = afterSizeChange;

        setScopedAttribute("afterSizeChange", afterSizeChange);
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

    public Object getAfterUseARIAChange() {
        return this._afterUseARIAChange;
    }

    public void setAfterUseARIAChange(Object afterUseARIAChange) {
        this._afterUseARIAChange = afterUseARIAChange;

        setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
    }

    public Object getAfterValueChange() {
        return this._afterValueChange;
    }

    public void setAfterValueChange(Object afterValueChange) {
        this._afterValueChange = afterValueChange;

        setScopedAttribute("afterValueChange", afterValueChange);
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

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnCanResetChange() {
        return this._onCanResetChange;
    }

    public void setOnCanResetChange(Object onCanResetChange) {
        this._onCanResetChange = onCanResetChange;

        setScopedAttribute("onCanResetChange", onCanResetChange);
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

    public Object getOnDefaultSelectedChange() {
        return this._onDefaultSelectedChange;
    }

    public void setOnDefaultSelectedChange(Object onDefaultSelectedChange) {
        this._onDefaultSelectedChange = onDefaultSelectedChange;

        setScopedAttribute("onDefaultSelectedChange", onDefaultSelectedChange);
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

    public Object getOnElementsChange() {
        return this._onElementsChange;
    }

    public void setOnElementsChange(Object onElementsChange) {
        this._onElementsChange = onElementsChange;

        setScopedAttribute("onElementsChange", onElementsChange);
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

    public Object getOnHiddenInputChange() {
        return this._onHiddenInputChange;
    }

    public void setOnHiddenInputChange(Object onHiddenInputChange) {
        this._onHiddenInputChange = onHiddenInputChange;

        setScopedAttribute("onHiddenInputChange", onHiddenInputChange);
    }

    public Object getOnHideClassChange() {
        return this._onHideClassChange;
    }

    public void setOnHideClassChange(Object onHideClassChange) {
        this._onHideClassChange = onHideClassChange;

        setScopedAttribute("onHideClassChange", onHideClassChange);
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

    public Object getOnInputNameChange() {
        return this._onInputNameChange;
    }

    public void setOnInputNameChange(Object onInputNameChange) {
        this._onInputNameChange = onInputNameChange;

        setScopedAttribute("onInputNameChange", onInputNameChange);
    }

    public Object getOnItemClick() {
        return this._onItemClick;
    }

    public void setOnItemClick(Object onItemClick) {
        this._onItemClick = onItemClick;

        setScopedAttribute("onItemClick", onItemClick);
    }

    public Object getOnItemOut() {
        return this._onItemOut;
    }

    public void setOnItemOut(Object onItemOut) {
        this._onItemOut = onItemOut;

        setScopedAttribute("onItemOut", onItemOut);
    }

    public Object getOnItemSelect() {
        return this._onItemSelect;
    }

    public void setOnItemSelect(Object onItemSelect) {
        this._onItemSelect = onItemSelect;

        setScopedAttribute("onItemSelect", onItemSelect);
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

    public Object getOnSelectedIndexChange() {
        return this._onSelectedIndexChange;
    }

    public void setOnSelectedIndexChange(Object onSelectedIndexChange) {
        this._onSelectedIndexChange = onSelectedIndexChange;

        setScopedAttribute("onSelectedIndexChange", onSelectedIndexChange);
    }

    public Object getOnShowTitleChange() {
        return this._onShowTitleChange;
    }

    public void setOnShowTitleChange(Object onShowTitleChange) {
        this._onShowTitleChange = onShowTitleChange;

        setScopedAttribute("onShowTitleChange", onShowTitleChange);
    }

    public Object getOnSizeChange() {
        return this._onSizeChange;
    }

    public void setOnSizeChange(Object onSizeChange) {
        this._onSizeChange = onSizeChange;

        setScopedAttribute("onSizeChange", onSizeChange);
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

    public Object getOnUseARIAChange() {
        return this._onUseARIAChange;
    }

    public void setOnUseARIAChange(Object onUseARIAChange) {
        this._onUseARIAChange = onUseARIAChange;

        setScopedAttribute("onUseARIAChange", onUseARIAChange);
    }

    public Object getOnValueChange() {
        return this._onValueChange;
    }

    public void setOnValueChange(Object onValueChange) {
        this._onValueChange = onValueChange;

        setScopedAttribute("onValueChange", onValueChange);
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

        this._boundingBox = null;
        this._canReset = true;
        this._contentBox = null;
        this._cssClass = null;
        this._defaultSelected = Integer.valueOf(0);
        this._destroyed = false;
        this._disabled = false;
        this._elements = null;
        this._focused = false;
        this._height = null;
        this._hiddenInput = null;
        this._hideClass = "aui-helper-hidden";
        this._ratingId = null;
        this._initialized = false;
        this._inputName = null;
        this._label = null;
        this._labelNode = null;
        this._render = null;
        this._rendered = false;
        this._selectedIndex = Integer.valueOf(-1);
        this._showTitle = true;
        this._size = Integer.valueOf(5);
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._title = null;
        this._useARIA = true;
        this._ratingValue = null;
        this._visible = true;
        this._width = null;
        this._afterBoundingBoxChange = null;
        this._afterCanResetChange = null;
        this._afterContentBoxChange = null;
        this._afterCssClassChange = null;
        this._afterDefaultSelectedChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterElementsChange = null;
        this._afterFocusedChange = null;
        this._afterHeightChange = null;
        this._afterHiddenInputChange = null;
        this._afterHideClassChange = null;
        this._afterIdChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterInputNameChange = null;
        this._afterItemClick = null;
        this._afterItemOut = null;
        this._afterItemSelect = null;
        this._afterLabelChange = null;
        this._afterLabelNodeChange = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterSelectedIndexChange = null;
        this._afterShowTitleChange = null;
        this._afterSizeChange = null;
        this._afterSrcNodeChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterTitleChange = null;
        this._afterUseARIAChange = null;
        this._afterValueChange = null;
        this._afterVisibleChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._onBoundingBoxChange = null;
        this._onCanResetChange = null;
        this._onContentBoxChange = null;
        this._onCssClassChange = null;
        this._onDefaultSelectedChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onElementsChange = null;
        this._onFocusedChange = null;
        this._onHeightChange = null;
        this._onHiddenInputChange = null;
        this._onHideClassChange = null;
        this._onIdChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onInputNameChange = null;
        this._onItemClick = null;
        this._onItemOut = null;
        this._onItemSelect = null;
        this._onLabelChange = null;
        this._onLabelNodeChange = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onSelectedIndexChange = null;
        this._onShowTitleChange = null;
        this._onSizeChange = null;
        this._onSrcNodeChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onTitleChange = null;
        this._onUseARIAChange = null;
        this._onValueChange = null;
        this._onVisibleChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/rating/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "canReset", Boolean.valueOf(this._canReset));
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "cssClass", this._cssClass);
        setNamespacedAttribute(request, "defaultSelected", this._defaultSelected);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "elements", this._elements);
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "hiddenInput", this._hiddenInput);
        setNamespacedAttribute(request, "hideClass", this._hideClass);
        setNamespacedAttribute(request, "ratingId", this._ratingId);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "inputName", this._inputName);
        setNamespacedAttribute(request, "label", this._label);
        setNamespacedAttribute(request, "labelNode", this._labelNode);
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "selectedIndex", this._selectedIndex);
        setNamespacedAttribute(request, "showTitle", Boolean.valueOf(this._showTitle));
        setNamespacedAttribute(request, "size", this._size);
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "title", this._title);
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "ratingValue", this._ratingValue);
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterCanResetChange", this._afterCanResetChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
        setNamespacedAttribute(request, "afterDefaultSelectedChange", this._afterDefaultSelectedChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterElementsChange", this._afterElementsChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterHiddenInputChange", this._afterHiddenInputChange);
        setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterInputNameChange", this._afterInputNameChange);
        setNamespacedAttribute(request, "afterItemClick", this._afterItemClick);
        setNamespacedAttribute(request, "afterItemOut", this._afterItemOut);
        setNamespacedAttribute(request, "afterItemSelect", this._afterItemSelect);
        setNamespacedAttribute(request, "afterLabelChange", this._afterLabelChange);
        setNamespacedAttribute(request, "afterLabelNodeChange", this._afterLabelNodeChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterSelectedIndexChange", this._afterSelectedIndexChange);
        setNamespacedAttribute(request, "afterShowTitleChange", this._afterShowTitleChange);
        setNamespacedAttribute(request, "afterSizeChange", this._afterSizeChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterTitleChange", this._afterTitleChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterValueChange", this._afterValueChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onCanResetChange", this._onCanResetChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
        setNamespacedAttribute(request, "onDefaultSelectedChange", this._onDefaultSelectedChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onElementsChange", this._onElementsChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onHiddenInputChange", this._onHiddenInputChange);
        setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onInputNameChange", this._onInputNameChange);
        setNamespacedAttribute(request, "onItemClick", this._onItemClick);
        setNamespacedAttribute(request, "onItemOut", this._onItemOut);
        setNamespacedAttribute(request, "onItemSelect", this._onItemSelect);
        setNamespacedAttribute(request, "onLabelChange", this._onLabelChange);
        setNamespacedAttribute(request, "onLabelNodeChange", this._onLabelNodeChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onSelectedIndexChange", this._onSelectedIndexChange);
        setNamespacedAttribute(request, "onShowTitleChange", this._onShowTitleChange);
        setNamespacedAttribute(request, "onSizeChange", this._onSizeChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onTitleChange", this._onTitleChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onValueChange", this._onValueChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
    }
}
