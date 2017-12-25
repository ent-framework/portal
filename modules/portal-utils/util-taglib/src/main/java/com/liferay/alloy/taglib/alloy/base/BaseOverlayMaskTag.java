package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseOverlayMaskTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:overlay-mask:";
    private static final String _PAGE = "/html/taglib/alloy/overlay_mask/page.jsp";
    private Object _align = null;
    private Object _alignOn = null;
    private Object _alignPoints = null;
    private String _background = null;
    private Object _overlaymaskBodyContent = null;
    private String _boundingBox = null;
    private Object _centered = null;
    private Object _constrain = null;
    private String _contentBox = null;
    private String _cssClass = null;
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private Object _fillHeight = null;
    private boolean _focused = false;
    private Object _footerContent = null;
    private Object _headerContent = null;
    private Object _height = null;
    private String _hideClass = "aui-helper-hidden";
    private String _overlaymaskId = null;
    private boolean _initialized = false;
    private Object _opacity = Double.valueOf(0.5D);
    private boolean _preventOverlap = false;
    private Object _render = null;
    private boolean _rendered = false;
    private boolean _shim = false;
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private String _target = "document";
    private boolean _useARIA = true;
    private boolean _visible = false;
    private Object _width = null;
    private Object _x = Integer.valueOf(0);
    private Object _xy = null;
    private Object _y = Integer.valueOf(0);
    private Object _zIndex = Integer.valueOf(1000);
    private Object _afterAlignChange = null;
    private Object _afterAlignOnChange = null;
    private Object _afterAlignPointsChange = null;
    private Object _afterBackgroundChange = null;
    private Object _afterBodyContentChange = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterCenteredChange = null;
    private Object _afterConstrainChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterCssClassChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterFillHeightChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterFooterContentChange = null;
    private Object _afterHeaderContentChange = null;
    private Object _afterHeightChange = null;
    private Object _afterHideClassChange = null;
    private Object _afterIdChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterOpacityChange = null;
    private Object _afterPreventOverlapChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterShimChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterTargetChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _afterXChange = null;
    private Object _afterXyChange = null;
    private Object _afterYChange = null;
    private Object _afterZIndexChange = null;
    private Object _onAlignChange = null;
    private Object _onAlignOnChange = null;
    private Object _onAlignPointsChange = null;
    private Object _onBackgroundChange = null;
    private Object _onBodyContentChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onCenteredChange = null;
    private Object _onConstrainChange = null;
    private Object _onContentBoxChange = null;
    private Object _onCssClassChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onFillHeightChange = null;
    private Object _onFocusedChange = null;
    private Object _onFooterContentChange = null;
    private Object _onHeaderContentChange = null;
    private Object _onHeightChange = null;
    private Object _onHideClassChange = null;
    private Object _onIdChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onOpacityChange = null;
    private Object _onPreventOverlapChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onShimChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onTargetChange = null;
    private Object _onUseARIAChange = null;
    private Object _onVisibleChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;
    private Object _onXChange = null;
    private Object _onXyChange = null;
    private Object _onYChange = null;
    private Object _onZIndexChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:overlay-mask:");

        return super.doStartTag();
    }

    public Object getAlign() {
        return this._align;
    }

    public void setAlign(Object align) {
        this._align = align;

        setScopedAttribute("align", align);
    }

    public Object getAlignOn() {
        return this._alignOn;
    }

    public void setAlignOn(Object alignOn) {
        this._alignOn = alignOn;

        setScopedAttribute("alignOn", alignOn);
    }

    public Object getAlignPoints() {
        return this._alignPoints;
    }

    public void setAlignPoints(Object alignPoints) {
        this._alignPoints = alignPoints;

        setScopedAttribute("alignPoints", alignPoints);
    }

    public String getBackground() {
        return this._background;
    }

    public void setBackground(String background) {
        this._background = background;

        setScopedAttribute("background", background);
    }

    public Object getOverlaymaskBodyContent() {
        return this._overlaymaskBodyContent;
    }

    public void setOverlaymaskBodyContent(Object overlaymaskBodyContent) {
        this._overlaymaskBodyContent = overlaymaskBodyContent;

        setScopedAttribute("overlaymaskBodyContent", overlaymaskBodyContent);
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public Object getCentered() {
        return this._centered;
    }

    public void setCentered(Object centered) {
        this._centered = centered;

        setScopedAttribute("centered", centered);
    }

    public Object getConstrain() {
        return this._constrain;
    }

    public void setConstrain(Object constrain) {
        this._constrain = constrain;

        setScopedAttribute("constrain", constrain);
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

    public Object getFillHeight() {
        return this._fillHeight;
    }

    public void setFillHeight(Object fillHeight) {
        this._fillHeight = fillHeight;

        setScopedAttribute("fillHeight", fillHeight);
    }

    public boolean getFocused() {
        return this._focused;
    }

    public void setFocused(boolean focused) {
        this._focused = focused;

        setScopedAttribute("focused", Boolean.valueOf(focused));
    }

    public Object getFooterContent() {
        return this._footerContent;
    }

    public void setFooterContent(Object footerContent) {
        this._footerContent = footerContent;

        setScopedAttribute("footerContent", footerContent);
    }

    public Object getHeaderContent() {
        return this._headerContent;
    }

    public void setHeaderContent(Object headerContent) {
        this._headerContent = headerContent;

        setScopedAttribute("headerContent", headerContent);
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

    public String getOverlaymaskId() {
        return this._overlaymaskId;
    }

    public void setOverlaymaskId(String overlaymaskId) {
        this._overlaymaskId = overlaymaskId;

        setScopedAttribute("overlaymaskId", overlaymaskId);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public Object getOpacity() {
        return this._opacity;
    }

    public void setOpacity(Object opacity) {
        this._opacity = opacity;

        setScopedAttribute("opacity", opacity);
    }

    public boolean getPreventOverlap() {
        return this._preventOverlap;
    }

    public void setPreventOverlap(boolean preventOverlap) {
        this._preventOverlap = preventOverlap;

        setScopedAttribute("preventOverlap", Boolean.valueOf(preventOverlap));
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

    public boolean getShim() {
        return this._shim;
    }

    public void setShim(boolean shim) {
        this._shim = shim;

        setScopedAttribute("shim", Boolean.valueOf(shim));
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

    public String getTarget() {
        return this._target;
    }

    public void setTarget(String target) {
        this._target = target;

        setScopedAttribute("target", target);
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

    public Object getX() {
        return this._x;
    }

    public void setX(Object x) {
        this._x = x;

        setScopedAttribute("x", x);
    }

    public Object getXy() {
        return this._xy;
    }

    public void setXy(Object xy) {
        this._xy = xy;

        setScopedAttribute("xy", xy);
    }

    public Object getY() {
        return this._y;
    }

    public void setY(Object y) {
        this._y = y;

        setScopedAttribute("y", y);
    }

    public Object getZIndex() {
        return this._zIndex;
    }

    public void setZIndex(Object zIndex) {
        this._zIndex = zIndex;

        setScopedAttribute("zIndex", zIndex);
    }

    public Object getAfterAlignChange() {
        return this._afterAlignChange;
    }

    public void setAfterAlignChange(Object afterAlignChange) {
        this._afterAlignChange = afterAlignChange;

        setScopedAttribute("afterAlignChange", afterAlignChange);
    }

    public Object getAfterAlignOnChange() {
        return this._afterAlignOnChange;
    }

    public void setAfterAlignOnChange(Object afterAlignOnChange) {
        this._afterAlignOnChange = afterAlignOnChange;

        setScopedAttribute("afterAlignOnChange", afterAlignOnChange);
    }

    public Object getAfterAlignPointsChange() {
        return this._afterAlignPointsChange;
    }

    public void setAfterAlignPointsChange(Object afterAlignPointsChange) {
        this._afterAlignPointsChange = afterAlignPointsChange;

        setScopedAttribute("afterAlignPointsChange", afterAlignPointsChange);
    }

    public Object getAfterBackgroundChange() {
        return this._afterBackgroundChange;
    }

    public void setAfterBackgroundChange(Object afterBackgroundChange) {
        this._afterBackgroundChange = afterBackgroundChange;

        setScopedAttribute("afterBackgroundChange", afterBackgroundChange);
    }

    public Object getAfterBodyContentChange() {
        return this._afterBodyContentChange;
    }

    public void setAfterBodyContentChange(Object afterBodyContentChange) {
        this._afterBodyContentChange = afterBodyContentChange;

        setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
    }

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterCenteredChange() {
        return this._afterCenteredChange;
    }

    public void setAfterCenteredChange(Object afterCenteredChange) {
        this._afterCenteredChange = afterCenteredChange;

        setScopedAttribute("afterCenteredChange", afterCenteredChange);
    }

    public Object getAfterConstrainChange() {
        return this._afterConstrainChange;
    }

    public void setAfterConstrainChange(Object afterConstrainChange) {
        this._afterConstrainChange = afterConstrainChange;

        setScopedAttribute("afterConstrainChange", afterConstrainChange);
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

    public Object getAfterFillHeightChange() {
        return this._afterFillHeightChange;
    }

    public void setAfterFillHeightChange(Object afterFillHeightChange) {
        this._afterFillHeightChange = afterFillHeightChange;

        setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
    }

    public Object getAfterFocusedChange() {
        return this._afterFocusedChange;
    }

    public void setAfterFocusedChange(Object afterFocusedChange) {
        this._afterFocusedChange = afterFocusedChange;

        setScopedAttribute("afterFocusedChange", afterFocusedChange);
    }

    public Object getAfterFooterContentChange() {
        return this._afterFooterContentChange;
    }

    public void setAfterFooterContentChange(Object afterFooterContentChange) {
        this._afterFooterContentChange = afterFooterContentChange;

        setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
    }

    public Object getAfterHeaderContentChange() {
        return this._afterHeaderContentChange;
    }

    public void setAfterHeaderContentChange(Object afterHeaderContentChange) {
        this._afterHeaderContentChange = afterHeaderContentChange;

        setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
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

    public Object getAfterOpacityChange() {
        return this._afterOpacityChange;
    }

    public void setAfterOpacityChange(Object afterOpacityChange) {
        this._afterOpacityChange = afterOpacityChange;

        setScopedAttribute("afterOpacityChange", afterOpacityChange);
    }

    public Object getAfterPreventOverlapChange() {
        return this._afterPreventOverlapChange;
    }

    public void setAfterPreventOverlapChange(Object afterPreventOverlapChange) {
        this._afterPreventOverlapChange = afterPreventOverlapChange;

        setScopedAttribute("afterPreventOverlapChange", afterPreventOverlapChange);
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

    public Object getAfterShimChange() {
        return this._afterShimChange;
    }

    public void setAfterShimChange(Object afterShimChange) {
        this._afterShimChange = afterShimChange;

        setScopedAttribute("afterShimChange", afterShimChange);
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

    public Object getAfterTargetChange() {
        return this._afterTargetChange;
    }

    public void setAfterTargetChange(Object afterTargetChange) {
        this._afterTargetChange = afterTargetChange;

        setScopedAttribute("afterTargetChange", afterTargetChange);
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

    public Object getAfterXChange() {
        return this._afterXChange;
    }

    public void setAfterXChange(Object afterXChange) {
        this._afterXChange = afterXChange;

        setScopedAttribute("afterXChange", afterXChange);
    }

    public Object getAfterXyChange() {
        return this._afterXyChange;
    }

    public void setAfterXyChange(Object afterXyChange) {
        this._afterXyChange = afterXyChange;

        setScopedAttribute("afterXyChange", afterXyChange);
    }

    public Object getAfterYChange() {
        return this._afterYChange;
    }

    public void setAfterYChange(Object afterYChange) {
        this._afterYChange = afterYChange;

        setScopedAttribute("afterYChange", afterYChange);
    }

    public Object getAfterZIndexChange() {
        return this._afterZIndexChange;
    }

    public void setAfterZIndexChange(Object afterZIndexChange) {
        this._afterZIndexChange = afterZIndexChange;

        setScopedAttribute("afterZIndexChange", afterZIndexChange);
    }

    public Object getOnAlignChange() {
        return this._onAlignChange;
    }

    public void setOnAlignChange(Object onAlignChange) {
        this._onAlignChange = onAlignChange;

        setScopedAttribute("onAlignChange", onAlignChange);
    }

    public Object getOnAlignOnChange() {
        return this._onAlignOnChange;
    }

    public void setOnAlignOnChange(Object onAlignOnChange) {
        this._onAlignOnChange = onAlignOnChange;

        setScopedAttribute("onAlignOnChange", onAlignOnChange);
    }

    public Object getOnAlignPointsChange() {
        return this._onAlignPointsChange;
    }

    public void setOnAlignPointsChange(Object onAlignPointsChange) {
        this._onAlignPointsChange = onAlignPointsChange;

        setScopedAttribute("onAlignPointsChange", onAlignPointsChange);
    }

    public Object getOnBackgroundChange() {
        return this._onBackgroundChange;
    }

    public void setOnBackgroundChange(Object onBackgroundChange) {
        this._onBackgroundChange = onBackgroundChange;

        setScopedAttribute("onBackgroundChange", onBackgroundChange);
    }

    public Object getOnBodyContentChange() {
        return this._onBodyContentChange;
    }

    public void setOnBodyContentChange(Object onBodyContentChange) {
        this._onBodyContentChange = onBodyContentChange;

        setScopedAttribute("onBodyContentChange", onBodyContentChange);
    }

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnCenteredChange() {
        return this._onCenteredChange;
    }

    public void setOnCenteredChange(Object onCenteredChange) {
        this._onCenteredChange = onCenteredChange;

        setScopedAttribute("onCenteredChange", onCenteredChange);
    }

    public Object getOnConstrainChange() {
        return this._onConstrainChange;
    }

    public void setOnConstrainChange(Object onConstrainChange) {
        this._onConstrainChange = onConstrainChange;

        setScopedAttribute("onConstrainChange", onConstrainChange);
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

    public Object getOnFillHeightChange() {
        return this._onFillHeightChange;
    }

    public void setOnFillHeightChange(Object onFillHeightChange) {
        this._onFillHeightChange = onFillHeightChange;

        setScopedAttribute("onFillHeightChange", onFillHeightChange);
    }

    public Object getOnFocusedChange() {
        return this._onFocusedChange;
    }

    public void setOnFocusedChange(Object onFocusedChange) {
        this._onFocusedChange = onFocusedChange;

        setScopedAttribute("onFocusedChange", onFocusedChange);
    }

    public Object getOnFooterContentChange() {
        return this._onFooterContentChange;
    }

    public void setOnFooterContentChange(Object onFooterContentChange) {
        this._onFooterContentChange = onFooterContentChange;

        setScopedAttribute("onFooterContentChange", onFooterContentChange);
    }

    public Object getOnHeaderContentChange() {
        return this._onHeaderContentChange;
    }

    public void setOnHeaderContentChange(Object onHeaderContentChange) {
        this._onHeaderContentChange = onHeaderContentChange;

        setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
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

    public Object getOnOpacityChange() {
        return this._onOpacityChange;
    }

    public void setOnOpacityChange(Object onOpacityChange) {
        this._onOpacityChange = onOpacityChange;

        setScopedAttribute("onOpacityChange", onOpacityChange);
    }

    public Object getOnPreventOverlapChange() {
        return this._onPreventOverlapChange;
    }

    public void setOnPreventOverlapChange(Object onPreventOverlapChange) {
        this._onPreventOverlapChange = onPreventOverlapChange;

        setScopedAttribute("onPreventOverlapChange", onPreventOverlapChange);
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

    public Object getOnShimChange() {
        return this._onShimChange;
    }

    public void setOnShimChange(Object onShimChange) {
        this._onShimChange = onShimChange;

        setScopedAttribute("onShimChange", onShimChange);
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

    public Object getOnTargetChange() {
        return this._onTargetChange;
    }

    public void setOnTargetChange(Object onTargetChange) {
        this._onTargetChange = onTargetChange;

        setScopedAttribute("onTargetChange", onTargetChange);
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

    public Object getOnXChange() {
        return this._onXChange;
    }

    public void setOnXChange(Object onXChange) {
        this._onXChange = onXChange;

        setScopedAttribute("onXChange", onXChange);
    }

    public Object getOnXyChange() {
        return this._onXyChange;
    }

    public void setOnXyChange(Object onXyChange) {
        this._onXyChange = onXyChange;

        setScopedAttribute("onXyChange", onXyChange);
    }

    public Object getOnYChange() {
        return this._onYChange;
    }

    public void setOnYChange(Object onYChange) {
        this._onYChange = onYChange;

        setScopedAttribute("onYChange", onYChange);
    }

    public Object getOnZIndexChange() {
        return this._onZIndexChange;
    }

    public void setOnZIndexChange(Object onZIndexChange) {
        this._onZIndexChange = onZIndexChange;

        setScopedAttribute("onZIndexChange", onZIndexChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._align = null;
        this._alignOn = null;
        this._alignPoints = null;
        this._background = null;
        this._overlaymaskBodyContent = null;
        this._boundingBox = null;
        this._centered = null;
        this._constrain = null;
        this._contentBox = null;
        this._cssClass = null;
        this._destroyed = false;
        this._disabled = false;
        this._fillHeight = null;
        this._focused = false;
        this._footerContent = null;
        this._headerContent = null;
        this._height = null;
        this._hideClass = "aui-helper-hidden";
        this._overlaymaskId = null;
        this._initialized = false;
        this._opacity = Double.valueOf(0.5D);
        this._preventOverlap = false;
        this._render = null;
        this._rendered = false;
        this._shim = false;
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._target = "document";
        this._useARIA = true;
        this._visible = false;
        this._width = null;
        this._x = Integer.valueOf(0);
        this._xy = null;
        this._y = Integer.valueOf(0);
        this._zIndex = Integer.valueOf(1000);
        this._afterAlignChange = null;
        this._afterAlignOnChange = null;
        this._afterAlignPointsChange = null;
        this._afterBackgroundChange = null;
        this._afterBodyContentChange = null;
        this._afterBoundingBoxChange = null;
        this._afterCenteredChange = null;
        this._afterConstrainChange = null;
        this._afterContentBoxChange = null;
        this._afterCssClassChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterFillHeightChange = null;
        this._afterFocusedChange = null;
        this._afterFooterContentChange = null;
        this._afterHeaderContentChange = null;
        this._afterHeightChange = null;
        this._afterHideClassChange = null;
        this._afterIdChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterOpacityChange = null;
        this._afterPreventOverlapChange = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterShimChange = null;
        this._afterSrcNodeChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterTargetChange = null;
        this._afterUseARIAChange = null;
        this._afterVisibleChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._afterXChange = null;
        this._afterXyChange = null;
        this._afterYChange = null;
        this._afterZIndexChange = null;
        this._onAlignChange = null;
        this._onAlignOnChange = null;
        this._onAlignPointsChange = null;
        this._onBackgroundChange = null;
        this._onBodyContentChange = null;
        this._onBoundingBoxChange = null;
        this._onCenteredChange = null;
        this._onConstrainChange = null;
        this._onContentBoxChange = null;
        this._onCssClassChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onFillHeightChange = null;
        this._onFocusedChange = null;
        this._onFooterContentChange = null;
        this._onHeaderContentChange = null;
        this._onHeightChange = null;
        this._onHideClassChange = null;
        this._onIdChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onOpacityChange = null;
        this._onPreventOverlapChange = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onShimChange = null;
        this._onSrcNodeChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onTargetChange = null;
        this._onUseARIAChange = null;
        this._onVisibleChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
        this._onXChange = null;
        this._onXyChange = null;
        this._onYChange = null;
        this._onZIndexChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/overlay_mask/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "align", this._align);
        setNamespacedAttribute(request, "alignOn", this._alignOn);
        setNamespacedAttribute(request, "alignPoints", this._alignPoints);
        setNamespacedAttribute(request, "background", this._background);
        setNamespacedAttribute(request, "overlaymaskBodyContent", this._overlaymaskBodyContent);
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "centered", this._centered);
        setNamespacedAttribute(request, "constrain", this._constrain);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "cssClass", this._cssClass);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "fillHeight", this._fillHeight);
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "footerContent", this._footerContent);
        setNamespacedAttribute(request, "headerContent", this._headerContent);
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "hideClass", this._hideClass);
        setNamespacedAttribute(request, "overlaymaskId", this._overlaymaskId);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "opacity", this._opacity);
        setNamespacedAttribute(request, "preventOverlap", Boolean.valueOf(this._preventOverlap));
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "shim", Boolean.valueOf(this._shim));
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "target", this._target);
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "x", this._x);
        setNamespacedAttribute(request, "xy", this._xy);
        setNamespacedAttribute(request, "y", this._y);
        setNamespacedAttribute(request, "zIndex", this._zIndex);
        setNamespacedAttribute(request, "afterAlignChange", this._afterAlignChange);
        setNamespacedAttribute(request, "afterAlignOnChange", this._afterAlignOnChange);
        setNamespacedAttribute(request, "afterAlignPointsChange", this._afterAlignPointsChange);
        setNamespacedAttribute(request, "afterBackgroundChange", this._afterBackgroundChange);
        setNamespacedAttribute(request, "afterBodyContentChange", this._afterBodyContentChange);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterCenteredChange", this._afterCenteredChange);
        setNamespacedAttribute(request, "afterConstrainChange", this._afterConstrainChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterFillHeightChange", this._afterFillHeightChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterFooterContentChange", this._afterFooterContentChange);
        setNamespacedAttribute(request, "afterHeaderContentChange", this._afterHeaderContentChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterOpacityChange", this._afterOpacityChange);
        setNamespacedAttribute(request, "afterPreventOverlapChange", this._afterPreventOverlapChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterShimChange", this._afterShimChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterTargetChange", this._afterTargetChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "afterXChange", this._afterXChange);
        setNamespacedAttribute(request, "afterXyChange", this._afterXyChange);
        setNamespacedAttribute(request, "afterYChange", this._afterYChange);
        setNamespacedAttribute(request, "afterZIndexChange", this._afterZIndexChange);
        setNamespacedAttribute(request, "onAlignChange", this._onAlignChange);
        setNamespacedAttribute(request, "onAlignOnChange", this._onAlignOnChange);
        setNamespacedAttribute(request, "onAlignPointsChange", this._onAlignPointsChange);
        setNamespacedAttribute(request, "onBackgroundChange", this._onBackgroundChange);
        setNamespacedAttribute(request, "onBodyContentChange", this._onBodyContentChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onCenteredChange", this._onCenteredChange);
        setNamespacedAttribute(request, "onConstrainChange", this._onConstrainChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onFillHeightChange", this._onFillHeightChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onFooterContentChange", this._onFooterContentChange);
        setNamespacedAttribute(request, "onHeaderContentChange", this._onHeaderContentChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onOpacityChange", this._onOpacityChange);
        setNamespacedAttribute(request, "onPreventOverlapChange", this._onPreventOverlapChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onShimChange", this._onShimChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onTargetChange", this._onTargetChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
        setNamespacedAttribute(request, "onXChange", this._onXChange);
        setNamespacedAttribute(request, "onXyChange", this._onXyChange);
        setNamespacedAttribute(request, "onYChange", this._onYChange);
        setNamespacedAttribute(request, "onZIndexChange", this._onZIndexChange);
    }
}
