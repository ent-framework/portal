package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseResizeTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:resize:";
    private static final String _PAGE = "/html/taglib/alloy/resize/page.jsp";
    private String _activeHandle = null;
    private Object _activeHandleEl = null;
    private Object _activeHandleNode = null;
    private boolean _autoHide = false;
    private Object _constrain = null;
    private Object _defMinHeight = Integer.valueOf(15);
    private Object _defMinWidth = Integer.valueOf(15);
    private boolean _destroyed = false;
    private Object _handles = null;
    private Object _handlesWrapper = null;
    private boolean _initialized = false;
    private Object _maxHeight = Integer.valueOf(Integer.MAX_VALUE);
    private Object _maxWidth = Integer.valueOf(Integer.MAX_VALUE);
    private Object _minHeight = Integer.valueOf(15);
    private Object _minWidth = Integer.valueOf(15);
    private Object _node = null;
    private boolean _preserveRatio = false;
    private boolean _proxy = false;
    private String _proxyEl = null;
    private boolean _resizing = false;
    private Object _tickX = null;
    private Object _tickY = null;
    private boolean _wrap = false;
    private Object _wrapTypes = null;
    private String _wrapper = "div";
    private Object _afterActiveHandleChange = null;
    private Object _afterActiveHandleElChange = null;
    private Object _afterActiveHandleNodeChange = null;
    private Object _afterAutoHideChange = null;
    private Object _afterConstrainChange = null;
    private Object _afterDefMinHeightChange = null;
    private Object _afterDefMinWidthChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterHandlesChange = null;
    private Object _afterHandlesWrapperChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterMaxHeightChange = null;
    private Object _afterMaxWidthChange = null;
    private Object _afterMinHeightChange = null;
    private Object _afterMinWidthChange = null;
    private Object _afterNodeChange = null;
    private Object _afterPreserveRatioChange = null;
    private Object _afterProxyChange = null;
    private Object _afterProxyElChange = null;
    private Object _afterAlign = null;
    private Object _afterEnd = null;
    private Object _afterMouseUp = null;
    private Object _afterResize = null;
    private Object _afterStart = null;
    private Object _afterResizingChange = null;
    private Object _afterTickXChange = null;
    private Object _afterTickYChange = null;
    private Object _afterWrapChange = null;
    private Object _afterWrapTypesChange = null;
    private Object _afterWrapperChange = null;
    private Object _onActiveHandleChange = null;
    private Object _onActiveHandleElChange = null;
    private Object _onActiveHandleNodeChange = null;
    private Object _onAutoHideChange = null;
    private Object _onConstrainChange = null;
    private Object _onDefMinHeightChange = null;
    private Object _onDefMinWidthChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onHandlesChange = null;
    private Object _onHandlesWrapperChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onMaxHeightChange = null;
    private Object _onMaxWidthChange = null;
    private Object _onMinHeightChange = null;
    private Object _onMinWidthChange = null;
    private Object _onNodeChange = null;
    private Object _onPreserveRatioChange = null;
    private Object _onProxyChange = null;
    private Object _onProxyElChange = null;
    private Object _onAlign = null;
    private Object _onEnd = null;
    private Object _onMouseUp = null;
    private Object _onResize = null;
    private Object _onStart = null;
    private Object _onResizingChange = null;
    private Object _onTickXChange = null;
    private Object _onTickYChange = null;
    private Object _onWrapChange = null;
    private Object _onWrapTypesChange = null;
    private Object _onWrapperChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:resize:");

        return super.doStartTag();
    }

    public String getActiveHandle() {
        return this._activeHandle;
    }

    public void setActiveHandle(String activeHandle) {
        this._activeHandle = activeHandle;

        setScopedAttribute("activeHandle", activeHandle);
    }

    public Object getActiveHandleEl() {
        return this._activeHandleEl;
    }

    public void setActiveHandleEl(Object activeHandleEl) {
        this._activeHandleEl = activeHandleEl;

        setScopedAttribute("activeHandleEl", activeHandleEl);
    }

    public Object getActiveHandleNode() {
        return this._activeHandleNode;
    }

    public void setActiveHandleNode(Object activeHandleNode) {
        this._activeHandleNode = activeHandleNode;

        setScopedAttribute("activeHandleNode", activeHandleNode);
    }

    public boolean getAutoHide() {
        return this._autoHide;
    }

    public void setAutoHide(boolean autoHide) {
        this._autoHide = autoHide;

        setScopedAttribute("autoHide", Boolean.valueOf(autoHide));
    }

    public Object getConstrain() {
        return this._constrain;
    }

    public void setConstrain(Object constrain) {
        this._constrain = constrain;

        setScopedAttribute("constrain", constrain);
    }

    public Object getDefMinHeight() {
        return this._defMinHeight;
    }

    public void setDefMinHeight(Object defMinHeight) {
        this._defMinHeight = defMinHeight;

        setScopedAttribute("defMinHeight", defMinHeight);
    }

    public Object getDefMinWidth() {
        return this._defMinWidth;
    }

    public void setDefMinWidth(Object defMinWidth) {
        this._defMinWidth = defMinWidth;

        setScopedAttribute("defMinWidth", defMinWidth);
    }

    public boolean getDestroyed() {
        return this._destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this._destroyed = destroyed;

        setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
    }

    public Object getHandles() {
        return this._handles;
    }

    public void setHandles(Object handles) {
        this._handles = handles;

        setScopedAttribute("handles", handles);
    }

    public Object getHandlesWrapper() {
        return this._handlesWrapper;
    }

    public void setHandlesWrapper(Object handlesWrapper) {
        this._handlesWrapper = handlesWrapper;

        setScopedAttribute("handlesWrapper", handlesWrapper);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public Object getMaxHeight() {
        return this._maxHeight;
    }

    public void setMaxHeight(Object maxHeight) {
        this._maxHeight = maxHeight;

        setScopedAttribute("maxHeight", maxHeight);
    }

    public Object getMaxWidth() {
        return this._maxWidth;
    }

    public void setMaxWidth(Object maxWidth) {
        this._maxWidth = maxWidth;

        setScopedAttribute("maxWidth", maxWidth);
    }

    public Object getMinHeight() {
        return this._minHeight;
    }

    public void setMinHeight(Object minHeight) {
        this._minHeight = minHeight;

        setScopedAttribute("minHeight", minHeight);
    }

    public Object getMinWidth() {
        return this._minWidth;
    }

    public void setMinWidth(Object minWidth) {
        this._minWidth = minWidth;

        setScopedAttribute("minWidth", minWidth);
    }

    public Object getNode() {
        return this._node;
    }

    public void setNode(Object node) {
        this._node = node;

        setScopedAttribute("node", node);
    }

    public boolean getPreserveRatio() {
        return this._preserveRatio;
    }

    public void setPreserveRatio(boolean preserveRatio) {
        this._preserveRatio = preserveRatio;

        setScopedAttribute("preserveRatio", Boolean.valueOf(preserveRatio));
    }

    public boolean getProxy() {
        return this._proxy;
    }

    public void setProxy(boolean proxy) {
        this._proxy = proxy;

        setScopedAttribute("proxy", Boolean.valueOf(proxy));
    }

    public String getProxyEl() {
        return this._proxyEl;
    }

    public void setProxyEl(String proxyEl) {
        this._proxyEl = proxyEl;

        setScopedAttribute("proxyEl", proxyEl);
    }

    public boolean getResizing() {
        return this._resizing;
    }

    public void setResizing(boolean resizing) {
        this._resizing = resizing;

        setScopedAttribute("resizing", Boolean.valueOf(resizing));
    }

    public Object getTickX() {
        return this._tickX;
    }

    public void setTickX(Object tickX) {
        this._tickX = tickX;

        setScopedAttribute("tickX", tickX);
    }

    public Object getTickY() {
        return this._tickY;
    }

    public void setTickY(Object tickY) {
        this._tickY = tickY;

        setScopedAttribute("tickY", tickY);
    }

    public boolean getWrap() {
        return this._wrap;
    }

    public void setWrap(boolean wrap) {
        this._wrap = wrap;

        setScopedAttribute("wrap", Boolean.valueOf(wrap));
    }

    public Object getWrapTypes() {
        return this._wrapTypes;
    }

    public void setWrapTypes(Object wrapTypes) {
        this._wrapTypes = wrapTypes;

        setScopedAttribute("wrapTypes", wrapTypes);
    }

    public String getWrapper() {
        return this._wrapper;
    }

    public void setWrapper(String wrapper) {
        this._wrapper = wrapper;

        setScopedAttribute("wrapper", wrapper);
    }

    public Object getAfterActiveHandleChange() {
        return this._afterActiveHandleChange;
    }

    public void setAfterActiveHandleChange(Object afterActiveHandleChange) {
        this._afterActiveHandleChange = afterActiveHandleChange;

        setScopedAttribute("afterActiveHandleChange", afterActiveHandleChange);
    }

    public Object getAfterActiveHandleElChange() {
        return this._afterActiveHandleElChange;
    }

    public void setAfterActiveHandleElChange(Object afterActiveHandleElChange) {
        this._afterActiveHandleElChange = afterActiveHandleElChange;

        setScopedAttribute("afterActiveHandleElChange", afterActiveHandleElChange);
    }

    public Object getAfterActiveHandleNodeChange() {
        return this._afterActiveHandleNodeChange;
    }

    public void setAfterActiveHandleNodeChange(Object afterActiveHandleNodeChange) {
        this._afterActiveHandleNodeChange = afterActiveHandleNodeChange;

        setScopedAttribute("afterActiveHandleNodeChange", afterActiveHandleNodeChange);
    }

    public Object getAfterAutoHideChange() {
        return this._afterAutoHideChange;
    }

    public void setAfterAutoHideChange(Object afterAutoHideChange) {
        this._afterAutoHideChange = afterAutoHideChange;

        setScopedAttribute("afterAutoHideChange", afterAutoHideChange);
    }

    public Object getAfterConstrainChange() {
        return this._afterConstrainChange;
    }

    public void setAfterConstrainChange(Object afterConstrainChange) {
        this._afterConstrainChange = afterConstrainChange;

        setScopedAttribute("afterConstrainChange", afterConstrainChange);
    }

    public Object getAfterDefMinHeightChange() {
        return this._afterDefMinHeightChange;
    }

    public void setAfterDefMinHeightChange(Object afterDefMinHeightChange) {
        this._afterDefMinHeightChange = afterDefMinHeightChange;

        setScopedAttribute("afterDefMinHeightChange", afterDefMinHeightChange);
    }

    public Object getAfterDefMinWidthChange() {
        return this._afterDefMinWidthChange;
    }

    public void setAfterDefMinWidthChange(Object afterDefMinWidthChange) {
        this._afterDefMinWidthChange = afterDefMinWidthChange;

        setScopedAttribute("afterDefMinWidthChange", afterDefMinWidthChange);
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

    public Object getAfterHandlesChange() {
        return this._afterHandlesChange;
    }

    public void setAfterHandlesChange(Object afterHandlesChange) {
        this._afterHandlesChange = afterHandlesChange;

        setScopedAttribute("afterHandlesChange", afterHandlesChange);
    }

    public Object getAfterHandlesWrapperChange() {
        return this._afterHandlesWrapperChange;
    }

    public void setAfterHandlesWrapperChange(Object afterHandlesWrapperChange) {
        this._afterHandlesWrapperChange = afterHandlesWrapperChange;

        setScopedAttribute("afterHandlesWrapperChange", afterHandlesWrapperChange);
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

    public Object getAfterMaxHeightChange() {
        return this._afterMaxHeightChange;
    }

    public void setAfterMaxHeightChange(Object afterMaxHeightChange) {
        this._afterMaxHeightChange = afterMaxHeightChange;

        setScopedAttribute("afterMaxHeightChange", afterMaxHeightChange);
    }

    public Object getAfterMaxWidthChange() {
        return this._afterMaxWidthChange;
    }

    public void setAfterMaxWidthChange(Object afterMaxWidthChange) {
        this._afterMaxWidthChange = afterMaxWidthChange;

        setScopedAttribute("afterMaxWidthChange", afterMaxWidthChange);
    }

    public Object getAfterMinHeightChange() {
        return this._afterMinHeightChange;
    }

    public void setAfterMinHeightChange(Object afterMinHeightChange) {
        this._afterMinHeightChange = afterMinHeightChange;

        setScopedAttribute("afterMinHeightChange", afterMinHeightChange);
    }

    public Object getAfterMinWidthChange() {
        return this._afterMinWidthChange;
    }

    public void setAfterMinWidthChange(Object afterMinWidthChange) {
        this._afterMinWidthChange = afterMinWidthChange;

        setScopedAttribute("afterMinWidthChange", afterMinWidthChange);
    }

    public Object getAfterNodeChange() {
        return this._afterNodeChange;
    }

    public void setAfterNodeChange(Object afterNodeChange) {
        this._afterNodeChange = afterNodeChange;

        setScopedAttribute("afterNodeChange", afterNodeChange);
    }

    public Object getAfterPreserveRatioChange() {
        return this._afterPreserveRatioChange;
    }

    public void setAfterPreserveRatioChange(Object afterPreserveRatioChange) {
        this._afterPreserveRatioChange = afterPreserveRatioChange;

        setScopedAttribute("afterPreserveRatioChange", afterPreserveRatioChange);
    }

    public Object getAfterProxyChange() {
        return this._afterProxyChange;
    }

    public void setAfterProxyChange(Object afterProxyChange) {
        this._afterProxyChange = afterProxyChange;

        setScopedAttribute("afterProxyChange", afterProxyChange);
    }

    public Object getAfterProxyElChange() {
        return this._afterProxyElChange;
    }

    public void setAfterProxyElChange(Object afterProxyElChange) {
        this._afterProxyElChange = afterProxyElChange;

        setScopedAttribute("afterProxyElChange", afterProxyElChange);
    }

    public Object getAfterAlign() {
        return this._afterAlign;
    }

    public void setAfterAlign(Object afterAlign) {
        this._afterAlign = afterAlign;

        setScopedAttribute("afterAlign", afterAlign);
    }

    public Object getAfterEnd() {
        return this._afterEnd;
    }

    public void setAfterEnd(Object afterEnd) {
        this._afterEnd = afterEnd;

        setScopedAttribute("afterEnd", afterEnd);
    }

    public Object getAfterMouseUp() {
        return this._afterMouseUp;
    }

    public void setAfterMouseUp(Object afterMouseUp) {
        this._afterMouseUp = afterMouseUp;

        setScopedAttribute("afterMouseUp", afterMouseUp);
    }

    public Object getAfterResize() {
        return this._afterResize;
    }

    public void setAfterResize(Object afterResize) {
        this._afterResize = afterResize;

        setScopedAttribute("afterResize", afterResize);
    }

    public Object getAfterStart() {
        return this._afterStart;
    }

    public void setAfterStart(Object afterStart) {
        this._afterStart = afterStart;

        setScopedAttribute("afterStart", afterStart);
    }

    public Object getAfterResizingChange() {
        return this._afterResizingChange;
    }

    public void setAfterResizingChange(Object afterResizingChange) {
        this._afterResizingChange = afterResizingChange;

        setScopedAttribute("afterResizingChange", afterResizingChange);
    }

    public Object getAfterTickXChange() {
        return this._afterTickXChange;
    }

    public void setAfterTickXChange(Object afterTickXChange) {
        this._afterTickXChange = afterTickXChange;

        setScopedAttribute("afterTickXChange", afterTickXChange);
    }

    public Object getAfterTickYChange() {
        return this._afterTickYChange;
    }

    public void setAfterTickYChange(Object afterTickYChange) {
        this._afterTickYChange = afterTickYChange;

        setScopedAttribute("afterTickYChange", afterTickYChange);
    }

    public Object getAfterWrapChange() {
        return this._afterWrapChange;
    }

    public void setAfterWrapChange(Object afterWrapChange) {
        this._afterWrapChange = afterWrapChange;

        setScopedAttribute("afterWrapChange", afterWrapChange);
    }

    public Object getAfterWrapTypesChange() {
        return this._afterWrapTypesChange;
    }

    public void setAfterWrapTypesChange(Object afterWrapTypesChange) {
        this._afterWrapTypesChange = afterWrapTypesChange;

        setScopedAttribute("afterWrapTypesChange", afterWrapTypesChange);
    }

    public Object getAfterWrapperChange() {
        return this._afterWrapperChange;
    }

    public void setAfterWrapperChange(Object afterWrapperChange) {
        this._afterWrapperChange = afterWrapperChange;

        setScopedAttribute("afterWrapperChange", afterWrapperChange);
    }

    public Object getOnActiveHandleChange() {
        return this._onActiveHandleChange;
    }

    public void setOnActiveHandleChange(Object onActiveHandleChange) {
        this._onActiveHandleChange = onActiveHandleChange;

        setScopedAttribute("onActiveHandleChange", onActiveHandleChange);
    }

    public Object getOnActiveHandleElChange() {
        return this._onActiveHandleElChange;
    }

    public void setOnActiveHandleElChange(Object onActiveHandleElChange) {
        this._onActiveHandleElChange = onActiveHandleElChange;

        setScopedAttribute("onActiveHandleElChange", onActiveHandleElChange);
    }

    public Object getOnActiveHandleNodeChange() {
        return this._onActiveHandleNodeChange;
    }

    public void setOnActiveHandleNodeChange(Object onActiveHandleNodeChange) {
        this._onActiveHandleNodeChange = onActiveHandleNodeChange;

        setScopedAttribute("onActiveHandleNodeChange", onActiveHandleNodeChange);
    }

    public Object getOnAutoHideChange() {
        return this._onAutoHideChange;
    }

    public void setOnAutoHideChange(Object onAutoHideChange) {
        this._onAutoHideChange = onAutoHideChange;

        setScopedAttribute("onAutoHideChange", onAutoHideChange);
    }

    public Object getOnConstrainChange() {
        return this._onConstrainChange;
    }

    public void setOnConstrainChange(Object onConstrainChange) {
        this._onConstrainChange = onConstrainChange;

        setScopedAttribute("onConstrainChange", onConstrainChange);
    }

    public Object getOnDefMinHeightChange() {
        return this._onDefMinHeightChange;
    }

    public void setOnDefMinHeightChange(Object onDefMinHeightChange) {
        this._onDefMinHeightChange = onDefMinHeightChange;

        setScopedAttribute("onDefMinHeightChange", onDefMinHeightChange);
    }

    public Object getOnDefMinWidthChange() {
        return this._onDefMinWidthChange;
    }

    public void setOnDefMinWidthChange(Object onDefMinWidthChange) {
        this._onDefMinWidthChange = onDefMinWidthChange;

        setScopedAttribute("onDefMinWidthChange", onDefMinWidthChange);
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

    public Object getOnHandlesChange() {
        return this._onHandlesChange;
    }

    public void setOnHandlesChange(Object onHandlesChange) {
        this._onHandlesChange = onHandlesChange;

        setScopedAttribute("onHandlesChange", onHandlesChange);
    }

    public Object getOnHandlesWrapperChange() {
        return this._onHandlesWrapperChange;
    }

    public void setOnHandlesWrapperChange(Object onHandlesWrapperChange) {
        this._onHandlesWrapperChange = onHandlesWrapperChange;

        setScopedAttribute("onHandlesWrapperChange", onHandlesWrapperChange);
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

    public Object getOnMaxHeightChange() {
        return this._onMaxHeightChange;
    }

    public void setOnMaxHeightChange(Object onMaxHeightChange) {
        this._onMaxHeightChange = onMaxHeightChange;

        setScopedAttribute("onMaxHeightChange", onMaxHeightChange);
    }

    public Object getOnMaxWidthChange() {
        return this._onMaxWidthChange;
    }

    public void setOnMaxWidthChange(Object onMaxWidthChange) {
        this._onMaxWidthChange = onMaxWidthChange;

        setScopedAttribute("onMaxWidthChange", onMaxWidthChange);
    }

    public Object getOnMinHeightChange() {
        return this._onMinHeightChange;
    }

    public void setOnMinHeightChange(Object onMinHeightChange) {
        this._onMinHeightChange = onMinHeightChange;

        setScopedAttribute("onMinHeightChange", onMinHeightChange);
    }

    public Object getOnMinWidthChange() {
        return this._onMinWidthChange;
    }

    public void setOnMinWidthChange(Object onMinWidthChange) {
        this._onMinWidthChange = onMinWidthChange;

        setScopedAttribute("onMinWidthChange", onMinWidthChange);
    }

    public Object getOnNodeChange() {
        return this._onNodeChange;
    }

    public void setOnNodeChange(Object onNodeChange) {
        this._onNodeChange = onNodeChange;

        setScopedAttribute("onNodeChange", onNodeChange);
    }

    public Object getOnPreserveRatioChange() {
        return this._onPreserveRatioChange;
    }

    public void setOnPreserveRatioChange(Object onPreserveRatioChange) {
        this._onPreserveRatioChange = onPreserveRatioChange;

        setScopedAttribute("onPreserveRatioChange", onPreserveRatioChange);
    }

    public Object getOnProxyChange() {
        return this._onProxyChange;
    }

    public void setOnProxyChange(Object onProxyChange) {
        this._onProxyChange = onProxyChange;

        setScopedAttribute("onProxyChange", onProxyChange);
    }

    public Object getOnProxyElChange() {
        return this._onProxyElChange;
    }

    public void setOnProxyElChange(Object onProxyElChange) {
        this._onProxyElChange = onProxyElChange;

        setScopedAttribute("onProxyElChange", onProxyElChange);
    }

    public Object getOnAlign() {
        return this._onAlign;
    }

    public void setOnAlign(Object onAlign) {
        this._onAlign = onAlign;

        setScopedAttribute("onAlign", onAlign);
    }

    public Object getOnEnd() {
        return this._onEnd;
    }

    public void setOnEnd(Object onEnd) {
        this._onEnd = onEnd;

        setScopedAttribute("onEnd", onEnd);
    }

    public Object getOnMouseUp() {
        return this._onMouseUp;
    }

    public void setOnMouseUp(Object onMouseUp) {
        this._onMouseUp = onMouseUp;

        setScopedAttribute("onMouseUp", onMouseUp);
    }

    public Object getOnResize() {
        return this._onResize;
    }

    public void setOnResize(Object onResize) {
        this._onResize = onResize;

        setScopedAttribute("onResize", onResize);
    }

    public Object getOnStart() {
        return this._onStart;
    }

    public void setOnStart(Object onStart) {
        this._onStart = onStart;

        setScopedAttribute("onStart", onStart);
    }

    public Object getOnResizingChange() {
        return this._onResizingChange;
    }

    public void setOnResizingChange(Object onResizingChange) {
        this._onResizingChange = onResizingChange;

        setScopedAttribute("onResizingChange", onResizingChange);
    }

    public Object getOnTickXChange() {
        return this._onTickXChange;
    }

    public void setOnTickXChange(Object onTickXChange) {
        this._onTickXChange = onTickXChange;

        setScopedAttribute("onTickXChange", onTickXChange);
    }

    public Object getOnTickYChange() {
        return this._onTickYChange;
    }

    public void setOnTickYChange(Object onTickYChange) {
        this._onTickYChange = onTickYChange;

        setScopedAttribute("onTickYChange", onTickYChange);
    }

    public Object getOnWrapChange() {
        return this._onWrapChange;
    }

    public void setOnWrapChange(Object onWrapChange) {
        this._onWrapChange = onWrapChange;

        setScopedAttribute("onWrapChange", onWrapChange);
    }

    public Object getOnWrapTypesChange() {
        return this._onWrapTypesChange;
    }

    public void setOnWrapTypesChange(Object onWrapTypesChange) {
        this._onWrapTypesChange = onWrapTypesChange;

        setScopedAttribute("onWrapTypesChange", onWrapTypesChange);
    }

    public Object getOnWrapperChange() {
        return this._onWrapperChange;
    }

    public void setOnWrapperChange(Object onWrapperChange) {
        this._onWrapperChange = onWrapperChange;

        setScopedAttribute("onWrapperChange", onWrapperChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._activeHandle = null;
        this._activeHandleEl = null;
        this._activeHandleNode = null;
        this._autoHide = false;
        this._constrain = null;
        this._defMinHeight = Integer.valueOf(15);
        this._defMinWidth = Integer.valueOf(15);
        this._destroyed = false;
        this._handles = null;
        this._handlesWrapper = null;
        this._initialized = false;
        this._maxHeight = Integer.valueOf(Integer.MAX_VALUE);
        this._maxWidth = Integer.valueOf(Integer.MAX_VALUE);
        this._minHeight = Integer.valueOf(15);
        this._minWidth = Integer.valueOf(15);
        this._node = null;
        this._preserveRatio = false;
        this._proxy = false;
        this._proxyEl = null;
        this._resizing = false;
        this._tickX = null;
        this._tickY = null;
        this._wrap = false;
        this._wrapTypes = null;
        this._wrapper = "div";
        this._afterActiveHandleChange = null;
        this._afterActiveHandleElChange = null;
        this._afterActiveHandleNodeChange = null;
        this._afterAutoHideChange = null;
        this._afterConstrainChange = null;
        this._afterDefMinHeightChange = null;
        this._afterDefMinWidthChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterHandlesChange = null;
        this._afterHandlesWrapperChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterMaxHeightChange = null;
        this._afterMaxWidthChange = null;
        this._afterMinHeightChange = null;
        this._afterMinWidthChange = null;
        this._afterNodeChange = null;
        this._afterPreserveRatioChange = null;
        this._afterProxyChange = null;
        this._afterProxyElChange = null;
        this._afterAlign = null;
        this._afterEnd = null;
        this._afterMouseUp = null;
        this._afterResize = null;
        this._afterStart = null;
        this._afterResizingChange = null;
        this._afterTickXChange = null;
        this._afterTickYChange = null;
        this._afterWrapChange = null;
        this._afterWrapTypesChange = null;
        this._afterWrapperChange = null;
        this._onActiveHandleChange = null;
        this._onActiveHandleElChange = null;
        this._onActiveHandleNodeChange = null;
        this._onAutoHideChange = null;
        this._onConstrainChange = null;
        this._onDefMinHeightChange = null;
        this._onDefMinWidthChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onHandlesChange = null;
        this._onHandlesWrapperChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onMaxHeightChange = null;
        this._onMaxWidthChange = null;
        this._onMinHeightChange = null;
        this._onMinWidthChange = null;
        this._onNodeChange = null;
        this._onPreserveRatioChange = null;
        this._onProxyChange = null;
        this._onProxyElChange = null;
        this._onAlign = null;
        this._onEnd = null;
        this._onMouseUp = null;
        this._onResize = null;
        this._onStart = null;
        this._onResizingChange = null;
        this._onTickXChange = null;
        this._onTickYChange = null;
        this._onWrapChange = null;
        this._onWrapTypesChange = null;
        this._onWrapperChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/resize/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "activeHandle", this._activeHandle);
        setNamespacedAttribute(request, "activeHandleEl", this._activeHandleEl);
        setNamespacedAttribute(request, "activeHandleNode", this._activeHandleNode);
        setNamespacedAttribute(request, "autoHide", Boolean.valueOf(this._autoHide));
        setNamespacedAttribute(request, "constrain", this._constrain);
        setNamespacedAttribute(request, "defMinHeight", this._defMinHeight);
        setNamespacedAttribute(request, "defMinWidth", this._defMinWidth);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "handles", this._handles);
        setNamespacedAttribute(request, "handlesWrapper", this._handlesWrapper);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "maxHeight", this._maxHeight);
        setNamespacedAttribute(request, "maxWidth", this._maxWidth);
        setNamespacedAttribute(request, "minHeight", this._minHeight);
        setNamespacedAttribute(request, "minWidth", this._minWidth);
        setNamespacedAttribute(request, "node", this._node);
        setNamespacedAttribute(request, "preserveRatio", Boolean.valueOf(this._preserveRatio));
        setNamespacedAttribute(request, "proxy", Boolean.valueOf(this._proxy));
        setNamespacedAttribute(request, "proxyEl", this._proxyEl);
        setNamespacedAttribute(request, "resizing", Boolean.valueOf(this._resizing));
        setNamespacedAttribute(request, "tickX", this._tickX);
        setNamespacedAttribute(request, "tickY", this._tickY);
        setNamespacedAttribute(request, "wrap", Boolean.valueOf(this._wrap));
        setNamespacedAttribute(request, "wrapTypes", this._wrapTypes);
        setNamespacedAttribute(request, "wrapper", this._wrapper);
        setNamespacedAttribute(request, "afterActiveHandleChange", this._afterActiveHandleChange);
        setNamespacedAttribute(request, "afterActiveHandleElChange", this._afterActiveHandleElChange);
        setNamespacedAttribute(request, "afterActiveHandleNodeChange", this._afterActiveHandleNodeChange);
        setNamespacedAttribute(request, "afterAutoHideChange", this._afterAutoHideChange);
        setNamespacedAttribute(request, "afterConstrainChange", this._afterConstrainChange);
        setNamespacedAttribute(request, "afterDefMinHeightChange", this._afterDefMinHeightChange);
        setNamespacedAttribute(request, "afterDefMinWidthChange", this._afterDefMinWidthChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterHandlesChange", this._afterHandlesChange);
        setNamespacedAttribute(request, "afterHandlesWrapperChange", this._afterHandlesWrapperChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterMaxHeightChange", this._afterMaxHeightChange);
        setNamespacedAttribute(request, "afterMaxWidthChange", this._afterMaxWidthChange);
        setNamespacedAttribute(request, "afterMinHeightChange", this._afterMinHeightChange);
        setNamespacedAttribute(request, "afterMinWidthChange", this._afterMinWidthChange);
        setNamespacedAttribute(request, "afterNodeChange", this._afterNodeChange);
        setNamespacedAttribute(request, "afterPreserveRatioChange", this._afterPreserveRatioChange);
        setNamespacedAttribute(request, "afterProxyChange", this._afterProxyChange);
        setNamespacedAttribute(request, "afterProxyElChange", this._afterProxyElChange);
        setNamespacedAttribute(request, "afterAlign", this._afterAlign);
        setNamespacedAttribute(request, "afterEnd", this._afterEnd);
        setNamespacedAttribute(request, "afterMouseUp", this._afterMouseUp);
        setNamespacedAttribute(request, "afterResize", this._afterResize);
        setNamespacedAttribute(request, "afterStart", this._afterStart);
        setNamespacedAttribute(request, "afterResizingChange", this._afterResizingChange);
        setNamespacedAttribute(request, "afterTickXChange", this._afterTickXChange);
        setNamespacedAttribute(request, "afterTickYChange", this._afterTickYChange);
        setNamespacedAttribute(request, "afterWrapChange", this._afterWrapChange);
        setNamespacedAttribute(request, "afterWrapTypesChange", this._afterWrapTypesChange);
        setNamespacedAttribute(request, "afterWrapperChange", this._afterWrapperChange);
        setNamespacedAttribute(request, "onActiveHandleChange", this._onActiveHandleChange);
        setNamespacedAttribute(request, "onActiveHandleElChange", this._onActiveHandleElChange);
        setNamespacedAttribute(request, "onActiveHandleNodeChange", this._onActiveHandleNodeChange);
        setNamespacedAttribute(request, "onAutoHideChange", this._onAutoHideChange);
        setNamespacedAttribute(request, "onConstrainChange", this._onConstrainChange);
        setNamespacedAttribute(request, "onDefMinHeightChange", this._onDefMinHeightChange);
        setNamespacedAttribute(request, "onDefMinWidthChange", this._onDefMinWidthChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onHandlesChange", this._onHandlesChange);
        setNamespacedAttribute(request, "onHandlesWrapperChange", this._onHandlesWrapperChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onMaxHeightChange", this._onMaxHeightChange);
        setNamespacedAttribute(request, "onMaxWidthChange", this._onMaxWidthChange);
        setNamespacedAttribute(request, "onMinHeightChange", this._onMinHeightChange);
        setNamespacedAttribute(request, "onMinWidthChange", this._onMinWidthChange);
        setNamespacedAttribute(request, "onNodeChange", this._onNodeChange);
        setNamespacedAttribute(request, "onPreserveRatioChange", this._onPreserveRatioChange);
        setNamespacedAttribute(request, "onProxyChange", this._onProxyChange);
        setNamespacedAttribute(request, "onProxyElChange", this._onProxyElChange);
        setNamespacedAttribute(request, "onAlign", this._onAlign);
        setNamespacedAttribute(request, "onEnd", this._onEnd);
        setNamespacedAttribute(request, "onMouseUp", this._onMouseUp);
        setNamespacedAttribute(request, "onResize", this._onResize);
        setNamespacedAttribute(request, "onStart", this._onStart);
        setNamespacedAttribute(request, "onResizingChange", this._onResizingChange);
        setNamespacedAttribute(request, "onTickXChange", this._onTickXChange);
        setNamespacedAttribute(request, "onTickYChange", this._onTickYChange);
        setNamespacedAttribute(request, "onWrapChange", this._onWrapChange);
        setNamespacedAttribute(request, "onWrapTypesChange", this._onWrapTypesChange);
        setNamespacedAttribute(request, "onWrapperChange", this._onWrapperChange);
    }
}
