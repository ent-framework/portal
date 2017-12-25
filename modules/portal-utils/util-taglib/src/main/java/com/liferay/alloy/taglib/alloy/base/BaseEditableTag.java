package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseEditableTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:editable:";
    private static final String _PAGE = "/html/taglib/alloy/editable/page.jsp";
    private String _boundingBox = null;
    private String _cancelButton = null;
    private String _contentBox = null;
    private String _contentText = null;
    private String _cssClass = null;
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private String _eventType = "click";
    private boolean _focused = false;
    private Object _formatInput = null;
    private Object _formatOutput = null;
    private Object _height = null;
    private String _hideClass = "aui-helper-hidden";
    private Object _icons = null;
    private String _editableId = null;
    private boolean _initialized = false;
    private String _inputType = "text";
    private Object _node = null;
    private Object _render = null;
    private String _renderTo = null;
    private boolean _rendered = false;
    private String _saveButton = null;
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private boolean _useARIA = true;
    private boolean _visible = true;
    private Object _width = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterCancel = null;
    private Object _afterCancelButtonChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterContentTextChange = null;
    private Object _afterCssClassChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterEventTypeChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterFormatInputChange = null;
    private Object _afterFormatOutputChange = null;
    private Object _afterHeightChange = null;
    private Object _afterHideClassChange = null;
    private Object _afterIconsChange = null;
    private Object _afterIdChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterInputTypeChange = null;
    private Object _afterNodeChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderToChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterSave = null;
    private Object _afterSaveButtonChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStartEditing = null;
    private Object _afterStopEditing = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onCancel = null;
    private Object _onCancelButtonChange = null;
    private Object _onContentBoxChange = null;
    private Object _onContentTextChange = null;
    private Object _onCssClassChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onEventTypeChange = null;
    private Object _onFocusedChange = null;
    private Object _onFormatInputChange = null;
    private Object _onFormatOutputChange = null;
    private Object _onHeightChange = null;
    private Object _onHideClassChange = null;
    private Object _onIconsChange = null;
    private Object _onIdChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onInputTypeChange = null;
    private Object _onNodeChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderToChange = null;
    private Object _onRenderedChange = null;
    private Object _onSave = null;
    private Object _onSaveButtonChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStartEditing = null;
    private Object _onStopEditing = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onUseARIAChange = null;
    private Object _onVisibleChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:editable:");

        return super.doStartTag();
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public String getCancelButton() {
        return this._cancelButton;
    }

    public void setCancelButton(String cancelButton) {
        this._cancelButton = cancelButton;

        setScopedAttribute("cancelButton", cancelButton);
    }

    public String getContentBox() {
        return this._contentBox;
    }

    public void setContentBox(String contentBox) {
        this._contentBox = contentBox;

        setScopedAttribute("contentBox", contentBox);
    }

    public String getContentText() {
        return this._contentText;
    }

    public void setContentText(String contentText) {
        this._contentText = contentText;

        setScopedAttribute("contentText", contentText);
    }

    public String getCssClass() {
        return this._cssClass;
    }

    public void setCssClass(String cssClass) {
        this._cssClass = cssClass;

        setScopedAttribute("cssClass", cssClass);
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

    public String getEventType() {
        return this._eventType;
    }

    public void setEventType(String eventType) {
        this._eventType = eventType;

        setScopedAttribute("eventType", eventType);
    }

    public boolean getFocused() {
        return this._focused;
    }

    public void setFocused(boolean focused) {
        this._focused = focused;

        setScopedAttribute("focused", Boolean.valueOf(focused));
    }

    public Object getFormatInput() {
        return this._formatInput;
    }

    public void setFormatInput(Object formatInput) {
        this._formatInput = formatInput;

        setScopedAttribute("formatInput", formatInput);
    }

    public Object getFormatOutput() {
        return this._formatOutput;
    }

    public void setFormatOutput(Object formatOutput) {
        this._formatOutput = formatOutput;

        setScopedAttribute("formatOutput", formatOutput);
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

    public Object getIcons() {
        return this._icons;
    }

    public void setIcons(Object icons) {
        this._icons = icons;

        setScopedAttribute("icons", icons);
    }

    public String getEditableId() {
        return this._editableId;
    }

    public void setEditableId(String editableId) {
        this._editableId = editableId;

        setScopedAttribute("editableId", editableId);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public String getInputType() {
        return this._inputType;
    }

    public void setInputType(String inputType) {
        this._inputType = inputType;

        setScopedAttribute("inputType", inputType);
    }

    public Object getNode() {
        return this._node;
    }

    public void setNode(Object node) {
        this._node = node;

        setScopedAttribute("node", node);
    }

    public Object getRender() {
        return this._render;
    }

    public void setRender(Object render) {
        this._render = render;

        setScopedAttribute("render", render);
    }

    public String getRenderTo() {
        return this._renderTo;
    }

    public void setRenderTo(String renderTo) {
        this._renderTo = renderTo;

        setScopedAttribute("renderTo", renderTo);
    }

    public boolean getRendered() {
        return this._rendered;
    }

    public void setRendered(boolean rendered) {
        this._rendered = rendered;

        setScopedAttribute("rendered", Boolean.valueOf(rendered));
    }

    public String getSaveButton() {
        return this._saveButton;
    }

    public void setSaveButton(String saveButton) {
        this._saveButton = saveButton;

        setScopedAttribute("saveButton", saveButton);
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

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterCancel() {
        return this._afterCancel;
    }

    public void setAfterCancel(Object afterCancel) {
        this._afterCancel = afterCancel;

        setScopedAttribute("afterCancel", afterCancel);
    }

    public Object getAfterCancelButtonChange() {
        return this._afterCancelButtonChange;
    }

    public void setAfterCancelButtonChange(Object afterCancelButtonChange) {
        this._afterCancelButtonChange = afterCancelButtonChange;

        setScopedAttribute("afterCancelButtonChange", afterCancelButtonChange);
    }

    public Object getAfterContentBoxChange() {
        return this._afterContentBoxChange;
    }

    public void setAfterContentBoxChange(Object afterContentBoxChange) {
        this._afterContentBoxChange = afterContentBoxChange;

        setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
    }

    public Object getAfterContentTextChange() {
        return this._afterContentTextChange;
    }

    public void setAfterContentTextChange(Object afterContentTextChange) {
        this._afterContentTextChange = afterContentTextChange;

        setScopedAttribute("afterContentTextChange", afterContentTextChange);
    }

    public Object getAfterCssClassChange() {
        return this._afterCssClassChange;
    }

    public void setAfterCssClassChange(Object afterCssClassChange) {
        this._afterCssClassChange = afterCssClassChange;

        setScopedAttribute("afterCssClassChange", afterCssClassChange);
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

    public Object getAfterEventTypeChange() {
        return this._afterEventTypeChange;
    }

    public void setAfterEventTypeChange(Object afterEventTypeChange) {
        this._afterEventTypeChange = afterEventTypeChange;

        setScopedAttribute("afterEventTypeChange", afterEventTypeChange);
    }

    public Object getAfterFocusedChange() {
        return this._afterFocusedChange;
    }

    public void setAfterFocusedChange(Object afterFocusedChange) {
        this._afterFocusedChange = afterFocusedChange;

        setScopedAttribute("afterFocusedChange", afterFocusedChange);
    }

    public Object getAfterFormatInputChange() {
        return this._afterFormatInputChange;
    }

    public void setAfterFormatInputChange(Object afterFormatInputChange) {
        this._afterFormatInputChange = afterFormatInputChange;

        setScopedAttribute("afterFormatInputChange", afterFormatInputChange);
    }

    public Object getAfterFormatOutputChange() {
        return this._afterFormatOutputChange;
    }

    public void setAfterFormatOutputChange(Object afterFormatOutputChange) {
        this._afterFormatOutputChange = afterFormatOutputChange;

        setScopedAttribute("afterFormatOutputChange", afterFormatOutputChange);
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

    public Object getAfterIconsChange() {
        return this._afterIconsChange;
    }

    public void setAfterIconsChange(Object afterIconsChange) {
        this._afterIconsChange = afterIconsChange;

        setScopedAttribute("afterIconsChange", afterIconsChange);
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

    public Object getAfterInputTypeChange() {
        return this._afterInputTypeChange;
    }

    public void setAfterInputTypeChange(Object afterInputTypeChange) {
        this._afterInputTypeChange = afterInputTypeChange;

        setScopedAttribute("afterInputTypeChange", afterInputTypeChange);
    }

    public Object getAfterNodeChange() {
        return this._afterNodeChange;
    }

    public void setAfterNodeChange(Object afterNodeChange) {
        this._afterNodeChange = afterNodeChange;

        setScopedAttribute("afterNodeChange", afterNodeChange);
    }

    public Object getAfterRenderChange() {
        return this._afterRenderChange;
    }

    public void setAfterRenderChange(Object afterRenderChange) {
        this._afterRenderChange = afterRenderChange;

        setScopedAttribute("afterRenderChange", afterRenderChange);
    }

    public Object getAfterRenderToChange() {
        return this._afterRenderToChange;
    }

    public void setAfterRenderToChange(Object afterRenderToChange) {
        this._afterRenderToChange = afterRenderToChange;

        setScopedAttribute("afterRenderToChange", afterRenderToChange);
    }

    public Object getAfterRenderedChange() {
        return this._afterRenderedChange;
    }

    public void setAfterRenderedChange(Object afterRenderedChange) {
        this._afterRenderedChange = afterRenderedChange;

        setScopedAttribute("afterRenderedChange", afterRenderedChange);
    }

    public Object getAfterSave() {
        return this._afterSave;
    }

    public void setAfterSave(Object afterSave) {
        this._afterSave = afterSave;

        setScopedAttribute("afterSave", afterSave);
    }

    public Object getAfterSaveButtonChange() {
        return this._afterSaveButtonChange;
    }

    public void setAfterSaveButtonChange(Object afterSaveButtonChange) {
        this._afterSaveButtonChange = afterSaveButtonChange;

        setScopedAttribute("afterSaveButtonChange", afterSaveButtonChange);
    }

    public Object getAfterSrcNodeChange() {
        return this._afterSrcNodeChange;
    }

    public void setAfterSrcNodeChange(Object afterSrcNodeChange) {
        this._afterSrcNodeChange = afterSrcNodeChange;

        setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
    }

    public Object getAfterStartEditing() {
        return this._afterStartEditing;
    }

    public void setAfterStartEditing(Object afterStartEditing) {
        this._afterStartEditing = afterStartEditing;

        setScopedAttribute("afterStartEditing", afterStartEditing);
    }

    public Object getAfterStopEditing() {
        return this._afterStopEditing;
    }

    public void setAfterStopEditing(Object afterStopEditing) {
        this._afterStopEditing = afterStopEditing;

        setScopedAttribute("afterStopEditing", afterStopEditing);
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

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnCancel() {
        return this._onCancel;
    }

    public void setOnCancel(Object onCancel) {
        this._onCancel = onCancel;

        setScopedAttribute("onCancel", onCancel);
    }

    public Object getOnCancelButtonChange() {
        return this._onCancelButtonChange;
    }

    public void setOnCancelButtonChange(Object onCancelButtonChange) {
        this._onCancelButtonChange = onCancelButtonChange;

        setScopedAttribute("onCancelButtonChange", onCancelButtonChange);
    }

    public Object getOnContentBoxChange() {
        return this._onContentBoxChange;
    }

    public void setOnContentBoxChange(Object onContentBoxChange) {
        this._onContentBoxChange = onContentBoxChange;

        setScopedAttribute("onContentBoxChange", onContentBoxChange);
    }

    public Object getOnContentTextChange() {
        return this._onContentTextChange;
    }

    public void setOnContentTextChange(Object onContentTextChange) {
        this._onContentTextChange = onContentTextChange;

        setScopedAttribute("onContentTextChange", onContentTextChange);
    }

    public Object getOnCssClassChange() {
        return this._onCssClassChange;
    }

    public void setOnCssClassChange(Object onCssClassChange) {
        this._onCssClassChange = onCssClassChange;

        setScopedAttribute("onCssClassChange", onCssClassChange);
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

    public Object getOnEventTypeChange() {
        return this._onEventTypeChange;
    }

    public void setOnEventTypeChange(Object onEventTypeChange) {
        this._onEventTypeChange = onEventTypeChange;

        setScopedAttribute("onEventTypeChange", onEventTypeChange);
    }

    public Object getOnFocusedChange() {
        return this._onFocusedChange;
    }

    public void setOnFocusedChange(Object onFocusedChange) {
        this._onFocusedChange = onFocusedChange;

        setScopedAttribute("onFocusedChange", onFocusedChange);
    }

    public Object getOnFormatInputChange() {
        return this._onFormatInputChange;
    }

    public void setOnFormatInputChange(Object onFormatInputChange) {
        this._onFormatInputChange = onFormatInputChange;

        setScopedAttribute("onFormatInputChange", onFormatInputChange);
    }

    public Object getOnFormatOutputChange() {
        return this._onFormatOutputChange;
    }

    public void setOnFormatOutputChange(Object onFormatOutputChange) {
        this._onFormatOutputChange = onFormatOutputChange;

        setScopedAttribute("onFormatOutputChange", onFormatOutputChange);
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

    public Object getOnIconsChange() {
        return this._onIconsChange;
    }

    public void setOnIconsChange(Object onIconsChange) {
        this._onIconsChange = onIconsChange;

        setScopedAttribute("onIconsChange", onIconsChange);
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

    public Object getOnInputTypeChange() {
        return this._onInputTypeChange;
    }

    public void setOnInputTypeChange(Object onInputTypeChange) {
        this._onInputTypeChange = onInputTypeChange;

        setScopedAttribute("onInputTypeChange", onInputTypeChange);
    }

    public Object getOnNodeChange() {
        return this._onNodeChange;
    }

    public void setOnNodeChange(Object onNodeChange) {
        this._onNodeChange = onNodeChange;

        setScopedAttribute("onNodeChange", onNodeChange);
    }

    public Object getOnRenderChange() {
        return this._onRenderChange;
    }

    public void setOnRenderChange(Object onRenderChange) {
        this._onRenderChange = onRenderChange;

        setScopedAttribute("onRenderChange", onRenderChange);
    }

    public Object getOnRenderToChange() {
        return this._onRenderToChange;
    }

    public void setOnRenderToChange(Object onRenderToChange) {
        this._onRenderToChange = onRenderToChange;

        setScopedAttribute("onRenderToChange", onRenderToChange);
    }

    public Object getOnRenderedChange() {
        return this._onRenderedChange;
    }

    public void setOnRenderedChange(Object onRenderedChange) {
        this._onRenderedChange = onRenderedChange;

        setScopedAttribute("onRenderedChange", onRenderedChange);
    }

    public Object getOnSave() {
        return this._onSave;
    }

    public void setOnSave(Object onSave) {
        this._onSave = onSave;

        setScopedAttribute("onSave", onSave);
    }

    public Object getOnSaveButtonChange() {
        return this._onSaveButtonChange;
    }

    public void setOnSaveButtonChange(Object onSaveButtonChange) {
        this._onSaveButtonChange = onSaveButtonChange;

        setScopedAttribute("onSaveButtonChange", onSaveButtonChange);
    }

    public Object getOnSrcNodeChange() {
        return this._onSrcNodeChange;
    }

    public void setOnSrcNodeChange(Object onSrcNodeChange) {
        this._onSrcNodeChange = onSrcNodeChange;

        setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
    }

    public Object getOnStartEditing() {
        return this._onStartEditing;
    }

    public void setOnStartEditing(Object onStartEditing) {
        this._onStartEditing = onStartEditing;

        setScopedAttribute("onStartEditing", onStartEditing);
    }

    public Object getOnStopEditing() {
        return this._onStopEditing;
    }

    public void setOnStopEditing(Object onStopEditing) {
        this._onStopEditing = onStopEditing;

        setScopedAttribute("onStopEditing", onStopEditing);
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

        this._boundingBox = null;
        this._cancelButton = null;
        this._contentBox = null;
        this._contentText = null;
        this._cssClass = null;
        this._destroyed = false;
        this._disabled = false;
        this._eventType = "click";
        this._focused = false;
        this._formatInput = null;
        this._formatOutput = null;
        this._height = null;
        this._hideClass = "aui-helper-hidden";
        this._icons = null;
        this._editableId = null;
        this._initialized = false;
        this._inputType = "text";
        this._node = null;
        this._render = null;
        this._renderTo = null;
        this._rendered = false;
        this._saveButton = null;
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._useARIA = true;
        this._visible = true;
        this._width = null;
        this._afterBoundingBoxChange = null;
        this._afterCancel = null;
        this._afterCancelButtonChange = null;
        this._afterContentBoxChange = null;
        this._afterContentTextChange = null;
        this._afterCssClassChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterEventTypeChange = null;
        this._afterFocusedChange = null;
        this._afterFormatInputChange = null;
        this._afterFormatOutputChange = null;
        this._afterHeightChange = null;
        this._afterHideClassChange = null;
        this._afterIconsChange = null;
        this._afterIdChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterInputTypeChange = null;
        this._afterNodeChange = null;
        this._afterRenderChange = null;
        this._afterRenderToChange = null;
        this._afterRenderedChange = null;
        this._afterSave = null;
        this._afterSaveButtonChange = null;
        this._afterSrcNodeChange = null;
        this._afterStartEditing = null;
        this._afterStopEditing = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterUseARIAChange = null;
        this._afterVisibleChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._onBoundingBoxChange = null;
        this._onCancel = null;
        this._onCancelButtonChange = null;
        this._onContentBoxChange = null;
        this._onContentTextChange = null;
        this._onCssClassChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onEventTypeChange = null;
        this._onFocusedChange = null;
        this._onFormatInputChange = null;
        this._onFormatOutputChange = null;
        this._onHeightChange = null;
        this._onHideClassChange = null;
        this._onIconsChange = null;
        this._onIdChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onInputTypeChange = null;
        this._onNodeChange = null;
        this._onRenderChange = null;
        this._onRenderToChange = null;
        this._onRenderedChange = null;
        this._onSave = null;
        this._onSaveButtonChange = null;
        this._onSrcNodeChange = null;
        this._onStartEditing = null;
        this._onStopEditing = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onUseARIAChange = null;
        this._onVisibleChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/editable/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "cancelButton", this._cancelButton);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "contentText", this._contentText);
        setNamespacedAttribute(request, "cssClass", this._cssClass);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "eventType", this._eventType);
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "formatInput", this._formatInput);
        setNamespacedAttribute(request, "formatOutput", this._formatOutput);
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "hideClass", this._hideClass);
        setNamespacedAttribute(request, "icons", this._icons);
        setNamespacedAttribute(request, "editableId", this._editableId);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "inputType", this._inputType);
        setNamespacedAttribute(request, "node", this._node);
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "renderTo", this._renderTo);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "saveButton", this._saveButton);
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterCancel", this._afterCancel);
        setNamespacedAttribute(request, "afterCancelButtonChange", this._afterCancelButtonChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterContentTextChange", this._afterContentTextChange);
        setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterEventTypeChange", this._afterEventTypeChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterFormatInputChange", this._afterFormatInputChange);
        setNamespacedAttribute(request, "afterFormatOutputChange", this._afterFormatOutputChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
        setNamespacedAttribute(request, "afterIconsChange", this._afterIconsChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterInputTypeChange", this._afterInputTypeChange);
        setNamespacedAttribute(request, "afterNodeChange", this._afterNodeChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderToChange", this._afterRenderToChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterSave", this._afterSave);
        setNamespacedAttribute(request, "afterSaveButtonChange", this._afterSaveButtonChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStartEditing", this._afterStartEditing);
        setNamespacedAttribute(request, "afterStopEditing", this._afterStopEditing);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onCancel", this._onCancel);
        setNamespacedAttribute(request, "onCancelButtonChange", this._onCancelButtonChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onContentTextChange", this._onContentTextChange);
        setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onEventTypeChange", this._onEventTypeChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onFormatInputChange", this._onFormatInputChange);
        setNamespacedAttribute(request, "onFormatOutputChange", this._onFormatOutputChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
        setNamespacedAttribute(request, "onIconsChange", this._onIconsChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onInputTypeChange", this._onInputTypeChange);
        setNamespacedAttribute(request, "onNodeChange", this._onNodeChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderToChange", this._onRenderToChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onSave", this._onSave);
        setNamespacedAttribute(request, "onSaveButtonChange", this._onSaveButtonChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStartEditing", this._onStartEditing);
        setNamespacedAttribute(request, "onStopEditing", this._onStopEditing);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
    }
}
