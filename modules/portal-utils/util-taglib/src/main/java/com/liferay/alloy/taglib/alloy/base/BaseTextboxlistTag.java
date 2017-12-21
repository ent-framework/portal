package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseTextboxlistTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:textboxlist:";
  private static final String _PAGE = "/html/taglib/alloy/textboxlist/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:textboxlist:");
    
    return super.doStartTag();
  }
  
  public boolean getAlwaysShowContainer() {
    return this._alwaysShowContainer;
  }
  
  public boolean getApplyLocalFilter() {
    return this._applyLocalFilter;
  }
  
  public boolean getAutoHighlight() {
    return this._autoHighlight;
  }
  
  public String getBoundingBox() {
    return this._boundingBox;
  }
  
  public boolean getButton() {
    return this._button;
  }
  
  public String getContentBox() {
    return this._contentBox;
  }
  
  public String getCssClass() {
    return this._cssClass;
  }
  
  public Object getDataSource() {
    return this._dataSource;
  }
  
  public String getDataSourceType() {
    return this._dataSourceType;
  }
  
  public String getDelimChar() {
    return this._delimChar;
  }
  
  public boolean getDestroyed() {
    return this._destroyed;
  }
  
  public boolean getDisabled() {
    return this._disabled;
  }
  
  public boolean getFocused() {
    return this._focused;
  }
  
  public boolean getForceSelection() {
    return this._forceSelection;
  }
  
  public Object getHeight() {
    return this._height;
  }
  
  public String getHideClass() {
    return this._hideClass;
  }
  
  public String getTextboxlistId() {
    return this._textboxlistId;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public String getInput() {
    return this._input;
  }
  
  public Object getMatchKey() {
    return this._matchKey;
  }
  
  public Object getMaxResultsDisplayed() {
    return this._maxResultsDisplayed;
  }
  
  public Object getMinQueryLength() {
    return this._minQueryLength;
  }
  
  public Object getQueryDelay() {
    return this._queryDelay;
  }
  
  public Object getQueryInterval() {
    return this._queryInterval;
  }
  
  public boolean getQueryMatchCase() {
    return this._queryMatchCase;
  }
  
  public boolean getQueryMatchContains() {
    return this._queryMatchContains;
  }
  
  public boolean getQueryQuestionMark() {
    return this._queryQuestionMark;
  }
  
  public Object getRender() {
    return this._render;
  }
  
  public boolean getRendered() {
    return this._rendered;
  }
  
  public Object getSchema() {
    return this._schema;
  }
  
  public String getSchemaType() {
    return this._schemaType;
  }
  
  public String getSrcNode() {
    return this._srcNode;
  }
  
  public Object getStrings() {
    return this._strings;
  }
  
  public boolean getSuppressInputUpdate() {
    return this._suppressInputUpdate;
  }
  
  public Object getTabIndex() {
    return this._tabIndex;
  }
  
  public boolean getTypeAhead() {
    return this._typeAhead;
  }
  
  public Object getTypeAheadDelay() {
    return this._typeAheadDelay;
  }
  
  public String getUniqueName() {
    return this._uniqueName;
  }
  
  public boolean getUseARIA() {
    return this._useARIA;
  }
  
  public boolean getVisible() {
    return this._visible;
  }
  
  public Object getWidth() {
    return this._width;
  }
  
  public Object getAfterAlwaysShowContainerChange() {
    return this._afterAlwaysShowContainerChange;
  }
  
  public Object getAfterApplyLocalFilterChange() {
    return this._afterApplyLocalFilterChange;
  }
  
  public Object getAfterAutoHighlightChange() {
    return this._afterAutoHighlightChange;
  }
  
  public Object getAfterBoundingBoxChange() {
    return this._afterBoundingBoxChange;
  }
  
  public Object getAfterButtonChange() {
    return this._afterButtonChange;
  }
  
  public Object getAfterContainerCollapse() {
    return this._afterContainerCollapse;
  }
  
  public Object getAfterContainerExpand() {
    return this._afterContainerExpand;
  }
  
  public Object getAfterContainerPopulate() {
    return this._afterContainerPopulate;
  }
  
  public Object getAfterContentBoxChange() {
    return this._afterContentBoxChange;
  }
  
  public Object getAfterCssClassChange() {
    return this._afterCssClassChange;
  }
  
  public Object getAfterDataError() {
    return this._afterDataError;
  }
  
  public Object getAfterDataRequest() {
    return this._afterDataRequest;
  }
  
  public Object getAfterDataReturn() {
    return this._afterDataReturn;
  }
  
  public Object getAfterDataSourceChange() {
    return this._afterDataSourceChange;
  }
  
  public Object getAfterDataSourceTypeChange() {
    return this._afterDataSourceTypeChange;
  }
  
  public Object getAfterDelimCharChange() {
    return this._afterDelimCharChange;
  }
  
  public Object getAfterDestroy() {
    return this._afterDestroy;
  }
  
  public Object getAfterDestroyedChange() {
    return this._afterDestroyedChange;
  }
  
  public Object getAfterDisabledChange() {
    return this._afterDisabledChange;
  }
  
  public Object getAfterFocusedChange() {
    return this._afterFocusedChange;
  }
  
  public Object getAfterForceSelectionChange() {
    return this._afterForceSelectionChange;
  }
  
  public Object getAfterHeightChange() {
    return this._afterHeightChange;
  }
  
  public Object getAfterHideClassChange() {
    return this._afterHideClassChange;
  }
  
  public Object getAfterIdChange() {
    return this._afterIdChange;
  }
  
  public Object getAfterInit() {
    return this._afterInit;
  }
  
  public Object getAfterInitializedChange() {
    return this._afterInitializedChange;
  }
  
  public Object getAfterInputChange() {
    return this._afterInputChange;
  }
  
  public Object getAfterItemArrowFrom() {
    return this._afterItemArrowFrom;
  }
  
  public Object getAfterItemArrowTo() {
    return this._afterItemArrowTo;
  }
  
  public Object getAfterItemMouseOut() {
    return this._afterItemMouseOut;
  }
  
  public Object getAfterItemMouseOver() {
    return this._afterItemMouseOver;
  }
  
  public Object getAfterItemSelect() {
    return this._afterItemSelect;
  }
  
  public Object getAfterMatchKeyChange() {
    return this._afterMatchKeyChange;
  }
  
  public Object getAfterMaxResultsDisplayedChange() {
    return this._afterMaxResultsDisplayedChange;
  }
  
  public Object getAfterMinQueryLengthChange() {
    return this._afterMinQueryLengthChange;
  }
  
  public Object getAfterQueryDelayChange() {
    return this._afterQueryDelayChange;
  }
  
  public Object getAfterQueryIntervalChange() {
    return this._afterQueryIntervalChange;
  }
  
  public Object getAfterQueryMatchCaseChange() {
    return this._afterQueryMatchCaseChange;
  }
  
  public Object getAfterQueryMatchContainsChange() {
    return this._afterQueryMatchContainsChange;
  }
  
  public Object getAfterQueryQuestionMarkChange() {
    return this._afterQueryQuestionMarkChange;
  }
  
  public Object getAfterRenderChange() {
    return this._afterRenderChange;
  }
  
  public Object getAfterRenderedChange() {
    return this._afterRenderedChange;
  }
  
  public Object getAfterSchemaChange() {
    return this._afterSchemaChange;
  }
  
  public Object getAfterSchemaTypeChange() {
    return this._afterSchemaTypeChange;
  }
  
  public Object getAfterSelectionEnforce() {
    return this._afterSelectionEnforce;
  }
  
  public Object getAfterSrcNodeChange() {
    return this._afterSrcNodeChange;
  }
  
  public Object getAfterStringsChange() {
    return this._afterStringsChange;
  }
  
  public Object getAfterSuppressInputUpdateChange() {
    return this._afterSuppressInputUpdateChange;
  }
  
  public Object getAfterTabIndexChange() {
    return this._afterTabIndexChange;
  }
  
  public Object getAfterTextboxBlur() {
    return this._afterTextboxBlur;
  }
  
  public Object getAfterTextboxChange() {
    return this._afterTextboxChange;
  }
  
  public Object getAfterTextboxFocus() {
    return this._afterTextboxFocus;
  }
  
  public Object getAfterTextboxKey() {
    return this._afterTextboxKey;
  }
  
  public Object getAfterTypeAhead() {
    return this._afterTypeAhead;
  }
  
  public Object getAfterTypeAheadChange() {
    return this._afterTypeAheadChange;
  }
  
  public Object getAfterTypeAheadDelayChange() {
    return this._afterTypeAheadDelayChange;
  }
  
  public Object getAfterUniqueNameChange() {
    return this._afterUniqueNameChange;
  }
  
  public Object getAfterUnmatchedItemSelect() {
    return this._afterUnmatchedItemSelect;
  }
  
  public Object getAfterUseARIAChange() {
    return this._afterUseARIAChange;
  }
  
  public Object getAfterVisibleChange() {
    return this._afterVisibleChange;
  }
  
  public Object getAfterContentUpdate() {
    return this._afterContentUpdate;
  }
  
  public Object getAfterRender() {
    return this._afterRender;
  }
  
  public Object getAfterWidthChange() {
    return this._afterWidthChange;
  }
  
  public Object getOnAlwaysShowContainerChange() {
    return this._onAlwaysShowContainerChange;
  }
  
  public Object getOnApplyLocalFilterChange() {
    return this._onApplyLocalFilterChange;
  }
  
  public Object getOnAutoHighlightChange() {
    return this._onAutoHighlightChange;
  }
  
  public Object getOnBoundingBoxChange() {
    return this._onBoundingBoxChange;
  }
  
  public Object getOnButtonChange() {
    return this._onButtonChange;
  }
  
  public Object getOnContainerCollapse() {
    return this._onContainerCollapse;
  }
  
  public Object getOnContainerExpand() {
    return this._onContainerExpand;
  }
  
  public Object getOnContainerPopulate() {
    return this._onContainerPopulate;
  }
  
  public Object getOnContentBoxChange() {
    return this._onContentBoxChange;
  }
  
  public Object getOnCssClassChange() {
    return this._onCssClassChange;
  }
  
  public Object getOnDataError() {
    return this._onDataError;
  }
  
  public Object getOnDataRequest() {
    return this._onDataRequest;
  }
  
  public Object getOnDataReturn() {
    return this._onDataReturn;
  }
  
  public Object getOnDataSourceChange() {
    return this._onDataSourceChange;
  }
  
  public Object getOnDataSourceTypeChange() {
    return this._onDataSourceTypeChange;
  }
  
  public Object getOnDelimCharChange() {
    return this._onDelimCharChange;
  }
  
  public Object getOnDestroy() {
    return this._onDestroy;
  }
  
  public Object getOnDestroyedChange() {
    return this._onDestroyedChange;
  }
  
  public Object getOnDisabledChange() {
    return this._onDisabledChange;
  }
  
  public Object getOnFocusedChange() {
    return this._onFocusedChange;
  }
  
  public Object getOnForceSelectionChange() {
    return this._onForceSelectionChange;
  }
  
  public Object getOnHeightChange() {
    return this._onHeightChange;
  }
  
  public Object getOnHideClassChange() {
    return this._onHideClassChange;
  }
  
  public Object getOnIdChange() {
    return this._onIdChange;
  }
  
  public Object getOnInit() {
    return this._onInit;
  }
  
  public Object getOnInitializedChange() {
    return this._onInitializedChange;
  }
  
  public Object getOnInputChange() {
    return this._onInputChange;
  }
  
  public Object getOnItemArrowFrom() {
    return this._onItemArrowFrom;
  }
  
  public Object getOnItemArrowTo() {
    return this._onItemArrowTo;
  }
  
  public Object getOnItemMouseOut() {
    return this._onItemMouseOut;
  }
  
  public Object getOnItemMouseOver() {
    return this._onItemMouseOver;
  }
  
  public Object getOnItemSelect() {
    return this._onItemSelect;
  }
  
  public Object getOnMatchKeyChange() {
    return this._onMatchKeyChange;
  }
  
  public Object getOnMaxResultsDisplayedChange() {
    return this._onMaxResultsDisplayedChange;
  }
  
  public Object getOnMinQueryLengthChange() {
    return this._onMinQueryLengthChange;
  }
  
  public Object getOnQueryDelayChange() {
    return this._onQueryDelayChange;
  }
  
  public Object getOnQueryIntervalChange() {
    return this._onQueryIntervalChange;
  }
  
  public Object getOnQueryMatchCaseChange() {
    return this._onQueryMatchCaseChange;
  }
  
  public Object getOnQueryMatchContainsChange() {
    return this._onQueryMatchContainsChange;
  }
  
  public Object getOnQueryQuestionMarkChange() {
    return this._onQueryQuestionMarkChange;
  }
  
  public Object getOnRenderChange() {
    return this._onRenderChange;
  }
  
  public Object getOnRenderedChange() {
    return this._onRenderedChange;
  }
  
  public Object getOnSchemaChange() {
    return this._onSchemaChange;
  }
  
  public Object getOnSchemaTypeChange() {
    return this._onSchemaTypeChange;
  }
  
  public Object getOnSelectionEnforce() {
    return this._onSelectionEnforce;
  }
  
  public Object getOnSrcNodeChange() {
    return this._onSrcNodeChange;
  }
  
  public Object getOnStringsChange() {
    return this._onStringsChange;
  }
  
  public Object getOnSuppressInputUpdateChange() {
    return this._onSuppressInputUpdateChange;
  }
  
  public Object getOnTabIndexChange() {
    return this._onTabIndexChange;
  }
  
  public Object getOnTextboxBlur() {
    return this._onTextboxBlur;
  }
  
  public Object getOnTextboxChange() {
    return this._onTextboxChange;
  }
  
  public Object getOnTextboxFocus() {
    return this._onTextboxFocus;
  }
  
  public Object getOnTextboxKey() {
    return this._onTextboxKey;
  }
  
  public Object getOnTypeAhead() {
    return this._onTypeAhead;
  }
  
  public Object getOnTypeAheadChange() {
    return this._onTypeAheadChange;
  }
  
  public Object getOnTypeAheadDelayChange() {
    return this._onTypeAheadDelayChange;
  }
  
  public Object getOnUniqueNameChange() {
    return this._onUniqueNameChange;
  }
  
  public Object getOnUnmatchedItemSelect() {
    return this._onUnmatchedItemSelect;
  }
  
  public Object getOnUseARIAChange() {
    return this._onUseARIAChange;
  }
  
  public Object getOnVisibleChange() {
    return this._onVisibleChange;
  }
  
  public Object getOnContentUpdate() {
    return this._onContentUpdate;
  }
  
  public Object getOnRender() {
    return this._onRender;
  }
  
  public Object getOnWidthChange() {
    return this._onWidthChange;
  }
  
  public void setAlwaysShowContainer(boolean alwaysShowContainer) {
    this._alwaysShowContainer = alwaysShowContainer;
    
    setScopedAttribute("alwaysShowContainer", Boolean.valueOf(alwaysShowContainer));
  }
  
  public void setApplyLocalFilter(boolean applyLocalFilter) {
    this._applyLocalFilter = applyLocalFilter;
    
    setScopedAttribute("applyLocalFilter", Boolean.valueOf(applyLocalFilter));
  }
  
  public void setAutoHighlight(boolean autoHighlight) {
    this._autoHighlight = autoHighlight;
    
    setScopedAttribute("autoHighlight", Boolean.valueOf(autoHighlight));
  }
  
  public void setBoundingBox(String boundingBox) {
    this._boundingBox = boundingBox;
    
    setScopedAttribute("boundingBox", boundingBox);
  }
  
  public void setButton(boolean button) {
    this._button = button;
    
    setScopedAttribute("button", Boolean.valueOf(button));
  }
  
  public void setContentBox(String contentBox) {
    this._contentBox = contentBox;
    
    setScopedAttribute("contentBox", contentBox);
  }
  
  public void setCssClass(String cssClass) {
    this._cssClass = cssClass;
    
    setScopedAttribute("cssClass", cssClass);
  }
  
  public void setDataSource(Object dataSource) {
    this._dataSource = dataSource;
    
    setScopedAttribute("dataSource", dataSource);
  }
  
  public void setDataSourceType(String dataSourceType) {
    this._dataSourceType = dataSourceType;
    
    setScopedAttribute("dataSourceType", dataSourceType);
  }
  
  public void setDelimChar(String delimChar) {
    this._delimChar = delimChar;
    
    setScopedAttribute("delimChar", delimChar);
  }
  
  public void setDestroyed(boolean destroyed) {
    this._destroyed = destroyed;
    
    setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
  }
  
  public void setDisabled(boolean disabled) {
    this._disabled = disabled;
    
    setScopedAttribute("disabled", Boolean.valueOf(disabled));
  }
  
  public void setFocused(boolean focused) {
    this._focused = focused;
    
    setScopedAttribute("focused", Boolean.valueOf(focused));
  }
  
  public void setForceSelection(boolean forceSelection) {
    this._forceSelection = forceSelection;
    
    setScopedAttribute("forceSelection", Boolean.valueOf(forceSelection));
  }
  
  public void setHeight(Object height) {
    this._height = height;
    
    setScopedAttribute("height", height);
  }
  
  public void setHideClass(String hideClass) {
    this._hideClass = hideClass;
    
    setScopedAttribute("hideClass", hideClass);
  }
  
  public void setTextboxlistId(String textboxlistId) {
    this._textboxlistId = textboxlistId;
    
    setScopedAttribute("textboxlistId", textboxlistId);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setInput(String input) {
    this._input = input;
    
    setScopedAttribute("input", input);
  }
  
  public void setMatchKey(Object matchKey) {
    this._matchKey = matchKey;
    
    setScopedAttribute("matchKey", matchKey);
  }
  
  public void setMaxResultsDisplayed(Object maxResultsDisplayed) {
    this._maxResultsDisplayed = maxResultsDisplayed;
    
    setScopedAttribute("maxResultsDisplayed", maxResultsDisplayed);
  }
  
  public void setMinQueryLength(Object minQueryLength) {
    this._minQueryLength = minQueryLength;
    
    setScopedAttribute("minQueryLength", minQueryLength);
  }
  
  public void setQueryDelay(Object queryDelay) {
    this._queryDelay = queryDelay;
    
    setScopedAttribute("queryDelay", queryDelay);
  }
  
  public void setQueryInterval(Object queryInterval) {
    this._queryInterval = queryInterval;
    
    setScopedAttribute("queryInterval", queryInterval);
  }
  
  public void setQueryMatchCase(boolean queryMatchCase) {
    this._queryMatchCase = queryMatchCase;
    
    setScopedAttribute("queryMatchCase", Boolean.valueOf(queryMatchCase));
  }
  
  public void setQueryMatchContains(boolean queryMatchContains) {
    this._queryMatchContains = queryMatchContains;
    
    setScopedAttribute("queryMatchContains", Boolean.valueOf(queryMatchContains));
  }
  
  public void setQueryQuestionMark(boolean queryQuestionMark) {
    this._queryQuestionMark = queryQuestionMark;
    
    setScopedAttribute("queryQuestionMark", Boolean.valueOf(queryQuestionMark));
  }
  
  public void setRender(Object render) {
    this._render = render;
    
    setScopedAttribute("render", render);
  }
  
  public void setRendered(boolean rendered) {
    this._rendered = rendered;
    
    setScopedAttribute("rendered", Boolean.valueOf(rendered));
  }
  
  public void setSchema(Object schema) {
    this._schema = schema;
    
    setScopedAttribute("schema", schema);
  }
  
  public void setSchemaType(String schemaType) {
    this._schemaType = schemaType;
    
    setScopedAttribute("schemaType", schemaType);
  }
  
  public void setSrcNode(String srcNode) {
    this._srcNode = srcNode;
    
    setScopedAttribute("srcNode", srcNode);
  }
  
  public void setStrings(Object strings) {
    this._strings = strings;
    
    setScopedAttribute("strings", strings);
  }
  
  public void setSuppressInputUpdate(boolean suppressInputUpdate) {
    this._suppressInputUpdate = suppressInputUpdate;
    
    setScopedAttribute("suppressInputUpdate", Boolean.valueOf(suppressInputUpdate));
  }
  
  public void setTabIndex(Object tabIndex) {
    this._tabIndex = tabIndex;
    
    setScopedAttribute("tabIndex", tabIndex);
  }
  
  public void setTypeAhead(boolean typeAhead) {
    this._typeAhead = typeAhead;
    
    setScopedAttribute("typeAhead", Boolean.valueOf(typeAhead));
  }
  
  public void setTypeAheadDelay(Object typeAheadDelay) {
    this._typeAheadDelay = typeAheadDelay;
    
    setScopedAttribute("typeAheadDelay", typeAheadDelay);
  }
  
  public void setUniqueName(String uniqueName) {
    this._uniqueName = uniqueName;
    
    setScopedAttribute("uniqueName", uniqueName);
  }
  
  public void setUseARIA(boolean useARIA) {
    this._useARIA = useARIA;
    
    setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
  }
  
  public void setVisible(boolean visible) {
    this._visible = visible;
    
    setScopedAttribute("visible", Boolean.valueOf(visible));
  }
  
  public void setWidth(Object width) {
    this._width = width;
    
    setScopedAttribute("width", width);
  }
  
  public void setAfterAlwaysShowContainerChange(Object afterAlwaysShowContainerChange) {
    this._afterAlwaysShowContainerChange = afterAlwaysShowContainerChange;
    
    setScopedAttribute("afterAlwaysShowContainerChange", afterAlwaysShowContainerChange);
  }
  
  public void setAfterApplyLocalFilterChange(Object afterApplyLocalFilterChange) {
    this._afterApplyLocalFilterChange = afterApplyLocalFilterChange;
    
    setScopedAttribute("afterApplyLocalFilterChange", afterApplyLocalFilterChange);
  }
  
  public void setAfterAutoHighlightChange(Object afterAutoHighlightChange) {
    this._afterAutoHighlightChange = afterAutoHighlightChange;
    
    setScopedAttribute("afterAutoHighlightChange", afterAutoHighlightChange);
  }
  
  public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
    this._afterBoundingBoxChange = afterBoundingBoxChange;
    
    setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
  }
  
  public void setAfterButtonChange(Object afterButtonChange) {
    this._afterButtonChange = afterButtonChange;
    
    setScopedAttribute("afterButtonChange", afterButtonChange);
  }
  
  public void setAfterContainerCollapse(Object afterContainerCollapse) {
    this._afterContainerCollapse = afterContainerCollapse;
    
    setScopedAttribute("afterContainerCollapse", afterContainerCollapse);
  }
  
  public void setAfterContainerExpand(Object afterContainerExpand) {
    this._afterContainerExpand = afterContainerExpand;
    
    setScopedAttribute("afterContainerExpand", afterContainerExpand);
  }
  
  public void setAfterContainerPopulate(Object afterContainerPopulate) {
    this._afterContainerPopulate = afterContainerPopulate;
    
    setScopedAttribute("afterContainerPopulate", afterContainerPopulate);
  }
  
  public void setAfterContentBoxChange(Object afterContentBoxChange) {
    this._afterContentBoxChange = afterContentBoxChange;
    
    setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
  }
  
  public void setAfterCssClassChange(Object afterCssClassChange) {
    this._afterCssClassChange = afterCssClassChange;
    
    setScopedAttribute("afterCssClassChange", afterCssClassChange);
  }
  
  public void setAfterDataError(Object afterDataError) {
    this._afterDataError = afterDataError;
    
    setScopedAttribute("afterDataError", afterDataError);
  }
  
  public void setAfterDataRequest(Object afterDataRequest) {
    this._afterDataRequest = afterDataRequest;
    
    setScopedAttribute("afterDataRequest", afterDataRequest);
  }
  
  public void setAfterDataReturn(Object afterDataReturn) {
    this._afterDataReturn = afterDataReturn;
    
    setScopedAttribute("afterDataReturn", afterDataReturn);
  }
  
  public void setAfterDataSourceChange(Object afterDataSourceChange) {
    this._afterDataSourceChange = afterDataSourceChange;
    
    setScopedAttribute("afterDataSourceChange", afterDataSourceChange);
  }
  
  public void setAfterDataSourceTypeChange(Object afterDataSourceTypeChange) {
    this._afterDataSourceTypeChange = afterDataSourceTypeChange;
    
    setScopedAttribute("afterDataSourceTypeChange", afterDataSourceTypeChange);
  }
  
  public void setAfterDelimCharChange(Object afterDelimCharChange) {
    this._afterDelimCharChange = afterDelimCharChange;
    
    setScopedAttribute("afterDelimCharChange", afterDelimCharChange);
  }
  
  public void setAfterDestroy(Object afterDestroy) {
    this._afterDestroy = afterDestroy;
    
    setScopedAttribute("afterDestroy", afterDestroy);
  }
  
  public void setAfterDestroyedChange(Object afterDestroyedChange) {
    this._afterDestroyedChange = afterDestroyedChange;
    
    setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
  }
  
  public void setAfterDisabledChange(Object afterDisabledChange) {
    this._afterDisabledChange = afterDisabledChange;
    
    setScopedAttribute("afterDisabledChange", afterDisabledChange);
  }
  
  public void setAfterFocusedChange(Object afterFocusedChange) {
    this._afterFocusedChange = afterFocusedChange;
    
    setScopedAttribute("afterFocusedChange", afterFocusedChange);
  }
  
  public void setAfterForceSelectionChange(Object afterForceSelectionChange) {
    this._afterForceSelectionChange = afterForceSelectionChange;
    
    setScopedAttribute("afterForceSelectionChange", afterForceSelectionChange);
  }
  
  public void setAfterHeightChange(Object afterHeightChange) {
    this._afterHeightChange = afterHeightChange;
    
    setScopedAttribute("afterHeightChange", afterHeightChange);
  }
  
  public void setAfterHideClassChange(Object afterHideClassChange) {
    this._afterHideClassChange = afterHideClassChange;
    
    setScopedAttribute("afterHideClassChange", afterHideClassChange);
  }
  
  public void setAfterIdChange(Object afterIdChange) {
    this._afterIdChange = afterIdChange;
    
    setScopedAttribute("afterIdChange", afterIdChange);
  }
  
  public void setAfterInit(Object afterInit) {
    this._afterInit = afterInit;
    
    setScopedAttribute("afterInit", afterInit);
  }
  
  public void setAfterInitializedChange(Object afterInitializedChange) {
    this._afterInitializedChange = afterInitializedChange;
    
    setScopedAttribute("afterInitializedChange", afterInitializedChange);
  }
  
  public void setAfterInputChange(Object afterInputChange) {
    this._afterInputChange = afterInputChange;
    
    setScopedAttribute("afterInputChange", afterInputChange);
  }
  
  public void setAfterItemArrowFrom(Object afterItemArrowFrom) {
    this._afterItemArrowFrom = afterItemArrowFrom;
    
    setScopedAttribute("afterItemArrowFrom", afterItemArrowFrom);
  }
  
  public void setAfterItemArrowTo(Object afterItemArrowTo) {
    this._afterItemArrowTo = afterItemArrowTo;
    
    setScopedAttribute("afterItemArrowTo", afterItemArrowTo);
  }
  
  public void setAfterItemMouseOut(Object afterItemMouseOut) {
    this._afterItemMouseOut = afterItemMouseOut;
    
    setScopedAttribute("afterItemMouseOut", afterItemMouseOut);
  }
  
  public void setAfterItemMouseOver(Object afterItemMouseOver) {
    this._afterItemMouseOver = afterItemMouseOver;
    
    setScopedAttribute("afterItemMouseOver", afterItemMouseOver);
  }
  
  public void setAfterItemSelect(Object afterItemSelect) {
    this._afterItemSelect = afterItemSelect;
    
    setScopedAttribute("afterItemSelect", afterItemSelect);
  }
  
  public void setAfterMatchKeyChange(Object afterMatchKeyChange) {
    this._afterMatchKeyChange = afterMatchKeyChange;
    
    setScopedAttribute("afterMatchKeyChange", afterMatchKeyChange);
  }
  
  public void setAfterMaxResultsDisplayedChange(Object afterMaxResultsDisplayedChange) {
    this._afterMaxResultsDisplayedChange = afterMaxResultsDisplayedChange;
    
    setScopedAttribute("afterMaxResultsDisplayedChange", afterMaxResultsDisplayedChange);
  }
  
  public void setAfterMinQueryLengthChange(Object afterMinQueryLengthChange) {
    this._afterMinQueryLengthChange = afterMinQueryLengthChange;
    
    setScopedAttribute("afterMinQueryLengthChange", afterMinQueryLengthChange);
  }
  
  public void setAfterQueryDelayChange(Object afterQueryDelayChange) {
    this._afterQueryDelayChange = afterQueryDelayChange;
    
    setScopedAttribute("afterQueryDelayChange", afterQueryDelayChange);
  }
  
  public void setAfterQueryIntervalChange(Object afterQueryIntervalChange) {
    this._afterQueryIntervalChange = afterQueryIntervalChange;
    
    setScopedAttribute("afterQueryIntervalChange", afterQueryIntervalChange);
  }
  
  public void setAfterQueryMatchCaseChange(Object afterQueryMatchCaseChange) {
    this._afterQueryMatchCaseChange = afterQueryMatchCaseChange;
    
    setScopedAttribute("afterQueryMatchCaseChange", afterQueryMatchCaseChange);
  }
  
  public void setAfterQueryMatchContainsChange(Object afterQueryMatchContainsChange) {
    this._afterQueryMatchContainsChange = afterQueryMatchContainsChange;
    
    setScopedAttribute("afterQueryMatchContainsChange", afterQueryMatchContainsChange);
  }
  
  public void setAfterQueryQuestionMarkChange(Object afterQueryQuestionMarkChange) {
    this._afterQueryQuestionMarkChange = afterQueryQuestionMarkChange;
    
    setScopedAttribute("afterQueryQuestionMarkChange", afterQueryQuestionMarkChange);
  }
  
  public void setAfterRenderChange(Object afterRenderChange) {
    this._afterRenderChange = afterRenderChange;
    
    setScopedAttribute("afterRenderChange", afterRenderChange);
  }
  
  public void setAfterRenderedChange(Object afterRenderedChange) {
    this._afterRenderedChange = afterRenderedChange;
    
    setScopedAttribute("afterRenderedChange", afterRenderedChange);
  }
  
  public void setAfterSchemaChange(Object afterSchemaChange) {
    this._afterSchemaChange = afterSchemaChange;
    
    setScopedAttribute("afterSchemaChange", afterSchemaChange);
  }
  
  public void setAfterSchemaTypeChange(Object afterSchemaTypeChange) {
    this._afterSchemaTypeChange = afterSchemaTypeChange;
    
    setScopedAttribute("afterSchemaTypeChange", afterSchemaTypeChange);
  }
  
  public void setAfterSelectionEnforce(Object afterSelectionEnforce) {
    this._afterSelectionEnforce = afterSelectionEnforce;
    
    setScopedAttribute("afterSelectionEnforce", afterSelectionEnforce);
  }
  
  public void setAfterSrcNodeChange(Object afterSrcNodeChange) {
    this._afterSrcNodeChange = afterSrcNodeChange;
    
    setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
  }
  
  public void setAfterStringsChange(Object afterStringsChange) {
    this._afterStringsChange = afterStringsChange;
    
    setScopedAttribute("afterStringsChange", afterStringsChange);
  }
  
  public void setAfterSuppressInputUpdateChange(Object afterSuppressInputUpdateChange) {
    this._afterSuppressInputUpdateChange = afterSuppressInputUpdateChange;
    
    setScopedAttribute("afterSuppressInputUpdateChange", afterSuppressInputUpdateChange);
  }
  
  public void setAfterTabIndexChange(Object afterTabIndexChange) {
    this._afterTabIndexChange = afterTabIndexChange;
    
    setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
  }
  
  public void setAfterTextboxBlur(Object afterTextboxBlur) {
    this._afterTextboxBlur = afterTextboxBlur;
    
    setScopedAttribute("afterTextboxBlur", afterTextboxBlur);
  }
  
  public void setAfterTextboxChange(Object afterTextboxChange) {
    this._afterTextboxChange = afterTextboxChange;
    
    setScopedAttribute("afterTextboxChange", afterTextboxChange);
  }
  
  public void setAfterTextboxFocus(Object afterTextboxFocus) {
    this._afterTextboxFocus = afterTextboxFocus;
    
    setScopedAttribute("afterTextboxFocus", afterTextboxFocus);
  }
  
  public void setAfterTextboxKey(Object afterTextboxKey) {
    this._afterTextboxKey = afterTextboxKey;
    
    setScopedAttribute("afterTextboxKey", afterTextboxKey);
  }
  
  public void setAfterTypeAhead(Object afterTypeAhead) {
    this._afterTypeAhead = afterTypeAhead;
    
    setScopedAttribute("afterTypeAhead", afterTypeAhead);
  }
  
  public void setAfterTypeAheadChange(Object afterTypeAheadChange) {
    this._afterTypeAheadChange = afterTypeAheadChange;
    
    setScopedAttribute("afterTypeAheadChange", afterTypeAheadChange);
  }
  
  public void setAfterTypeAheadDelayChange(Object afterTypeAheadDelayChange) {
    this._afterTypeAheadDelayChange = afterTypeAheadDelayChange;
    
    setScopedAttribute("afterTypeAheadDelayChange", afterTypeAheadDelayChange);
  }
  
  public void setAfterUniqueNameChange(Object afterUniqueNameChange) {
    this._afterUniqueNameChange = afterUniqueNameChange;
    
    setScopedAttribute("afterUniqueNameChange", afterUniqueNameChange);
  }
  
  public void setAfterUnmatchedItemSelect(Object afterUnmatchedItemSelect) {
    this._afterUnmatchedItemSelect = afterUnmatchedItemSelect;
    
    setScopedAttribute("afterUnmatchedItemSelect", afterUnmatchedItemSelect);
  }
  
  public void setAfterUseARIAChange(Object afterUseARIAChange) {
    this._afterUseARIAChange = afterUseARIAChange;
    
    setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
  }
  
  public void setAfterVisibleChange(Object afterVisibleChange) {
    this._afterVisibleChange = afterVisibleChange;
    
    setScopedAttribute("afterVisibleChange", afterVisibleChange);
  }
  
  public void setAfterContentUpdate(Object afterContentUpdate) {
    this._afterContentUpdate = afterContentUpdate;
    
    setScopedAttribute("afterContentUpdate", afterContentUpdate);
  }
  
  public void setAfterRender(Object afterRender) {
    this._afterRender = afterRender;
    
    setScopedAttribute("afterRender", afterRender);
  }
  
  public void setAfterWidthChange(Object afterWidthChange) {
    this._afterWidthChange = afterWidthChange;
    
    setScopedAttribute("afterWidthChange", afterWidthChange);
  }
  
  public void setOnAlwaysShowContainerChange(Object onAlwaysShowContainerChange) {
    this._onAlwaysShowContainerChange = onAlwaysShowContainerChange;
    
    setScopedAttribute("onAlwaysShowContainerChange", onAlwaysShowContainerChange);
  }
  
  public void setOnApplyLocalFilterChange(Object onApplyLocalFilterChange) {
    this._onApplyLocalFilterChange = onApplyLocalFilterChange;
    
    setScopedAttribute("onApplyLocalFilterChange", onApplyLocalFilterChange);
  }
  
  public void setOnAutoHighlightChange(Object onAutoHighlightChange) {
    this._onAutoHighlightChange = onAutoHighlightChange;
    
    setScopedAttribute("onAutoHighlightChange", onAutoHighlightChange);
  }
  
  public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
    this._onBoundingBoxChange = onBoundingBoxChange;
    
    setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
  }
  
  public void setOnButtonChange(Object onButtonChange) {
    this._onButtonChange = onButtonChange;
    
    setScopedAttribute("onButtonChange", onButtonChange);
  }
  
  public void setOnContainerCollapse(Object onContainerCollapse) {
    this._onContainerCollapse = onContainerCollapse;
    
    setScopedAttribute("onContainerCollapse", onContainerCollapse);
  }
  
  public void setOnContainerExpand(Object onContainerExpand) {
    this._onContainerExpand = onContainerExpand;
    
    setScopedAttribute("onContainerExpand", onContainerExpand);
  }
  
  public void setOnContainerPopulate(Object onContainerPopulate) {
    this._onContainerPopulate = onContainerPopulate;
    
    setScopedAttribute("onContainerPopulate", onContainerPopulate);
  }
  
  public void setOnContentBoxChange(Object onContentBoxChange) {
    this._onContentBoxChange = onContentBoxChange;
    
    setScopedAttribute("onContentBoxChange", onContentBoxChange);
  }
  
  public void setOnCssClassChange(Object onCssClassChange) {
    this._onCssClassChange = onCssClassChange;
    
    setScopedAttribute("onCssClassChange", onCssClassChange);
  }
  
  public void setOnDataError(Object onDataError) {
    this._onDataError = onDataError;
    
    setScopedAttribute("onDataError", onDataError);
  }
  
  public void setOnDataRequest(Object onDataRequest) {
    this._onDataRequest = onDataRequest;
    
    setScopedAttribute("onDataRequest", onDataRequest);
  }
  
  public void setOnDataReturn(Object onDataReturn) {
    this._onDataReturn = onDataReturn;
    
    setScopedAttribute("onDataReturn", onDataReturn);
  }
  
  public void setOnDataSourceChange(Object onDataSourceChange) {
    this._onDataSourceChange = onDataSourceChange;
    
    setScopedAttribute("onDataSourceChange", onDataSourceChange);
  }
  
  public void setOnDataSourceTypeChange(Object onDataSourceTypeChange) {
    this._onDataSourceTypeChange = onDataSourceTypeChange;
    
    setScopedAttribute("onDataSourceTypeChange", onDataSourceTypeChange);
  }
  
  public void setOnDelimCharChange(Object onDelimCharChange) {
    this._onDelimCharChange = onDelimCharChange;
    
    setScopedAttribute("onDelimCharChange", onDelimCharChange);
  }
  
  public void setOnDestroy(Object onDestroy) {
    this._onDestroy = onDestroy;
    
    setScopedAttribute("onDestroy", onDestroy);
  }
  
  public void setOnDestroyedChange(Object onDestroyedChange) {
    this._onDestroyedChange = onDestroyedChange;
    
    setScopedAttribute("onDestroyedChange", onDestroyedChange);
  }
  
  public void setOnDisabledChange(Object onDisabledChange) {
    this._onDisabledChange = onDisabledChange;
    
    setScopedAttribute("onDisabledChange", onDisabledChange);
  }
  
  public void setOnFocusedChange(Object onFocusedChange) {
    this._onFocusedChange = onFocusedChange;
    
    setScopedAttribute("onFocusedChange", onFocusedChange);
  }
  
  public void setOnForceSelectionChange(Object onForceSelectionChange) {
    this._onForceSelectionChange = onForceSelectionChange;
    
    setScopedAttribute("onForceSelectionChange", onForceSelectionChange);
  }
  
  public void setOnHeightChange(Object onHeightChange) {
    this._onHeightChange = onHeightChange;
    
    setScopedAttribute("onHeightChange", onHeightChange);
  }
  
  public void setOnHideClassChange(Object onHideClassChange) {
    this._onHideClassChange = onHideClassChange;
    
    setScopedAttribute("onHideClassChange", onHideClassChange);
  }
  
  public void setOnIdChange(Object onIdChange) {
    this._onIdChange = onIdChange;
    
    setScopedAttribute("onIdChange", onIdChange);
  }
  
  public void setOnInit(Object onInit) {
    this._onInit = onInit;
    
    setScopedAttribute("onInit", onInit);
  }
  
  public void setOnInitializedChange(Object onInitializedChange) {
    this._onInitializedChange = onInitializedChange;
    
    setScopedAttribute("onInitializedChange", onInitializedChange);
  }
  
  public void setOnInputChange(Object onInputChange) {
    this._onInputChange = onInputChange;
    
    setScopedAttribute("onInputChange", onInputChange);
  }
  
  public void setOnItemArrowFrom(Object onItemArrowFrom) {
    this._onItemArrowFrom = onItemArrowFrom;
    
    setScopedAttribute("onItemArrowFrom", onItemArrowFrom);
  }
  
  public void setOnItemArrowTo(Object onItemArrowTo) {
    this._onItemArrowTo = onItemArrowTo;
    
    setScopedAttribute("onItemArrowTo", onItemArrowTo);
  }
  
  public void setOnItemMouseOut(Object onItemMouseOut) {
    this._onItemMouseOut = onItemMouseOut;
    
    setScopedAttribute("onItemMouseOut", onItemMouseOut);
  }
  
  public void setOnItemMouseOver(Object onItemMouseOver) {
    this._onItemMouseOver = onItemMouseOver;
    
    setScopedAttribute("onItemMouseOver", onItemMouseOver);
  }
  
  public void setOnItemSelect(Object onItemSelect) {
    this._onItemSelect = onItemSelect;
    
    setScopedAttribute("onItemSelect", onItemSelect);
  }
  
  public void setOnMatchKeyChange(Object onMatchKeyChange) {
    this._onMatchKeyChange = onMatchKeyChange;
    
    setScopedAttribute("onMatchKeyChange", onMatchKeyChange);
  }
  
  public void setOnMaxResultsDisplayedChange(Object onMaxResultsDisplayedChange) {
    this._onMaxResultsDisplayedChange = onMaxResultsDisplayedChange;
    
    setScopedAttribute("onMaxResultsDisplayedChange", onMaxResultsDisplayedChange);
  }
  
  public void setOnMinQueryLengthChange(Object onMinQueryLengthChange) {
    this._onMinQueryLengthChange = onMinQueryLengthChange;
    
    setScopedAttribute("onMinQueryLengthChange", onMinQueryLengthChange);
  }
  
  public void setOnQueryDelayChange(Object onQueryDelayChange) {
    this._onQueryDelayChange = onQueryDelayChange;
    
    setScopedAttribute("onQueryDelayChange", onQueryDelayChange);
  }
  
  public void setOnQueryIntervalChange(Object onQueryIntervalChange) {
    this._onQueryIntervalChange = onQueryIntervalChange;
    
    setScopedAttribute("onQueryIntervalChange", onQueryIntervalChange);
  }
  
  public void setOnQueryMatchCaseChange(Object onQueryMatchCaseChange) {
    this._onQueryMatchCaseChange = onQueryMatchCaseChange;
    
    setScopedAttribute("onQueryMatchCaseChange", onQueryMatchCaseChange);
  }
  
  public void setOnQueryMatchContainsChange(Object onQueryMatchContainsChange) {
    this._onQueryMatchContainsChange = onQueryMatchContainsChange;
    
    setScopedAttribute("onQueryMatchContainsChange", onQueryMatchContainsChange);
  }
  
  public void setOnQueryQuestionMarkChange(Object onQueryQuestionMarkChange) {
    this._onQueryQuestionMarkChange = onQueryQuestionMarkChange;
    
    setScopedAttribute("onQueryQuestionMarkChange", onQueryQuestionMarkChange);
  }
  
  public void setOnRenderChange(Object onRenderChange) {
    this._onRenderChange = onRenderChange;
    
    setScopedAttribute("onRenderChange", onRenderChange);
  }
  
  public void setOnRenderedChange(Object onRenderedChange) {
    this._onRenderedChange = onRenderedChange;
    
    setScopedAttribute("onRenderedChange", onRenderedChange);
  }
  
  public void setOnSchemaChange(Object onSchemaChange) {
    this._onSchemaChange = onSchemaChange;
    
    setScopedAttribute("onSchemaChange", onSchemaChange);
  }
  
  public void setOnSchemaTypeChange(Object onSchemaTypeChange) {
    this._onSchemaTypeChange = onSchemaTypeChange;
    
    setScopedAttribute("onSchemaTypeChange", onSchemaTypeChange);
  }
  
  public void setOnSelectionEnforce(Object onSelectionEnforce) {
    this._onSelectionEnforce = onSelectionEnforce;
    
    setScopedAttribute("onSelectionEnforce", onSelectionEnforce);
  }
  
  public void setOnSrcNodeChange(Object onSrcNodeChange) {
    this._onSrcNodeChange = onSrcNodeChange;
    
    setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
  }
  
  public void setOnStringsChange(Object onStringsChange) {
    this._onStringsChange = onStringsChange;
    
    setScopedAttribute("onStringsChange", onStringsChange);
  }
  
  public void setOnSuppressInputUpdateChange(Object onSuppressInputUpdateChange) {
    this._onSuppressInputUpdateChange = onSuppressInputUpdateChange;
    
    setScopedAttribute("onSuppressInputUpdateChange", onSuppressInputUpdateChange);
  }
  
  public void setOnTabIndexChange(Object onTabIndexChange) {
    this._onTabIndexChange = onTabIndexChange;
    
    setScopedAttribute("onTabIndexChange", onTabIndexChange);
  }
  
  public void setOnTextboxBlur(Object onTextboxBlur) {
    this._onTextboxBlur = onTextboxBlur;
    
    setScopedAttribute("onTextboxBlur", onTextboxBlur);
  }
  
  public void setOnTextboxChange(Object onTextboxChange) {
    this._onTextboxChange = onTextboxChange;
    
    setScopedAttribute("onTextboxChange", onTextboxChange);
  }
  
  public void setOnTextboxFocus(Object onTextboxFocus) {
    this._onTextboxFocus = onTextboxFocus;
    
    setScopedAttribute("onTextboxFocus", onTextboxFocus);
  }
  
  public void setOnTextboxKey(Object onTextboxKey) {
    this._onTextboxKey = onTextboxKey;
    
    setScopedAttribute("onTextboxKey", onTextboxKey);
  }
  
  public void setOnTypeAhead(Object onTypeAhead) {
    this._onTypeAhead = onTypeAhead;
    
    setScopedAttribute("onTypeAhead", onTypeAhead);
  }
  
  public void setOnTypeAheadChange(Object onTypeAheadChange) {
    this._onTypeAheadChange = onTypeAheadChange;
    
    setScopedAttribute("onTypeAheadChange", onTypeAheadChange);
  }
  
  public void setOnTypeAheadDelayChange(Object onTypeAheadDelayChange) {
    this._onTypeAheadDelayChange = onTypeAheadDelayChange;
    
    setScopedAttribute("onTypeAheadDelayChange", onTypeAheadDelayChange);
  }
  
  public void setOnUniqueNameChange(Object onUniqueNameChange) {
    this._onUniqueNameChange = onUniqueNameChange;
    
    setScopedAttribute("onUniqueNameChange", onUniqueNameChange);
  }
  
  public void setOnUnmatchedItemSelect(Object onUnmatchedItemSelect) {
    this._onUnmatchedItemSelect = onUnmatchedItemSelect;
    
    setScopedAttribute("onUnmatchedItemSelect", onUnmatchedItemSelect);
  }
  
  public void setOnUseARIAChange(Object onUseARIAChange) {
    this._onUseARIAChange = onUseARIAChange;
    
    setScopedAttribute("onUseARIAChange", onUseARIAChange);
  }
  
  public void setOnVisibleChange(Object onVisibleChange) {
    this._onVisibleChange = onVisibleChange;
    
    setScopedAttribute("onVisibleChange", onVisibleChange);
  }
  
  public void setOnContentUpdate(Object onContentUpdate) {
    this._onContentUpdate = onContentUpdate;
    
    setScopedAttribute("onContentUpdate", onContentUpdate);
  }
  
  public void setOnRender(Object onRender) {
    this._onRender = onRender;
    
    setScopedAttribute("onRender", onRender);
  }
  
  public void setOnWidthChange(Object onWidthChange) {
    this._onWidthChange = onWidthChange;
    
    setScopedAttribute("onWidthChange", onWidthChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._alwaysShowContainer = false;
    this._applyLocalFilter = true;
    this._autoHighlight = true;
    this._boundingBox = null;
    this._button = true;
    this._contentBox = null;
    this._cssClass = null;
    this._dataSource = null;
    this._dataSourceType = null;
    this._delimChar = null;
    this._destroyed = false;
    this._disabled = false;
    this._focused = false;
    this._forceSelection = false;
    this._height = null;
    this._hideClass = "aui-helper-hidden";
    this._textboxlistId = null;
    this._initialized = false;
    this._input = null;
    this._matchKey = null;
    this._maxResultsDisplayed = Integer.valueOf(10);
    this._minQueryLength = Integer.valueOf(1);
    this._queryDelay = Double.valueOf(0.2D);
    this._queryInterval = Double.valueOf(0.5D);
    this._queryMatchCase = false;
    this._queryMatchContains = false;
    this._queryQuestionMark = true;
    this._render = null;
    this._rendered = false;
    this._schema = null;
    this._schemaType = "array";
    this._srcNode = null;
    this._strings = null;
    this._suppressInputUpdate = false;
    this._tabIndex = Integer.valueOf(0);
    this._typeAhead = false;
    this._typeAheadDelay = Double.valueOf(0.2D);
    this._uniqueName = null;
    this._useARIA = true;
    this._visible = true;
    this._width = null;
    this._afterAlwaysShowContainerChange = null;
    this._afterApplyLocalFilterChange = null;
    this._afterAutoHighlightChange = null;
    this._afterBoundingBoxChange = null;
    this._afterButtonChange = null;
    this._afterContainerCollapse = null;
    this._afterContainerExpand = null;
    this._afterContainerPopulate = null;
    this._afterContentBoxChange = null;
    this._afterCssClassChange = null;
    this._afterDataError = null;
    this._afterDataRequest = null;
    this._afterDataReturn = null;
    this._afterDataSourceChange = null;
    this._afterDataSourceTypeChange = null;
    this._afterDelimCharChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterDisabledChange = null;
    this._afterFocusedChange = null;
    this._afterForceSelectionChange = null;
    this._afterHeightChange = null;
    this._afterHideClassChange = null;
    this._afterIdChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterInputChange = null;
    this._afterItemArrowFrom = null;
    this._afterItemArrowTo = null;
    this._afterItemMouseOut = null;
    this._afterItemMouseOver = null;
    this._afterItemSelect = null;
    this._afterMatchKeyChange = null;
    this._afterMaxResultsDisplayedChange = null;
    this._afterMinQueryLengthChange = null;
    this._afterQueryDelayChange = null;
    this._afterQueryIntervalChange = null;
    this._afterQueryMatchCaseChange = null;
    this._afterQueryMatchContainsChange = null;
    this._afterQueryQuestionMarkChange = null;
    this._afterRenderChange = null;
    this._afterRenderedChange = null;
    this._afterSchemaChange = null;
    this._afterSchemaTypeChange = null;
    this._afterSelectionEnforce = null;
    this._afterSrcNodeChange = null;
    this._afterStringsChange = null;
    this._afterSuppressInputUpdateChange = null;
    this._afterTabIndexChange = null;
    this._afterTextboxBlur = null;
    this._afterTextboxChange = null;
    this._afterTextboxFocus = null;
    this._afterTextboxKey = null;
    this._afterTypeAhead = null;
    this._afterTypeAheadChange = null;
    this._afterTypeAheadDelayChange = null;
    this._afterUniqueNameChange = null;
    this._afterUnmatchedItemSelect = null;
    this._afterUseARIAChange = null;
    this._afterVisibleChange = null;
    this._afterContentUpdate = null;
    this._afterRender = null;
    this._afterWidthChange = null;
    this._onAlwaysShowContainerChange = null;
    this._onApplyLocalFilterChange = null;
    this._onAutoHighlightChange = null;
    this._onBoundingBoxChange = null;
    this._onButtonChange = null;
    this._onContainerCollapse = null;
    this._onContainerExpand = null;
    this._onContainerPopulate = null;
    this._onContentBoxChange = null;
    this._onCssClassChange = null;
    this._onDataError = null;
    this._onDataRequest = null;
    this._onDataReturn = null;
    this._onDataSourceChange = null;
    this._onDataSourceTypeChange = null;
    this._onDelimCharChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onDisabledChange = null;
    this._onFocusedChange = null;
    this._onForceSelectionChange = null;
    this._onHeightChange = null;
    this._onHideClassChange = null;
    this._onIdChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onInputChange = null;
    this._onItemArrowFrom = null;
    this._onItemArrowTo = null;
    this._onItemMouseOut = null;
    this._onItemMouseOver = null;
    this._onItemSelect = null;
    this._onMatchKeyChange = null;
    this._onMaxResultsDisplayedChange = null;
    this._onMinQueryLengthChange = null;
    this._onQueryDelayChange = null;
    this._onQueryIntervalChange = null;
    this._onQueryMatchCaseChange = null;
    this._onQueryMatchContainsChange = null;
    this._onQueryQuestionMarkChange = null;
    this._onRenderChange = null;
    this._onRenderedChange = null;
    this._onSchemaChange = null;
    this._onSchemaTypeChange = null;
    this._onSelectionEnforce = null;
    this._onSrcNodeChange = null;
    this._onStringsChange = null;
    this._onSuppressInputUpdateChange = null;
    this._onTabIndexChange = null;
    this._onTextboxBlur = null;
    this._onTextboxChange = null;
    this._onTextboxFocus = null;
    this._onTextboxKey = null;
    this._onTypeAhead = null;
    this._onTypeAheadChange = null;
    this._onTypeAheadDelayChange = null;
    this._onUniqueNameChange = null;
    this._onUnmatchedItemSelect = null;
    this._onUseARIAChange = null;
    this._onVisibleChange = null;
    this._onContentUpdate = null;
    this._onRender = null;
    this._onWidthChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/textboxlist/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "alwaysShowContainer", Boolean.valueOf(this._alwaysShowContainer));
    setNamespacedAttribute(request, "applyLocalFilter", Boolean.valueOf(this._applyLocalFilter));
    setNamespacedAttribute(request, "autoHighlight", Boolean.valueOf(this._autoHighlight));
    setNamespacedAttribute(request, "boundingBox", this._boundingBox);
    setNamespacedAttribute(request, "button", Boolean.valueOf(this._button));
    setNamespacedAttribute(request, "contentBox", this._contentBox);
    setNamespacedAttribute(request, "cssClass", this._cssClass);
    setNamespacedAttribute(request, "dataSource", this._dataSource);
    setNamespacedAttribute(request, "dataSourceType", this._dataSourceType);
    setNamespacedAttribute(request, "delimChar", this._delimChar);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
    setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
    setNamespacedAttribute(request, "forceSelection", Boolean.valueOf(this._forceSelection));
    setNamespacedAttribute(request, "height", this._height);
    setNamespacedAttribute(request, "hideClass", this._hideClass);
    setNamespacedAttribute(request, "textboxlistId", this._textboxlistId);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "input", this._input);
    setNamespacedAttribute(request, "matchKey", this._matchKey);
    setNamespacedAttribute(request, "maxResultsDisplayed", this._maxResultsDisplayed);
    setNamespacedAttribute(request, "minQueryLength", this._minQueryLength);
    setNamespacedAttribute(request, "queryDelay", this._queryDelay);
    setNamespacedAttribute(request, "queryInterval", this._queryInterval);
    setNamespacedAttribute(request, "queryMatchCase", Boolean.valueOf(this._queryMatchCase));
    setNamespacedAttribute(request, "queryMatchContains", Boolean.valueOf(this._queryMatchContains));
    setNamespacedAttribute(request, "queryQuestionMark", Boolean.valueOf(this._queryQuestionMark));
    setNamespacedAttribute(request, "render", this._render);
    setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
    setNamespacedAttribute(request, "schema", this._schema);
    setNamespacedAttribute(request, "schemaType", this._schemaType);
    setNamespacedAttribute(request, "srcNode", this._srcNode);
    setNamespacedAttribute(request, "strings", this._strings);
    setNamespacedAttribute(request, "suppressInputUpdate", Boolean.valueOf(this._suppressInputUpdate));
    setNamespacedAttribute(request, "tabIndex", this._tabIndex);
    setNamespacedAttribute(request, "typeAhead", Boolean.valueOf(this._typeAhead));
    setNamespacedAttribute(request, "typeAheadDelay", this._typeAheadDelay);
    setNamespacedAttribute(request, "uniqueName", this._uniqueName);
    setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
    setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
    setNamespacedAttribute(request, "width", this._width);
    setNamespacedAttribute(request, "afterAlwaysShowContainerChange", this._afterAlwaysShowContainerChange);
    setNamespacedAttribute(request, "afterApplyLocalFilterChange", this._afterApplyLocalFilterChange);
    setNamespacedAttribute(request, "afterAutoHighlightChange", this._afterAutoHighlightChange);
    setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
    setNamespacedAttribute(request, "afterButtonChange", this._afterButtonChange);
    setNamespacedAttribute(request, "afterContainerCollapse", this._afterContainerCollapse);
    setNamespacedAttribute(request, "afterContainerExpand", this._afterContainerExpand);
    setNamespacedAttribute(request, "afterContainerPopulate", this._afterContainerPopulate);
    setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
    setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
    setNamespacedAttribute(request, "afterDataError", this._afterDataError);
    setNamespacedAttribute(request, "afterDataRequest", this._afterDataRequest);
    setNamespacedAttribute(request, "afterDataReturn", this._afterDataReturn);
    setNamespacedAttribute(request, "afterDataSourceChange", this._afterDataSourceChange);
    setNamespacedAttribute(request, "afterDataSourceTypeChange", this._afterDataSourceTypeChange);
    setNamespacedAttribute(request, "afterDelimCharChange", this._afterDelimCharChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
    setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
    setNamespacedAttribute(request, "afterForceSelectionChange", this._afterForceSelectionChange);
    setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
    setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
    setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterInputChange", this._afterInputChange);
    setNamespacedAttribute(request, "afterItemArrowFrom", this._afterItemArrowFrom);
    setNamespacedAttribute(request, "afterItemArrowTo", this._afterItemArrowTo);
    setNamespacedAttribute(request, "afterItemMouseOut", this._afterItemMouseOut);
    setNamespacedAttribute(request, "afterItemMouseOver", this._afterItemMouseOver);
    setNamespacedAttribute(request, "afterItemSelect", this._afterItemSelect);
    setNamespacedAttribute(request, "afterMatchKeyChange", this._afterMatchKeyChange);
    setNamespacedAttribute(request, "afterMaxResultsDisplayedChange", this._afterMaxResultsDisplayedChange);
    setNamespacedAttribute(request, "afterMinQueryLengthChange", this._afterMinQueryLengthChange);
    setNamespacedAttribute(request, "afterQueryDelayChange", this._afterQueryDelayChange);
    setNamespacedAttribute(request, "afterQueryIntervalChange", this._afterQueryIntervalChange);
    setNamespacedAttribute(request, "afterQueryMatchCaseChange", this._afterQueryMatchCaseChange);
    setNamespacedAttribute(request, "afterQueryMatchContainsChange", this._afterQueryMatchContainsChange);
    setNamespacedAttribute(request, "afterQueryQuestionMarkChange", this._afterQueryQuestionMarkChange);
    setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
    setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
    setNamespacedAttribute(request, "afterSchemaChange", this._afterSchemaChange);
    setNamespacedAttribute(request, "afterSchemaTypeChange", this._afterSchemaTypeChange);
    setNamespacedAttribute(request, "afterSelectionEnforce", this._afterSelectionEnforce);
    setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
    setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
    setNamespacedAttribute(request, "afterSuppressInputUpdateChange", this._afterSuppressInputUpdateChange);
    setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
    setNamespacedAttribute(request, "afterTextboxBlur", this._afterTextboxBlur);
    setNamespacedAttribute(request, "afterTextboxChange", this._afterTextboxChange);
    setNamespacedAttribute(request, "afterTextboxFocus", this._afterTextboxFocus);
    setNamespacedAttribute(request, "afterTextboxKey", this._afterTextboxKey);
    setNamespacedAttribute(request, "afterTypeAhead", this._afterTypeAhead);
    setNamespacedAttribute(request, "afterTypeAheadChange", this._afterTypeAheadChange);
    setNamespacedAttribute(request, "afterTypeAheadDelayChange", this._afterTypeAheadDelayChange);
    setNamespacedAttribute(request, "afterUniqueNameChange", this._afterUniqueNameChange);
    setNamespacedAttribute(request, "afterUnmatchedItemSelect", this._afterUnmatchedItemSelect);
    setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
    setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
    setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
    setNamespacedAttribute(request, "afterRender", this._afterRender);
    setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
    setNamespacedAttribute(request, "onAlwaysShowContainerChange", this._onAlwaysShowContainerChange);
    setNamespacedAttribute(request, "onApplyLocalFilterChange", this._onApplyLocalFilterChange);
    setNamespacedAttribute(request, "onAutoHighlightChange", this._onAutoHighlightChange);
    setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
    setNamespacedAttribute(request, "onButtonChange", this._onButtonChange);
    setNamespacedAttribute(request, "onContainerCollapse", this._onContainerCollapse);
    setNamespacedAttribute(request, "onContainerExpand", this._onContainerExpand);
    setNamespacedAttribute(request, "onContainerPopulate", this._onContainerPopulate);
    setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
    setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
    setNamespacedAttribute(request, "onDataError", this._onDataError);
    setNamespacedAttribute(request, "onDataRequest", this._onDataRequest);
    setNamespacedAttribute(request, "onDataReturn", this._onDataReturn);
    setNamespacedAttribute(request, "onDataSourceChange", this._onDataSourceChange);
    setNamespacedAttribute(request, "onDataSourceTypeChange", this._onDataSourceTypeChange);
    setNamespacedAttribute(request, "onDelimCharChange", this._onDelimCharChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
    setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
    setNamespacedAttribute(request, "onForceSelectionChange", this._onForceSelectionChange);
    setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
    setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
    setNamespacedAttribute(request, "onIdChange", this._onIdChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onInputChange", this._onInputChange);
    setNamespacedAttribute(request, "onItemArrowFrom", this._onItemArrowFrom);
    setNamespacedAttribute(request, "onItemArrowTo", this._onItemArrowTo);
    setNamespacedAttribute(request, "onItemMouseOut", this._onItemMouseOut);
    setNamespacedAttribute(request, "onItemMouseOver", this._onItemMouseOver);
    setNamespacedAttribute(request, "onItemSelect", this._onItemSelect);
    setNamespacedAttribute(request, "onMatchKeyChange", this._onMatchKeyChange);
    setNamespacedAttribute(request, "onMaxResultsDisplayedChange", this._onMaxResultsDisplayedChange);
    setNamespacedAttribute(request, "onMinQueryLengthChange", this._onMinQueryLengthChange);
    setNamespacedAttribute(request, "onQueryDelayChange", this._onQueryDelayChange);
    setNamespacedAttribute(request, "onQueryIntervalChange", this._onQueryIntervalChange);
    setNamespacedAttribute(request, "onQueryMatchCaseChange", this._onQueryMatchCaseChange);
    setNamespacedAttribute(request, "onQueryMatchContainsChange", this._onQueryMatchContainsChange);
    setNamespacedAttribute(request, "onQueryQuestionMarkChange", this._onQueryQuestionMarkChange);
    setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
    setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
    setNamespacedAttribute(request, "onSchemaChange", this._onSchemaChange);
    setNamespacedAttribute(request, "onSchemaTypeChange", this._onSchemaTypeChange);
    setNamespacedAttribute(request, "onSelectionEnforce", this._onSelectionEnforce);
    setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
    setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
    setNamespacedAttribute(request, "onSuppressInputUpdateChange", this._onSuppressInputUpdateChange);
    setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
    setNamespacedAttribute(request, "onTextboxBlur", this._onTextboxBlur);
    setNamespacedAttribute(request, "onTextboxChange", this._onTextboxChange);
    setNamespacedAttribute(request, "onTextboxFocus", this._onTextboxFocus);
    setNamespacedAttribute(request, "onTextboxKey", this._onTextboxKey);
    setNamespacedAttribute(request, "onTypeAhead", this._onTypeAhead);
    setNamespacedAttribute(request, "onTypeAheadChange", this._onTypeAheadChange);
    setNamespacedAttribute(request, "onTypeAheadDelayChange", this._onTypeAheadDelayChange);
    setNamespacedAttribute(request, "onUniqueNameChange", this._onUniqueNameChange);
    setNamespacedAttribute(request, "onUnmatchedItemSelect", this._onUnmatchedItemSelect);
    setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
    setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
    setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
    setNamespacedAttribute(request, "onRender", this._onRender);
    setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
  }
  





  private boolean _alwaysShowContainer = false;
  private boolean _applyLocalFilter = true;
  private boolean _autoHighlight = true;
  private String _boundingBox = null;
  private boolean _button = true;
  private String _contentBox = null;
  private String _cssClass = null;
  private Object _dataSource = null;
  private String _dataSourceType = null;
  private String _delimChar = null;
  private boolean _destroyed = false;
  private boolean _disabled = false;
  private boolean _focused = false;
  private boolean _forceSelection = false;
  private Object _height = null;
  private String _hideClass = "aui-helper-hidden";
  private String _textboxlistId = null;
  private boolean _initialized = false;
  private String _input = null;
  private Object _matchKey = null;
  private Object _maxResultsDisplayed = Integer.valueOf(10);
  private Object _minQueryLength = Integer.valueOf(1);
  private Object _queryDelay = Double.valueOf(0.2D);
  private Object _queryInterval = Double.valueOf(0.5D);
  private boolean _queryMatchCase = false;
  private boolean _queryMatchContains = false;
  private boolean _queryQuestionMark = true;
  private Object _render = null;
  private boolean _rendered = false;
  private Object _schema = null;
  private String _schemaType = "array";
  private String _srcNode = null;
  private Object _strings = null;
  private boolean _suppressInputUpdate = false;
  private Object _tabIndex = Integer.valueOf(0);
  private boolean _typeAhead = false;
  private Object _typeAheadDelay = Double.valueOf(0.2D);
  private String _uniqueName = null;
  private boolean _useARIA = true;
  private boolean _visible = true;
  private Object _width = null;
  private Object _afterAlwaysShowContainerChange = null;
  private Object _afterApplyLocalFilterChange = null;
  private Object _afterAutoHighlightChange = null;
  private Object _afterBoundingBoxChange = null;
  private Object _afterButtonChange = null;
  private Object _afterContainerCollapse = null;
  private Object _afterContainerExpand = null;
  private Object _afterContainerPopulate = null;
  private Object _afterContentBoxChange = null;
  private Object _afterCssClassChange = null;
  private Object _afterDataError = null;
  private Object _afterDataRequest = null;
  private Object _afterDataReturn = null;
  private Object _afterDataSourceChange = null;
  private Object _afterDataSourceTypeChange = null;
  private Object _afterDelimCharChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterDisabledChange = null;
  private Object _afterFocusedChange = null;
  private Object _afterForceSelectionChange = null;
  private Object _afterHeightChange = null;
  private Object _afterHideClassChange = null;
  private Object _afterIdChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterInputChange = null;
  private Object _afterItemArrowFrom = null;
  private Object _afterItemArrowTo = null;
  private Object _afterItemMouseOut = null;
  private Object _afterItemMouseOver = null;
  private Object _afterItemSelect = null;
  private Object _afterMatchKeyChange = null;
  private Object _afterMaxResultsDisplayedChange = null;
  private Object _afterMinQueryLengthChange = null;
  private Object _afterQueryDelayChange = null;
  private Object _afterQueryIntervalChange = null;
  private Object _afterQueryMatchCaseChange = null;
  private Object _afterQueryMatchContainsChange = null;
  private Object _afterQueryQuestionMarkChange = null;
  private Object _afterRenderChange = null;
  private Object _afterRenderedChange = null;
  private Object _afterSchemaChange = null;
  private Object _afterSchemaTypeChange = null;
  private Object _afterSelectionEnforce = null;
  private Object _afterSrcNodeChange = null;
  private Object _afterStringsChange = null;
  private Object _afterSuppressInputUpdateChange = null;
  private Object _afterTabIndexChange = null;
  private Object _afterTextboxBlur = null;
  private Object _afterTextboxChange = null;
  private Object _afterTextboxFocus = null;
  private Object _afterTextboxKey = null;
  private Object _afterTypeAhead = null;
  private Object _afterTypeAheadChange = null;
  private Object _afterTypeAheadDelayChange = null;
  private Object _afterUniqueNameChange = null;
  private Object _afterUnmatchedItemSelect = null;
  private Object _afterUseARIAChange = null;
  private Object _afterVisibleChange = null;
  private Object _afterContentUpdate = null;
  private Object _afterRender = null;
  private Object _afterWidthChange = null;
  private Object _onAlwaysShowContainerChange = null;
  private Object _onApplyLocalFilterChange = null;
  private Object _onAutoHighlightChange = null;
  private Object _onBoundingBoxChange = null;
  private Object _onButtonChange = null;
  private Object _onContainerCollapse = null;
  private Object _onContainerExpand = null;
  private Object _onContainerPopulate = null;
  private Object _onContentBoxChange = null;
  private Object _onCssClassChange = null;
  private Object _onDataError = null;
  private Object _onDataRequest = null;
  private Object _onDataReturn = null;
  private Object _onDataSourceChange = null;
  private Object _onDataSourceTypeChange = null;
  private Object _onDelimCharChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onDisabledChange = null;
  private Object _onFocusedChange = null;
  private Object _onForceSelectionChange = null;
  private Object _onHeightChange = null;
  private Object _onHideClassChange = null;
  private Object _onIdChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onInputChange = null;
  private Object _onItemArrowFrom = null;
  private Object _onItemArrowTo = null;
  private Object _onItemMouseOut = null;
  private Object _onItemMouseOver = null;
  private Object _onItemSelect = null;
  private Object _onMatchKeyChange = null;
  private Object _onMaxResultsDisplayedChange = null;
  private Object _onMinQueryLengthChange = null;
  private Object _onQueryDelayChange = null;
  private Object _onQueryIntervalChange = null;
  private Object _onQueryMatchCaseChange = null;
  private Object _onQueryMatchContainsChange = null;
  private Object _onQueryQuestionMarkChange = null;
  private Object _onRenderChange = null;
  private Object _onRenderedChange = null;
  private Object _onSchemaChange = null;
  private Object _onSchemaTypeChange = null;
  private Object _onSelectionEnforce = null;
  private Object _onSrcNodeChange = null;
  private Object _onStringsChange = null;
  private Object _onSuppressInputUpdateChange = null;
  private Object _onTabIndexChange = null;
  private Object _onTextboxBlur = null;
  private Object _onTextboxChange = null;
  private Object _onTextboxFocus = null;
  private Object _onTextboxKey = null;
  private Object _onTypeAhead = null;
  private Object _onTypeAheadChange = null;
  private Object _onTypeAheadDelayChange = null;
  private Object _onUniqueNameChange = null;
  private Object _onUnmatchedItemSelect = null;
  private Object _onUseARIAChange = null;
  private Object _onVisibleChange = null;
  private Object _onContentUpdate = null;
  private Object _onRender = null;
  private Object _onWidthChange = null;
}
