package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseTreeViewTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:tree-view:";
    private static final String _PAGE = "/html/taglib/alloy/tree_view/page.jsp";
    private Object _children = null;
    private String _container = null;
    private boolean _destroyed = false;
    private Object _index = null;
    private boolean _initialized = false;
    private Object _io = null;
    private Object _lastSelected = null;
    private String _type = "file";
    private Object _afterChildrenChange = null;
    private Object _afterContainerChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterIndexChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterIoChange = null;
    private Object _afterLastSelectedChange = null;
    private Object _afterTypeChange = null;
    private Object _onChildrenChange = null;
    private Object _onContainerChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onIndexChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onIoChange = null;
    private Object _onLastSelectedChange = null;
    private Object _onTypeChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:tree-view:");

        return super.doStartTag();
    }

    public Object getChildren() {
        return this._children;
    }

    public void setChildren(Object children) {
        this._children = children;

        setScopedAttribute("children", children);
    }

    public String getContainer() {
        return this._container;
    }

    public void setContainer(String container) {
        this._container = container;

        setScopedAttribute("container", container);
    }

    public boolean getDestroyed() {
        return this._destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this._destroyed = destroyed;

        setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
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

    public Object getIo() {
        return this._io;
    }

    public void setIo(Object io) {
        this._io = io;

        setScopedAttribute("io", io);
    }

    public Object getLastSelected() {
        return this._lastSelected;
    }

    public void setLastSelected(Object lastSelected) {
        this._lastSelected = lastSelected;

        setScopedAttribute("lastSelected", lastSelected);
    }

    public String getType() {
        return this._type;
    }

    public void setType(String type) {
        this._type = type;

        setScopedAttribute("type", type);
    }

    public Object getAfterChildrenChange() {
        return this._afterChildrenChange;
    }

    public void setAfterChildrenChange(Object afterChildrenChange) {
        this._afterChildrenChange = afterChildrenChange;

        setScopedAttribute("afterChildrenChange", afterChildrenChange);
    }

    public Object getAfterContainerChange() {
        return this._afterContainerChange;
    }

    public void setAfterContainerChange(Object afterContainerChange) {
        this._afterContainerChange = afterContainerChange;

        setScopedAttribute("afterContainerChange", afterContainerChange);
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

    public Object getAfterIoChange() {
        return this._afterIoChange;
    }

    public void setAfterIoChange(Object afterIoChange) {
        this._afterIoChange = afterIoChange;

        setScopedAttribute("afterIoChange", afterIoChange);
    }

    public Object getAfterLastSelectedChange() {
        return this._afterLastSelectedChange;
    }

    public void setAfterLastSelectedChange(Object afterLastSelectedChange) {
        this._afterLastSelectedChange = afterLastSelectedChange;

        setScopedAttribute("afterLastSelectedChange", afterLastSelectedChange);
    }

    public Object getAfterTypeChange() {
        return this._afterTypeChange;
    }

    public void setAfterTypeChange(Object afterTypeChange) {
        this._afterTypeChange = afterTypeChange;

        setScopedAttribute("afterTypeChange", afterTypeChange);
    }

    public Object getOnChildrenChange() {
        return this._onChildrenChange;
    }

    public void setOnChildrenChange(Object onChildrenChange) {
        this._onChildrenChange = onChildrenChange;

        setScopedAttribute("onChildrenChange", onChildrenChange);
    }

    public Object getOnContainerChange() {
        return this._onContainerChange;
    }

    public void setOnContainerChange(Object onContainerChange) {
        this._onContainerChange = onContainerChange;

        setScopedAttribute("onContainerChange", onContainerChange);
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

    public Object getOnIoChange() {
        return this._onIoChange;
    }

    public void setOnIoChange(Object onIoChange) {
        this._onIoChange = onIoChange;

        setScopedAttribute("onIoChange", onIoChange);
    }

    public Object getOnLastSelectedChange() {
        return this._onLastSelectedChange;
    }

    public void setOnLastSelectedChange(Object onLastSelectedChange) {
        this._onLastSelectedChange = onLastSelectedChange;

        setScopedAttribute("onLastSelectedChange", onLastSelectedChange);
    }

    public Object getOnTypeChange() {
        return this._onTypeChange;
    }

    public void setOnTypeChange(Object onTypeChange) {
        this._onTypeChange = onTypeChange;

        setScopedAttribute("onTypeChange", onTypeChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._children = null;
        this._container = null;
        this._destroyed = false;
        this._index = null;
        this._initialized = false;
        this._io = null;
        this._lastSelected = null;
        this._type = "file";
        this._afterChildrenChange = null;
        this._afterContainerChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterIndexChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterIoChange = null;
        this._afterLastSelectedChange = null;
        this._afterTypeChange = null;
        this._onChildrenChange = null;
        this._onContainerChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onIndexChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onIoChange = null;
        this._onLastSelectedChange = null;
        this._onTypeChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/tree_view/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "children", this._children);
        setNamespacedAttribute(request, "container", this._container);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "index", this._index);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "io", this._io);
        setNamespacedAttribute(request, "lastSelected", this._lastSelected);
        setNamespacedAttribute(request, "type", this._type);
        setNamespacedAttribute(request, "afterChildrenChange", this._afterChildrenChange);
        setNamespacedAttribute(request, "afterContainerChange", this._afterContainerChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterIndexChange", this._afterIndexChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterIoChange", this._afterIoChange);
        setNamespacedAttribute(request, "afterLastSelectedChange", this._afterLastSelectedChange);
        setNamespacedAttribute(request, "afterTypeChange", this._afterTypeChange);
        setNamespacedAttribute(request, "onChildrenChange", this._onChildrenChange);
        setNamespacedAttribute(request, "onContainerChange", this._onContainerChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onIndexChange", this._onIndexChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onIoChange", this._onIoChange);
        setNamespacedAttribute(request, "onLastSelectedChange", this._onLastSelectedChange);
        setNamespacedAttribute(request, "onTypeChange", this._onTypeChange);
    }
}
