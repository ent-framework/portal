package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;















public abstract class BaseDatePickerSelectTag
  extends IncludeTag
{
  protected static final String _ATTRIBUTE_NAMESPACE = "alloy:date-picker-select:";
  private static final String _PAGE = "/html/taglib/alloy/date_picker_select/page.jsp";
  
  public int doStartTag()
    throws JspException
  {
    setAttributeNamespace("alloy:date-picker-select:");
    
    return super.doStartTag();
  }
  
  public Object getAppendOrder() {
    return this._appendOrder;
  }
  
  public String getBoundingBox() {
    return this._boundingBox;
  }
  
  public String getButtonNode() {
    return this._buttonNode;
  }
  
  public Object getCalendar() {
    return this._calendar;
  }
  
  public String getContentBox() {
    return this._contentBox;
  }
  
  public String getCssClass() {
    return this._cssClass;
  }
  
  public String getDayNode() {
    return this._dayNode;
  }
  
  public String getDayNodeName() {
    return this._dayNodeName;
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
  
  public Object getFormatter() {
    return this._formatter;
  }
  
  public Object getHeight() {
    return this._height;
  }
  
  public String getHideClass() {
    return this._hideClass;
  }
  
  public String getDatepickerselectId() {
    return this._datepickerselectId;
  }
  
  public boolean getInitialized() {
    return this._initialized;
  }
  
  public String getMonthNode() {
    return this._monthNode;
  }
  
  public String getMonthNodeName() {
    return this._monthNodeName;
  }
  
  public boolean getNullableDay() {
    return this._nullableDay;
  }
  
  public boolean getNullableMonth() {
    return this._nullableMonth;
  }
  
  public boolean getNullableYear() {
    return this._nullableYear;
  }
  
  public boolean getPopulateDay() {
    return this._populateDay;
  }
  
  public boolean getPopulateMonth() {
    return this._populateMonth;
  }
  
  public boolean getPopulateYear() {
    return this._populateYear;
  }
  
  public Object getRender() {
    return this._render;
  }
  
  public boolean getRendered() {
    return this._rendered;
  }
  
  public String getSelectWrapperNode() {
    return this._selectWrapperNode;
  }
  
  public boolean getSetValue() {
    return this._setValue;
  }
  
  public String getSrcNode() {
    return this._srcNode;
  }
  
  public boolean getStack() {
    return this._stack;
  }
  
  public Object getStrings() {
    return this._strings;
  }
  
  public Object getTabIndex() {
    return this._tabIndex;
  }
  
  public Object getTrigger() {
    return this._trigger;
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
  
  public String getYearNode() {
    return this._yearNode;
  }
  
  public String getYearNodeName() {
    return this._yearNodeName;
  }
  
  public Object getYearRange() {
    return this._yearRange;
  }
  
  public Object getAfterAppendOrderChange() {
    return this._afterAppendOrderChange;
  }
  
  public Object getAfterBoundingBoxChange() {
    return this._afterBoundingBoxChange;
  }
  
  public Object getAfterButtonNodeChange() {
    return this._afterButtonNodeChange;
  }
  
  public Object getAfterCalendarChange() {
    return this._afterCalendarChange;
  }
  
  public Object getAfterContentBoxChange() {
    return this._afterContentBoxChange;
  }
  
  public Object getAfterCssClassChange() {
    return this._afterCssClassChange;
  }
  
  public Object getAfterDayNodeChange() {
    return this._afterDayNodeChange;
  }
  
  public Object getAfterDayNodeNameChange() {
    return this._afterDayNodeNameChange;
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
  
  public Object getAfterFormatterChange() {
    return this._afterFormatterChange;
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
  
  public Object getAfterMonthNodeChange() {
    return this._afterMonthNodeChange;
  }
  
  public Object getAfterMonthNodeNameChange() {
    return this._afterMonthNodeNameChange;
  }
  
  public Object getAfterNullableDayChange() {
    return this._afterNullableDayChange;
  }
  
  public Object getAfterNullableMonthChange() {
    return this._afterNullableMonthChange;
  }
  
  public Object getAfterNullableYearChange() {
    return this._afterNullableYearChange;
  }
  
  public Object getAfterPopulateDayChange() {
    return this._afterPopulateDayChange;
  }
  
  public Object getAfterPopulateMonthChange() {
    return this._afterPopulateMonthChange;
  }
  
  public Object getAfterPopulateYearChange() {
    return this._afterPopulateYearChange;
  }
  
  public Object getAfterRenderChange() {
    return this._afterRenderChange;
  }
  
  public Object getAfterRenderedChange() {
    return this._afterRenderedChange;
  }
  
  public Object getAfterSelectWrapperNodeChange() {
    return this._afterSelectWrapperNodeChange;
  }
  
  public Object getAfterSetValueChange() {
    return this._afterSetValueChange;
  }
  
  public Object getAfterSrcNodeChange() {
    return this._afterSrcNodeChange;
  }
  
  public Object getAfterStackChange() {
    return this._afterStackChange;
  }
  
  public Object getAfterStringsChange() {
    return this._afterStringsChange;
  }
  
  public Object getAfterTabIndexChange() {
    return this._afterTabIndexChange;
  }
  
  public Object getAfterTriggerChange() {
    return this._afterTriggerChange;
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
  
  public Object getAfterYearNodeChange() {
    return this._afterYearNodeChange;
  }
  
  public Object getAfterYearNodeNameChange() {
    return this._afterYearNodeNameChange;
  }
  
  public Object getAfterYearRangeChange() {
    return this._afterYearRangeChange;
  }
  
  public Object getOnAppendOrderChange() {
    return this._onAppendOrderChange;
  }
  
  public Object getOnBoundingBoxChange() {
    return this._onBoundingBoxChange;
  }
  
  public Object getOnButtonNodeChange() {
    return this._onButtonNodeChange;
  }
  
  public Object getOnCalendarChange() {
    return this._onCalendarChange;
  }
  
  public Object getOnContentBoxChange() {
    return this._onContentBoxChange;
  }
  
  public Object getOnCssClassChange() {
    return this._onCssClassChange;
  }
  
  public Object getOnDayNodeChange() {
    return this._onDayNodeChange;
  }
  
  public Object getOnDayNodeNameChange() {
    return this._onDayNodeNameChange;
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
  
  public Object getOnFormatterChange() {
    return this._onFormatterChange;
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
  
  public Object getOnMonthNodeChange() {
    return this._onMonthNodeChange;
  }
  
  public Object getOnMonthNodeNameChange() {
    return this._onMonthNodeNameChange;
  }
  
  public Object getOnNullableDayChange() {
    return this._onNullableDayChange;
  }
  
  public Object getOnNullableMonthChange() {
    return this._onNullableMonthChange;
  }
  
  public Object getOnNullableYearChange() {
    return this._onNullableYearChange;
  }
  
  public Object getOnPopulateDayChange() {
    return this._onPopulateDayChange;
  }
  
  public Object getOnPopulateMonthChange() {
    return this._onPopulateMonthChange;
  }
  
  public Object getOnPopulateYearChange() {
    return this._onPopulateYearChange;
  }
  
  public Object getOnRenderChange() {
    return this._onRenderChange;
  }
  
  public Object getOnRenderedChange() {
    return this._onRenderedChange;
  }
  
  public Object getOnSelectWrapperNodeChange() {
    return this._onSelectWrapperNodeChange;
  }
  
  public Object getOnSetValueChange() {
    return this._onSetValueChange;
  }
  
  public Object getOnSrcNodeChange() {
    return this._onSrcNodeChange;
  }
  
  public Object getOnStackChange() {
    return this._onStackChange;
  }
  
  public Object getOnStringsChange() {
    return this._onStringsChange;
  }
  
  public Object getOnTabIndexChange() {
    return this._onTabIndexChange;
  }
  
  public Object getOnTriggerChange() {
    return this._onTriggerChange;
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
  
  public Object getOnYearNodeChange() {
    return this._onYearNodeChange;
  }
  
  public Object getOnYearNodeNameChange() {
    return this._onYearNodeNameChange;
  }
  
  public Object getOnYearRangeChange() {
    return this._onYearRangeChange;
  }
  
  public void setAppendOrder(Object appendOrder) {
    this._appendOrder = appendOrder;
    
    setScopedAttribute("appendOrder", appendOrder);
  }
  
  public void setBoundingBox(String boundingBox) {
    this._boundingBox = boundingBox;
    
    setScopedAttribute("boundingBox", boundingBox);
  }
  
  public void setButtonNode(String buttonNode) {
    this._buttonNode = buttonNode;
    
    setScopedAttribute("buttonNode", buttonNode);
  }
  
  public void setCalendar(Object calendar) {
    this._calendar = calendar;
    
    setScopedAttribute("calendar", calendar);
  }
  
  public void setContentBox(String contentBox) {
    this._contentBox = contentBox;
    
    setScopedAttribute("contentBox", contentBox);
  }
  
  public void setCssClass(String cssClass) {
    this._cssClass = cssClass;
    
    setScopedAttribute("cssClass", cssClass);
  }
  
  public void setDayNode(String dayNode) {
    this._dayNode = dayNode;
    
    setScopedAttribute("dayNode", dayNode);
  }
  
  public void setDayNodeName(String dayNodeName) {
    this._dayNodeName = dayNodeName;
    
    setScopedAttribute("dayNodeName", dayNodeName);
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
  
  public void setFormatter(Object formatter) {
    this._formatter = formatter;
    
    setScopedAttribute("formatter", formatter);
  }
  
  public void setHeight(Object height) {
    this._height = height;
    
    setScopedAttribute("height", height);
  }
  
  public void setHideClass(String hideClass) {
    this._hideClass = hideClass;
    
    setScopedAttribute("hideClass", hideClass);
  }
  
  public void setDatepickerselectId(String datepickerselectId) {
    this._datepickerselectId = datepickerselectId;
    
    setScopedAttribute("datepickerselectId", datepickerselectId);
  }
  
  public void setInitialized(boolean initialized) {
    this._initialized = initialized;
    
    setScopedAttribute("initialized", Boolean.valueOf(initialized));
  }
  
  public void setMonthNode(String monthNode) {
    this._monthNode = monthNode;
    
    setScopedAttribute("monthNode", monthNode);
  }
  
  public void setMonthNodeName(String monthNodeName) {
    this._monthNodeName = monthNodeName;
    
    setScopedAttribute("monthNodeName", monthNodeName);
  }
  
  public void setNullableDay(boolean nullableDay) {
    this._nullableDay = nullableDay;
    
    setScopedAttribute("nullableDay", Boolean.valueOf(nullableDay));
  }
  
  public void setNullableMonth(boolean nullableMonth) {
    this._nullableMonth = nullableMonth;
    
    setScopedAttribute("nullableMonth", Boolean.valueOf(nullableMonth));
  }
  
  public void setNullableYear(boolean nullableYear) {
    this._nullableYear = nullableYear;
    
    setScopedAttribute("nullableYear", Boolean.valueOf(nullableYear));
  }
  
  public void setPopulateDay(boolean populateDay) {
    this._populateDay = populateDay;
    
    setScopedAttribute("populateDay", Boolean.valueOf(populateDay));
  }
  
  public void setPopulateMonth(boolean populateMonth) {
    this._populateMonth = populateMonth;
    
    setScopedAttribute("populateMonth", Boolean.valueOf(populateMonth));
  }
  
  public void setPopulateYear(boolean populateYear) {
    this._populateYear = populateYear;
    
    setScopedAttribute("populateYear", Boolean.valueOf(populateYear));
  }
  
  public void setRender(Object render) {
    this._render = render;
    
    setScopedAttribute("render", render);
  }
  
  public void setRendered(boolean rendered) {
    this._rendered = rendered;
    
    setScopedAttribute("rendered", Boolean.valueOf(rendered));
  }
  
  public void setSelectWrapperNode(String selectWrapperNode) {
    this._selectWrapperNode = selectWrapperNode;
    
    setScopedAttribute("selectWrapperNode", selectWrapperNode);
  }
  
  public void setSetValue(boolean setValue) {
    this._setValue = setValue;
    
    setScopedAttribute("setValue", Boolean.valueOf(setValue));
  }
  
  public void setSrcNode(String srcNode) {
    this._srcNode = srcNode;
    
    setScopedAttribute("srcNode", srcNode);
  }
  
  public void setStack(boolean stack) {
    this._stack = stack;
    
    setScopedAttribute("stack", Boolean.valueOf(stack));
  }
  
  public void setStrings(Object strings) {
    this._strings = strings;
    
    setScopedAttribute("strings", strings);
  }
  
  public void setTabIndex(Object tabIndex) {
    this._tabIndex = tabIndex;
    
    setScopedAttribute("tabIndex", tabIndex);
  }
  
  public void setTrigger(Object trigger) {
    this._trigger = trigger;
    
    setScopedAttribute("trigger", trigger);
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
  
  public void setYearNode(String yearNode) {
    this._yearNode = yearNode;
    
    setScopedAttribute("yearNode", yearNode);
  }
  
  public void setYearNodeName(String yearNodeName) {
    this._yearNodeName = yearNodeName;
    
    setScopedAttribute("yearNodeName", yearNodeName);
  }
  
  public void setYearRange(Object yearRange) {
    this._yearRange = yearRange;
    
    setScopedAttribute("yearRange", yearRange);
  }
  
  public void setAfterAppendOrderChange(Object afterAppendOrderChange) {
    this._afterAppendOrderChange = afterAppendOrderChange;
    
    setScopedAttribute("afterAppendOrderChange", afterAppendOrderChange);
  }
  
  public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
    this._afterBoundingBoxChange = afterBoundingBoxChange;
    
    setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
  }
  
  public void setAfterButtonNodeChange(Object afterButtonNodeChange) {
    this._afterButtonNodeChange = afterButtonNodeChange;
    
    setScopedAttribute("afterButtonNodeChange", afterButtonNodeChange);
  }
  
  public void setAfterCalendarChange(Object afterCalendarChange) {
    this._afterCalendarChange = afterCalendarChange;
    
    setScopedAttribute("afterCalendarChange", afterCalendarChange);
  }
  
  public void setAfterContentBoxChange(Object afterContentBoxChange) {
    this._afterContentBoxChange = afterContentBoxChange;
    
    setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
  }
  
  public void setAfterCssClassChange(Object afterCssClassChange) {
    this._afterCssClassChange = afterCssClassChange;
    
    setScopedAttribute("afterCssClassChange", afterCssClassChange);
  }
  
  public void setAfterDayNodeChange(Object afterDayNodeChange) {
    this._afterDayNodeChange = afterDayNodeChange;
    
    setScopedAttribute("afterDayNodeChange", afterDayNodeChange);
  }
  
  public void setAfterDayNodeNameChange(Object afterDayNodeNameChange) {
    this._afterDayNodeNameChange = afterDayNodeNameChange;
    
    setScopedAttribute("afterDayNodeNameChange", afterDayNodeNameChange);
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
  
  public void setAfterFormatterChange(Object afterFormatterChange) {
    this._afterFormatterChange = afterFormatterChange;
    
    setScopedAttribute("afterFormatterChange", afterFormatterChange);
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
  
  public void setAfterMonthNodeChange(Object afterMonthNodeChange) {
    this._afterMonthNodeChange = afterMonthNodeChange;
    
    setScopedAttribute("afterMonthNodeChange", afterMonthNodeChange);
  }
  
  public void setAfterMonthNodeNameChange(Object afterMonthNodeNameChange) {
    this._afterMonthNodeNameChange = afterMonthNodeNameChange;
    
    setScopedAttribute("afterMonthNodeNameChange", afterMonthNodeNameChange);
  }
  
  public void setAfterNullableDayChange(Object afterNullableDayChange) {
    this._afterNullableDayChange = afterNullableDayChange;
    
    setScopedAttribute("afterNullableDayChange", afterNullableDayChange);
  }
  
  public void setAfterNullableMonthChange(Object afterNullableMonthChange) {
    this._afterNullableMonthChange = afterNullableMonthChange;
    
    setScopedAttribute("afterNullableMonthChange", afterNullableMonthChange);
  }
  
  public void setAfterNullableYearChange(Object afterNullableYearChange) {
    this._afterNullableYearChange = afterNullableYearChange;
    
    setScopedAttribute("afterNullableYearChange", afterNullableYearChange);
  }
  
  public void setAfterPopulateDayChange(Object afterPopulateDayChange) {
    this._afterPopulateDayChange = afterPopulateDayChange;
    
    setScopedAttribute("afterPopulateDayChange", afterPopulateDayChange);
  }
  
  public void setAfterPopulateMonthChange(Object afterPopulateMonthChange) {
    this._afterPopulateMonthChange = afterPopulateMonthChange;
    
    setScopedAttribute("afterPopulateMonthChange", afterPopulateMonthChange);
  }
  
  public void setAfterPopulateYearChange(Object afterPopulateYearChange) {
    this._afterPopulateYearChange = afterPopulateYearChange;
    
    setScopedAttribute("afterPopulateYearChange", afterPopulateYearChange);
  }
  
  public void setAfterRenderChange(Object afterRenderChange) {
    this._afterRenderChange = afterRenderChange;
    
    setScopedAttribute("afterRenderChange", afterRenderChange);
  }
  
  public void setAfterRenderedChange(Object afterRenderedChange) {
    this._afterRenderedChange = afterRenderedChange;
    
    setScopedAttribute("afterRenderedChange", afterRenderedChange);
  }
  
  public void setAfterSelectWrapperNodeChange(Object afterSelectWrapperNodeChange) {
    this._afterSelectWrapperNodeChange = afterSelectWrapperNodeChange;
    
    setScopedAttribute("afterSelectWrapperNodeChange", afterSelectWrapperNodeChange);
  }
  
  public void setAfterSetValueChange(Object afterSetValueChange) {
    this._afterSetValueChange = afterSetValueChange;
    
    setScopedAttribute("afterSetValueChange", afterSetValueChange);
  }
  
  public void setAfterSrcNodeChange(Object afterSrcNodeChange) {
    this._afterSrcNodeChange = afterSrcNodeChange;
    
    setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
  }
  
  public void setAfterStackChange(Object afterStackChange) {
    this._afterStackChange = afterStackChange;
    
    setScopedAttribute("afterStackChange", afterStackChange);
  }
  
  public void setAfterStringsChange(Object afterStringsChange) {
    this._afterStringsChange = afterStringsChange;
    
    setScopedAttribute("afterStringsChange", afterStringsChange);
  }
  
  public void setAfterTabIndexChange(Object afterTabIndexChange) {
    this._afterTabIndexChange = afterTabIndexChange;
    
    setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
  }
  
  public void setAfterTriggerChange(Object afterTriggerChange) {
    this._afterTriggerChange = afterTriggerChange;
    
    setScopedAttribute("afterTriggerChange", afterTriggerChange);
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
  
  public void setAfterYearNodeChange(Object afterYearNodeChange) {
    this._afterYearNodeChange = afterYearNodeChange;
    
    setScopedAttribute("afterYearNodeChange", afterYearNodeChange);
  }
  
  public void setAfterYearNodeNameChange(Object afterYearNodeNameChange) {
    this._afterYearNodeNameChange = afterYearNodeNameChange;
    
    setScopedAttribute("afterYearNodeNameChange", afterYearNodeNameChange);
  }
  
  public void setAfterYearRangeChange(Object afterYearRangeChange) {
    this._afterYearRangeChange = afterYearRangeChange;
    
    setScopedAttribute("afterYearRangeChange", afterYearRangeChange);
  }
  
  public void setOnAppendOrderChange(Object onAppendOrderChange) {
    this._onAppendOrderChange = onAppendOrderChange;
    
    setScopedAttribute("onAppendOrderChange", onAppendOrderChange);
  }
  
  public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
    this._onBoundingBoxChange = onBoundingBoxChange;
    
    setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
  }
  
  public void setOnButtonNodeChange(Object onButtonNodeChange) {
    this._onButtonNodeChange = onButtonNodeChange;
    
    setScopedAttribute("onButtonNodeChange", onButtonNodeChange);
  }
  
  public void setOnCalendarChange(Object onCalendarChange) {
    this._onCalendarChange = onCalendarChange;
    
    setScopedAttribute("onCalendarChange", onCalendarChange);
  }
  
  public void setOnContentBoxChange(Object onContentBoxChange) {
    this._onContentBoxChange = onContentBoxChange;
    
    setScopedAttribute("onContentBoxChange", onContentBoxChange);
  }
  
  public void setOnCssClassChange(Object onCssClassChange) {
    this._onCssClassChange = onCssClassChange;
    
    setScopedAttribute("onCssClassChange", onCssClassChange);
  }
  
  public void setOnDayNodeChange(Object onDayNodeChange) {
    this._onDayNodeChange = onDayNodeChange;
    
    setScopedAttribute("onDayNodeChange", onDayNodeChange);
  }
  
  public void setOnDayNodeNameChange(Object onDayNodeNameChange) {
    this._onDayNodeNameChange = onDayNodeNameChange;
    
    setScopedAttribute("onDayNodeNameChange", onDayNodeNameChange);
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
  
  public void setOnFormatterChange(Object onFormatterChange) {
    this._onFormatterChange = onFormatterChange;
    
    setScopedAttribute("onFormatterChange", onFormatterChange);
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
  
  public void setOnMonthNodeChange(Object onMonthNodeChange) {
    this._onMonthNodeChange = onMonthNodeChange;
    
    setScopedAttribute("onMonthNodeChange", onMonthNodeChange);
  }
  
  public void setOnMonthNodeNameChange(Object onMonthNodeNameChange) {
    this._onMonthNodeNameChange = onMonthNodeNameChange;
    
    setScopedAttribute("onMonthNodeNameChange", onMonthNodeNameChange);
  }
  
  public void setOnNullableDayChange(Object onNullableDayChange) {
    this._onNullableDayChange = onNullableDayChange;
    
    setScopedAttribute("onNullableDayChange", onNullableDayChange);
  }
  
  public void setOnNullableMonthChange(Object onNullableMonthChange) {
    this._onNullableMonthChange = onNullableMonthChange;
    
    setScopedAttribute("onNullableMonthChange", onNullableMonthChange);
  }
  
  public void setOnNullableYearChange(Object onNullableYearChange) {
    this._onNullableYearChange = onNullableYearChange;
    
    setScopedAttribute("onNullableYearChange", onNullableYearChange);
  }
  
  public void setOnPopulateDayChange(Object onPopulateDayChange) {
    this._onPopulateDayChange = onPopulateDayChange;
    
    setScopedAttribute("onPopulateDayChange", onPopulateDayChange);
  }
  
  public void setOnPopulateMonthChange(Object onPopulateMonthChange) {
    this._onPopulateMonthChange = onPopulateMonthChange;
    
    setScopedAttribute("onPopulateMonthChange", onPopulateMonthChange);
  }
  
  public void setOnPopulateYearChange(Object onPopulateYearChange) {
    this._onPopulateYearChange = onPopulateYearChange;
    
    setScopedAttribute("onPopulateYearChange", onPopulateYearChange);
  }
  
  public void setOnRenderChange(Object onRenderChange) {
    this._onRenderChange = onRenderChange;
    
    setScopedAttribute("onRenderChange", onRenderChange);
  }
  
  public void setOnRenderedChange(Object onRenderedChange) {
    this._onRenderedChange = onRenderedChange;
    
    setScopedAttribute("onRenderedChange", onRenderedChange);
  }
  
  public void setOnSelectWrapperNodeChange(Object onSelectWrapperNodeChange) {
    this._onSelectWrapperNodeChange = onSelectWrapperNodeChange;
    
    setScopedAttribute("onSelectWrapperNodeChange", onSelectWrapperNodeChange);
  }
  
  public void setOnSetValueChange(Object onSetValueChange) {
    this._onSetValueChange = onSetValueChange;
    
    setScopedAttribute("onSetValueChange", onSetValueChange);
  }
  
  public void setOnSrcNodeChange(Object onSrcNodeChange) {
    this._onSrcNodeChange = onSrcNodeChange;
    
    setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
  }
  
  public void setOnStackChange(Object onStackChange) {
    this._onStackChange = onStackChange;
    
    setScopedAttribute("onStackChange", onStackChange);
  }
  
  public void setOnStringsChange(Object onStringsChange) {
    this._onStringsChange = onStringsChange;
    
    setScopedAttribute("onStringsChange", onStringsChange);
  }
  
  public void setOnTabIndexChange(Object onTabIndexChange) {
    this._onTabIndexChange = onTabIndexChange;
    
    setScopedAttribute("onTabIndexChange", onTabIndexChange);
  }
  
  public void setOnTriggerChange(Object onTriggerChange) {
    this._onTriggerChange = onTriggerChange;
    
    setScopedAttribute("onTriggerChange", onTriggerChange);
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
  
  public void setOnYearNodeChange(Object onYearNodeChange) {
    this._onYearNodeChange = onYearNodeChange;
    
    setScopedAttribute("onYearNodeChange", onYearNodeChange);
  }
  
  public void setOnYearNodeNameChange(Object onYearNodeNameChange) {
    this._onYearNodeNameChange = onYearNodeNameChange;
    
    setScopedAttribute("onYearNodeNameChange", onYearNodeNameChange);
  }
  
  public void setOnYearRangeChange(Object onYearRangeChange) {
    this._onYearRangeChange = onYearRangeChange;
    
    setScopedAttribute("onYearRangeChange", onYearRangeChange);
  }
  
  protected void cleanUp()
  {
    super.cleanUp();
    
    this._appendOrder = null;
    this._boundingBox = null;
    this._buttonNode = null;
    this._calendar = null;
    this._contentBox = null;
    this._cssClass = null;
    this._dayNode = null;
    this._dayNodeName = "day";
    this._destroyed = false;
    this._disabled = false;
    this._focused = false;
    this._formatter = null;
    this._height = null;
    this._hideClass = "aui-helper-hidden";
    this._datepickerselectId = null;
    this._initialized = false;
    this._monthNode = null;
    this._monthNodeName = "month";
    this._nullableDay = false;
    this._nullableMonth = false;
    this._nullableYear = false;
    this._populateDay = true;
    this._populateMonth = true;
    this._populateYear = true;
    this._render = null;
    this._rendered = false;
    this._selectWrapperNode = null;
    this._setValue = true;
    this._srcNode = null;
    this._stack = true;
    this._strings = null;
    this._tabIndex = Integer.valueOf(0);
    this._trigger = null;
    this._useARIA = true;
    this._visible = true;
    this._width = null;
    this._yearNode = null;
    this._yearNodeName = "year";
    this._yearRange = null;
    this._afterAppendOrderChange = null;
    this._afterBoundingBoxChange = null;
    this._afterButtonNodeChange = null;
    this._afterCalendarChange = null;
    this._afterContentBoxChange = null;
    this._afterCssClassChange = null;
    this._afterDayNodeChange = null;
    this._afterDayNodeNameChange = null;
    this._afterDestroy = null;
    this._afterDestroyedChange = null;
    this._afterDisabledChange = null;
    this._afterFocusedChange = null;
    this._afterFormatterChange = null;
    this._afterHeightChange = null;
    this._afterHideClassChange = null;
    this._afterIdChange = null;
    this._afterInit = null;
    this._afterInitializedChange = null;
    this._afterMonthNodeChange = null;
    this._afterMonthNodeNameChange = null;
    this._afterNullableDayChange = null;
    this._afterNullableMonthChange = null;
    this._afterNullableYearChange = null;
    this._afterPopulateDayChange = null;
    this._afterPopulateMonthChange = null;
    this._afterPopulateYearChange = null;
    this._afterRenderChange = null;
    this._afterRenderedChange = null;
    this._afterSelectWrapperNodeChange = null;
    this._afterSetValueChange = null;
    this._afterSrcNodeChange = null;
    this._afterStackChange = null;
    this._afterStringsChange = null;
    this._afterTabIndexChange = null;
    this._afterTriggerChange = null;
    this._afterUseARIAChange = null;
    this._afterVisibleChange = null;
    this._afterContentUpdate = null;
    this._afterRender = null;
    this._afterWidthChange = null;
    this._afterYearNodeChange = null;
    this._afterYearNodeNameChange = null;
    this._afterYearRangeChange = null;
    this._onAppendOrderChange = null;
    this._onBoundingBoxChange = null;
    this._onButtonNodeChange = null;
    this._onCalendarChange = null;
    this._onContentBoxChange = null;
    this._onCssClassChange = null;
    this._onDayNodeChange = null;
    this._onDayNodeNameChange = null;
    this._onDestroy = null;
    this._onDestroyedChange = null;
    this._onDisabledChange = null;
    this._onFocusedChange = null;
    this._onFormatterChange = null;
    this._onHeightChange = null;
    this._onHideClassChange = null;
    this._onIdChange = null;
    this._onInit = null;
    this._onInitializedChange = null;
    this._onMonthNodeChange = null;
    this._onMonthNodeNameChange = null;
    this._onNullableDayChange = null;
    this._onNullableMonthChange = null;
    this._onNullableYearChange = null;
    this._onPopulateDayChange = null;
    this._onPopulateMonthChange = null;
    this._onPopulateYearChange = null;
    this._onRenderChange = null;
    this._onRenderedChange = null;
    this._onSelectWrapperNodeChange = null;
    this._onSetValueChange = null;
    this._onSrcNodeChange = null;
    this._onStackChange = null;
    this._onStringsChange = null;
    this._onTabIndexChange = null;
    this._onTriggerChange = null;
    this._onUseARIAChange = null;
    this._onVisibleChange = null;
    this._onContentUpdate = null;
    this._onRender = null;
    this._onWidthChange = null;
    this._onYearNodeChange = null;
    this._onYearNodeNameChange = null;
    this._onYearRangeChange = null;
  }
  
  protected String getPage()
  {
    return "/html/taglib/alloy/date_picker_select/page.jsp";
  }
  
  protected void setAttributes(HttpServletRequest request)
  {
    setNamespacedAttribute(request, "appendOrder", this._appendOrder);
    setNamespacedAttribute(request, "boundingBox", this._boundingBox);
    setNamespacedAttribute(request, "buttonNode", this._buttonNode);
    setNamespacedAttribute(request, "calendar", this._calendar);
    setNamespacedAttribute(request, "contentBox", this._contentBox);
    setNamespacedAttribute(request, "cssClass", this._cssClass);
    setNamespacedAttribute(request, "dayNode", this._dayNode);
    setNamespacedAttribute(request, "dayNodeName", this._dayNodeName);
    setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
    setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
    setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
    setNamespacedAttribute(request, "formatter", this._formatter);
    setNamespacedAttribute(request, "height", this._height);
    setNamespacedAttribute(request, "hideClass", this._hideClass);
    setNamespacedAttribute(request, "datepickerselectId", this._datepickerselectId);
    setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
    setNamespacedAttribute(request, "monthNode", this._monthNode);
    setNamespacedAttribute(request, "monthNodeName", this._monthNodeName);
    setNamespacedAttribute(request, "nullableDay", Boolean.valueOf(this._nullableDay));
    setNamespacedAttribute(request, "nullableMonth", Boolean.valueOf(this._nullableMonth));
    setNamespacedAttribute(request, "nullableYear", Boolean.valueOf(this._nullableYear));
    setNamespacedAttribute(request, "populateDay", Boolean.valueOf(this._populateDay));
    setNamespacedAttribute(request, "populateMonth", Boolean.valueOf(this._populateMonth));
    setNamespacedAttribute(request, "populateYear", Boolean.valueOf(this._populateYear));
    setNamespacedAttribute(request, "render", this._render);
    setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
    setNamespacedAttribute(request, "selectWrapperNode", this._selectWrapperNode);
    setNamespacedAttribute(request, "setValue", Boolean.valueOf(this._setValue));
    setNamespacedAttribute(request, "srcNode", this._srcNode);
    setNamespacedAttribute(request, "stack", Boolean.valueOf(this._stack));
    setNamespacedAttribute(request, "strings", this._strings);
    setNamespacedAttribute(request, "tabIndex", this._tabIndex);
    setNamespacedAttribute(request, "trigger", this._trigger);
    setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
    setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
    setNamespacedAttribute(request, "width", this._width);
    setNamespacedAttribute(request, "yearNode", this._yearNode);
    setNamespacedAttribute(request, "yearNodeName", this._yearNodeName);
    setNamespacedAttribute(request, "yearRange", this._yearRange);
    setNamespacedAttribute(request, "afterAppendOrderChange", this._afterAppendOrderChange);
    setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
    setNamespacedAttribute(request, "afterButtonNodeChange", this._afterButtonNodeChange);
    setNamespacedAttribute(request, "afterCalendarChange", this._afterCalendarChange);
    setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
    setNamespacedAttribute(request, "afterCssClassChange", this._afterCssClassChange);
    setNamespacedAttribute(request, "afterDayNodeChange", this._afterDayNodeChange);
    setNamespacedAttribute(request, "afterDayNodeNameChange", this._afterDayNodeNameChange);
    setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
    setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
    setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
    setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
    setNamespacedAttribute(request, "afterFormatterChange", this._afterFormatterChange);
    setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
    setNamespacedAttribute(request, "afterHideClassChange", this._afterHideClassChange);
    setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
    setNamespacedAttribute(request, "afterInit", this._afterInit);
    setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
    setNamespacedAttribute(request, "afterMonthNodeChange", this._afterMonthNodeChange);
    setNamespacedAttribute(request, "afterMonthNodeNameChange", this._afterMonthNodeNameChange);
    setNamespacedAttribute(request, "afterNullableDayChange", this._afterNullableDayChange);
    setNamespacedAttribute(request, "afterNullableMonthChange", this._afterNullableMonthChange);
    setNamespacedAttribute(request, "afterNullableYearChange", this._afterNullableYearChange);
    setNamespacedAttribute(request, "afterPopulateDayChange", this._afterPopulateDayChange);
    setNamespacedAttribute(request, "afterPopulateMonthChange", this._afterPopulateMonthChange);
    setNamespacedAttribute(request, "afterPopulateYearChange", this._afterPopulateYearChange);
    setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
    setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
    setNamespacedAttribute(request, "afterSelectWrapperNodeChange", this._afterSelectWrapperNodeChange);
    setNamespacedAttribute(request, "afterSetValueChange", this._afterSetValueChange);
    setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
    setNamespacedAttribute(request, "afterStackChange", this._afterStackChange);
    setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
    setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
    setNamespacedAttribute(request, "afterTriggerChange", this._afterTriggerChange);
    setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
    setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
    setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
    setNamespacedAttribute(request, "afterRender", this._afterRender);
    setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
    setNamespacedAttribute(request, "afterYearNodeChange", this._afterYearNodeChange);
    setNamespacedAttribute(request, "afterYearNodeNameChange", this._afterYearNodeNameChange);
    setNamespacedAttribute(request, "afterYearRangeChange", this._afterYearRangeChange);
    setNamespacedAttribute(request, "onAppendOrderChange", this._onAppendOrderChange);
    setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
    setNamespacedAttribute(request, "onButtonNodeChange", this._onButtonNodeChange);
    setNamespacedAttribute(request, "onCalendarChange", this._onCalendarChange);
    setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
    setNamespacedAttribute(request, "onCssClassChange", this._onCssClassChange);
    setNamespacedAttribute(request, "onDayNodeChange", this._onDayNodeChange);
    setNamespacedAttribute(request, "onDayNodeNameChange", this._onDayNodeNameChange);
    setNamespacedAttribute(request, "onDestroy", this._onDestroy);
    setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
    setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
    setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
    setNamespacedAttribute(request, "onFormatterChange", this._onFormatterChange);
    setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
    setNamespacedAttribute(request, "onHideClassChange", this._onHideClassChange);
    setNamespacedAttribute(request, "onIdChange", this._onIdChange);
    setNamespacedAttribute(request, "onInit", this._onInit);
    setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    setNamespacedAttribute(request, "onMonthNodeChange", this._onMonthNodeChange);
    setNamespacedAttribute(request, "onMonthNodeNameChange", this._onMonthNodeNameChange);
    setNamespacedAttribute(request, "onNullableDayChange", this._onNullableDayChange);
    setNamespacedAttribute(request, "onNullableMonthChange", this._onNullableMonthChange);
    setNamespacedAttribute(request, "onNullableYearChange", this._onNullableYearChange);
    setNamespacedAttribute(request, "onPopulateDayChange", this._onPopulateDayChange);
    setNamespacedAttribute(request, "onPopulateMonthChange", this._onPopulateMonthChange);
    setNamespacedAttribute(request, "onPopulateYearChange", this._onPopulateYearChange);
    setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
    setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
    setNamespacedAttribute(request, "onSelectWrapperNodeChange", this._onSelectWrapperNodeChange);
    setNamespacedAttribute(request, "onSetValueChange", this._onSetValueChange);
    setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
    setNamespacedAttribute(request, "onStackChange", this._onStackChange);
    setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
    setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
    setNamespacedAttribute(request, "onTriggerChange", this._onTriggerChange);
    setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
    setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
    setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
    setNamespacedAttribute(request, "onRender", this._onRender);
    setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
    setNamespacedAttribute(request, "onYearNodeChange", this._onYearNodeChange);
    setNamespacedAttribute(request, "onYearNodeNameChange", this._onYearNodeNameChange);
    setNamespacedAttribute(request, "onYearRangeChange", this._onYearRangeChange);
  }
  





  private Object _appendOrder = null;
  private String _boundingBox = null;
  private String _buttonNode = null;
  private Object _calendar = null;
  private String _contentBox = null;
  private String _cssClass = null;
  private String _dayNode = null;
  private String _dayNodeName = "day";
  private boolean _destroyed = false;
  private boolean _disabled = false;
  private boolean _focused = false;
  private Object _formatter = null;
  private Object _height = null;
  private String _hideClass = "aui-helper-hidden";
  private String _datepickerselectId = null;
  private boolean _initialized = false;
  private String _monthNode = null;
  private String _monthNodeName = "month";
  private boolean _nullableDay = false;
  private boolean _nullableMonth = false;
  private boolean _nullableYear = false;
  private boolean _populateDay = true;
  private boolean _populateMonth = true;
  private boolean _populateYear = true;
  private Object _render = null;
  private boolean _rendered = false;
  private String _selectWrapperNode = null;
  private boolean _setValue = true;
  private String _srcNode = null;
  private boolean _stack = true;
  private Object _strings = null;
  private Object _tabIndex = Integer.valueOf(0);
  private Object _trigger = null;
  private boolean _useARIA = true;
  private boolean _visible = true;
  private Object _width = null;
  private String _yearNode = null;
  private String _yearNodeName = "year";
  private Object _yearRange = null;
  private Object _afterAppendOrderChange = null;
  private Object _afterBoundingBoxChange = null;
  private Object _afterButtonNodeChange = null;
  private Object _afterCalendarChange = null;
  private Object _afterContentBoxChange = null;
  private Object _afterCssClassChange = null;
  private Object _afterDayNodeChange = null;
  private Object _afterDayNodeNameChange = null;
  private Object _afterDestroy = null;
  private Object _afterDestroyedChange = null;
  private Object _afterDisabledChange = null;
  private Object _afterFocusedChange = null;
  private Object _afterFormatterChange = null;
  private Object _afterHeightChange = null;
  private Object _afterHideClassChange = null;
  private Object _afterIdChange = null;
  private Object _afterInit = null;
  private Object _afterInitializedChange = null;
  private Object _afterMonthNodeChange = null;
  private Object _afterMonthNodeNameChange = null;
  private Object _afterNullableDayChange = null;
  private Object _afterNullableMonthChange = null;
  private Object _afterNullableYearChange = null;
  private Object _afterPopulateDayChange = null;
  private Object _afterPopulateMonthChange = null;
  private Object _afterPopulateYearChange = null;
  private Object _afterRenderChange = null;
  private Object _afterRenderedChange = null;
  private Object _afterSelectWrapperNodeChange = null;
  private Object _afterSetValueChange = null;
  private Object _afterSrcNodeChange = null;
  private Object _afterStackChange = null;
  private Object _afterStringsChange = null;
  private Object _afterTabIndexChange = null;
  private Object _afterTriggerChange = null;
  private Object _afterUseARIAChange = null;
  private Object _afterVisibleChange = null;
  private Object _afterContentUpdate = null;
  private Object _afterRender = null;
  private Object _afterWidthChange = null;
  private Object _afterYearNodeChange = null;
  private Object _afterYearNodeNameChange = null;
  private Object _afterYearRangeChange = null;
  private Object _onAppendOrderChange = null;
  private Object _onBoundingBoxChange = null;
  private Object _onButtonNodeChange = null;
  private Object _onCalendarChange = null;
  private Object _onContentBoxChange = null;
  private Object _onCssClassChange = null;
  private Object _onDayNodeChange = null;
  private Object _onDayNodeNameChange = null;
  private Object _onDestroy = null;
  private Object _onDestroyedChange = null;
  private Object _onDisabledChange = null;
  private Object _onFocusedChange = null;
  private Object _onFormatterChange = null;
  private Object _onHeightChange = null;
  private Object _onHideClassChange = null;
  private Object _onIdChange = null;
  private Object _onInit = null;
  private Object _onInitializedChange = null;
  private Object _onMonthNodeChange = null;
  private Object _onMonthNodeNameChange = null;
  private Object _onNullableDayChange = null;
  private Object _onNullableMonthChange = null;
  private Object _onNullableYearChange = null;
  private Object _onPopulateDayChange = null;
  private Object _onPopulateMonthChange = null;
  private Object _onPopulateYearChange = null;
  private Object _onRenderChange = null;
  private Object _onRenderedChange = null;
  private Object _onSelectWrapperNodeChange = null;
  private Object _onSetValueChange = null;
  private Object _onSrcNodeChange = null;
  private Object _onStackChange = null;
  private Object _onStringsChange = null;
  private Object _onTabIndexChange = null;
  private Object _onTriggerChange = null;
  private Object _onUseARIAChange = null;
  private Object _onVisibleChange = null;
  private Object _onContentUpdate = null;
  private Object _onRender = null;
  private Object _onWidthChange = null;
  private Object _onYearNodeChange = null;
  private Object _onYearNodeNameChange = null;
  private Object _onYearRangeChange = null;
}
