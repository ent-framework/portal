package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseImageGalleryTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:image-gallery:";
    private static final String _PAGE = "/html/taglib/alloy/image_gallery/page.jsp";
    private Object _align = null;
    private Object _alignOn = null;
    private boolean _anim = true;
    private Object _arrowLeftEl = null;
    private Object _arrowRightEl = null;
    private boolean _autoPlay = false;
    private Object _imagegalleryBodyContent = null;
    private String _boundingBox = null;
    private String _caption = null;
    private Object _captionEl = null;
    private boolean _captionFromTitle = true;
    private boolean _centered = true;
    private Object _closeEl = null;
    private Object _constrain = null;
    private String _contentBox = null;
    private String _cssClass = null;
    private Object _currentIndex = Integer.valueOf(0);
    private Object _delay = Integer.valueOf(7000);
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private Object _fillHeight = null;
    private boolean _focused = false;
    private Object _footerContent = null;
    private Object _headerContent = null;
    private Object _height = null;
    private String _hideClass = "aui-helper-hidden";
    private String _imagegalleryId = null;
    private Object _image = null;
    private Object _imageAnim = null;
    private Object _infoEl = null;
    private String _infoTemplate = "Image {current} of {total}";
    private boolean _initialized = false;
    private Object _links = null;
    private Object _loader = null;
    private boolean _loading = false;
    private Object _loadingEl = null;
    private Object _maxHeight = Integer.valueOf(Integer.MAX_VALUE);
    private Object _maxWidth = Integer.valueOf(Integer.MAX_VALUE);
    private Object _modal = null;
    private Object _paginator = null;
    private Object _paginatorEl = null;
    private Object _paginatorInstance = null;
    private boolean _paused = false;
    private String _pausedLabel = null;
    private boolean _playing = false;
    private String _playingLabel = "(Playing)";
    private boolean _preloadAllImages = false;
    private boolean _preventOverlap = false;
    private Object _render = null;
    private boolean _rendered = false;
    private boolean _repeat = true;
    private boolean _shim = false;
    private boolean _showArrows = true;
    private boolean _showClose = true;
    private boolean _showPlayer = true;
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private Object _toolbar = null;
    private boolean _totalLinks = true;
    private boolean _useARIA = true;
    private boolean _useOriginalImage = false;
    private boolean _visible = true;
    private Object _width = null;
    private Object _x = Integer.valueOf(0);
    private Object _xy = null;
    private Object _y = Integer.valueOf(0);
    private Object _zIndex = Integer.valueOf(0);
    private Object _afterAlignChange = null;
    private Object _afterAlignOnChange = null;
    private Object _afterAnim = null;
    private Object _afterAnimChange = null;
    private Object _afterArrowLeftElChange = null;
    private Object _afterArrowRightElChange = null;
    private Object _afterAutoPlayChange = null;
    private Object _afterBodyContentChange = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterCaptionChange = null;
    private Object _afterCaptionElChange = null;
    private Object _afterCaptionFromTitleChange = null;
    private Object _afterCenteredChange = null;
    private Object _afterCloseElChange = null;
    private Object _afterConstrainChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterCssClassChange = null;
    private Object _afterCurrentIndexChange = null;
    private Object _afterDelayChange = null;
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
    private Object _afterImageAnimChange = null;
    private Object _afterImageChange = null;
    private Object _afterInfoElChange = null;
    private Object _afterInfoTemplateChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterLinksChange = null;
    private Object _afterLoad = null;
    private Object _afterLoaderChange = null;
    private Object _afterLoadingChange = null;
    private Object _afterLoadingElChange = null;
    private Object _afterMaxHeightChange = null;
    private Object _afterMaxWidthChange = null;
    private Object _afterModalChange = null;
    private Object _afterPaginatorChange = null;
    private Object _afterPaginatorElChange = null;
    private Object _afterPaginatorInstanceChange = null;
    private Object _afterPausedChange = null;
    private Object _afterPausedLabelChange = null;
    private Object _afterPlayingChange = null;
    private Object _afterPlayingLabelChange = null;
    private Object _afterPreloadAllImagesChange = null;
    private Object _afterPreventOverlapChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterRepeatChange = null;
    private Object _afterRequest = null;
    private Object _afterShimChange = null;
    private Object _afterShowArrowsChange = null;
    private Object _afterShowCloseChange = null;
    private Object _afterShowPlayerChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterToolbarChange = null;
    private Object _afterTotalLinksChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterUseOriginalImageChange = null;
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
    private Object _onAnim = null;
    private Object _onAnimChange = null;
    private Object _onArrowLeftElChange = null;
    private Object _onArrowRightElChange = null;
    private Object _onAutoPlayChange = null;
    private Object _onBodyContentChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onCaptionChange = null;
    private Object _onCaptionElChange = null;
    private Object _onCaptionFromTitleChange = null;
    private Object _onCenteredChange = null;
    private Object _onCloseElChange = null;
    private Object _onConstrainChange = null;
    private Object _onContentBoxChange = null;
    private Object _onCssClassChange = null;
    private Object _onCurrentIndexChange = null;
    private Object _onDelayChange = null;
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
    private Object _onImageAnimChange = null;
    private Object _onImageChange = null;
    private Object _onInfoElChange = null;
    private Object _onInfoTemplateChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onLinksChange = null;
    private Object _onLoad = null;
    private Object _onLoaderChange = null;
    private Object _onLoadingChange = null;
    private Object _onLoadingElChange = null;
    private Object _onMaxHeightChange = null;
    private Object _onMaxWidthChange = null;
    private Object _onModalChange = null;
    private Object _onPaginatorChange = null;
    private Object _onPaginatorElChange = null;
    private Object _onPaginatorInstanceChange = null;
    private Object _onPausedChange = null;
    private Object _onPausedLabelChange = null;
    private Object _onPlayingChange = null;
    private Object _onPlayingLabelChange = null;
    private Object _onPreloadAllImagesChange = null;
    private Object _onPreventOverlapChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onRepeatChange = null;
    private Object _onRequest = null;
    private Object _onShimChange = null;
    private Object _onShowArrowsChange = null;
    private Object _onShowCloseChange = null;
    private Object _onShowPlayerChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onToolbarChange = null;
    private Object _onTotalLinksChange = null;
    private Object _onUseARIAChange = null;
    private Object _onUseOriginalImageChange = null;
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
        setAttributeNamespace("alloy:image-gallery:");

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

    public boolean getAnim() {
        return this._anim;
    }

    public void setAnim(boolean anim) {
        this._anim = anim;

        setScopedAttribute("anim", Boolean.valueOf(anim));
    }

    public Object getArrowLeftEl() {
        return this._arrowLeftEl;
    }

    public void setArrowLeftEl(Object arrowLeftEl) {
        this._arrowLeftEl = arrowLeftEl;

        setScopedAttribute("arrowLeftEl", arrowLeftEl);
    }

    public Object getArrowRightEl() {
        return this._arrowRightEl;
    }

    public void setArrowRightEl(Object arrowRightEl) {
        this._arrowRightEl = arrowRightEl;

        setScopedAttribute("arrowRightEl", arrowRightEl);
    }

    public boolean getAutoPlay() {
        return this._autoPlay;
    }

    public void setAutoPlay(boolean autoPlay) {
        this._autoPlay = autoPlay;

        setScopedAttribute("autoPlay", Boolean.valueOf(autoPlay));
    }

    public Object getImagegalleryBodyContent() {
        return this._imagegalleryBodyContent;
    }

    public void setImagegalleryBodyContent(Object imagegalleryBodyContent) {
        this._imagegalleryBodyContent = imagegalleryBodyContent;

        setScopedAttribute("imagegalleryBodyContent", imagegalleryBodyContent);
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public String getCaption() {
        return this._caption;
    }

    public void setCaption(String caption) {
        this._caption = caption;

        setScopedAttribute("caption", caption);
    }

    public Object getCaptionEl() {
        return this._captionEl;
    }

    public void setCaptionEl(Object captionEl) {
        this._captionEl = captionEl;

        setScopedAttribute("captionEl", captionEl);
    }

    public boolean getCaptionFromTitle() {
        return this._captionFromTitle;
    }

    public void setCaptionFromTitle(boolean captionFromTitle) {
        this._captionFromTitle = captionFromTitle;

        setScopedAttribute("captionFromTitle", Boolean.valueOf(captionFromTitle));
    }

    public boolean getCentered() {
        return this._centered;
    }

    public void setCentered(boolean centered) {
        this._centered = centered;

        setScopedAttribute("centered", Boolean.valueOf(centered));
    }

    public Object getCloseEl() {
        return this._closeEl;
    }

    public void setCloseEl(Object closeEl) {
        this._closeEl = closeEl;

        setScopedAttribute("closeEl", closeEl);
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

    public Object getCurrentIndex() {
        return this._currentIndex;
    }

    public void setCurrentIndex(Object currentIndex) {
        this._currentIndex = currentIndex;

        setScopedAttribute("currentIndex", currentIndex);
    }

    public Object getDelay() {
        return this._delay;
    }

    public void setDelay(Object delay) {
        this._delay = delay;

        setScopedAttribute("delay", delay);
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

    public String getImagegalleryId() {
        return this._imagegalleryId;
    }

    public void setImagegalleryId(String imagegalleryId) {
        this._imagegalleryId = imagegalleryId;

        setScopedAttribute("imagegalleryId", imagegalleryId);
    }

    public Object getImage() {
        return this._image;
    }

    public void setImage(Object image) {
        this._image = image;

        setScopedAttribute("image", image);
    }

    public Object getImageAnim() {
        return this._imageAnim;
    }

    public void setImageAnim(Object imageAnim) {
        this._imageAnim = imageAnim;

        setScopedAttribute("imageAnim", imageAnim);
    }

    public Object getInfoEl() {
        return this._infoEl;
    }

    public void setInfoEl(Object infoEl) {
        this._infoEl = infoEl;

        setScopedAttribute("infoEl", infoEl);
    }

    public String getInfoTemplate() {
        return this._infoTemplate;
    }

    public void setInfoTemplate(String infoTemplate) {
        this._infoTemplate = infoTemplate;

        setScopedAttribute("infoTemplate", infoTemplate);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public Object getLinks() {
        return this._links;
    }

    public void setLinks(Object links) {
        this._links = links;

        setScopedAttribute("links", links);
    }

    public Object getLoader() {
        return this._loader;
    }

    public void setLoader(Object loader) {
        this._loader = loader;

        setScopedAttribute("loader", loader);
    }

    public boolean getLoading() {
        return this._loading;
    }

    public void setLoading(boolean loading) {
        this._loading = loading;

        setScopedAttribute("loading", Boolean.valueOf(loading));
    }

    public Object getLoadingEl() {
        return this._loadingEl;
    }

    public void setLoadingEl(Object loadingEl) {
        this._loadingEl = loadingEl;

        setScopedAttribute("loadingEl", loadingEl);
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

    public Object getModal() {
        return this._modal;
    }

    public void setModal(Object modal) {
        this._modal = modal;

        setScopedAttribute("modal", modal);
    }

    public Object getPaginator() {
        return this._paginator;
    }

    public void setPaginator(Object paginator) {
        this._paginator = paginator;

        setScopedAttribute("paginator", paginator);
    }

    public Object getPaginatorEl() {
        return this._paginatorEl;
    }

    public void setPaginatorEl(Object paginatorEl) {
        this._paginatorEl = paginatorEl;

        setScopedAttribute("paginatorEl", paginatorEl);
    }

    public Object getPaginatorInstance() {
        return this._paginatorInstance;
    }

    public void setPaginatorInstance(Object paginatorInstance) {
        this._paginatorInstance = paginatorInstance;

        setScopedAttribute("paginatorInstance", paginatorInstance);
    }

    public boolean getPaused() {
        return this._paused;
    }

    public void setPaused(boolean paused) {
        this._paused = paused;

        setScopedAttribute("paused", Boolean.valueOf(paused));
    }

    public String getPausedLabel() {
        return this._pausedLabel;
    }

    public void setPausedLabel(String pausedLabel) {
        this._pausedLabel = pausedLabel;

        setScopedAttribute("pausedLabel", pausedLabel);
    }

    public boolean getPlaying() {
        return this._playing;
    }

    public void setPlaying(boolean playing) {
        this._playing = playing;

        setScopedAttribute("playing", Boolean.valueOf(playing));
    }

    public String getPlayingLabel() {
        return this._playingLabel;
    }

    public void setPlayingLabel(String playingLabel) {
        this._playingLabel = playingLabel;

        setScopedAttribute("playingLabel", playingLabel);
    }

    public boolean getPreloadAllImages() {
        return this._preloadAllImages;
    }

    public void setPreloadAllImages(boolean preloadAllImages) {
        this._preloadAllImages = preloadAllImages;

        setScopedAttribute("preloadAllImages", Boolean.valueOf(preloadAllImages));
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

    public boolean getRepeat() {
        return this._repeat;
    }

    public void setRepeat(boolean repeat) {
        this._repeat = repeat;

        setScopedAttribute("repeat", Boolean.valueOf(repeat));
    }

    public boolean getShim() {
        return this._shim;
    }

    public void setShim(boolean shim) {
        this._shim = shim;

        setScopedAttribute("shim", Boolean.valueOf(shim));
    }

    public boolean getShowArrows() {
        return this._showArrows;
    }

    public void setShowArrows(boolean showArrows) {
        this._showArrows = showArrows;

        setScopedAttribute("showArrows", Boolean.valueOf(showArrows));
    }

    public boolean getShowClose() {
        return this._showClose;
    }

    public void setShowClose(boolean showClose) {
        this._showClose = showClose;

        setScopedAttribute("showClose", Boolean.valueOf(showClose));
    }

    public boolean getShowPlayer() {
        return this._showPlayer;
    }

    public void setShowPlayer(boolean showPlayer) {
        this._showPlayer = showPlayer;

        setScopedAttribute("showPlayer", Boolean.valueOf(showPlayer));
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

    public Object getToolbar() {
        return this._toolbar;
    }

    public void setToolbar(Object toolbar) {
        this._toolbar = toolbar;

        setScopedAttribute("toolbar", toolbar);
    }

    public boolean getTotalLinks() {
        return this._totalLinks;
    }

    public void setTotalLinks(boolean totalLinks) {
        this._totalLinks = totalLinks;

        setScopedAttribute("totalLinks", Boolean.valueOf(totalLinks));
    }

    public boolean getUseARIA() {
        return this._useARIA;
    }

    public void setUseARIA(boolean useARIA) {
        this._useARIA = useARIA;

        setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
    }

    public boolean getUseOriginalImage() {
        return this._useOriginalImage;
    }

    public void setUseOriginalImage(boolean useOriginalImage) {
        this._useOriginalImage = useOriginalImage;

        setScopedAttribute("useOriginalImage", Boolean.valueOf(useOriginalImage));
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

    public Object getAfterAnim() {
        return this._afterAnim;
    }

    public void setAfterAnim(Object afterAnim) {
        this._afterAnim = afterAnim;

        setScopedAttribute("afterAnim", afterAnim);
    }

    public Object getAfterAnimChange() {
        return this._afterAnimChange;
    }

    public void setAfterAnimChange(Object afterAnimChange) {
        this._afterAnimChange = afterAnimChange;

        setScopedAttribute("afterAnimChange", afterAnimChange);
    }

    public Object getAfterArrowLeftElChange() {
        return this._afterArrowLeftElChange;
    }

    public void setAfterArrowLeftElChange(Object afterArrowLeftElChange) {
        this._afterArrowLeftElChange = afterArrowLeftElChange;

        setScopedAttribute("afterArrowLeftElChange", afterArrowLeftElChange);
    }

    public Object getAfterArrowRightElChange() {
        return this._afterArrowRightElChange;
    }

    public void setAfterArrowRightElChange(Object afterArrowRightElChange) {
        this._afterArrowRightElChange = afterArrowRightElChange;

        setScopedAttribute("afterArrowRightElChange", afterArrowRightElChange);
    }

    public Object getAfterAutoPlayChange() {
        return this._afterAutoPlayChange;
    }

    public void setAfterAutoPlayChange(Object afterAutoPlayChange) {
        this._afterAutoPlayChange = afterAutoPlayChange;

        setScopedAttribute("afterAutoPlayChange", afterAutoPlayChange);
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

    public Object getAfterCaptionChange() {
        return this._afterCaptionChange;
    }

    public void setAfterCaptionChange(Object afterCaptionChange) {
        this._afterCaptionChange = afterCaptionChange;

        setScopedAttribute("afterCaptionChange", afterCaptionChange);
    }

    public Object getAfterCaptionElChange() {
        return this._afterCaptionElChange;
    }

    public void setAfterCaptionElChange(Object afterCaptionElChange) {
        this._afterCaptionElChange = afterCaptionElChange;

        setScopedAttribute("afterCaptionElChange", afterCaptionElChange);
    }

    public Object getAfterCaptionFromTitleChange() {
        return this._afterCaptionFromTitleChange;
    }

    public void setAfterCaptionFromTitleChange(Object afterCaptionFromTitleChange) {
        this._afterCaptionFromTitleChange = afterCaptionFromTitleChange;

        setScopedAttribute("afterCaptionFromTitleChange", afterCaptionFromTitleChange);
    }

    public Object getAfterCenteredChange() {
        return this._afterCenteredChange;
    }

    public void setAfterCenteredChange(Object afterCenteredChange) {
        this._afterCenteredChange = afterCenteredChange;

        setScopedAttribute("afterCenteredChange", afterCenteredChange);
    }

    public Object getAfterCloseElChange() {
        return this._afterCloseElChange;
    }

    public void setAfterCloseElChange(Object afterCloseElChange) {
        this._afterCloseElChange = afterCloseElChange;

        setScopedAttribute("afterCloseElChange", afterCloseElChange);
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

    public Object getAfterCurrentIndexChange() {
        return this._afterCurrentIndexChange;
    }

    public void setAfterCurrentIndexChange(Object afterCurrentIndexChange) {
        this._afterCurrentIndexChange = afterCurrentIndexChange;

        setScopedAttribute("afterCurrentIndexChange", afterCurrentIndexChange);
    }

    public Object getAfterDelayChange() {
        return this._afterDelayChange;
    }

    public void setAfterDelayChange(Object afterDelayChange) {
        this._afterDelayChange = afterDelayChange;

        setScopedAttribute("afterDelayChange", afterDelayChange);
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

    public Object getAfterImageAnimChange() {
        return this._afterImageAnimChange;
    }

    public void setAfterImageAnimChange(Object afterImageAnimChange) {
        this._afterImageAnimChange = afterImageAnimChange;

        setScopedAttribute("afterImageAnimChange", afterImageAnimChange);
    }

    public Object getAfterImageChange() {
        return this._afterImageChange;
    }

    public void setAfterImageChange(Object afterImageChange) {
        this._afterImageChange = afterImageChange;

        setScopedAttribute("afterImageChange", afterImageChange);
    }

    public Object getAfterInfoElChange() {
        return this._afterInfoElChange;
    }

    public void setAfterInfoElChange(Object afterInfoElChange) {
        this._afterInfoElChange = afterInfoElChange;

        setScopedAttribute("afterInfoElChange", afterInfoElChange);
    }

    public Object getAfterInfoTemplateChange() {
        return this._afterInfoTemplateChange;
    }

    public void setAfterInfoTemplateChange(Object afterInfoTemplateChange) {
        this._afterInfoTemplateChange = afterInfoTemplateChange;

        setScopedAttribute("afterInfoTemplateChange", afterInfoTemplateChange);
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

    public Object getAfterLinksChange() {
        return this._afterLinksChange;
    }

    public void setAfterLinksChange(Object afterLinksChange) {
        this._afterLinksChange = afterLinksChange;

        setScopedAttribute("afterLinksChange", afterLinksChange);
    }

    public Object getAfterLoad() {
        return this._afterLoad;
    }

    public void setAfterLoad(Object afterLoad) {
        this._afterLoad = afterLoad;

        setScopedAttribute("afterLoad", afterLoad);
    }

    public Object getAfterLoaderChange() {
        return this._afterLoaderChange;
    }

    public void setAfterLoaderChange(Object afterLoaderChange) {
        this._afterLoaderChange = afterLoaderChange;

        setScopedAttribute("afterLoaderChange", afterLoaderChange);
    }

    public Object getAfterLoadingChange() {
        return this._afterLoadingChange;
    }

    public void setAfterLoadingChange(Object afterLoadingChange) {
        this._afterLoadingChange = afterLoadingChange;

        setScopedAttribute("afterLoadingChange", afterLoadingChange);
    }

    public Object getAfterLoadingElChange() {
        return this._afterLoadingElChange;
    }

    public void setAfterLoadingElChange(Object afterLoadingElChange) {
        this._afterLoadingElChange = afterLoadingElChange;

        setScopedAttribute("afterLoadingElChange", afterLoadingElChange);
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

    public Object getAfterModalChange() {
        return this._afterModalChange;
    }

    public void setAfterModalChange(Object afterModalChange) {
        this._afterModalChange = afterModalChange;

        setScopedAttribute("afterModalChange", afterModalChange);
    }

    public Object getAfterPaginatorChange() {
        return this._afterPaginatorChange;
    }

    public void setAfterPaginatorChange(Object afterPaginatorChange) {
        this._afterPaginatorChange = afterPaginatorChange;

        setScopedAttribute("afterPaginatorChange", afterPaginatorChange);
    }

    public Object getAfterPaginatorElChange() {
        return this._afterPaginatorElChange;
    }

    public void setAfterPaginatorElChange(Object afterPaginatorElChange) {
        this._afterPaginatorElChange = afterPaginatorElChange;

        setScopedAttribute("afterPaginatorElChange", afterPaginatorElChange);
    }

    public Object getAfterPaginatorInstanceChange() {
        return this._afterPaginatorInstanceChange;
    }

    public void setAfterPaginatorInstanceChange(Object afterPaginatorInstanceChange) {
        this._afterPaginatorInstanceChange = afterPaginatorInstanceChange;

        setScopedAttribute("afterPaginatorInstanceChange", afterPaginatorInstanceChange);
    }

    public Object getAfterPausedChange() {
        return this._afterPausedChange;
    }

    public void setAfterPausedChange(Object afterPausedChange) {
        this._afterPausedChange = afterPausedChange;

        setScopedAttribute("afterPausedChange", afterPausedChange);
    }

    public Object getAfterPausedLabelChange() {
        return this._afterPausedLabelChange;
    }

    public void setAfterPausedLabelChange(Object afterPausedLabelChange) {
        this._afterPausedLabelChange = afterPausedLabelChange;

        setScopedAttribute("afterPausedLabelChange", afterPausedLabelChange);
    }

    public Object getAfterPlayingChange() {
        return this._afterPlayingChange;
    }

    public void setAfterPlayingChange(Object afterPlayingChange) {
        this._afterPlayingChange = afterPlayingChange;

        setScopedAttribute("afterPlayingChange", afterPlayingChange);
    }

    public Object getAfterPlayingLabelChange() {
        return this._afterPlayingLabelChange;
    }

    public void setAfterPlayingLabelChange(Object afterPlayingLabelChange) {
        this._afterPlayingLabelChange = afterPlayingLabelChange;

        setScopedAttribute("afterPlayingLabelChange", afterPlayingLabelChange);
    }

    public Object getAfterPreloadAllImagesChange() {
        return this._afterPreloadAllImagesChange;
    }

    public void setAfterPreloadAllImagesChange(Object afterPreloadAllImagesChange) {
        this._afterPreloadAllImagesChange = afterPreloadAllImagesChange;

        setScopedAttribute("afterPreloadAllImagesChange", afterPreloadAllImagesChange);
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

    public Object getAfterRepeatChange() {
        return this._afterRepeatChange;
    }

    public void setAfterRepeatChange(Object afterRepeatChange) {
        this._afterRepeatChange = afterRepeatChange;

        setScopedAttribute("afterRepeatChange", afterRepeatChange);
    }

    public Object getAfterRequest() {
        return this._afterRequest;
    }

    public void setAfterRequest(Object afterRequest) {
        this._afterRequest = afterRequest;

        setScopedAttribute("afterRequest", afterRequest);
    }

    public Object getAfterShimChange() {
        return this._afterShimChange;
    }

    public void setAfterShimChange(Object afterShimChange) {
        this._afterShimChange = afterShimChange;

        setScopedAttribute("afterShimChange", afterShimChange);
    }

    public Object getAfterShowArrowsChange() {
        return this._afterShowArrowsChange;
    }

    public void setAfterShowArrowsChange(Object afterShowArrowsChange) {
        this._afterShowArrowsChange = afterShowArrowsChange;

        setScopedAttribute("afterShowArrowsChange", afterShowArrowsChange);
    }

    public Object getAfterShowCloseChange() {
        return this._afterShowCloseChange;
    }

    public void setAfterShowCloseChange(Object afterShowCloseChange) {
        this._afterShowCloseChange = afterShowCloseChange;

        setScopedAttribute("afterShowCloseChange", afterShowCloseChange);
    }

    public Object getAfterShowPlayerChange() {
        return this._afterShowPlayerChange;
    }

    public void setAfterShowPlayerChange(Object afterShowPlayerChange) {
        this._afterShowPlayerChange = afterShowPlayerChange;

        setScopedAttribute("afterShowPlayerChange", afterShowPlayerChange);
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

    public Object getAfterToolbarChange() {
        return this._afterToolbarChange;
    }

    public void setAfterToolbarChange(Object afterToolbarChange) {
        this._afterToolbarChange = afterToolbarChange;

        setScopedAttribute("afterToolbarChange", afterToolbarChange);
    }

    public Object getAfterTotalLinksChange() {
        return this._afterTotalLinksChange;
    }

    public void setAfterTotalLinksChange(Object afterTotalLinksChange) {
        this._afterTotalLinksChange = afterTotalLinksChange;

        setScopedAttribute("afterTotalLinksChange", afterTotalLinksChange);
    }

    public Object getAfterUseARIAChange() {
        return this._afterUseARIAChange;
    }

    public void setAfterUseARIAChange(Object afterUseARIAChange) {
        this._afterUseARIAChange = afterUseARIAChange;

        setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
    }

    public Object getAfterUseOriginalImageChange() {
        return this._afterUseOriginalImageChange;
    }

    public void setAfterUseOriginalImageChange(Object afterUseOriginalImageChange) {
        this._afterUseOriginalImageChange = afterUseOriginalImageChange;

        setScopedAttribute("afterUseOriginalImageChange", afterUseOriginalImageChange);
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

    public Object getOnAnim() {
        return this._onAnim;
    }

    public void setOnAnim(Object onAnim) {
        this._onAnim = onAnim;

        setScopedAttribute("onAnim", onAnim);
    }

    public Object getOnAnimChange() {
        return this._onAnimChange;
    }

    public void setOnAnimChange(Object onAnimChange) {
        this._onAnimChange = onAnimChange;

        setScopedAttribute("onAnimChange", onAnimChange);
    }

    public Object getOnArrowLeftElChange() {
        return this._onArrowLeftElChange;
    }

    public void setOnArrowLeftElChange(Object onArrowLeftElChange) {
        this._onArrowLeftElChange = onArrowLeftElChange;

        setScopedAttribute("onArrowLeftElChange", onArrowLeftElChange);
    }

    public Object getOnArrowRightElChange() {
        return this._onArrowRightElChange;
    }

    public void setOnArrowRightElChange(Object onArrowRightElChange) {
        this._onArrowRightElChange = onArrowRightElChange;

        setScopedAttribute("onArrowRightElChange", onArrowRightElChange);
    }

    public Object getOnAutoPlayChange() {
        return this._onAutoPlayChange;
    }

    public void setOnAutoPlayChange(Object onAutoPlayChange) {
        this._onAutoPlayChange = onAutoPlayChange;

        setScopedAttribute("onAutoPlayChange", onAutoPlayChange);
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

    public Object getOnCaptionChange() {
        return this._onCaptionChange;
    }

    public void setOnCaptionChange(Object onCaptionChange) {
        this._onCaptionChange = onCaptionChange;

        setScopedAttribute("onCaptionChange", onCaptionChange);
    }

    public Object getOnCaptionElChange() {
        return this._onCaptionElChange;
    }

    public void setOnCaptionElChange(Object onCaptionElChange) {
        this._onCaptionElChange = onCaptionElChange;

        setScopedAttribute("onCaptionElChange", onCaptionElChange);
    }

    public Object getOnCaptionFromTitleChange() {
        return this._onCaptionFromTitleChange;
    }

    public void setOnCaptionFromTitleChange(Object onCaptionFromTitleChange) {
        this._onCaptionFromTitleChange = onCaptionFromTitleChange;

        setScopedAttribute("onCaptionFromTitleChange", onCaptionFromTitleChange);
    }

    public Object getOnCenteredChange() {
        return this._onCenteredChange;
    }

    public void setOnCenteredChange(Object onCenteredChange) {
        this._onCenteredChange = onCenteredChange;

        setScopedAttribute("onCenteredChange", onCenteredChange);
    }

    public Object getOnCloseElChange() {
        return this._onCloseElChange;
    }

    public void setOnCloseElChange(Object onCloseElChange) {
        this._onCloseElChange = onCloseElChange;

        setScopedAttribute("onCloseElChange", onCloseElChange);
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

    public Object getOnCurrentIndexChange() {
        return this._onCurrentIndexChange;
    }

    public void setOnCurrentIndexChange(Object onCurrentIndexChange) {
        this._onCurrentIndexChange = onCurrentIndexChange;

        setScopedAttribute("onCurrentIndexChange", onCurrentIndexChange);
    }

    public Object getOnDelayChange() {
        return this._onDelayChange;
    }

    public void setOnDelayChange(Object onDelayChange) {
        this._onDelayChange = onDelayChange;

        setScopedAttribute("onDelayChange", onDelayChange);
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

    public Object getOnImageAnimChange() {
        return this._onImageAnimChange;
    }

    public void setOnImageAnimChange(Object onImageAnimChange) {
        this._onImageAnimChange = onImageAnimChange;

        setScopedAttribute("onImageAnimChange", onImageAnimChange);
    }

    public Object getOnImageChange() {
        return this._onImageChange;
    }

    public void setOnImageChange(Object onImageChange) {
        this._onImageChange = onImageChange;

        setScopedAttribute("onImageChange", onImageChange);
    }

    public Object getOnInfoElChange() {
        return this._onInfoElChange;
    }

    public void setOnInfoElChange(Object onInfoElChange) {
        this._onInfoElChange = onInfoElChange;

        setScopedAttribute("onInfoElChange", onInfoElChange);
    }

    public Object getOnInfoTemplateChange() {
        return this._onInfoTemplateChange;
    }

    public void setOnInfoTemplateChange(Object onInfoTemplateChange) {
        this._onInfoTemplateChange = onInfoTemplateChange;

        setScopedAttribute("onInfoTemplateChange", onInfoTemplateChange);
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

    public Object getOnLinksChange() {
        return this._onLinksChange;
    }

    public void setOnLinksChange(Object onLinksChange) {
        this._onLinksChange = onLinksChange;

        setScopedAttribute("onLinksChange", onLinksChange);
    }

    public Object getOnLoad() {
        return this._onLoad;
    }

    public void setOnLoad(Object onLoad) {
        this._onLoad = onLoad;

        setScopedAttribute("onLoad", onLoad);
    }

    public Object getOnLoaderChange() {
        return this._onLoaderChange;
    }

    public void setOnLoaderChange(Object onLoaderChange) {
        this._onLoaderChange = onLoaderChange;

        setScopedAttribute("onLoaderChange", onLoaderChange);
    }

    public Object getOnLoadingChange() {
        return this._onLoadingChange;
    }

    public void setOnLoadingChange(Object onLoadingChange) {
        this._onLoadingChange = onLoadingChange;

        setScopedAttribute("onLoadingChange", onLoadingChange);
    }

    public Object getOnLoadingElChange() {
        return this._onLoadingElChange;
    }

    public void setOnLoadingElChange(Object onLoadingElChange) {
        this._onLoadingElChange = onLoadingElChange;

        setScopedAttribute("onLoadingElChange", onLoadingElChange);
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

    public Object getOnModalChange() {
        return this._onModalChange;
    }

    public void setOnModalChange(Object onModalChange) {
        this._onModalChange = onModalChange;

        setScopedAttribute("onModalChange", onModalChange);
    }

    public Object getOnPaginatorChange() {
        return this._onPaginatorChange;
    }

    public void setOnPaginatorChange(Object onPaginatorChange) {
        this._onPaginatorChange = onPaginatorChange;

        setScopedAttribute("onPaginatorChange", onPaginatorChange);
    }

    public Object getOnPaginatorElChange() {
        return this._onPaginatorElChange;
    }

    public void setOnPaginatorElChange(Object onPaginatorElChange) {
        this._onPaginatorElChange = onPaginatorElChange;

        setScopedAttribute("onPaginatorElChange", onPaginatorElChange);
    }

    public Object getOnPaginatorInstanceChange() {
        return this._onPaginatorInstanceChange;
    }

    public void setOnPaginatorInstanceChange(Object onPaginatorInstanceChange) {
        this._onPaginatorInstanceChange = onPaginatorInstanceChange;

        setScopedAttribute("onPaginatorInstanceChange", onPaginatorInstanceChange);
    }

    public Object getOnPausedChange() {
        return this._onPausedChange;
    }

    public void setOnPausedChange(Object onPausedChange) {
        this._onPausedChange = onPausedChange;

        setScopedAttribute("onPausedChange", onPausedChange);
    }

    public Object getOnPausedLabelChange() {
        return this._onPausedLabelChange;
    }

    public void setOnPausedLabelChange(Object onPausedLabelChange) {
        this._onPausedLabelChange = onPausedLabelChange;

        setScopedAttribute("onPausedLabelChange", onPausedLabelChange);
    }

    public Object getOnPlayingChange() {
        return this._onPlayingChange;
    }

    public void setOnPlayingChange(Object onPlayingChange) {
        this._onPlayingChange = onPlayingChange;

        setScopedAttribute("onPlayingChange", onPlayingChange);
    }

    public Object getOnPlayingLabelChange() {
        return this._onPlayingLabelChange;
    }

    public void setOnPlayingLabelChange(Object onPlayingLabelChange) {
        this._onPlayingLabelChange = onPlayingLabelChange;

        setScopedAttribute("onPlayingLabelChange", onPlayingLabelChange);
    }

    public Object getOnPreloadAllImagesChange() {
        return this._onPreloadAllImagesChange;
    }

    public void setOnPreloadAllImagesChange(Object onPreloadAllImagesChange) {
        this._onPreloadAllImagesChange = onPreloadAllImagesChange;

        setScopedAttribute("onPreloadAllImagesChange", onPreloadAllImagesChange);
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

    public Object getOnRepeatChange() {
        return this._onRepeatChange;
    }

    public void setOnRepeatChange(Object onRepeatChange) {
        this._onRepeatChange = onRepeatChange;

        setScopedAttribute("onRepeatChange", onRepeatChange);
    }

    public Object getOnRequest() {
        return this._onRequest;
    }

    public void setOnRequest(Object onRequest) {
        this._onRequest = onRequest;

        setScopedAttribute("onRequest", onRequest);
    }

    public Object getOnShimChange() {
        return this._onShimChange;
    }

    public void setOnShimChange(Object onShimChange) {
        this._onShimChange = onShimChange;

        setScopedAttribute("onShimChange", onShimChange);
    }

    public Object getOnShowArrowsChange() {
        return this._onShowArrowsChange;
    }

    public void setOnShowArrowsChange(Object onShowArrowsChange) {
        this._onShowArrowsChange = onShowArrowsChange;

        setScopedAttribute("onShowArrowsChange", onShowArrowsChange);
    }

    public Object getOnShowCloseChange() {
        return this._onShowCloseChange;
    }

    public void setOnShowCloseChange(Object onShowCloseChange) {
        this._onShowCloseChange = onShowCloseChange;

        setScopedAttribute("onShowCloseChange", onShowCloseChange);
    }

    public Object getOnShowPlayerChange() {
        return this._onShowPlayerChange;
    }

    public void setOnShowPlayerChange(Object onShowPlayerChange) {
        this._onShowPlayerChange = onShowPlayerChange;

        setScopedAttribute("onShowPlayerChange", onShowPlayerChange);
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

    public Object getOnToolbarChange() {
        return this._onToolbarChange;
    }

    public void setOnToolbarChange(Object onToolbarChange) {
        this._onToolbarChange = onToolbarChange;

        setScopedAttribute("onToolbarChange", onToolbarChange);
    }

    public Object getOnTotalLinksChange() {
        return this._onTotalLinksChange;
    }

    public void setOnTotalLinksChange(Object onTotalLinksChange) {
        this._onTotalLinksChange = onTotalLinksChange;

        setScopedAttribute("onTotalLinksChange", onTotalLinksChange);
    }

    public Object getOnUseARIAChange() {
        return this._onUseARIAChange;
    }

    public void setOnUseARIAChange(Object onUseARIAChange) {
        this._onUseARIAChange = onUseARIAChange;

        setScopedAttribute("onUseARIAChange", onUseARIAChange);
    }

    public Object getOnUseOriginalImageChange() {
        return this._onUseOriginalImageChange;
    }

    public void setOnUseOriginalImageChange(Object onUseOriginalImageChange) {
        this._onUseOriginalImageChange = onUseOriginalImageChange;

        setScopedAttribute("onUseOriginalImageChange", onUseOriginalImageChange);
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
        this._anim = true;
        this._arrowLeftEl = null;
        this._arrowRightEl = null;
        this._autoPlay = false;
        this._imagegalleryBodyContent = null;
        this._boundingBox = null;
        this._caption = null;
        this._captionEl = null;
        this._captionFromTitle = true;
        this._centered = true;
        this._closeEl = null;
        this._constrain = null;
        this._contentBox = null;
        this._cssClass = null;
        this._currentIndex = Integer.valueOf(0);
        this._delay = Integer.valueOf(7000);
        this._destroyed = false;
        this._disabled = false;
        this._fillHeight = null;
        this._focused = false;
        this._footerContent = null;
        this._headerContent = null;
        this._height = null;
        this._hideClass = "aui-helper-hidden";
        this._imagegalleryId = null;
        this._image = null;
        this._imageAnim = null;
        this._infoEl = null;
        this._infoTemplate = "Image {current} of {total}";
        this._initialized = false;
        this._links = null;
        this._loader = null;
        this._loading = false;
        this._loadingEl = null;
        this._maxHeight = Integer.valueOf(Integer.MAX_VALUE);
        this._maxWidth = Integer.valueOf(Integer.MAX_VALUE);
        this._modal = null;
        this._paginator = null;
        this._paginatorEl = null;
        this._paginatorInstance = null;
        this._paused = false;
        this._pausedLabel = null;
        this._playing = false;
        this._playingLabel = "(Playing)";
        this._preloadAllImages = false;
        this._preventOverlap = false;
        this._render = null;
        this._rendered = false;
        this._repeat = true;
        this._shim = false;
        this._showArrows = true;
        this._showClose = true;
        this._showPlayer = true;
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._toolbar = null;
        this._totalLinks = true;
        this._useARIA = true;
        this._useOriginalImage = false;
        this._visible = true;
        this._width = null;
        this._x = Integer.valueOf(0);
        this._xy = null;
        this._y = Integer.valueOf(0);
        this._zIndex = Integer.valueOf(0);
        this._afterAlignChange = null;
        this._afterAlignOnChange = null;
        this._afterAnim = null;
        this._afterAnimChange = null;
        this._afterArrowLeftElChange = null;
        this._afterArrowRightElChange = null;
        this._afterAutoPlayChange = null;
        this._afterBodyContentChange = null;
        this._afterBoundingBoxChange = null;
        this._afterCaptionChange = null;
        this._afterCaptionElChange = null;
        this._afterCaptionFromTitleChange = null;
        this._afterCenteredChange = null;
        this._afterCloseElChange = null;
        this._afterConstrainChange = null;
        this._afterContentBoxChange = null;
        this._afterCssClassChange = null;
        this._afterCurrentIndexChange = null;
        this._afterDelayChange = null;
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
        this._afterImageAnimChange = null;
        this._afterImageChange = null;
        this._afterInfoElChange = null;
        this._afterInfoTemplateChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterLinksChange = null;
        this._afterLoad = null;
        this._afterLoaderChange = null;
        this._afterLoadingChange = null;
        this._afterLoadingElChange = null;
        this._afterMaxHeightChange = null;
        this._afterMaxWidthChange = null;
        this._afterModalChange = null;
        this._afterPaginatorChange = null;
        this._afterPaginatorElChange = null;
        this._afterPaginatorInstanceChange = null;
        this._afterPausedChange = null;
        this._afterPausedLabelChange = null;
        this._afterPlayingChange = null;
        this._afterPlayingLabelChange = null;
        this._afterPreloadAllImagesChange = null;
        this._afterPreventOverlapChange = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterRepeatChange = null;
        this._afterRequest = null;
        this._afterShimChange = null;
        this._afterShowArrowsChange = null;
        this._afterShowCloseChange = null;
        this._afterShowPlayerChange = null;
        this._afterSrcNodeChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterToolbarChange = null;
        this._afterTotalLinksChange = null;
        this._afterUseARIAChange = null;
        this._afterUseOriginalImageChange = null;
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
        this._onAnim = null;
        this._onAnimChange = null;
        this._onArrowLeftElChange = null;
        this._onArrowRightElChange = null;
        this._onAutoPlayChange = null;
        this._onBodyContentChange = null;
        this._onBoundingBoxChange = null;
        this._onCaptionChange = null;
        this._onCaptionElChange = null;
        this._onCaptionFromTitleChange = null;
        this._onCenteredChange = null;
        this._onCloseElChange = null;
        this._onConstrainChange = null;
        this._onContentBoxChange = null;
        this._onCssClassChange = null;
        this._onCurrentIndexChange = null;
        this._onDelayChange = null;
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
        this._onImageAnimChange = null;
        this._onImageChange = null;
        this._onInfoElChange = null;
        this._onInfoTemplateChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onLinksChange = null;
        this._onLoad = null;
        this._onLoaderChange = null;
        this._onLoadingChange = null;
        this._onLoadingElChange = null;
        this._onMaxHeightChange = null;
        this._onMaxWidthChange = null;
        this._onModalChange = null;
        this._onPaginatorChange = null;
        this._onPaginatorElChange = null;
        this._onPaginatorInstanceChange = null;
        this._onPausedChange = null;
        this._onPausedLabelChange = null;
        this._onPlayingChange = null;
        this._onPlayingLabelChange = null;
        this._onPreloadAllImagesChange = null;
        this._onPreventOverlapChange = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onRepeatChange = null;
        this._onRequest = null;
        this._onShimChange = null;
        this._onShowArrowsChange = null;
        this._onShowCloseChange = null;
        this._onShowPlayerChange = null;
        this._onSrcNodeChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onToolbarChange = null;
        this._onTotalLinksChange = null;
        this._onUseARIAChange = null;
        this._onUseOriginalImageChange = null;
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
        return "/html/taglib/alloy/image_gallery/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "align", this._align);
        setNamespacedAttribute(request, "alignOn", this._alignOn);
        setNamespacedAttribute(request, "anim", Boolean.valueOf(this._anim));
        setNamespacedAttribute(request, "arrowLeftEl", this._arrowLeftEl);
        setNamespacedAttribute(request, "arrowRightEl", this._arrowRightEl);
        setNamespacedAttribute(request, "autoPlay", Boolean.valueOf(this._autoPlay));
        setNamespacedAttribute(request, "imagegalleryBodyContent", this._imagegalleryBodyContent);
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "caption", this._caption);
        setNamespacedAttribute(request, "captionEl", this._captionEl);
        setNamespacedAttribute(request, "captionFromTitle", Boolean.valueOf(this._captionFromTitle));
        setNamespacedAttribute(request, "centered", Boolean.valueOf(this._centered));
        setNamespacedAttribute(request, "closeEl", this._closeEl);
        setNamespacedAttribute(request, "constrain", this._constrain);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "cssClass", this._cssClass);
        setNamespacedAttribute(request, "currentIndex", this._currentIndex);
        setNamespacedAttribute(request, "delay", this._delay);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "fillHeight", this._fillHeight);
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "footerContent", this._footerContent);
        setNamespacedAttribute(request, "headerContent", this._headerContent);
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "hideClass", this._hideClass);
        setNamespacedAttribute(request, "imagegalleryId", this._imagegalleryId);
        setNamespacedAttribute(request, "image", this._image);
        setNamespacedAttribute(request, "imageAnim", this._imageAnim);
        setNamespacedAttribute(request, "infoEl", this._infoEl);
        setNamespacedAttribute(request, "infoTemplate", this._infoTemplate);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "links", this._links);
        setNamespacedAttribute(request, "loader", this._loader);
        setNamespacedAttribute(request, "loading", Boolean.valueOf(this._loading));
        setNamespacedAttribute(request, "loadingEl", this._loadingEl);
        setNamespacedAttribute(request, "maxHeight", this._maxHeight);
        setNamespacedAttribute(request, "maxWidth", this._maxWidth);
        setNamespacedAttribute(request, "modal", this._modal);
        setNamespacedAttribute(request, "paginator", this._paginator);
        setNamespacedAttribute(request, "paginatorEl", this._paginatorEl);
        setNamespacedAttribute(request, "paginatorInstance", this._paginatorInstance);
        setNamespacedAttribute(request, "paused", Boolean.valueOf(this._paused));
        setNamespacedAttribute(request, "pausedLabel", this._pausedLabel);
        setNamespacedAttribute(request, "playing", Boolean.valueOf(this._playing));
        setNamespacedAttribute(request, "playingLabel", this._playingLabel);
        setNamespacedAttribute(request, "preloadAllImages", Boolean.valueOf(this._preloadAllImages));
        setNamespacedAttribute(request, "preventOverlap", Boolean.valueOf(this._preventOverlap));
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "repeat", Boolean.valueOf(this._repeat));
        setNamespacedAttribute(request, "shim", Boolean.valueOf(this._shim));
        setNamespacedAttribute(request, "showArrows", Boolean.valueOf(this._showArrows));
        setNamespacedAttribute(request, "showClose", Boolean.valueOf(this._showClose));
        setNamespacedAttribute(request, "showPlayer", Boolean.valueOf(this._showPlayer));
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "toolbar", this._toolbar);
        setNamespacedAttribute(request, "totalLinks", Boolean.valueOf(this._totalLinks));
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "useOriginalImage", Boolean.valueOf(this._useOriginalImage));
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "x", this._x);
        setNamespacedAttribute(request, "xy", this._xy);
        setNamespacedAttribute(request, "y", this._y);
        setNamespacedAttribute(request, "zIndex", this._zIndex);
        setNamespacedAttribute(request, "afterAlignChange", this._afterAlignChange);
        setNamespacedAttribute(request, "afterAlignOnChange", this._afterAlignOnChange);
        setNamespacedAttribute(request, "afterAnim", this._afterAnim);
        setNamespacedAttribute(request, "afterAnimChange", this._afterAnimChange);
        setNamespacedAttribute(request, "afterArrowLeftElChange", this._afterArrowLeftElChange);
        setNamespacedAttribute(request, "afterArrowRightElChange", this._afterArrowRightElChange);
        setNamespacedAttribute(request, "afterAutoPlayChange", this._afterAutoPlayChange);
        setNamespacedAttribute(request, "afterBodyContentChange", this._afterBodyContentChange);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterCaptionChange", this._afterCaptionChange);
        setNamespacedAttribute(request, "afterCaptionElChange", this._afterCaptionElChange);
        setNamespacedAttribute(request, "afterCaptionFromTitleChange", this._afterCaptionFromTitleChange);
        setNamespacedAttribute(request, "afterCenteredChange", this._afterCenteredChange);
        setNamespacedAttribute(request, "afterCloseElChange", this._afterCloseElChange);
        setNamespacedAttribute(request, "afterConstrainChange", this._afterConstrainChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
        setNamespacedAttribute(request, "afterCurrentIndexChange", this._afterCurrentIndexChange);
        setNamespacedAttribute(request, "afterDelayChange", this._afterDelayChange);
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
        setNamespacedAttribute(request, "afterImageAnimChange", this._afterImageAnimChange);
        setNamespacedAttribute(request, "afterImageChange", this._afterImageChange);
        setNamespacedAttribute(request, "afterInfoElChange", this._afterInfoElChange);
        setNamespacedAttribute(request, "afterInfoTemplateChange", this._afterInfoTemplateChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterLinksChange", this._afterLinksChange);
        setNamespacedAttribute(request, "afterLoad", this._afterLoad);
        setNamespacedAttribute(request, "afterLoaderChange", this._afterLoaderChange);
        setNamespacedAttribute(request, "afterLoadingChange", this._afterLoadingChange);
        setNamespacedAttribute(request, "afterLoadingElChange", this._afterLoadingElChange);
        setNamespacedAttribute(request, "afterMaxHeightChange", this._afterMaxHeightChange);
        setNamespacedAttribute(request, "afterMaxWidthChange", this._afterMaxWidthChange);
        setNamespacedAttribute(request, "afterModalChange", this._afterModalChange);
        setNamespacedAttribute(request, "afterPaginatorChange", this._afterPaginatorChange);
        setNamespacedAttribute(request, "afterPaginatorElChange", this._afterPaginatorElChange);
        setNamespacedAttribute(request, "afterPaginatorInstanceChange", this._afterPaginatorInstanceChange);
        setNamespacedAttribute(request, "afterPausedChange", this._afterPausedChange);
        setNamespacedAttribute(request, "afterPausedLabelChange", this._afterPausedLabelChange);
        setNamespacedAttribute(request, "afterPlayingChange", this._afterPlayingChange);
        setNamespacedAttribute(request, "afterPlayingLabelChange", this._afterPlayingLabelChange);
        setNamespacedAttribute(request, "afterPreloadAllImagesChange", this._afterPreloadAllImagesChange);
        setNamespacedAttribute(request, "afterPreventOverlapChange", this._afterPreventOverlapChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterRepeatChange", this._afterRepeatChange);
        setNamespacedAttribute(request, "afterRequest", this._afterRequest);
        setNamespacedAttribute(request, "afterShimChange", this._afterShimChange);
        setNamespacedAttribute(request, "afterShowArrowsChange", this._afterShowArrowsChange);
        setNamespacedAttribute(request, "afterShowCloseChange", this._afterShowCloseChange);
        setNamespacedAttribute(request, "afterShowPlayerChange", this._afterShowPlayerChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterToolbarChange", this._afterToolbarChange);
        setNamespacedAttribute(request, "afterTotalLinksChange", this._afterTotalLinksChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterUseOriginalImageChange", this._afterUseOriginalImageChange);
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
        setNamespacedAttribute(request, "onAnim", this._onAnim);
        setNamespacedAttribute(request, "onAnimChange", this._onAnimChange);
        setNamespacedAttribute(request, "onArrowLeftElChange", this._onArrowLeftElChange);
        setNamespacedAttribute(request, "onArrowRightElChange", this._onArrowRightElChange);
        setNamespacedAttribute(request, "onAutoPlayChange", this._onAutoPlayChange);
        setNamespacedAttribute(request, "onBodyContentChange", this._onBodyContentChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onCaptionChange", this._onCaptionChange);
        setNamespacedAttribute(request, "onCaptionElChange", this._onCaptionElChange);
        setNamespacedAttribute(request, "onCaptionFromTitleChange", this._onCaptionFromTitleChange);
        setNamespacedAttribute(request, "onCenteredChange", this._onCenteredChange);
        setNamespacedAttribute(request, "onCloseElChange", this._onCloseElChange);
        setNamespacedAttribute(request, "onConstrainChange", this._onConstrainChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
        setNamespacedAttribute(request, "onCurrentIndexChange", this._onCurrentIndexChange);
        setNamespacedAttribute(request, "onDelayChange", this._onDelayChange);
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
        setNamespacedAttribute(request, "onImageAnimChange", this._onImageAnimChange);
        setNamespacedAttribute(request, "onImageChange", this._onImageChange);
        setNamespacedAttribute(request, "onInfoElChange", this._onInfoElChange);
        setNamespacedAttribute(request, "onInfoTemplateChange", this._onInfoTemplateChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onLinksChange", this._onLinksChange);
        setNamespacedAttribute(request, "onLoad", this._onLoad);
        setNamespacedAttribute(request, "onLoaderChange", this._onLoaderChange);
        setNamespacedAttribute(request, "onLoadingChange", this._onLoadingChange);
        setNamespacedAttribute(request, "onLoadingElChange", this._onLoadingElChange);
        setNamespacedAttribute(request, "onMaxHeightChange", this._onMaxHeightChange);
        setNamespacedAttribute(request, "onMaxWidthChange", this._onMaxWidthChange);
        setNamespacedAttribute(request, "onModalChange", this._onModalChange);
        setNamespacedAttribute(request, "onPaginatorChange", this._onPaginatorChange);
        setNamespacedAttribute(request, "onPaginatorElChange", this._onPaginatorElChange);
        setNamespacedAttribute(request, "onPaginatorInstanceChange", this._onPaginatorInstanceChange);
        setNamespacedAttribute(request, "onPausedChange", this._onPausedChange);
        setNamespacedAttribute(request, "onPausedLabelChange", this._onPausedLabelChange);
        setNamespacedAttribute(request, "onPlayingChange", this._onPlayingChange);
        setNamespacedAttribute(request, "onPlayingLabelChange", this._onPlayingLabelChange);
        setNamespacedAttribute(request, "onPreloadAllImagesChange", this._onPreloadAllImagesChange);
        setNamespacedAttribute(request, "onPreventOverlapChange", this._onPreventOverlapChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onRepeatChange", this._onRepeatChange);
        setNamespacedAttribute(request, "onRequest", this._onRequest);
        setNamespacedAttribute(request, "onShimChange", this._onShimChange);
        setNamespacedAttribute(request, "onShowArrowsChange", this._onShowArrowsChange);
        setNamespacedAttribute(request, "onShowCloseChange", this._onShowCloseChange);
        setNamespacedAttribute(request, "onShowPlayerChange", this._onShowPlayerChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onToolbarChange", this._onToolbarChange);
        setNamespacedAttribute(request, "onTotalLinksChange", this._onTotalLinksChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onUseOriginalImageChange", this._onUseOriginalImageChange);
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
