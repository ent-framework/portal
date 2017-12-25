package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BasePaginatorTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:paginator:";
    private static final String _PAGE = "/html/taglib/alloy/paginator/page.jsp";
    private boolean _alwaysVisible = true;
    private String _containers = null;
    private boolean _destroyed = false;
    private String _firstPageLink = null;
    private String _firstPageLinkLabel = "first";
    private boolean _initialized = false;
    private String _lastPageLink = null;
    private String _lastPageLinkLabel = "last";
    private Object _maxPageLinks = Integer.valueOf(10);
    private String _nextPageLink = null;
    private String _nextPageLinkLabel = "next &gt;";
    private Object _paginatorPage = Integer.valueOf(1);
    private String _pageContainerTemplate = null;
    private Object _pageLinkContent = null;
    private String _pageLinkTemplate = null;
    private String _pageReportEl = null;
    private String _pageReportLabelTemplate = "({page} of {totalPages})";
    private String _prevPageLink = null;
    private String _prevPageLinkLabel = "&lt; prev";
    private Object _rowsPerPage = Integer.valueOf(1);
    private String _rowsPerPageEl = null;
    private Object _rowsPerPageOptions = null;
    private Object _state = null;
    private String _template = "{FirstPageLink} {PrevPageLink} {PageLinks} {NextPageLink} {LastPageLink} {CurrentPageReport} {Total} {RowsPerPageSelect}";
    private Object _total = Integer.valueOf(0);
    private String _totalEl = null;
    private String _totalLabel = "(Total {total})";
    private Object _totalPages = Integer.valueOf(0);
    private Object _afterAlwaysVisibleChange = null;
    private Object _afterContainersChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterFirstPageLinkChange = null;
    private Object _afterFirstPageLinkLabelChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterLastPageLinkChange = null;
    private Object _afterLastPageLinkLabelChange = null;
    private Object _afterMaxPageLinksChange = null;
    private Object _afterNextPageLinkChange = null;
    private Object _afterNextPageLinkLabelChange = null;
    private Object _afterPageChange = null;
    private Object _afterPageContainerTemplateChange = null;
    private Object _afterPageLinkContentChange = null;
    private Object _afterPageLinkTemplateChange = null;
    private Object _afterPageReportElChange = null;
    private Object _afterPageReportLabelTemplateChange = null;
    private Object _afterPrevPageLinkChange = null;
    private Object _afterPrevPageLinkLabelChange = null;
    private Object _afterRowsPerPageChange = null;
    private Object _afterRowsPerPageElChange = null;
    private Object _afterRowsPerPageOptionsChange = null;
    private Object _afterStateChange = null;
    private Object _afterTemplateChange = null;
    private Object _afterTotalChange = null;
    private Object _afterTotalElChange = null;
    private Object _afterTotalLabelChange = null;
    private Object _afterTotalPagesChange = null;
    private Object _onAlwaysVisibleChange = null;
    private Object _onContainersChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onFirstPageLinkChange = null;
    private Object _onFirstPageLinkLabelChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onLastPageLinkChange = null;
    private Object _onLastPageLinkLabelChange = null;
    private Object _onMaxPageLinksChange = null;
    private Object _onNextPageLinkChange = null;
    private Object _onNextPageLinkLabelChange = null;
    private Object _onPageChange = null;
    private Object _onPageContainerTemplateChange = null;
    private Object _onPageLinkContentChange = null;
    private Object _onPageLinkTemplateChange = null;
    private Object _onPageReportElChange = null;
    private Object _onPageReportLabelTemplateChange = null;
    private Object _onPrevPageLinkChange = null;
    private Object _onPrevPageLinkLabelChange = null;
    private Object _onRowsPerPageChange = null;
    private Object _onRowsPerPageElChange = null;
    private Object _onRowsPerPageOptionsChange = null;
    private Object _onStateChange = null;
    private Object _onTemplateChange = null;
    private Object _onTotalChange = null;
    private Object _onTotalElChange = null;
    private Object _onTotalLabelChange = null;
    private Object _onTotalPagesChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:paginator:");

        return super.doStartTag();
    }

    public boolean getAlwaysVisible() {
        return this._alwaysVisible;
    }

    public void setAlwaysVisible(boolean alwaysVisible) {
        this._alwaysVisible = alwaysVisible;

        setScopedAttribute("alwaysVisible", Boolean.valueOf(alwaysVisible));
    }

    public String getContainers() {
        return this._containers;
    }

    public void setContainers(String containers) {
        this._containers = containers;

        setScopedAttribute("containers", containers);
    }

    public boolean getDestroyed() {
        return this._destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this._destroyed = destroyed;

        setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
    }

    public String getFirstPageLink() {
        return this._firstPageLink;
    }

    public void setFirstPageLink(String firstPageLink) {
        this._firstPageLink = firstPageLink;

        setScopedAttribute("firstPageLink", firstPageLink);
    }

    public String getFirstPageLinkLabel() {
        return this._firstPageLinkLabel;
    }

    public void setFirstPageLinkLabel(String firstPageLinkLabel) {
        this._firstPageLinkLabel = firstPageLinkLabel;

        setScopedAttribute("firstPageLinkLabel", firstPageLinkLabel);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public String getLastPageLink() {
        return this._lastPageLink;
    }

    public void setLastPageLink(String lastPageLink) {
        this._lastPageLink = lastPageLink;

        setScopedAttribute("lastPageLink", lastPageLink);
    }

    public String getLastPageLinkLabel() {
        return this._lastPageLinkLabel;
    }

    public void setLastPageLinkLabel(String lastPageLinkLabel) {
        this._lastPageLinkLabel = lastPageLinkLabel;

        setScopedAttribute("lastPageLinkLabel", lastPageLinkLabel);
    }

    public Object getMaxPageLinks() {
        return this._maxPageLinks;
    }

    public void setMaxPageLinks(Object maxPageLinks) {
        this._maxPageLinks = maxPageLinks;

        setScopedAttribute("maxPageLinks", maxPageLinks);
    }

    public String getNextPageLink() {
        return this._nextPageLink;
    }

    public void setNextPageLink(String nextPageLink) {
        this._nextPageLink = nextPageLink;

        setScopedAttribute("nextPageLink", nextPageLink);
    }

    public String getNextPageLinkLabel() {
        return this._nextPageLinkLabel;
    }

    public void setNextPageLinkLabel(String nextPageLinkLabel) {
        this._nextPageLinkLabel = nextPageLinkLabel;

        setScopedAttribute("nextPageLinkLabel", nextPageLinkLabel);
    }

    public Object getPaginatorPage() {
        return this._paginatorPage;
    }

    public void setPaginatorPage(Object paginatorPage) {
        this._paginatorPage = paginatorPage;

        setScopedAttribute("paginatorPage", paginatorPage);
    }

    public String getPageContainerTemplate() {
        return this._pageContainerTemplate;
    }

    public void setPageContainerTemplate(String pageContainerTemplate) {
        this._pageContainerTemplate = pageContainerTemplate;

        setScopedAttribute("pageContainerTemplate", pageContainerTemplate);
    }

    public Object getPageLinkContent() {
        return this._pageLinkContent;
    }

    public void setPageLinkContent(Object pageLinkContent) {
        this._pageLinkContent = pageLinkContent;

        setScopedAttribute("pageLinkContent", pageLinkContent);
    }

    public String getPageLinkTemplate() {
        return this._pageLinkTemplate;
    }

    public void setPageLinkTemplate(String pageLinkTemplate) {
        this._pageLinkTemplate = pageLinkTemplate;

        setScopedAttribute("pageLinkTemplate", pageLinkTemplate);
    }

    public String getPageReportEl() {
        return this._pageReportEl;
    }

    public void setPageReportEl(String pageReportEl) {
        this._pageReportEl = pageReportEl;

        setScopedAttribute("pageReportEl", pageReportEl);
    }

    public String getPageReportLabelTemplate() {
        return this._pageReportLabelTemplate;
    }

    public void setPageReportLabelTemplate(String pageReportLabelTemplate) {
        this._pageReportLabelTemplate = pageReportLabelTemplate;

        setScopedAttribute("pageReportLabelTemplate", pageReportLabelTemplate);
    }

    public String getPrevPageLink() {
        return this._prevPageLink;
    }

    public void setPrevPageLink(String prevPageLink) {
        this._prevPageLink = prevPageLink;

        setScopedAttribute("prevPageLink", prevPageLink);
    }

    public String getPrevPageLinkLabel() {
        return this._prevPageLinkLabel;
    }

    public void setPrevPageLinkLabel(String prevPageLinkLabel) {
        this._prevPageLinkLabel = prevPageLinkLabel;

        setScopedAttribute("prevPageLinkLabel", prevPageLinkLabel);
    }

    public Object getRowsPerPage() {
        return this._rowsPerPage;
    }

    public void setRowsPerPage(Object rowsPerPage) {
        this._rowsPerPage = rowsPerPage;

        setScopedAttribute("rowsPerPage", rowsPerPage);
    }

    public String getRowsPerPageEl() {
        return this._rowsPerPageEl;
    }

    public void setRowsPerPageEl(String rowsPerPageEl) {
        this._rowsPerPageEl = rowsPerPageEl;

        setScopedAttribute("rowsPerPageEl", rowsPerPageEl);
    }

    public Object getRowsPerPageOptions() {
        return this._rowsPerPageOptions;
    }

    public void setRowsPerPageOptions(Object rowsPerPageOptions) {
        this._rowsPerPageOptions = rowsPerPageOptions;

        setScopedAttribute("rowsPerPageOptions", rowsPerPageOptions);
    }

    public Object getState() {
        return this._state;
    }

    public void setState(Object state) {
        this._state = state;

        setScopedAttribute("state", state);
    }

    public String getTemplate() {
        return this._template;
    }

    public void setTemplate(String template) {
        this._template = template;

        setScopedAttribute("template", template);
    }

    public Object getTotal() {
        return this._total;
    }

    public void setTotal(Object total) {
        this._total = total;

        setScopedAttribute("total", total);
    }

    public String getTotalEl() {
        return this._totalEl;
    }

    public void setTotalEl(String totalEl) {
        this._totalEl = totalEl;

        setScopedAttribute("totalEl", totalEl);
    }

    public String getTotalLabel() {
        return this._totalLabel;
    }

    public void setTotalLabel(String totalLabel) {
        this._totalLabel = totalLabel;

        setScopedAttribute("totalLabel", totalLabel);
    }

    public Object getTotalPages() {
        return this._totalPages;
    }

    public void setTotalPages(Object totalPages) {
        this._totalPages = totalPages;

        setScopedAttribute("totalPages", totalPages);
    }

    public Object getAfterAlwaysVisibleChange() {
        return this._afterAlwaysVisibleChange;
    }

    public void setAfterAlwaysVisibleChange(Object afterAlwaysVisibleChange) {
        this._afterAlwaysVisibleChange = afterAlwaysVisibleChange;

        setScopedAttribute("afterAlwaysVisibleChange", afterAlwaysVisibleChange);
    }

    public Object getAfterContainersChange() {
        return this._afterContainersChange;
    }

    public void setAfterContainersChange(Object afterContainersChange) {
        this._afterContainersChange = afterContainersChange;

        setScopedAttribute("afterContainersChange", afterContainersChange);
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

    public Object getAfterFirstPageLinkChange() {
        return this._afterFirstPageLinkChange;
    }

    public void setAfterFirstPageLinkChange(Object afterFirstPageLinkChange) {
        this._afterFirstPageLinkChange = afterFirstPageLinkChange;

        setScopedAttribute("afterFirstPageLinkChange", afterFirstPageLinkChange);
    }

    public Object getAfterFirstPageLinkLabelChange() {
        return this._afterFirstPageLinkLabelChange;
    }

    public void setAfterFirstPageLinkLabelChange(Object afterFirstPageLinkLabelChange) {
        this._afterFirstPageLinkLabelChange = afterFirstPageLinkLabelChange;

        setScopedAttribute("afterFirstPageLinkLabelChange", afterFirstPageLinkLabelChange);
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

    public Object getAfterLastPageLinkChange() {
        return this._afterLastPageLinkChange;
    }

    public void setAfterLastPageLinkChange(Object afterLastPageLinkChange) {
        this._afterLastPageLinkChange = afterLastPageLinkChange;

        setScopedAttribute("afterLastPageLinkChange", afterLastPageLinkChange);
    }

    public Object getAfterLastPageLinkLabelChange() {
        return this._afterLastPageLinkLabelChange;
    }

    public void setAfterLastPageLinkLabelChange(Object afterLastPageLinkLabelChange) {
        this._afterLastPageLinkLabelChange = afterLastPageLinkLabelChange;

        setScopedAttribute("afterLastPageLinkLabelChange", afterLastPageLinkLabelChange);
    }

    public Object getAfterMaxPageLinksChange() {
        return this._afterMaxPageLinksChange;
    }

    public void setAfterMaxPageLinksChange(Object afterMaxPageLinksChange) {
        this._afterMaxPageLinksChange = afterMaxPageLinksChange;

        setScopedAttribute("afterMaxPageLinksChange", afterMaxPageLinksChange);
    }

    public Object getAfterNextPageLinkChange() {
        return this._afterNextPageLinkChange;
    }

    public void setAfterNextPageLinkChange(Object afterNextPageLinkChange) {
        this._afterNextPageLinkChange = afterNextPageLinkChange;

        setScopedAttribute("afterNextPageLinkChange", afterNextPageLinkChange);
    }

    public Object getAfterNextPageLinkLabelChange() {
        return this._afterNextPageLinkLabelChange;
    }

    public void setAfterNextPageLinkLabelChange(Object afterNextPageLinkLabelChange) {
        this._afterNextPageLinkLabelChange = afterNextPageLinkLabelChange;

        setScopedAttribute("afterNextPageLinkLabelChange", afterNextPageLinkLabelChange);
    }

    public Object getAfterPageChange() {
        return this._afterPageChange;
    }

    public void setAfterPageChange(Object afterPageChange) {
        this._afterPageChange = afterPageChange;

        setScopedAttribute("afterPageChange", afterPageChange);
    }

    public Object getAfterPageContainerTemplateChange() {
        return this._afterPageContainerTemplateChange;
    }

    public void setAfterPageContainerTemplateChange(Object afterPageContainerTemplateChange) {
        this._afterPageContainerTemplateChange = afterPageContainerTemplateChange;

        setScopedAttribute("afterPageContainerTemplateChange", afterPageContainerTemplateChange);
    }

    public Object getAfterPageLinkContentChange() {
        return this._afterPageLinkContentChange;
    }

    public void setAfterPageLinkContentChange(Object afterPageLinkContentChange) {
        this._afterPageLinkContentChange = afterPageLinkContentChange;

        setScopedAttribute("afterPageLinkContentChange", afterPageLinkContentChange);
    }

    public Object getAfterPageLinkTemplateChange() {
        return this._afterPageLinkTemplateChange;
    }

    public void setAfterPageLinkTemplateChange(Object afterPageLinkTemplateChange) {
        this._afterPageLinkTemplateChange = afterPageLinkTemplateChange;

        setScopedAttribute("afterPageLinkTemplateChange", afterPageLinkTemplateChange);
    }

    public Object getAfterPageReportElChange() {
        return this._afterPageReportElChange;
    }

    public void setAfterPageReportElChange(Object afterPageReportElChange) {
        this._afterPageReportElChange = afterPageReportElChange;

        setScopedAttribute("afterPageReportElChange", afterPageReportElChange);
    }

    public Object getAfterPageReportLabelTemplateChange() {
        return this._afterPageReportLabelTemplateChange;
    }

    public void setAfterPageReportLabelTemplateChange(Object afterPageReportLabelTemplateChange) {
        this._afterPageReportLabelTemplateChange = afterPageReportLabelTemplateChange;

        setScopedAttribute("afterPageReportLabelTemplateChange", afterPageReportLabelTemplateChange);
    }

    public Object getAfterPrevPageLinkChange() {
        return this._afterPrevPageLinkChange;
    }

    public void setAfterPrevPageLinkChange(Object afterPrevPageLinkChange) {
        this._afterPrevPageLinkChange = afterPrevPageLinkChange;

        setScopedAttribute("afterPrevPageLinkChange", afterPrevPageLinkChange);
    }

    public Object getAfterPrevPageLinkLabelChange() {
        return this._afterPrevPageLinkLabelChange;
    }

    public void setAfterPrevPageLinkLabelChange(Object afterPrevPageLinkLabelChange) {
        this._afterPrevPageLinkLabelChange = afterPrevPageLinkLabelChange;

        setScopedAttribute("afterPrevPageLinkLabelChange", afterPrevPageLinkLabelChange);
    }

    public Object getAfterRowsPerPageChange() {
        return this._afterRowsPerPageChange;
    }

    public void setAfterRowsPerPageChange(Object afterRowsPerPageChange) {
        this._afterRowsPerPageChange = afterRowsPerPageChange;

        setScopedAttribute("afterRowsPerPageChange", afterRowsPerPageChange);
    }

    public Object getAfterRowsPerPageElChange() {
        return this._afterRowsPerPageElChange;
    }

    public void setAfterRowsPerPageElChange(Object afterRowsPerPageElChange) {
        this._afterRowsPerPageElChange = afterRowsPerPageElChange;

        setScopedAttribute("afterRowsPerPageElChange", afterRowsPerPageElChange);
    }

    public Object getAfterRowsPerPageOptionsChange() {
        return this._afterRowsPerPageOptionsChange;
    }

    public void setAfterRowsPerPageOptionsChange(Object afterRowsPerPageOptionsChange) {
        this._afterRowsPerPageOptionsChange = afterRowsPerPageOptionsChange;

        setScopedAttribute("afterRowsPerPageOptionsChange", afterRowsPerPageOptionsChange);
    }

    public Object getAfterStateChange() {
        return this._afterStateChange;
    }

    public void setAfterStateChange(Object afterStateChange) {
        this._afterStateChange = afterStateChange;

        setScopedAttribute("afterStateChange", afterStateChange);
    }

    public Object getAfterTemplateChange() {
        return this._afterTemplateChange;
    }

    public void setAfterTemplateChange(Object afterTemplateChange) {
        this._afterTemplateChange = afterTemplateChange;

        setScopedAttribute("afterTemplateChange", afterTemplateChange);
    }

    public Object getAfterTotalChange() {
        return this._afterTotalChange;
    }

    public void setAfterTotalChange(Object afterTotalChange) {
        this._afterTotalChange = afterTotalChange;

        setScopedAttribute("afterTotalChange", afterTotalChange);
    }

    public Object getAfterTotalElChange() {
        return this._afterTotalElChange;
    }

    public void setAfterTotalElChange(Object afterTotalElChange) {
        this._afterTotalElChange = afterTotalElChange;

        setScopedAttribute("afterTotalElChange", afterTotalElChange);
    }

    public Object getAfterTotalLabelChange() {
        return this._afterTotalLabelChange;
    }

    public void setAfterTotalLabelChange(Object afterTotalLabelChange) {
        this._afterTotalLabelChange = afterTotalLabelChange;

        setScopedAttribute("afterTotalLabelChange", afterTotalLabelChange);
    }

    public Object getAfterTotalPagesChange() {
        return this._afterTotalPagesChange;
    }

    public void setAfterTotalPagesChange(Object afterTotalPagesChange) {
        this._afterTotalPagesChange = afterTotalPagesChange;

        setScopedAttribute("afterTotalPagesChange", afterTotalPagesChange);
    }

    public Object getOnAlwaysVisibleChange() {
        return this._onAlwaysVisibleChange;
    }

    public void setOnAlwaysVisibleChange(Object onAlwaysVisibleChange) {
        this._onAlwaysVisibleChange = onAlwaysVisibleChange;

        setScopedAttribute("onAlwaysVisibleChange", onAlwaysVisibleChange);
    }

    public Object getOnContainersChange() {
        return this._onContainersChange;
    }

    public void setOnContainersChange(Object onContainersChange) {
        this._onContainersChange = onContainersChange;

        setScopedAttribute("onContainersChange", onContainersChange);
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

    public Object getOnFirstPageLinkChange() {
        return this._onFirstPageLinkChange;
    }

    public void setOnFirstPageLinkChange(Object onFirstPageLinkChange) {
        this._onFirstPageLinkChange = onFirstPageLinkChange;

        setScopedAttribute("onFirstPageLinkChange", onFirstPageLinkChange);
    }

    public Object getOnFirstPageLinkLabelChange() {
        return this._onFirstPageLinkLabelChange;
    }

    public void setOnFirstPageLinkLabelChange(Object onFirstPageLinkLabelChange) {
        this._onFirstPageLinkLabelChange = onFirstPageLinkLabelChange;

        setScopedAttribute("onFirstPageLinkLabelChange", onFirstPageLinkLabelChange);
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

    public Object getOnLastPageLinkChange() {
        return this._onLastPageLinkChange;
    }

    public void setOnLastPageLinkChange(Object onLastPageLinkChange) {
        this._onLastPageLinkChange = onLastPageLinkChange;

        setScopedAttribute("onLastPageLinkChange", onLastPageLinkChange);
    }

    public Object getOnLastPageLinkLabelChange() {
        return this._onLastPageLinkLabelChange;
    }

    public void setOnLastPageLinkLabelChange(Object onLastPageLinkLabelChange) {
        this._onLastPageLinkLabelChange = onLastPageLinkLabelChange;

        setScopedAttribute("onLastPageLinkLabelChange", onLastPageLinkLabelChange);
    }

    public Object getOnMaxPageLinksChange() {
        return this._onMaxPageLinksChange;
    }

    public void setOnMaxPageLinksChange(Object onMaxPageLinksChange) {
        this._onMaxPageLinksChange = onMaxPageLinksChange;

        setScopedAttribute("onMaxPageLinksChange", onMaxPageLinksChange);
    }

    public Object getOnNextPageLinkChange() {
        return this._onNextPageLinkChange;
    }

    public void setOnNextPageLinkChange(Object onNextPageLinkChange) {
        this._onNextPageLinkChange = onNextPageLinkChange;

        setScopedAttribute("onNextPageLinkChange", onNextPageLinkChange);
    }

    public Object getOnNextPageLinkLabelChange() {
        return this._onNextPageLinkLabelChange;
    }

    public void setOnNextPageLinkLabelChange(Object onNextPageLinkLabelChange) {
        this._onNextPageLinkLabelChange = onNextPageLinkLabelChange;

        setScopedAttribute("onNextPageLinkLabelChange", onNextPageLinkLabelChange);
    }

    public Object getOnPageChange() {
        return this._onPageChange;
    }

    public void setOnPageChange(Object onPageChange) {
        this._onPageChange = onPageChange;

        setScopedAttribute("onPageChange", onPageChange);
    }

    public Object getOnPageContainerTemplateChange() {
        return this._onPageContainerTemplateChange;
    }

    public void setOnPageContainerTemplateChange(Object onPageContainerTemplateChange) {
        this._onPageContainerTemplateChange = onPageContainerTemplateChange;

        setScopedAttribute("onPageContainerTemplateChange", onPageContainerTemplateChange);
    }

    public Object getOnPageLinkContentChange() {
        return this._onPageLinkContentChange;
    }

    public void setOnPageLinkContentChange(Object onPageLinkContentChange) {
        this._onPageLinkContentChange = onPageLinkContentChange;

        setScopedAttribute("onPageLinkContentChange", onPageLinkContentChange);
    }

    public Object getOnPageLinkTemplateChange() {
        return this._onPageLinkTemplateChange;
    }

    public void setOnPageLinkTemplateChange(Object onPageLinkTemplateChange) {
        this._onPageLinkTemplateChange = onPageLinkTemplateChange;

        setScopedAttribute("onPageLinkTemplateChange", onPageLinkTemplateChange);
    }

    public Object getOnPageReportElChange() {
        return this._onPageReportElChange;
    }

    public void setOnPageReportElChange(Object onPageReportElChange) {
        this._onPageReportElChange = onPageReportElChange;

        setScopedAttribute("onPageReportElChange", onPageReportElChange);
    }

    public Object getOnPageReportLabelTemplateChange() {
        return this._onPageReportLabelTemplateChange;
    }

    public void setOnPageReportLabelTemplateChange(Object onPageReportLabelTemplateChange) {
        this._onPageReportLabelTemplateChange = onPageReportLabelTemplateChange;

        setScopedAttribute("onPageReportLabelTemplateChange", onPageReportLabelTemplateChange);
    }

    public Object getOnPrevPageLinkChange() {
        return this._onPrevPageLinkChange;
    }

    public void setOnPrevPageLinkChange(Object onPrevPageLinkChange) {
        this._onPrevPageLinkChange = onPrevPageLinkChange;

        setScopedAttribute("onPrevPageLinkChange", onPrevPageLinkChange);
    }

    public Object getOnPrevPageLinkLabelChange() {
        return this._onPrevPageLinkLabelChange;
    }

    public void setOnPrevPageLinkLabelChange(Object onPrevPageLinkLabelChange) {
        this._onPrevPageLinkLabelChange = onPrevPageLinkLabelChange;

        setScopedAttribute("onPrevPageLinkLabelChange", onPrevPageLinkLabelChange);
    }

    public Object getOnRowsPerPageChange() {
        return this._onRowsPerPageChange;
    }

    public void setOnRowsPerPageChange(Object onRowsPerPageChange) {
        this._onRowsPerPageChange = onRowsPerPageChange;

        setScopedAttribute("onRowsPerPageChange", onRowsPerPageChange);
    }

    public Object getOnRowsPerPageElChange() {
        return this._onRowsPerPageElChange;
    }

    public void setOnRowsPerPageElChange(Object onRowsPerPageElChange) {
        this._onRowsPerPageElChange = onRowsPerPageElChange;

        setScopedAttribute("onRowsPerPageElChange", onRowsPerPageElChange);
    }

    public Object getOnRowsPerPageOptionsChange() {
        return this._onRowsPerPageOptionsChange;
    }

    public void setOnRowsPerPageOptionsChange(Object onRowsPerPageOptionsChange) {
        this._onRowsPerPageOptionsChange = onRowsPerPageOptionsChange;

        setScopedAttribute("onRowsPerPageOptionsChange", onRowsPerPageOptionsChange);
    }

    public Object getOnStateChange() {
        return this._onStateChange;
    }

    public void setOnStateChange(Object onStateChange) {
        this._onStateChange = onStateChange;

        setScopedAttribute("onStateChange", onStateChange);
    }

    public Object getOnTemplateChange() {
        return this._onTemplateChange;
    }

    public void setOnTemplateChange(Object onTemplateChange) {
        this._onTemplateChange = onTemplateChange;

        setScopedAttribute("onTemplateChange", onTemplateChange);
    }

    public Object getOnTotalChange() {
        return this._onTotalChange;
    }

    public void setOnTotalChange(Object onTotalChange) {
        this._onTotalChange = onTotalChange;

        setScopedAttribute("onTotalChange", onTotalChange);
    }

    public Object getOnTotalElChange() {
        return this._onTotalElChange;
    }

    public void setOnTotalElChange(Object onTotalElChange) {
        this._onTotalElChange = onTotalElChange;

        setScopedAttribute("onTotalElChange", onTotalElChange);
    }

    public Object getOnTotalLabelChange() {
        return this._onTotalLabelChange;
    }

    public void setOnTotalLabelChange(Object onTotalLabelChange) {
        this._onTotalLabelChange = onTotalLabelChange;

        setScopedAttribute("onTotalLabelChange", onTotalLabelChange);
    }

    public Object getOnTotalPagesChange() {
        return this._onTotalPagesChange;
    }

    public void setOnTotalPagesChange(Object onTotalPagesChange) {
        this._onTotalPagesChange = onTotalPagesChange;

        setScopedAttribute("onTotalPagesChange", onTotalPagesChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._alwaysVisible = true;
        this._containers = null;
        this._destroyed = false;
        this._firstPageLink = null;
        this._firstPageLinkLabel = "first";
        this._initialized = false;
        this._lastPageLink = null;
        this._lastPageLinkLabel = "last";
        this._maxPageLinks = Integer.valueOf(10);
        this._nextPageLink = null;
        this._nextPageLinkLabel = "next &gt;";
        this._paginatorPage = Integer.valueOf(1);
        this._pageContainerTemplate = null;
        this._pageLinkContent = null;
        this._pageLinkTemplate = null;
        this._pageReportEl = null;
        this._pageReportLabelTemplate = "({page} of {totalPages})";
        this._prevPageLink = null;
        this._prevPageLinkLabel = "&lt; prev";
        this._rowsPerPage = Integer.valueOf(1);
        this._rowsPerPageEl = null;
        this._rowsPerPageOptions = null;
        this._state = null;
        this._template = "{FirstPageLink} {PrevPageLink} {PageLinks} {NextPageLink} {LastPageLink} {CurrentPageReport} {Total} {RowsPerPageSelect}";
        this._total = Integer.valueOf(0);
        this._totalEl = null;
        this._totalLabel = "(Total {total})";
        this._totalPages = Integer.valueOf(0);
        this._afterAlwaysVisibleChange = null;
        this._afterContainersChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterFirstPageLinkChange = null;
        this._afterFirstPageLinkLabelChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterLastPageLinkChange = null;
        this._afterLastPageLinkLabelChange = null;
        this._afterMaxPageLinksChange = null;
        this._afterNextPageLinkChange = null;
        this._afterNextPageLinkLabelChange = null;
        this._afterPageChange = null;
        this._afterPageContainerTemplateChange = null;
        this._afterPageLinkContentChange = null;
        this._afterPageLinkTemplateChange = null;
        this._afterPageReportElChange = null;
        this._afterPageReportLabelTemplateChange = null;
        this._afterPrevPageLinkChange = null;
        this._afterPrevPageLinkLabelChange = null;
        this._afterRowsPerPageChange = null;
        this._afterRowsPerPageElChange = null;
        this._afterRowsPerPageOptionsChange = null;
        this._afterStateChange = null;
        this._afterTemplateChange = null;
        this._afterTotalChange = null;
        this._afterTotalElChange = null;
        this._afterTotalLabelChange = null;
        this._afterTotalPagesChange = null;
        this._onAlwaysVisibleChange = null;
        this._onContainersChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onFirstPageLinkChange = null;
        this._onFirstPageLinkLabelChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onLastPageLinkChange = null;
        this._onLastPageLinkLabelChange = null;
        this._onMaxPageLinksChange = null;
        this._onNextPageLinkChange = null;
        this._onNextPageLinkLabelChange = null;
        this._onPageChange = null;
        this._onPageContainerTemplateChange = null;
        this._onPageLinkContentChange = null;
        this._onPageLinkTemplateChange = null;
        this._onPageReportElChange = null;
        this._onPageReportLabelTemplateChange = null;
        this._onPrevPageLinkChange = null;
        this._onPrevPageLinkLabelChange = null;
        this._onRowsPerPageChange = null;
        this._onRowsPerPageElChange = null;
        this._onRowsPerPageOptionsChange = null;
        this._onStateChange = null;
        this._onTemplateChange = null;
        this._onTotalChange = null;
        this._onTotalElChange = null;
        this._onTotalLabelChange = null;
        this._onTotalPagesChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/paginator/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "alwaysVisible", Boolean.valueOf(this._alwaysVisible));
        setNamespacedAttribute(request, "containers", this._containers);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "firstPageLink", this._firstPageLink);
        setNamespacedAttribute(request, "firstPageLinkLabel", this._firstPageLinkLabel);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "lastPageLink", this._lastPageLink);
        setNamespacedAttribute(request, "lastPageLinkLabel", this._lastPageLinkLabel);
        setNamespacedAttribute(request, "maxPageLinks", this._maxPageLinks);
        setNamespacedAttribute(request, "nextPageLink", this._nextPageLink);
        setNamespacedAttribute(request, "nextPageLinkLabel", this._nextPageLinkLabel);
        setNamespacedAttribute(request, "paginatorPage", this._paginatorPage);
        setNamespacedAttribute(request, "pageContainerTemplate", this._pageContainerTemplate);
        setNamespacedAttribute(request, "pageLinkContent", this._pageLinkContent);
        setNamespacedAttribute(request, "pageLinkTemplate", this._pageLinkTemplate);
        setNamespacedAttribute(request, "pageReportEl", this._pageReportEl);
        setNamespacedAttribute(request, "pageReportLabelTemplate", this._pageReportLabelTemplate);
        setNamespacedAttribute(request, "prevPageLink", this._prevPageLink);
        setNamespacedAttribute(request, "prevPageLinkLabel", this._prevPageLinkLabel);
        setNamespacedAttribute(request, "rowsPerPage", this._rowsPerPage);
        setNamespacedAttribute(request, "rowsPerPageEl", this._rowsPerPageEl);
        setNamespacedAttribute(request, "rowsPerPageOptions", this._rowsPerPageOptions);
        setNamespacedAttribute(request, "state", this._state);
        setNamespacedAttribute(request, "template", this._template);
        setNamespacedAttribute(request, "total", this._total);
        setNamespacedAttribute(request, "totalEl", this._totalEl);
        setNamespacedAttribute(request, "totalLabel", this._totalLabel);
        setNamespacedAttribute(request, "totalPages", this._totalPages);
        setNamespacedAttribute(request, "afterAlwaysVisibleChange", this._afterAlwaysVisibleChange);
        setNamespacedAttribute(request, "afterContainersChange", this._afterContainersChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterFirstPageLinkChange", this._afterFirstPageLinkChange);
        setNamespacedAttribute(request, "afterFirstPageLinkLabelChange", this._afterFirstPageLinkLabelChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterLastPageLinkChange", this._afterLastPageLinkChange);
        setNamespacedAttribute(request, "afterLastPageLinkLabelChange", this._afterLastPageLinkLabelChange);
        setNamespacedAttribute(request, "afterMaxPageLinksChange", this._afterMaxPageLinksChange);
        setNamespacedAttribute(request, "afterNextPageLinkChange", this._afterNextPageLinkChange);
        setNamespacedAttribute(request, "afterNextPageLinkLabelChange", this._afterNextPageLinkLabelChange);
        setNamespacedAttribute(request, "afterPageChange", this._afterPageChange);
        setNamespacedAttribute(request, "afterPageContainerTemplateChange", this._afterPageContainerTemplateChange);
        setNamespacedAttribute(request, "afterPageLinkContentChange", this._afterPageLinkContentChange);
        setNamespacedAttribute(request, "afterPageLinkTemplateChange", this._afterPageLinkTemplateChange);
        setNamespacedAttribute(request, "afterPageReportElChange", this._afterPageReportElChange);
        setNamespacedAttribute(request, "afterPageReportLabelTemplateChange", this._afterPageReportLabelTemplateChange);
        setNamespacedAttribute(request, "afterPrevPageLinkChange", this._afterPrevPageLinkChange);
        setNamespacedAttribute(request, "afterPrevPageLinkLabelChange", this._afterPrevPageLinkLabelChange);
        setNamespacedAttribute(request, "afterRowsPerPageChange", this._afterRowsPerPageChange);
        setNamespacedAttribute(request, "afterRowsPerPageElChange", this._afterRowsPerPageElChange);
        setNamespacedAttribute(request, "afterRowsPerPageOptionsChange", this._afterRowsPerPageOptionsChange);
        setNamespacedAttribute(request, "afterStateChange", this._afterStateChange);
        setNamespacedAttribute(request, "afterTemplateChange", this._afterTemplateChange);
        setNamespacedAttribute(request, "afterTotalChange", this._afterTotalChange);
        setNamespacedAttribute(request, "afterTotalElChange", this._afterTotalElChange);
        setNamespacedAttribute(request, "afterTotalLabelChange", this._afterTotalLabelChange);
        setNamespacedAttribute(request, "afterTotalPagesChange", this._afterTotalPagesChange);
        setNamespacedAttribute(request, "onAlwaysVisibleChange", this._onAlwaysVisibleChange);
        setNamespacedAttribute(request, "onContainersChange", this._onContainersChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onFirstPageLinkChange", this._onFirstPageLinkChange);
        setNamespacedAttribute(request, "onFirstPageLinkLabelChange", this._onFirstPageLinkLabelChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onLastPageLinkChange", this._onLastPageLinkChange);
        setNamespacedAttribute(request, "onLastPageLinkLabelChange", this._onLastPageLinkLabelChange);
        setNamespacedAttribute(request, "onMaxPageLinksChange", this._onMaxPageLinksChange);
        setNamespacedAttribute(request, "onNextPageLinkChange", this._onNextPageLinkChange);
        setNamespacedAttribute(request, "onNextPageLinkLabelChange", this._onNextPageLinkLabelChange);
        setNamespacedAttribute(request, "onPageChange", this._onPageChange);
        setNamespacedAttribute(request, "onPageContainerTemplateChange", this._onPageContainerTemplateChange);
        setNamespacedAttribute(request, "onPageLinkContentChange", this._onPageLinkContentChange);
        setNamespacedAttribute(request, "onPageLinkTemplateChange", this._onPageLinkTemplateChange);
        setNamespacedAttribute(request, "onPageReportElChange", this._onPageReportElChange);
        setNamespacedAttribute(request, "onPageReportLabelTemplateChange", this._onPageReportLabelTemplateChange);
        setNamespacedAttribute(request, "onPrevPageLinkChange", this._onPrevPageLinkChange);
        setNamespacedAttribute(request, "onPrevPageLinkLabelChange", this._onPrevPageLinkLabelChange);
        setNamespacedAttribute(request, "onRowsPerPageChange", this._onRowsPerPageChange);
        setNamespacedAttribute(request, "onRowsPerPageElChange", this._onRowsPerPageElChange);
        setNamespacedAttribute(request, "onRowsPerPageOptionsChange", this._onRowsPerPageOptionsChange);
        setNamespacedAttribute(request, "onStateChange", this._onStateChange);
        setNamespacedAttribute(request, "onTemplateChange", this._onTemplateChange);
        setNamespacedAttribute(request, "onTotalChange", this._onTotalChange);
        setNamespacedAttribute(request, "onTotalElChange", this._onTotalElChange);
        setNamespacedAttribute(request, "onTotalLabelChange", this._onTotalLabelChange);
        setNamespacedAttribute(request, "onTotalPagesChange", this._onTotalPagesChange);
    }
}
