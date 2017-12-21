package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseIORequestTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:io-request:";
  private static final String _PAGE = "/html/taglib/alloy/io_request/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:io-request:");
    
    return super.doStartTag();
  }
  
  public boolean getActive() {
    return this._active;
  }
  
  public Object getArguments() {
    return this._arguments;
  }
  
  public boolean getAutoLoad() {
    return this._autoLoad;
  }
  
  public boolean getCache() {
    return this._cache;
  }
  
  public String getCfg() {
    return this._cfg;
  }
  
  public Object getContext() {
    return this._context;
  }
  
  public Object getData() {
    return this._data;
  }
  
  public String getDataType() {
    return this._dataType;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public Object getForm() {
    return this._form;
  }
  
  public Object getHeaders() {
    return this._headers;
  }
  
  public Object getHost() {
    return this._host;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public String getMethod() {
    return this._method;
  }
  
  public Object getResponseData() {
    return this._responseData;
  }
  
  public String getSelector() {
    return this._selector;
  }
  
  public boolean getSync() {
    return this._sync;
  }
  
  public Object getTimeout() {
    return this._timeout;
  }
  
  public Object getTransaction() {
    return this._transaction;
  }
  
  public String getUri() {
    return this._uri;
  }
  
  public Object getXdr() {
    return this._xdr;
  }
  
  public Object getAfterActiveChange() {
    return this._afterActiveChange;
  }
  
  public Object getAfterArgumentsChange() {
    return this._afterArgumentsChange;
  }
  
  public Object getAfterAutoLoadChange() {
    return this._afterAutoLoadChange;
  }
  
  public Object getAfterCacheChange() {
    return this._afterCacheChange;
  }
  
  public Object getAfterCfgChange() {
    return this._afterCfgChange;
  }
  
  public Object getAfterContextChange() {
    return this._afterContextChange;
  }
  
  public Object getAfterDataChange() {
    return this._afterDataChange;
  }
  
  public Object getAfterDataTypeChange() {
    return this._afterDataTypeChange;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterFormChange() {
    return this._afterFormChange;
  }
  
  public Object getAfterHeadersChange() {
    return this._afterHeadersChange;
  }
  
  public Object getAfterHostChange() {
    return this._afterHostChange;
  }
  
  public Object getAfterInit() {
    return this._afterInit;
  }
  
  public Object getAfterInitializedChange() {
    return this._afterInitializedChange;
  }
  
  public Object getAfterMethodChange() {
    return this._afterMethodChange;
  }
  
  public Object getAfterResponseDataChange() {
    return this._afterResponseDataChange;
  }
  
  public Object getAfterSelectorChange() {
    return this._afterSelectorChange;
  }
  
  public Object getAfterSyncChange() {
    return this._afterSyncChange;
  }
  
  public Object getAfterTimeoutChange() {
    return this._afterTimeoutChange;
  }
  
  public Object getAfterTransactionChange() {
    return this._afterTransactionChange;
  }
  
  public Object getAfterUriChange() {
    return this._afterUriChange;
  }
  
  public Object getAfterXdrChange() {
    return this._afterXdrChange;
  }
  
  public Object getOnActiveChange() {
    return this._onActiveChange;
  }
  
  public Object getOnArgumentsChange() {
    return this._onArgumentsChange;
  }
  
  public Object getOnAutoLoadChange() {
    return this._onAutoLoadChange;
  }
  
  public Object getOnCacheChange() {
    return this._onCacheChange;
  }
  
  public Object getOnCfgChange() {
    return this._onCfgChange;
  }
  
  public Object getOnContextChange() {
    return this._onContextChange;
  }
  
  public Object getOnDataChange() {
    return this._onDataChange;
  }
  
  public Object getOnDataTypeChange() {
    return this._onDataTypeChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnFormChange() {
    return this._onFormChange;
  }
  
  public Object getOnHeadersChange() {
    return this._onHeadersChange;
  }
  
  public Object getOnHostChange() {
    return this._onHostChange;
  }
  
  public Object getOnInit() {
    return this._onInit;
  }
  
  public Object getOnInitializedChange() {
    return this._onInitializedChange;
  }
  
  public Object getOnMethodChange() {
    return this._onMethodChange;
  }
  
  public Object getOnResponseDataChange() {
    return this._onResponseDataChange;
  }
  
  public Object getOnSelectorChange() {
    return this._onSelectorChange;
  }
  
  public Object getOnSyncChange() {
    return this._onSyncChange;
  }
  
  public Object getOnTimeoutChange() {
    return this._onTimeoutChange;
  }
  
  public Object getOnTransactionChange() {
    return this._onTransactionChange;
  }
  
  public Object getOnUriChange() {
    return this._onUriChange;
  }
  
  public Object getOnXdrChange() {
    return this._onXdrChange;
  }
  
  public void setActive(boolean active) {
    this._active = active;
    
    setScopedAttribute("active", Boolean.valueOf(active));
  }
  
  public void setArguments(Object arguments) {
    this._arguments = arguments;
    
    setScopedAttribute("arguments", arguments);
  }
  
  public void setAutoLoad(boolean autoLoad) {
    this._autoLoad = autoLoad;
    
    setScopedAttribute("autoLoad", Boolean.valueOf(autoLoad));
  }
  
  public void setCache(boolean cache) {
    this._cache = cache;
    
    setScopedAttribute("cache", Boolean.valueOf(cache));
  }
  
  public void setCfg(String cfg) {
    this._cfg = cfg;
    
    setScopedAttribute("cfg", cfg);
  }
  
  public void setContext(Object context) {
    this._context = context;
    
    setScopedAttribute("context", context);
  }
  
  public void setData(Object data) {
    this._data = data;
    
    setScopedAttribute("data", data);
  }
  
  public void setDataType(String dataType) {
    this._dataType = dataType;
    
    setScopedAttribute("dataType", dataType);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setForm(Object form) {
    this._form = form;
    
    setScopedAttribute("form", form);
  }
  
  public void setHeaders(Object headers) {
    this._headers = headers;
    
    setScopedAttribute("headers", headers);
  }
  
  public void setHost(Object host) {
    this._host = host;
    
    setScopedAttribute("host", host);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setMethod(String method) {
    this._method = method;
    
    setScopedAttribute("method", method);
  }
  
  public void setResponseData(Object responseData) {
    this._responseData = responseData;
    
    setScopedAttribute("responseData", responseData);
  }
  
  public void setSelector(String selector) {
    this._selector = selector;
    
    setScopedAttribute("selector", selector);
  }
  
  public void setSync(boolean sync) {
    this._sync = sync;
    
    setScopedAttribute("sync", Boolean.valueOf(sync));
  }
  
  public void setTimeout(Object timeout) {
    this._timeout = timeout;
    
    setScopedAttribute("timeout", timeout);
  }
  
  public void setTransaction(Object transaction) {
    this._transaction = transaction;
    
    setScopedAttribute("transaction", transaction);
  }
  
  public void setUri(String uri) {
    this._uri = uri;
    
    setScopedAttribute("uri", uri);
  }
  
  public void setXdr(Object xdr) {
    this._xdr = xdr;
    
    setScopedAttribute("xdr", xdr);
  }
  
  public void setAfterActiveChange(Object afterActiveChange) {
    this._afterActiveChange = afterActiveChange;
    
    setScopedAttribute("afterActiveChange", afterActiveChange);
  }
  
  public void setAfterArgumentsChange(Object afterArgumentsChange) {
    this._afterArgumentsChange = afterArgumentsChange;
    
    setScopedAttribute("afterArgumentsChange", afterArgumentsChange);
  }
  
  public void setAfterAutoLoadChange(Object afterAutoLoadChange) {
    this._afterAutoLoadChange = afterAutoLoadChange;
    
    setScopedAttribute("afterAutoLoadChange", afterAutoLoadChange);
  }
  
  public void setAfterCacheChange(Object afterCacheChange) {
    this._afterCacheChange = afterCacheChange;
    
    setScopedAttribute("afterCacheChange", afterCacheChange);
  }
  
  public void setAfterCfgChange(Object afterCfgChange) {
    this._afterCfgChange = afterCfgChange;
    
    setScopedAttribute("afterCfgChange", afterCfgChange);
  }
  
  public void setAfterContextChange(Object afterContextChange) {
    this._afterContextChange = afterContextChange;
    
    setScopedAttribute("afterContextChange", afterContextChange);
  }
  
  public void setAfterDataChange(Object afterDataChange) {
    this._afterDataChange = afterDataChange;
    
    setScopedAttribute("afterDataChange", afterDataChange);
  }
  
  public void setAfterDataTypeChange(Object afterDataTypeChange) {
    this._afterDataTypeChange = afterDataTypeChange;
    
    setScopedAttribute("afterDataTypeChange", afterDataTypeChange);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterFormChange(Object afterFormChange) {
    this._afterFormChange = afterFormChange;
    
    setScopedAttribute("afterFormChange", afterFormChange);
  }
  
  public void setAfterHeadersChange(Object afterHeadersChange) {
    this._afterHeadersChange = afterHeadersChange;
    
    setScopedAttribute("afterHeadersChange", afterHeadersChange);
  }
  
  public void setAfterHostChange(Object afterHostChange) {
    this._afterHostChange = afterHostChange;
    
    setScopedAttribute("afterHostChange", afterHostChange);
  }
  
  public void setAfterInit(Object afterInit) {
    this._afterInit = afterInit;
    
    setScopedAttribute("afterInit", afterInit);
  }
  
  public void setAfterInitializedChange(Object afterInitializedChange) {
    this._afterInitializedChange = afterInitializedChange;
    
    setScopedAttribute("afterInitializedChange", afterInitializedChange);
  }
  
  public void setAfterMethodChange(Object afterMethodChange) {
    this._afterMethodChange = afterMethodChange;
    
    setScopedAttribute("afterMethodChange", afterMethodChange);
  }
  
  public void setAfterResponseDataChange(Object afterResponseDataChange) {
    this._afterResponseDataChange = afterResponseDataChange;
    
    setScopedAttribute("afterResponseDataChange", afterResponseDataChange);
  }
  
  public void setAfterSelectorChange(Object afterSelectorChange) {
    this._afterSelectorChange = afterSelectorChange;
    
    setScopedAttribute("afterSelectorChange", afterSelectorChange);
  }
  
  public void setAfterSyncChange(Object afterSyncChange) {
    this._afterSyncChange = afterSyncChange;
    
    setScopedAttribute("afterSyncChange", afterSyncChange);
  }
  
  public void setAfterTimeoutChange(Object afterTimeoutChange) {
    this._afterTimeoutChange = afterTimeoutChange;
    
    setScopedAttribute("afterTimeoutChange", afterTimeoutChange);
  }
  
  public void setAfterTransactionChange(Object afterTransactionChange) {
    this._afterTransactionChange = afterTransactionChange;
    
    setScopedAttribute("afterTransactionChange", afterTransactionChange);
  }
  
  public void setAfterUriChange(Object afterUriChange) {
    this._afterUriChange = afterUriChange;
    
    setScopedAttribute("afterUriChange", afterUriChange);
  }
  
  public void setAfterXdrChange(Object afterXdrChange) {
    this._afterXdrChange = afterXdrChange;
    
    setScopedAttribute("afterXdrChange", afterXdrChange);
  }
  
  public void setOnActiveChange(Object onActiveChange) {
    this._onActiveChange = onActiveChange;
    
    setScopedAttribute("onActiveChange", onActiveChange);
  }
  
  public void setOnArgumentsChange(Object onArgumentsChange) {
    this._onArgumentsChange = onArgumentsChange;
    
    setScopedAttribute("onArgumentsChange", onArgumentsChange);
  }
  
  public void setOnAutoLoadChange(Object onAutoLoadChange) {
    this._onAutoLoadChange = onAutoLoadChange;
    
    setScopedAttribute("onAutoLoadChange", onAutoLoadChange);
  }
  
  public void setOnCacheChange(Object onCacheChange) {
    this._onCacheChange = onCacheChange;
    
    setScopedAttribute("onCacheChange", onCacheChange);
  }
  
  public void setOnCfgChange(Object onCfgChange) {
    this._onCfgChange = onCfgChange;
    
    setScopedAttribute("onCfgChange", onCfgChange);
  }
  
  public void setOnContextChange(Object onContextChange) {
    this._onContextChange = onContextChange;
    
    setScopedAttribute("onContextChange", onContextChange);
  }
  
  public void setOnDataChange(Object onDataChange) {
    this._onDataChange = onDataChange;
    
    setScopedAttribute("onDataChange", onDataChange);
  }
  
  public void setOnDataTypeChange(Object onDataTypeChange) {
    this._onDataTypeChange = onDataTypeChange;
    
    setScopedAttribute("onDataTypeChange", onDataTypeChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnFormChange(Object onFormChange) {
    this._onFormChange = onFormChange;
    
    setScopedAttribute("onFormChange", onFormChange);
  }
  
  public void setOnHeadersChange(Object onHeadersChange) {
    this._onHeadersChange = onHeadersChange;
    
    setScopedAttribute("onHeadersChange", onHeadersChange);
  }
  
  public void setOnHostChange(Object onHostChange) {
    this._onHostChange = onHostChange;
    
    setScopedAttribute("onHostChange", onHostChange);
  }
  
  public void setOnInit(Object onInit) {
    this._onInit = onInit;
    
    setScopedAttribute("onInit", onInit);
  }
  
  public void setOnInitializedChange(Object onInitializedChange) {
    this._onInitializedChange = onInitializedChange;
    
    setScopedAttribute("onInitializedChange", onInitializedChange);
  }
  
  public void setOnMethodChange(Object onMethodChange) {
    this._onMethodChange = onMethodChange;
    
    setScopedAttribute("onMethodChange", onMethodChange);
  }
  
  public void setOnResponseDataChange(Object onResponseDataChange) {
    this._onResponseDataChange = onResponseDataChange;
    
    setScopedAttribute("onResponseDataChange", onResponseDataChange);
  }
  
  public void setOnSelectorChange(Object onSelectorChange) {
    this._onSelectorChange = onSelectorChange;
    
    setScopedAttribute("onSelectorChange", onSelectorChange);
  }
  
  public void setOnSyncChange(Object onSyncChange) {
    this._onSyncChange = onSyncChange;
    
    setScopedAttribute("onSyncChange", onSyncChange);
  }
  
  public void setOnTimeoutChange(Object onTimeoutChange) {
    this._onTimeoutChange = onTimeoutChange;
    
    setScopedAttribute("onTimeoutChange", onTimeoutChange);
  }
  
  public void setOnTransactionChange(Object onTransactionChange) {
    this._onTransactionChange = onTransactionChange;
    
    setScopedAttribute("onTransactionChange", onTransactionChange);
  }
  
  public void setOnUriChange(Object onUriChange) {
    this._onUriChange = onUriChange;
    
    setScopedAttribute("onUriChange", onUriChange);
  }
  
  public void setOnXdrChange(Object onXdrChange) {
    this._onXdrChange = onXdrChange;
    
    setScopedAttribute("onXdrChange", onXdrChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._active = false;
    this._arguments = null;
    this._autoLoad = true;
    this._cache = true;
    this._cfg = null;
    this._context = null;
    this._data = null;
    this._dataType = null;
    this._destroyed = false;
    this._form = null;
    this._headers = null;
    this._host = null;
    this._initialized = false;
    this._method = null;
    this._responseData = null;
    this._selector = null;
    this._sync = false;
    this._timeout = Integer.valueOf(0);
    this._transaction = null;
    this._uri = null;
    this._xdr = null;
    this._afterActiveChange = null;
    this._afterArgumentsChange = null;
    this._afterAutoLoadChange = null;
    this._afterCacheChange = null;
    this._afterCfgChange = null;
    this._afterContextChange = null;
    this._afterDataChange = null;
    this._afterDataTypeChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterFormChange = null;
    this._afterHeadersChange = null;
    this._afterHostChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterMethodChange = null;
    this._afterResponseDataChange = null;
    this._afterSelectorChange = null;
    this._afterSyncChange = null;
    this._afterTimeoutChange = null;
    this._afterTransactionChange = null;
    this._afterUriChange = null;
    this._afterXdrChange = null;
    this._onActiveChange = null;
    this._onArgumentsChange = null;
    this._onAutoLoadChange = null;
    this._onCacheChange = null;
    this._onCfgChange = null;
    this._onContextChange = null;
    this._onDataChange = null;
    this._onDataTypeChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onFormChange = null;
    this._onHeadersChange = null;
    this._onHostChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onMethodChange = null;
    this._onResponseDataChange = null;
    this._onSelectorChange = null;
    this._onSyncChange = null;
    this._onTimeoutChange = null;
    this._onTransactionChange = null;
    this._onUriChange = null;
    this._onXdrChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/io_request/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "active", Boolean.valueOf(this._active));
    setNamespacedAttribute(request, "arguments", this._arguments);
    setNamespacedAttribute(request, "autoLoad", Boolean.valueOf(this._autoLoad));
    setNamespacedAttribute(request, "cache", Boolean.valueOf(this._cache));
    setNamespacedAttribute(request, "cfg", this._cfg);
    setNamespacedAttribute(request, "context", this._context);
    setNamespacedAttribute(request, "data", this._data);
    setNamespacedAttribute(request, "dataType", this._dataType);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "form", this._form);
    setNamespacedAttribute(request, "headers", this._headers);
    setNamespacedAttribute(request, "host", this._host);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "method", this._method);
    setNamespacedAttribute(request, "responseData", this._responseData);
    setNamespacedAttribute(request, "selector", this._selector);
    setNamespacedAttribute(request, "sync", Boolean.valueOf(this._sync));
    setNamespacedAttribute(request, "timeout", this._timeout);
    setNamespacedAttribute(request, "transaction", this._transaction);
    setNamespacedAttribute(request, "uri", this._uri);
    setNamespacedAttribute(request, "xdr", this._xdr);
    setNamespacedAttribute(request, "afterActiveChange", this._afterActiveChange);
    setNamespacedAttribute(request, "afterArgumentsChange", this._afterArgumentsChange);
    setNamespacedAttribute(request, "afterAutoLoadChange", this._afterAutoLoadChange);
    setNamespacedAttribute(request, "afterCacheChange", this._afterCacheChange);
    setNamespacedAttribute(request, "afterCfgChange", this._afterCfgChange);
    setNamespacedAttribute(request, "afterContextChange", this._afterContextChange);
    setNamespacedAttribute(request, "afterDataChange", this._afterDataChange);
    setNamespacedAttribute(request, "afterDataTypeChange", this._afterDataTypeChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterFormChange", this._afterFormChange);
    setNamespacedAttribute(request, "afterHeadersChange", this._afterHeadersChange);
    setNamespacedAttribute(request, "afterHostChange", this._afterHostChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterMethodChange", this._afterMethodChange);
    setNamespacedAttribute(request, "afterResponseDataChange", this._afterResponseDataChange);
    setNamespacedAttribute(request, "afterSelectorChange", this._afterSelectorChange);
    setNamespacedAttribute(request, "afterSyncChange", this._afterSyncChange);
    setNamespacedAttribute(request, "afterTimeoutChange", this._afterTimeoutChange);
    setNamespacedAttribute(request, "afterTransactionChange", this._afterTransactionChange);
    setNamespacedAttribute(request, "afterUriChange", this._afterUriChange);
    setNamespacedAttribute(request, "afterXdrChange", this._afterXdrChange);
    setNamespacedAttribute(request, "onActiveChange", this._onActiveChange);
    setNamespacedAttribute(request, "onArgumentsChange", this._onArgumentsChange);
    setNamespacedAttribute(request, "onAutoLoadChange", this._onAutoLoadChange);
    setNamespacedAttribute(request, "onCacheChange", this._onCacheChange);
    setNamespacedAttribute(request, "onCfgChange", this._onCfgChange);
    setNamespacedAttribute(request, "onContextChange", this._onContextChange);
    setNamespacedAttribute(request, "onDataChange", this._onDataChange);
    setNamespacedAttribute(request, "onDataTypeChange", this._onDataTypeChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onFormChange", this._onFormChange);
    setNamespacedAttribute(request, "onHeadersChange", this._onHeadersChange);
    setNamespacedAttribute(request, "onHostChange", this._onHostChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onMethodChange", this._onMethodChange);
    setNamespacedAttribute(request, "onResponseDataChange", this._onResponseDataChange);
    setNamespacedAttribute(request, "onSelectorChange", this._onSelectorChange);
    setNamespacedAttribute(request, "onSyncChange", this._onSyncChange);
    setNamespacedAttribute(request, "onTimeoutChange", this._onTimeoutChange);
    setNamespacedAttribute(request, "onTransactionChange", this._onTransactionChange);
    setNamespacedAttribute(request, "onUriChange", this._onUriChange);
    setNamespacedAttribute(request, "onXdrChange", this._onXdrChange);
  }
  





  private boolean _active = false;
  private Object _arguments = null;
  private boolean _autoLoad = true;
  private boolean _cache = true;
  private String _cfg = null;
  private Object _context = null;
  private Object _data = null;
  private String _dataType = null;
  private boolean _destroyed = false;
  private Object _form = null;
  private Object _headers = null;
  private Object _host = null;
  private boolean _initialized = false;
  private String _method = null;
  private Object _responseData = null;
  private String _selector = null;
  private boolean _sync = false;
  private Object _timeout = Integer.valueOf(0);
  private Object _transaction = null;
  private String _uri = null;
  private Object _xdr = null;
  private Object _afterActiveChange = null;
  private Object _afterArgumentsChange = null;
  private Object _afterAutoLoadChange = null;
  private Object _afterCacheChange = null;
  private Object _afterCfgChange = null;
  private Object _afterContextChange = null;
  private Object _afterDataChange = null;
  private Object _afterDataTypeChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterFormChange = null;
  private Object _afterHeadersChange = null;
  private Object _afterHostChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterMethodChange = null;
  private Object _afterResponseDataChange = null;
  private Object _afterSelectorChange = null;
  private Object _afterSyncChange = null;
  private Object _afterTimeoutChange = null;
  private Object _afterTransactionChange = null;
  private Object _afterUriChange = null;
  private Object _afterXdrChange = null;
  private Object _onActiveChange = null;
  private Object _onArgumentsChange = null;
  private Object _onAutoLoadChange = null;
  private Object _onCacheChange = null;
  private Object _onCfgChange = null;
  private Object _onContextChange = null;
  private Object _onDataChange = null;
  private Object _onDataTypeChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onFormChange = null;
  private Object _onHeadersChange = null;
  private Object _onHostChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onMethodChange = null;
  private Object _onResponseDataChange = null;
  private Object _onSelectorChange = null;
  private Object _onSyncChange = null;
  private Object _onTimeoutChange = null;
  private Object _onTransactionChange = null;
  private Object _onUriChange = null;
  private Object _onXdrChange = null;
}
