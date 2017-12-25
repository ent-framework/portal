package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseCalendarTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:calendar:";
    private static final String _PAGE = "/html/taglib/alloy/calendar/page.jsp";
    private boolean _allowNone = true;
    private String _blankDays = null;
    private String _boundingBox = null;
    private String _contentBox = null;
    private Object _currentDay = Integer.valueOf(0);
    private Object _currentMonth = Integer.valueOf(0);
    private Object _currentYear = Integer.valueOf(0);
    private Object _customRenderer = null;
    private Object _date = null;
    private String _dateFormat = "%m/%d/%Y";
    private Object _dates = null;
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private String _disabledDatesRule = null;
    private String _enabledDatesRule = null;
    private Object _firstDayOfWeek = Integer.valueOf(0);
    private boolean _focused = false;
    private String _headerContentNode = null;
    private Object _headerRenderer = null;
    private String _headerTitleNode = null;
    private Object _height = null;
    private String _iconNextNode = null;
    private String _iconPrevNode = null;
    private String _calendarId = null;
    private boolean _initialized = false;
    private Object _maxDate = null;
    private Object _maximumDate = null;
    private Object _minDate = null;
    private Object _minimumDate = null;
    private String _monthDays = null;
    private String _monthDaysNode = null;
    private Object _noneLinkNode = null;
    private Object _paddingDaysEnd = null;
    private Object _paddingDaysStart = null;
    private Object _render = null;
    private boolean _rendered = false;
    private boolean _selectMultipleDates = false;
    private Object _selectedDates = null;
    private String _selectionMode = "single";
    private boolean _setValue = true;
    private boolean _showNextMonth = false;
    private boolean _showOtherMonth = true;
    private boolean _showPrevMonth = false;
    private boolean _showToday = true;
    private String _srcNode = null;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private Object _todayLinkNode = null;
    private boolean _visible = true;
    private String _weekDays = null;
    private String _weekDaysNode = null;
    private Object _width = null;
    private Object _afterAllowNoneChange = null;
    private Object _afterBlankDaysChange = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterCurrentDayChange = null;
    private Object _afterCurrentMonthChange = null;
    private Object _afterCurrentYearChange = null;
    private Object _afterCustomRendererChange = null;
    private Object _afterDateChange = null;
    private Object _afterDateFormatChange = null;
    private Object _afterDatesChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterDisabledDatesRuleChange = null;
    private Object _afterEnabledDatesRuleChange = null;
    private Object _afterFirstDayOfWeekChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterHeaderContentNodeChange = null;
    private Object _afterHeaderRendererChange = null;
    private Object _afterHeaderTitleNodeChange = null;
    private Object _afterHeightChange = null;
    private Object _afterIconNextNodeChange = null;
    private Object _afterIconPrevNodeChange = null;
    private Object _afterIdChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterMaxDateChange = null;
    private Object _afterMaximumDateChange = null;
    private Object _afterMinDateChange = null;
    private Object _afterMinimumDateChange = null;
    private Object _afterMonthDaysChange = null;
    private Object _afterMonthDaysNodeChange = null;
    private Object _afterNoneLinkNodeChange = null;
    private Object _afterPaddingDaysEndChange = null;
    private Object _afterPaddingDaysStartChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterSelectMultipleDatesChange = null;
    private Object _afterSelectedDatesChange = null;
    private Object _afterSelectionModeChange = null;
    private Object _afterSetValueChange = null;
    private Object _afterShowNextMonthChange = null;
    private Object _afterShowOtherMonthChange = null;
    private Object _afterShowPrevMonthChange = null;
    private Object _afterShowTodayChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterTodayLinkNodeChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterWeekDaysChange = null;
    private Object _afterWeekDaysNodeChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _onAllowNoneChange = null;
    private Object _onBlankDaysChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onContentBoxChange = null;
    private Object _onCurrentDayChange = null;
    private Object _onCurrentMonthChange = null;
    private Object _onCurrentYearChange = null;
    private Object _onCustomRendererChange = null;
    private Object _onDateChange = null;
    private Object _onDateFormatChange = null;
    private Object _onDatesChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onDisabledDatesRuleChange = null;
    private Object _onEnabledDatesRuleChange = null;
    private Object _onFirstDayOfWeekChange = null;
    private Object _onFocusedChange = null;
    private Object _onHeaderContentNodeChange = null;
    private Object _onHeaderRendererChange = null;
    private Object _onHeaderTitleNodeChange = null;
    private Object _onHeightChange = null;
    private Object _onIconNextNodeChange = null;
    private Object _onIconPrevNodeChange = null;
    private Object _onIdChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onMaxDateChange = null;
    private Object _onMaximumDateChange = null;
    private Object _onMinDateChange = null;
    private Object _onMinimumDateChange = null;
    private Object _onMonthDaysChange = null;
    private Object _onMonthDaysNodeChange = null;
    private Object _onNoneLinkNodeChange = null;
    private Object _onPaddingDaysEndChange = null;
    private Object _onPaddingDaysStartChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onSelectMultipleDatesChange = null;
    private Object _onSelectedDatesChange = null;
    private Object _onSelectionModeChange = null;
    private Object _onSetValueChange = null;
    private Object _onShowNextMonthChange = null;
    private Object _onShowOtherMonthChange = null;
    private Object _onShowPrevMonthChange = null;
    private Object _onShowTodayChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onTodayLinkNodeChange = null;
    private Object _onVisibleChange = null;
    private Object _onWeekDaysChange = null;
    private Object _onWeekDaysNodeChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:calendar:");

        return super.doStartTag();
    }

    public boolean getAllowNone() {
        return this._allowNone;
    }

    public void setAllowNone(boolean allowNone) {
        this._allowNone = allowNone;

        setScopedAttribute("allowNone", Boolean.valueOf(allowNone));
    }

    public String getBlankDays() {
        return this._blankDays;
    }

    public void setBlankDays(String blankDays) {
        this._blankDays = blankDays;

        setScopedAttribute("blankDays", blankDays);
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public String getContentBox() {
        return this._contentBox;
    }

    public void setContentBox(String contentBox) {
        this._contentBox = contentBox;

        setScopedAttribute("contentBox", contentBox);
    }

    public Object getCurrentDay() {
        return this._currentDay;
    }

    public void setCurrentDay(Object currentDay) {
        this._currentDay = currentDay;

        setScopedAttribute("currentDay", currentDay);
    }

    public Object getCurrentMonth() {
        return this._currentMonth;
    }

    public void setCurrentMonth(Object currentMonth) {
        this._currentMonth = currentMonth;

        setScopedAttribute("currentMonth", currentMonth);
    }

    public Object getCurrentYear() {
        return this._currentYear;
    }

    public void setCurrentYear(Object currentYear) {
        this._currentYear = currentYear;

        setScopedAttribute("currentYear", currentYear);
    }

    public Object getCustomRenderer() {
        return this._customRenderer;
    }

    public void setCustomRenderer(Object customRenderer) {
        this._customRenderer = customRenderer;

        setScopedAttribute("customRenderer", customRenderer);
    }

    public Object getDate() {
        return this._date;
    }

    public void setDate(Object date) {
        this._date = date;

        setScopedAttribute("date", date);
    }

    public String getDateFormat() {
        return this._dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this._dateFormat = dateFormat;

        setScopedAttribute("dateFormat", dateFormat);
    }

    public Object getDates() {
        return this._dates;
    }

    public void setDates(Object dates) {
        this._dates = dates;

        setScopedAttribute("dates", dates);
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

    public String getDisabledDatesRule() {
        return this._disabledDatesRule;
    }

    public void setDisabledDatesRule(String disabledDatesRule) {
        this._disabledDatesRule = disabledDatesRule;

        setScopedAttribute("disabledDatesRule", disabledDatesRule);
    }

    public String getEnabledDatesRule() {
        return this._enabledDatesRule;
    }

    public void setEnabledDatesRule(String enabledDatesRule) {
        this._enabledDatesRule = enabledDatesRule;

        setScopedAttribute("enabledDatesRule", enabledDatesRule);
    }

    public Object getFirstDayOfWeek() {
        return this._firstDayOfWeek;
    }

    public void setFirstDayOfWeek(Object firstDayOfWeek) {
        this._firstDayOfWeek = firstDayOfWeek;

        setScopedAttribute("firstDayOfWeek", firstDayOfWeek);
    }

    public boolean getFocused() {
        return this._focused;
    }

    public void setFocused(boolean focused) {
        this._focused = focused;

        setScopedAttribute("focused", Boolean.valueOf(focused));
    }

    public String getHeaderContentNode() {
        return this._headerContentNode;
    }

    public void setHeaderContentNode(String headerContentNode) {
        this._headerContentNode = headerContentNode;

        setScopedAttribute("headerContentNode", headerContentNode);
    }

    public Object getHeaderRenderer() {
        return this._headerRenderer;
    }

    public void setHeaderRenderer(Object headerRenderer) {
        this._headerRenderer = headerRenderer;

        setScopedAttribute("headerRenderer", headerRenderer);
    }

    public String getHeaderTitleNode() {
        return this._headerTitleNode;
    }

    public void setHeaderTitleNode(String headerTitleNode) {
        this._headerTitleNode = headerTitleNode;

        setScopedAttribute("headerTitleNode", headerTitleNode);
    }

    public Object getHeight() {
        return this._height;
    }

    public void setHeight(Object height) {
        this._height = height;

        setScopedAttribute("height", height);
    }

    public String getIconNextNode() {
        return this._iconNextNode;
    }

    public void setIconNextNode(String iconNextNode) {
        this._iconNextNode = iconNextNode;

        setScopedAttribute("iconNextNode", iconNextNode);
    }

    public String getIconPrevNode() {
        return this._iconPrevNode;
    }

    public void setIconPrevNode(String iconPrevNode) {
        this._iconPrevNode = iconPrevNode;

        setScopedAttribute("iconPrevNode", iconPrevNode);
    }

    public String getCalendarId() {
        return this._calendarId;
    }

    public void setCalendarId(String calendarId) {
        this._calendarId = calendarId;

        setScopedAttribute("calendarId", calendarId);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public Object getMaxDate() {
        return this._maxDate;
    }

    public void setMaxDate(Object maxDate) {
        this._maxDate = maxDate;

        setScopedAttribute("maxDate", maxDate);
    }

    public Object getMaximumDate() {
        return this._maximumDate;
    }

    public void setMaximumDate(Object maximumDate) {
        this._maximumDate = maximumDate;

        setScopedAttribute("maximumDate", maximumDate);
    }

    public Object getMinDate() {
        return this._minDate;
    }

    public void setMinDate(Object minDate) {
        this._minDate = minDate;

        setScopedAttribute("minDate", minDate);
    }

    public Object getMinimumDate() {
        return this._minimumDate;
    }

    public void setMinimumDate(Object minimumDate) {
        this._minimumDate = minimumDate;

        setScopedAttribute("minimumDate", minimumDate);
    }

    public String getMonthDays() {
        return this._monthDays;
    }

    public void setMonthDays(String monthDays) {
        this._monthDays = monthDays;

        setScopedAttribute("monthDays", monthDays);
    }

    public String getMonthDaysNode() {
        return this._monthDaysNode;
    }

    public void setMonthDaysNode(String monthDaysNode) {
        this._monthDaysNode = monthDaysNode;

        setScopedAttribute("monthDaysNode", monthDaysNode);
    }

    public Object getNoneLinkNode() {
        return this._noneLinkNode;
    }

    public void setNoneLinkNode(Object noneLinkNode) {
        this._noneLinkNode = noneLinkNode;

        setScopedAttribute("noneLinkNode", noneLinkNode);
    }

    public Object getPaddingDaysEnd() {
        return this._paddingDaysEnd;
    }

    public void setPaddingDaysEnd(Object paddingDaysEnd) {
        this._paddingDaysEnd = paddingDaysEnd;

        setScopedAttribute("paddingDaysEnd", paddingDaysEnd);
    }

    public Object getPaddingDaysStart() {
        return this._paddingDaysStart;
    }

    public void setPaddingDaysStart(Object paddingDaysStart) {
        this._paddingDaysStart = paddingDaysStart;

        setScopedAttribute("paddingDaysStart", paddingDaysStart);
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

    public boolean getSelectMultipleDates() {
        return this._selectMultipleDates;
    }

    public void setSelectMultipleDates(boolean selectMultipleDates) {
        this._selectMultipleDates = selectMultipleDates;

        setScopedAttribute("selectMultipleDates", Boolean.valueOf(selectMultipleDates));
    }

    public Object getSelectedDates() {
        return this._selectedDates;
    }

    public void setSelectedDates(Object selectedDates) {
        this._selectedDates = selectedDates;

        setScopedAttribute("selectedDates", selectedDates);
    }

    public String getSelectionMode() {
        return this._selectionMode;
    }

    public void setSelectionMode(String selectionMode) {
        this._selectionMode = selectionMode;

        setScopedAttribute("selectionMode", selectionMode);
    }

    public boolean getSetValue() {
        return this._setValue;
    }

    public void setSetValue(boolean setValue) {
        this._setValue = setValue;

        setScopedAttribute("setValue", Boolean.valueOf(setValue));
    }

    public boolean getShowNextMonth() {
        return this._showNextMonth;
    }

    public void setShowNextMonth(boolean showNextMonth) {
        this._showNextMonth = showNextMonth;

        setScopedAttribute("showNextMonth", Boolean.valueOf(showNextMonth));
    }

    public boolean getShowOtherMonth() {
        return this._showOtherMonth;
    }

    public void setShowOtherMonth(boolean showOtherMonth) {
        this._showOtherMonth = showOtherMonth;

        setScopedAttribute("showOtherMonth", Boolean.valueOf(showOtherMonth));
    }

    public boolean getShowPrevMonth() {
        return this._showPrevMonth;
    }

    public void setShowPrevMonth(boolean showPrevMonth) {
        this._showPrevMonth = showPrevMonth;

        setScopedAttribute("showPrevMonth", Boolean.valueOf(showPrevMonth));
    }

    public boolean getShowToday() {
        return this._showToday;
    }

    public void setShowToday(boolean showToday) {
        this._showToday = showToday;

        setScopedAttribute("showToday", Boolean.valueOf(showToday));
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

    public Object getTodayLinkNode() {
        return this._todayLinkNode;
    }

    public void setTodayLinkNode(Object todayLinkNode) {
        this._todayLinkNode = todayLinkNode;

        setScopedAttribute("todayLinkNode", todayLinkNode);
    }

    public boolean getVisible() {
        return this._visible;
    }

    public void setVisible(boolean visible) {
        this._visible = visible;

        setScopedAttribute("visible", Boolean.valueOf(visible));
    }

    public String getWeekDays() {
        return this._weekDays;
    }

    public void setWeekDays(String weekDays) {
        this._weekDays = weekDays;

        setScopedAttribute("weekDays", weekDays);
    }

    public String getWeekDaysNode() {
        return this._weekDaysNode;
    }

    public void setWeekDaysNode(String weekDaysNode) {
        this._weekDaysNode = weekDaysNode;

        setScopedAttribute("weekDaysNode", weekDaysNode);
    }

    public Object getWidth() {
        return this._width;
    }

    public void setWidth(Object width) {
        this._width = width;

        setScopedAttribute("width", width);
    }

    public Object getAfterAllowNoneChange() {
        return this._afterAllowNoneChange;
    }

    public void setAfterAllowNoneChange(Object afterAllowNoneChange) {
        this._afterAllowNoneChange = afterAllowNoneChange;

        setScopedAttribute("afterAllowNoneChange", afterAllowNoneChange);
    }

    public Object getAfterBlankDaysChange() {
        return this._afterBlankDaysChange;
    }

    public void setAfterBlankDaysChange(Object afterBlankDaysChange) {
        this._afterBlankDaysChange = afterBlankDaysChange;

        setScopedAttribute("afterBlankDaysChange", afterBlankDaysChange);
    }

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterContentBoxChange() {
        return this._afterContentBoxChange;
    }

    public void setAfterContentBoxChange(Object afterContentBoxChange) {
        this._afterContentBoxChange = afterContentBoxChange;

        setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
    }

    public Object getAfterCurrentDayChange() {
        return this._afterCurrentDayChange;
    }

    public void setAfterCurrentDayChange(Object afterCurrentDayChange) {
        this._afterCurrentDayChange = afterCurrentDayChange;

        setScopedAttribute("afterCurrentDayChange", afterCurrentDayChange);
    }

    public Object getAfterCurrentMonthChange() {
        return this._afterCurrentMonthChange;
    }

    public void setAfterCurrentMonthChange(Object afterCurrentMonthChange) {
        this._afterCurrentMonthChange = afterCurrentMonthChange;

        setScopedAttribute("afterCurrentMonthChange", afterCurrentMonthChange);
    }

    public Object getAfterCurrentYearChange() {
        return this._afterCurrentYearChange;
    }

    public void setAfterCurrentYearChange(Object afterCurrentYearChange) {
        this._afterCurrentYearChange = afterCurrentYearChange;

        setScopedAttribute("afterCurrentYearChange", afterCurrentYearChange);
    }

    public Object getAfterCustomRendererChange() {
        return this._afterCustomRendererChange;
    }

    public void setAfterCustomRendererChange(Object afterCustomRendererChange) {
        this._afterCustomRendererChange = afterCustomRendererChange;

        setScopedAttribute("afterCustomRendererChange", afterCustomRendererChange);
    }

    public Object getAfterDateChange() {
        return this._afterDateChange;
    }

    public void setAfterDateChange(Object afterDateChange) {
        this._afterDateChange = afterDateChange;

        setScopedAttribute("afterDateChange", afterDateChange);
    }

    public Object getAfterDateFormatChange() {
        return this._afterDateFormatChange;
    }

    public void setAfterDateFormatChange(Object afterDateFormatChange) {
        this._afterDateFormatChange = afterDateFormatChange;

        setScopedAttribute("afterDateFormatChange", afterDateFormatChange);
    }

    public Object getAfterDatesChange() {
        return this._afterDatesChange;
    }

    public void setAfterDatesChange(Object afterDatesChange) {
        this._afterDatesChange = afterDatesChange;

        setScopedAttribute("afterDatesChange", afterDatesChange);
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

    public Object getAfterDisabledDatesRuleChange() {
        return this._afterDisabledDatesRuleChange;
    }

    public void setAfterDisabledDatesRuleChange(Object afterDisabledDatesRuleChange) {
        this._afterDisabledDatesRuleChange = afterDisabledDatesRuleChange;

        setScopedAttribute("afterDisabledDatesRuleChange", afterDisabledDatesRuleChange);
    }

    public Object getAfterEnabledDatesRuleChange() {
        return this._afterEnabledDatesRuleChange;
    }

    public void setAfterEnabledDatesRuleChange(Object afterEnabledDatesRuleChange) {
        this._afterEnabledDatesRuleChange = afterEnabledDatesRuleChange;

        setScopedAttribute("afterEnabledDatesRuleChange", afterEnabledDatesRuleChange);
    }

    public Object getAfterFirstDayOfWeekChange() {
        return this._afterFirstDayOfWeekChange;
    }

    public void setAfterFirstDayOfWeekChange(Object afterFirstDayOfWeekChange) {
        this._afterFirstDayOfWeekChange = afterFirstDayOfWeekChange;

        setScopedAttribute("afterFirstDayOfWeekChange", afterFirstDayOfWeekChange);
    }

    public Object getAfterFocusedChange() {
        return this._afterFocusedChange;
    }

    public void setAfterFocusedChange(Object afterFocusedChange) {
        this._afterFocusedChange = afterFocusedChange;

        setScopedAttribute("afterFocusedChange", afterFocusedChange);
    }

    public Object getAfterHeaderContentNodeChange() {
        return this._afterHeaderContentNodeChange;
    }

    public void setAfterHeaderContentNodeChange(Object afterHeaderContentNodeChange) {
        this._afterHeaderContentNodeChange = afterHeaderContentNodeChange;

        setScopedAttribute("afterHeaderContentNodeChange", afterHeaderContentNodeChange);
    }

    public Object getAfterHeaderRendererChange() {
        return this._afterHeaderRendererChange;
    }

    public void setAfterHeaderRendererChange(Object afterHeaderRendererChange) {
        this._afterHeaderRendererChange = afterHeaderRendererChange;

        setScopedAttribute("afterHeaderRendererChange", afterHeaderRendererChange);
    }

    public Object getAfterHeaderTitleNodeChange() {
        return this._afterHeaderTitleNodeChange;
    }

    public void setAfterHeaderTitleNodeChange(Object afterHeaderTitleNodeChange) {
        this._afterHeaderTitleNodeChange = afterHeaderTitleNodeChange;

        setScopedAttribute("afterHeaderTitleNodeChange", afterHeaderTitleNodeChange);
    }

    public Object getAfterHeightChange() {
        return this._afterHeightChange;
    }

    public void setAfterHeightChange(Object afterHeightChange) {
        this._afterHeightChange = afterHeightChange;

        setScopedAttribute("afterHeightChange", afterHeightChange);
    }

    public Object getAfterIconNextNodeChange() {
        return this._afterIconNextNodeChange;
    }

    public void setAfterIconNextNodeChange(Object afterIconNextNodeChange) {
        this._afterIconNextNodeChange = afterIconNextNodeChange;

        setScopedAttribute("afterIconNextNodeChange", afterIconNextNodeChange);
    }

    public Object getAfterIconPrevNodeChange() {
        return this._afterIconPrevNodeChange;
    }

    public void setAfterIconPrevNodeChange(Object afterIconPrevNodeChange) {
        this._afterIconPrevNodeChange = afterIconPrevNodeChange;

        setScopedAttribute("afterIconPrevNodeChange", afterIconPrevNodeChange);
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

    public Object getAfterMaxDateChange() {
        return this._afterMaxDateChange;
    }

    public void setAfterMaxDateChange(Object afterMaxDateChange) {
        this._afterMaxDateChange = afterMaxDateChange;

        setScopedAttribute("afterMaxDateChange", afterMaxDateChange);
    }

    public Object getAfterMaximumDateChange() {
        return this._afterMaximumDateChange;
    }

    public void setAfterMaximumDateChange(Object afterMaximumDateChange) {
        this._afterMaximumDateChange = afterMaximumDateChange;

        setScopedAttribute("afterMaximumDateChange", afterMaximumDateChange);
    }

    public Object getAfterMinDateChange() {
        return this._afterMinDateChange;
    }

    public void setAfterMinDateChange(Object afterMinDateChange) {
        this._afterMinDateChange = afterMinDateChange;

        setScopedAttribute("afterMinDateChange", afterMinDateChange);
    }

    public Object getAfterMinimumDateChange() {
        return this._afterMinimumDateChange;
    }

    public void setAfterMinimumDateChange(Object afterMinimumDateChange) {
        this._afterMinimumDateChange = afterMinimumDateChange;

        setScopedAttribute("afterMinimumDateChange", afterMinimumDateChange);
    }

    public Object getAfterMonthDaysChange() {
        return this._afterMonthDaysChange;
    }

    public void setAfterMonthDaysChange(Object afterMonthDaysChange) {
        this._afterMonthDaysChange = afterMonthDaysChange;

        setScopedAttribute("afterMonthDaysChange", afterMonthDaysChange);
    }

    public Object getAfterMonthDaysNodeChange() {
        return this._afterMonthDaysNodeChange;
    }

    public void setAfterMonthDaysNodeChange(Object afterMonthDaysNodeChange) {
        this._afterMonthDaysNodeChange = afterMonthDaysNodeChange;

        setScopedAttribute("afterMonthDaysNodeChange", afterMonthDaysNodeChange);
    }

    public Object getAfterNoneLinkNodeChange() {
        return this._afterNoneLinkNodeChange;
    }

    public void setAfterNoneLinkNodeChange(Object afterNoneLinkNodeChange) {
        this._afterNoneLinkNodeChange = afterNoneLinkNodeChange;

        setScopedAttribute("afterNoneLinkNodeChange", afterNoneLinkNodeChange);
    }

    public Object getAfterPaddingDaysEndChange() {
        return this._afterPaddingDaysEndChange;
    }

    public void setAfterPaddingDaysEndChange(Object afterPaddingDaysEndChange) {
        this._afterPaddingDaysEndChange = afterPaddingDaysEndChange;

        setScopedAttribute("afterPaddingDaysEndChange", afterPaddingDaysEndChange);
    }

    public Object getAfterPaddingDaysStartChange() {
        return this._afterPaddingDaysStartChange;
    }

    public void setAfterPaddingDaysStartChange(Object afterPaddingDaysStartChange) {
        this._afterPaddingDaysStartChange = afterPaddingDaysStartChange;

        setScopedAttribute("afterPaddingDaysStartChange", afterPaddingDaysStartChange);
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

    public Object getAfterSelectMultipleDatesChange() {
        return this._afterSelectMultipleDatesChange;
    }

    public void setAfterSelectMultipleDatesChange(Object afterSelectMultipleDatesChange) {
        this._afterSelectMultipleDatesChange = afterSelectMultipleDatesChange;

        setScopedAttribute("afterSelectMultipleDatesChange", afterSelectMultipleDatesChange);
    }

    public Object getAfterSelectedDatesChange() {
        return this._afterSelectedDatesChange;
    }

    public void setAfterSelectedDatesChange(Object afterSelectedDatesChange) {
        this._afterSelectedDatesChange = afterSelectedDatesChange;

        setScopedAttribute("afterSelectedDatesChange", afterSelectedDatesChange);
    }

    public Object getAfterSelectionModeChange() {
        return this._afterSelectionModeChange;
    }

    public void setAfterSelectionModeChange(Object afterSelectionModeChange) {
        this._afterSelectionModeChange = afterSelectionModeChange;

        setScopedAttribute("afterSelectionModeChange", afterSelectionModeChange);
    }

    public Object getAfterSetValueChange() {
        return this._afterSetValueChange;
    }

    public void setAfterSetValueChange(Object afterSetValueChange) {
        this._afterSetValueChange = afterSetValueChange;

        setScopedAttribute("afterSetValueChange", afterSetValueChange);
    }

    public Object getAfterShowNextMonthChange() {
        return this._afterShowNextMonthChange;
    }

    public void setAfterShowNextMonthChange(Object afterShowNextMonthChange) {
        this._afterShowNextMonthChange = afterShowNextMonthChange;

        setScopedAttribute("afterShowNextMonthChange", afterShowNextMonthChange);
    }

    public Object getAfterShowOtherMonthChange() {
        return this._afterShowOtherMonthChange;
    }

    public void setAfterShowOtherMonthChange(Object afterShowOtherMonthChange) {
        this._afterShowOtherMonthChange = afterShowOtherMonthChange;

        setScopedAttribute("afterShowOtherMonthChange", afterShowOtherMonthChange);
    }

    public Object getAfterShowPrevMonthChange() {
        return this._afterShowPrevMonthChange;
    }

    public void setAfterShowPrevMonthChange(Object afterShowPrevMonthChange) {
        this._afterShowPrevMonthChange = afterShowPrevMonthChange;

        setScopedAttribute("afterShowPrevMonthChange", afterShowPrevMonthChange);
    }

    public Object getAfterShowTodayChange() {
        return this._afterShowTodayChange;
    }

    public void setAfterShowTodayChange(Object afterShowTodayChange) {
        this._afterShowTodayChange = afterShowTodayChange;

        setScopedAttribute("afterShowTodayChange", afterShowTodayChange);
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

    public Object getAfterTodayLinkNodeChange() {
        return this._afterTodayLinkNodeChange;
    }

    public void setAfterTodayLinkNodeChange(Object afterTodayLinkNodeChange) {
        this._afterTodayLinkNodeChange = afterTodayLinkNodeChange;

        setScopedAttribute("afterTodayLinkNodeChange", afterTodayLinkNodeChange);
    }

    public Object getAfterVisibleChange() {
        return this._afterVisibleChange;
    }

    public void setAfterVisibleChange(Object afterVisibleChange) {
        this._afterVisibleChange = afterVisibleChange;

        setScopedAttribute("afterVisibleChange", afterVisibleChange);
    }

    public Object getAfterWeekDaysChange() {
        return this._afterWeekDaysChange;
    }

    public void setAfterWeekDaysChange(Object afterWeekDaysChange) {
        this._afterWeekDaysChange = afterWeekDaysChange;

        setScopedAttribute("afterWeekDaysChange", afterWeekDaysChange);
    }

    public Object getAfterWeekDaysNodeChange() {
        return this._afterWeekDaysNodeChange;
    }

    public void setAfterWeekDaysNodeChange(Object afterWeekDaysNodeChange) {
        this._afterWeekDaysNodeChange = afterWeekDaysNodeChange;

        setScopedAttribute("afterWeekDaysNodeChange", afterWeekDaysNodeChange);
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

    public Object getOnAllowNoneChange() {
        return this._onAllowNoneChange;
    }

    public void setOnAllowNoneChange(Object onAllowNoneChange) {
        this._onAllowNoneChange = onAllowNoneChange;

        setScopedAttribute("onAllowNoneChange", onAllowNoneChange);
    }

    public Object getOnBlankDaysChange() {
        return this._onBlankDaysChange;
    }

    public void setOnBlankDaysChange(Object onBlankDaysChange) {
        this._onBlankDaysChange = onBlankDaysChange;

        setScopedAttribute("onBlankDaysChange", onBlankDaysChange);
    }

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnContentBoxChange() {
        return this._onContentBoxChange;
    }

    public void setOnContentBoxChange(Object onContentBoxChange) {
        this._onContentBoxChange = onContentBoxChange;

        setScopedAttribute("onContentBoxChange", onContentBoxChange);
    }

    public Object getOnCurrentDayChange() {
        return this._onCurrentDayChange;
    }

    public void setOnCurrentDayChange(Object onCurrentDayChange) {
        this._onCurrentDayChange = onCurrentDayChange;

        setScopedAttribute("onCurrentDayChange", onCurrentDayChange);
    }

    public Object getOnCurrentMonthChange() {
        return this._onCurrentMonthChange;
    }

    public void setOnCurrentMonthChange(Object onCurrentMonthChange) {
        this._onCurrentMonthChange = onCurrentMonthChange;

        setScopedAttribute("onCurrentMonthChange", onCurrentMonthChange);
    }

    public Object getOnCurrentYearChange() {
        return this._onCurrentYearChange;
    }

    public void setOnCurrentYearChange(Object onCurrentYearChange) {
        this._onCurrentYearChange = onCurrentYearChange;

        setScopedAttribute("onCurrentYearChange", onCurrentYearChange);
    }

    public Object getOnCustomRendererChange() {
        return this._onCustomRendererChange;
    }

    public void setOnCustomRendererChange(Object onCustomRendererChange) {
        this._onCustomRendererChange = onCustomRendererChange;

        setScopedAttribute("onCustomRendererChange", onCustomRendererChange);
    }

    public Object getOnDateChange() {
        return this._onDateChange;
    }

    public void setOnDateChange(Object onDateChange) {
        this._onDateChange = onDateChange;

        setScopedAttribute("onDateChange", onDateChange);
    }

    public Object getOnDateFormatChange() {
        return this._onDateFormatChange;
    }

    public void setOnDateFormatChange(Object onDateFormatChange) {
        this._onDateFormatChange = onDateFormatChange;

        setScopedAttribute("onDateFormatChange", onDateFormatChange);
    }

    public Object getOnDatesChange() {
        return this._onDatesChange;
    }

    public void setOnDatesChange(Object onDatesChange) {
        this._onDatesChange = onDatesChange;

        setScopedAttribute("onDatesChange", onDatesChange);
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

    public Object getOnDisabledDatesRuleChange() {
        return this._onDisabledDatesRuleChange;
    }

    public void setOnDisabledDatesRuleChange(Object onDisabledDatesRuleChange) {
        this._onDisabledDatesRuleChange = onDisabledDatesRuleChange;

        setScopedAttribute("onDisabledDatesRuleChange", onDisabledDatesRuleChange);
    }

    public Object getOnEnabledDatesRuleChange() {
        return this._onEnabledDatesRuleChange;
    }

    public void setOnEnabledDatesRuleChange(Object onEnabledDatesRuleChange) {
        this._onEnabledDatesRuleChange = onEnabledDatesRuleChange;

        setScopedAttribute("onEnabledDatesRuleChange", onEnabledDatesRuleChange);
    }

    public Object getOnFirstDayOfWeekChange() {
        return this._onFirstDayOfWeekChange;
    }

    public void setOnFirstDayOfWeekChange(Object onFirstDayOfWeekChange) {
        this._onFirstDayOfWeekChange = onFirstDayOfWeekChange;

        setScopedAttribute("onFirstDayOfWeekChange", onFirstDayOfWeekChange);
    }

    public Object getOnFocusedChange() {
        return this._onFocusedChange;
    }

    public void setOnFocusedChange(Object onFocusedChange) {
        this._onFocusedChange = onFocusedChange;

        setScopedAttribute("onFocusedChange", onFocusedChange);
    }

    public Object getOnHeaderContentNodeChange() {
        return this._onHeaderContentNodeChange;
    }

    public void setOnHeaderContentNodeChange(Object onHeaderContentNodeChange) {
        this._onHeaderContentNodeChange = onHeaderContentNodeChange;

        setScopedAttribute("onHeaderContentNodeChange", onHeaderContentNodeChange);
    }

    public Object getOnHeaderRendererChange() {
        return this._onHeaderRendererChange;
    }

    public void setOnHeaderRendererChange(Object onHeaderRendererChange) {
        this._onHeaderRendererChange = onHeaderRendererChange;

        setScopedAttribute("onHeaderRendererChange", onHeaderRendererChange);
    }

    public Object getOnHeaderTitleNodeChange() {
        return this._onHeaderTitleNodeChange;
    }

    public void setOnHeaderTitleNodeChange(Object onHeaderTitleNodeChange) {
        this._onHeaderTitleNodeChange = onHeaderTitleNodeChange;

        setScopedAttribute("onHeaderTitleNodeChange", onHeaderTitleNodeChange);
    }

    public Object getOnHeightChange() {
        return this._onHeightChange;
    }

    public void setOnHeightChange(Object onHeightChange) {
        this._onHeightChange = onHeightChange;

        setScopedAttribute("onHeightChange", onHeightChange);
    }

    public Object getOnIconNextNodeChange() {
        return this._onIconNextNodeChange;
    }

    public void setOnIconNextNodeChange(Object onIconNextNodeChange) {
        this._onIconNextNodeChange = onIconNextNodeChange;

        setScopedAttribute("onIconNextNodeChange", onIconNextNodeChange);
    }

    public Object getOnIconPrevNodeChange() {
        return this._onIconPrevNodeChange;
    }

    public void setOnIconPrevNodeChange(Object onIconPrevNodeChange) {
        this._onIconPrevNodeChange = onIconPrevNodeChange;

        setScopedAttribute("onIconPrevNodeChange", onIconPrevNodeChange);
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

    public Object getOnMaxDateChange() {
        return this._onMaxDateChange;
    }

    public void setOnMaxDateChange(Object onMaxDateChange) {
        this._onMaxDateChange = onMaxDateChange;

        setScopedAttribute("onMaxDateChange", onMaxDateChange);
    }

    public Object getOnMaximumDateChange() {
        return this._onMaximumDateChange;
    }

    public void setOnMaximumDateChange(Object onMaximumDateChange) {
        this._onMaximumDateChange = onMaximumDateChange;

        setScopedAttribute("onMaximumDateChange", onMaximumDateChange);
    }

    public Object getOnMinDateChange() {
        return this._onMinDateChange;
    }

    public void setOnMinDateChange(Object onMinDateChange) {
        this._onMinDateChange = onMinDateChange;

        setScopedAttribute("onMinDateChange", onMinDateChange);
    }

    public Object getOnMinimumDateChange() {
        return this._onMinimumDateChange;
    }

    public void setOnMinimumDateChange(Object onMinimumDateChange) {
        this._onMinimumDateChange = onMinimumDateChange;

        setScopedAttribute("onMinimumDateChange", onMinimumDateChange);
    }

    public Object getOnMonthDaysChange() {
        return this._onMonthDaysChange;
    }

    public void setOnMonthDaysChange(Object onMonthDaysChange) {
        this._onMonthDaysChange = onMonthDaysChange;

        setScopedAttribute("onMonthDaysChange", onMonthDaysChange);
    }

    public Object getOnMonthDaysNodeChange() {
        return this._onMonthDaysNodeChange;
    }

    public void setOnMonthDaysNodeChange(Object onMonthDaysNodeChange) {
        this._onMonthDaysNodeChange = onMonthDaysNodeChange;

        setScopedAttribute("onMonthDaysNodeChange", onMonthDaysNodeChange);
    }

    public Object getOnNoneLinkNodeChange() {
        return this._onNoneLinkNodeChange;
    }

    public void setOnNoneLinkNodeChange(Object onNoneLinkNodeChange) {
        this._onNoneLinkNodeChange = onNoneLinkNodeChange;

        setScopedAttribute("onNoneLinkNodeChange", onNoneLinkNodeChange);
    }

    public Object getOnPaddingDaysEndChange() {
        return this._onPaddingDaysEndChange;
    }

    public void setOnPaddingDaysEndChange(Object onPaddingDaysEndChange) {
        this._onPaddingDaysEndChange = onPaddingDaysEndChange;

        setScopedAttribute("onPaddingDaysEndChange", onPaddingDaysEndChange);
    }

    public Object getOnPaddingDaysStartChange() {
        return this._onPaddingDaysStartChange;
    }

    public void setOnPaddingDaysStartChange(Object onPaddingDaysStartChange) {
        this._onPaddingDaysStartChange = onPaddingDaysStartChange;

        setScopedAttribute("onPaddingDaysStartChange", onPaddingDaysStartChange);
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

    public Object getOnSelectMultipleDatesChange() {
        return this._onSelectMultipleDatesChange;
    }

    public void setOnSelectMultipleDatesChange(Object onSelectMultipleDatesChange) {
        this._onSelectMultipleDatesChange = onSelectMultipleDatesChange;

        setScopedAttribute("onSelectMultipleDatesChange", onSelectMultipleDatesChange);
    }

    public Object getOnSelectedDatesChange() {
        return this._onSelectedDatesChange;
    }

    public void setOnSelectedDatesChange(Object onSelectedDatesChange) {
        this._onSelectedDatesChange = onSelectedDatesChange;

        setScopedAttribute("onSelectedDatesChange", onSelectedDatesChange);
    }

    public Object getOnSelectionModeChange() {
        return this._onSelectionModeChange;
    }

    public void setOnSelectionModeChange(Object onSelectionModeChange) {
        this._onSelectionModeChange = onSelectionModeChange;

        setScopedAttribute("onSelectionModeChange", onSelectionModeChange);
    }

    public Object getOnSetValueChange() {
        return this._onSetValueChange;
    }

    public void setOnSetValueChange(Object onSetValueChange) {
        this._onSetValueChange = onSetValueChange;

        setScopedAttribute("onSetValueChange", onSetValueChange);
    }

    public Object getOnShowNextMonthChange() {
        return this._onShowNextMonthChange;
    }

    public void setOnShowNextMonthChange(Object onShowNextMonthChange) {
        this._onShowNextMonthChange = onShowNextMonthChange;

        setScopedAttribute("onShowNextMonthChange", onShowNextMonthChange);
    }

    public Object getOnShowOtherMonthChange() {
        return this._onShowOtherMonthChange;
    }

    public void setOnShowOtherMonthChange(Object onShowOtherMonthChange) {
        this._onShowOtherMonthChange = onShowOtherMonthChange;

        setScopedAttribute("onShowOtherMonthChange", onShowOtherMonthChange);
    }

    public Object getOnShowPrevMonthChange() {
        return this._onShowPrevMonthChange;
    }

    public void setOnShowPrevMonthChange(Object onShowPrevMonthChange) {
        this._onShowPrevMonthChange = onShowPrevMonthChange;

        setScopedAttribute("onShowPrevMonthChange", onShowPrevMonthChange);
    }

    public Object getOnShowTodayChange() {
        return this._onShowTodayChange;
    }

    public void setOnShowTodayChange(Object onShowTodayChange) {
        this._onShowTodayChange = onShowTodayChange;

        setScopedAttribute("onShowTodayChange", onShowTodayChange);
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

    public Object getOnTodayLinkNodeChange() {
        return this._onTodayLinkNodeChange;
    }

    public void setOnTodayLinkNodeChange(Object onTodayLinkNodeChange) {
        this._onTodayLinkNodeChange = onTodayLinkNodeChange;

        setScopedAttribute("onTodayLinkNodeChange", onTodayLinkNodeChange);
    }

    public Object getOnVisibleChange() {
        return this._onVisibleChange;
    }

    public void setOnVisibleChange(Object onVisibleChange) {
        this._onVisibleChange = onVisibleChange;

        setScopedAttribute("onVisibleChange", onVisibleChange);
    }

    public Object getOnWeekDaysChange() {
        return this._onWeekDaysChange;
    }

    public void setOnWeekDaysChange(Object onWeekDaysChange) {
        this._onWeekDaysChange = onWeekDaysChange;

        setScopedAttribute("onWeekDaysChange", onWeekDaysChange);
    }

    public Object getOnWeekDaysNodeChange() {
        return this._onWeekDaysNodeChange;
    }

    public void setOnWeekDaysNodeChange(Object onWeekDaysNodeChange) {
        this._onWeekDaysNodeChange = onWeekDaysNodeChange;

        setScopedAttribute("onWeekDaysNodeChange", onWeekDaysNodeChange);
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

        this._allowNone = true;
        this._blankDays = null;
        this._boundingBox = null;
        this._contentBox = null;
        this._currentDay = Integer.valueOf(0);
        this._currentMonth = Integer.valueOf(0);
        this._currentYear = Integer.valueOf(0);
        this._customRenderer = null;
        this._date = null;
        this._dateFormat = "%m/%d/%Y";
        this._dates = null;
        this._destroyed = false;
        this._disabled = false;
        this._disabledDatesRule = null;
        this._enabledDatesRule = null;
        this._firstDayOfWeek = Integer.valueOf(0);
        this._focused = false;
        this._headerContentNode = null;
        this._headerRenderer = null;
        this._headerTitleNode = null;
        this._height = null;
        this._iconNextNode = null;
        this._iconPrevNode = null;
        this._calendarId = null;
        this._initialized = false;
        this._maxDate = null;
        this._maximumDate = null;
        this._minDate = null;
        this._minimumDate = null;
        this._monthDays = null;
        this._monthDaysNode = null;
        this._noneLinkNode = null;
        this._paddingDaysEnd = null;
        this._paddingDaysStart = null;
        this._render = null;
        this._rendered = false;
        this._selectMultipleDates = false;
        this._selectedDates = null;
        this._selectionMode = "single";
        this._setValue = true;
        this._showNextMonth = false;
        this._showOtherMonth = true;
        this._showPrevMonth = false;
        this._showToday = true;
        this._srcNode = null;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._todayLinkNode = null;
        this._visible = true;
        this._weekDays = null;
        this._weekDaysNode = null;
        this._width = null;
        this._afterAllowNoneChange = null;
        this._afterBlankDaysChange = null;
        this._afterBoundingBoxChange = null;
        this._afterContentBoxChange = null;
        this._afterCurrentDayChange = null;
        this._afterCurrentMonthChange = null;
        this._afterCurrentYearChange = null;
        this._afterCustomRendererChange = null;
        this._afterDateChange = null;
        this._afterDateFormatChange = null;
        this._afterDatesChange = null;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterDisabledDatesRuleChange = null;
        this._afterEnabledDatesRuleChange = null;
        this._afterFirstDayOfWeekChange = null;
        this._afterFocusedChange = null;
        this._afterHeaderContentNodeChange = null;
        this._afterHeaderRendererChange = null;
        this._afterHeaderTitleNodeChange = null;
        this._afterHeightChange = null;
        this._afterIconNextNodeChange = null;
        this._afterIconPrevNodeChange = null;
        this._afterIdChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterMaxDateChange = null;
        this._afterMaximumDateChange = null;
        this._afterMinDateChange = null;
        this._afterMinimumDateChange = null;
        this._afterMonthDaysChange = null;
        this._afterMonthDaysNodeChange = null;
        this._afterNoneLinkNodeChange = null;
        this._afterPaddingDaysEndChange = null;
        this._afterPaddingDaysStartChange = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterSelectMultipleDatesChange = null;
        this._afterSelectedDatesChange = null;
        this._afterSelectionModeChange = null;
        this._afterSetValueChange = null;
        this._afterShowNextMonthChange = null;
        this._afterShowOtherMonthChange = null;
        this._afterShowPrevMonthChange = null;
        this._afterShowTodayChange = null;
        this._afterSrcNodeChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterTodayLinkNodeChange = null;
        this._afterVisibleChange = null;
        this._afterWeekDaysChange = null;
        this._afterWeekDaysNodeChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._onAllowNoneChange = null;
        this._onBlankDaysChange = null;
        this._onBoundingBoxChange = null;
        this._onContentBoxChange = null;
        this._onCurrentDayChange = null;
        this._onCurrentMonthChange = null;
        this._onCurrentYearChange = null;
        this._onCustomRendererChange = null;
        this._onDateChange = null;
        this._onDateFormatChange = null;
        this._onDatesChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onDisabledDatesRuleChange = null;
        this._onEnabledDatesRuleChange = null;
        this._onFirstDayOfWeekChange = null;
        this._onFocusedChange = null;
        this._onHeaderContentNodeChange = null;
        this._onHeaderRendererChange = null;
        this._onHeaderTitleNodeChange = null;
        this._onHeightChange = null;
        this._onIconNextNodeChange = null;
        this._onIconPrevNodeChange = null;
        this._onIdChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onMaxDateChange = null;
        this._onMaximumDateChange = null;
        this._onMinDateChange = null;
        this._onMinimumDateChange = null;
        this._onMonthDaysChange = null;
        this._onMonthDaysNodeChange = null;
        this._onNoneLinkNodeChange = null;
        this._onPaddingDaysEndChange = null;
        this._onPaddingDaysStartChange = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onSelectMultipleDatesChange = null;
        this._onSelectedDatesChange = null;
        this._onSelectionModeChange = null;
        this._onSetValueChange = null;
        this._onShowNextMonthChange = null;
        this._onShowOtherMonthChange = null;
        this._onShowPrevMonthChange = null;
        this._onShowTodayChange = null;
        this._onSrcNodeChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onTodayLinkNodeChange = null;
        this._onVisibleChange = null;
        this._onWeekDaysChange = null;
        this._onWeekDaysNodeChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/calendar/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "allowNone", Boolean.valueOf(this._allowNone));
        setNamespacedAttribute(request, "blankDays", this._blankDays);
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "currentDay", this._currentDay);
        setNamespacedAttribute(request, "currentMonth", this._currentMonth);
        setNamespacedAttribute(request, "currentYear", this._currentYear);
        setNamespacedAttribute(request, "customRenderer", this._customRenderer);
        setNamespacedAttribute(request, "date", this._date);
        setNamespacedAttribute(request, "dateFormat", this._dateFormat);
        setNamespacedAttribute(request, "dates", this._dates);
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "disabledDatesRule", this._disabledDatesRule);
        setNamespacedAttribute(request, "enabledDatesRule", this._enabledDatesRule);
        setNamespacedAttribute(request, "firstDayOfWeek", this._firstDayOfWeek);
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "headerContentNode", this._headerContentNode);
        setNamespacedAttribute(request, "headerRenderer", this._headerRenderer);
        setNamespacedAttribute(request, "headerTitleNode", this._headerTitleNode);
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "iconNextNode", this._iconNextNode);
        setNamespacedAttribute(request, "iconPrevNode", this._iconPrevNode);
        setNamespacedAttribute(request, "calendarId", this._calendarId);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "maxDate", this._maxDate);
        setNamespacedAttribute(request, "maximumDate", this._maximumDate);
        setNamespacedAttribute(request, "minDate", this._minDate);
        setNamespacedAttribute(request, "minimumDate", this._minimumDate);
        setNamespacedAttribute(request, "monthDays", this._monthDays);
        setNamespacedAttribute(request, "monthDaysNode", this._monthDaysNode);
        setNamespacedAttribute(request, "noneLinkNode", this._noneLinkNode);
        setNamespacedAttribute(request, "paddingDaysEnd", this._paddingDaysEnd);
        setNamespacedAttribute(request, "paddingDaysStart", this._paddingDaysStart);
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "selectMultipleDates", Boolean.valueOf(this._selectMultipleDates));
        setNamespacedAttribute(request, "selectedDates", this._selectedDates);
        setNamespacedAttribute(request, "selectionMode", this._selectionMode);
        setNamespacedAttribute(request, "setValue", Boolean.valueOf(this._setValue));
        setNamespacedAttribute(request, "showNextMonth", Boolean.valueOf(this._showNextMonth));
        setNamespacedAttribute(request, "showOtherMonth", Boolean.valueOf(this._showOtherMonth));
        setNamespacedAttribute(request, "showPrevMonth", Boolean.valueOf(this._showPrevMonth));
        setNamespacedAttribute(request, "showToday", Boolean.valueOf(this._showToday));
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "todayLinkNode", this._todayLinkNode);
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "weekDays", this._weekDays);
        setNamespacedAttribute(request, "weekDaysNode", this._weekDaysNode);
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "afterAllowNoneChange", this._afterAllowNoneChange);
        setNamespacedAttribute(request, "afterBlankDaysChange", this._afterBlankDaysChange);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterCurrentDayChange", this._afterCurrentDayChange);
        setNamespacedAttribute(request, "afterCurrentMonthChange", this._afterCurrentMonthChange);
        setNamespacedAttribute(request, "afterCurrentYearChange", this._afterCurrentYearChange);
        setNamespacedAttribute(request, "afterCustomRendererChange", this._afterCustomRendererChange);
        setNamespacedAttribute(request, "afterDateChange", this._afterDateChange);
        setNamespacedAttribute(request, "afterDateFormatChange", this._afterDateFormatChange);
        setNamespacedAttribute(request, "afterDatesChange", this._afterDatesChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterDisabledDatesRuleChange", this._afterDisabledDatesRuleChange);
        setNamespacedAttribute(request, "afterEnabledDatesRuleChange", this._afterEnabledDatesRuleChange);
        setNamespacedAttribute(request, "afterFirstDayOfWeekChange", this._afterFirstDayOfWeekChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterHeaderContentNodeChange", this._afterHeaderContentNodeChange);
        setNamespacedAttribute(request, "afterHeaderRendererChange", this._afterHeaderRendererChange);
        setNamespacedAttribute(request, "afterHeaderTitleNodeChange", this._afterHeaderTitleNodeChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterIconNextNodeChange", this._afterIconNextNodeChange);
        setNamespacedAttribute(request, "afterIconPrevNodeChange", this._afterIconPrevNodeChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterMaxDateChange", this._afterMaxDateChange);
        setNamespacedAttribute(request, "afterMaximumDateChange", this._afterMaximumDateChange);
        setNamespacedAttribute(request, "afterMinDateChange", this._afterMinDateChange);
        setNamespacedAttribute(request, "afterMinimumDateChange", this._afterMinimumDateChange);
        setNamespacedAttribute(request, "afterMonthDaysChange", this._afterMonthDaysChange);
        setNamespacedAttribute(request, "afterMonthDaysNodeChange", this._afterMonthDaysNodeChange);
        setNamespacedAttribute(request, "afterNoneLinkNodeChange", this._afterNoneLinkNodeChange);
        setNamespacedAttribute(request, "afterPaddingDaysEndChange", this._afterPaddingDaysEndChange);
        setNamespacedAttribute(request, "afterPaddingDaysStartChange", this._afterPaddingDaysStartChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterSelectMultipleDatesChange", this._afterSelectMultipleDatesChange);
        setNamespacedAttribute(request, "afterSelectedDatesChange", this._afterSelectedDatesChange);
        setNamespacedAttribute(request, "afterSelectionModeChange", this._afterSelectionModeChange);
        setNamespacedAttribute(request, "afterSetValueChange", this._afterSetValueChange);
        setNamespacedAttribute(request, "afterShowNextMonthChange", this._afterShowNextMonthChange);
        setNamespacedAttribute(request, "afterShowOtherMonthChange", this._afterShowOtherMonthChange);
        setNamespacedAttribute(request, "afterShowPrevMonthChange", this._afterShowPrevMonthChange);
        setNamespacedAttribute(request, "afterShowTodayChange", this._afterShowTodayChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterTodayLinkNodeChange", this._afterTodayLinkNodeChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterWeekDaysChange", this._afterWeekDaysChange);
        setNamespacedAttribute(request, "afterWeekDaysNodeChange", this._afterWeekDaysNodeChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "onAllowNoneChange", this._onAllowNoneChange);
        setNamespacedAttribute(request, "onBlankDaysChange", this._onBlankDaysChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onCurrentDayChange", this._onCurrentDayChange);
        setNamespacedAttribute(request, "onCurrentMonthChange", this._onCurrentMonthChange);
        setNamespacedAttribute(request, "onCurrentYearChange", this._onCurrentYearChange);
        setNamespacedAttribute(request, "onCustomRendererChange", this._onCustomRendererChange);
        setNamespacedAttribute(request, "onDateChange", this._onDateChange);
        setNamespacedAttribute(request, "onDateFormatChange", this._onDateFormatChange);
        setNamespacedAttribute(request, "onDatesChange", this._onDatesChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onDisabledDatesRuleChange", this._onDisabledDatesRuleChange);
        setNamespacedAttribute(request, "onEnabledDatesRuleChange", this._onEnabledDatesRuleChange);
        setNamespacedAttribute(request, "onFirstDayOfWeekChange", this._onFirstDayOfWeekChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onHeaderContentNodeChange", this._onHeaderContentNodeChange);
        setNamespacedAttribute(request, "onHeaderRendererChange", this._onHeaderRendererChange);
        setNamespacedAttribute(request, "onHeaderTitleNodeChange", this._onHeaderTitleNodeChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onIconNextNodeChange", this._onIconNextNodeChange);
        setNamespacedAttribute(request, "onIconPrevNodeChange", this._onIconPrevNodeChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onMaxDateChange", this._onMaxDateChange);
        setNamespacedAttribute(request, "onMaximumDateChange", this._onMaximumDateChange);
        setNamespacedAttribute(request, "onMinDateChange", this._onMinDateChange);
        setNamespacedAttribute(request, "onMinimumDateChange", this._onMinimumDateChange);
        setNamespacedAttribute(request, "onMonthDaysChange", this._onMonthDaysChange);
        setNamespacedAttribute(request, "onMonthDaysNodeChange", this._onMonthDaysNodeChange);
        setNamespacedAttribute(request, "onNoneLinkNodeChange", this._onNoneLinkNodeChange);
        setNamespacedAttribute(request, "onPaddingDaysEndChange", this._onPaddingDaysEndChange);
        setNamespacedAttribute(request, "onPaddingDaysStartChange", this._onPaddingDaysStartChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onSelectMultipleDatesChange", this._onSelectMultipleDatesChange);
        setNamespacedAttribute(request, "onSelectedDatesChange", this._onSelectedDatesChange);
        setNamespacedAttribute(request, "onSelectionModeChange", this._onSelectionModeChange);
        setNamespacedAttribute(request, "onSetValueChange", this._onSetValueChange);
        setNamespacedAttribute(request, "onShowNextMonthChange", this._onShowNextMonthChange);
        setNamespacedAttribute(request, "onShowOtherMonthChange", this._onShowOtherMonthChange);
        setNamespacedAttribute(request, "onShowPrevMonthChange", this._onShowPrevMonthChange);
        setNamespacedAttribute(request, "onShowTodayChange", this._onShowTodayChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onTodayLinkNodeChange", this._onTodayLinkNodeChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onWeekDaysChange", this._onWeekDaysChange);
        setNamespacedAttribute(request, "onWeekDaysNodeChange", this._onWeekDaysNodeChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
    }
}
