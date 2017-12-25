package com.liferay.alloy.taglib.alloy_util;

import com.liferay.alloy.taglib.alloy_util.base.BaseComponentTag;
import com.liferay.alloy.util.ReservedAttributeUtil;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ComponentTag
        extends BaseComponentTag {
    private static final String _AFTER = "after";
    private static final String _DYNAMIC_ATTRIBUTES = "dynamicAttributes";
    private static final Pattern _EVENT_AFTER_REGEX = Pattern.compile("after[A-Z]");
    private static final Pattern _EVENT_ON_REGEX = Pattern.compile("on[A-Z]");
    private static final String _ON = "on";

    protected void setAttributes(HttpServletRequest request) {
        Map<String, Object> options = getOptions();
        HashMap<String, Object> optionsJSON = new HashMap();

        _proccessAttributes(options, optionsJSON);

        super.setAttributes(request);

        setNamespacedAttribute(request, "options", options);
        setNamespacedAttribute(request, "optionsJSON", optionsJSON);
    }

    private boolean _isEventAttribute(String key) {
        Matcher afterMatcher = _EVENT_AFTER_REGEX.matcher(key);
        Matcher onMatcher = _EVENT_ON_REGEX.matcher(key);

        return (afterMatcher.find()) || (onMatcher.find());
    }

    private boolean _isValidAttribute(String key) {
        List<String> excludeAttributes = Collections.EMPTY_LIST;

        if (getExcludeAttributes() != null) {
            excludeAttributes = Arrays.asList(getExcludeAttributes().split(","));
        }


        return (!excludeAttributes.contains(key)) && (!key.equals("dynamicAttributes"));
    }

    private void _proccessAttributes(Map<String, Object> options, Map<String, Object> newOptions) {
        Map<String, String> afterEventOptionsMap = new HashMap();


        Map<String, String> onEventOptionsMap = new HashMap();

        for (String key : options.keySet()) {
            if (_isValidAttribute(key)) {


                Object value = options.get(key);

                String originalKey = ReservedAttributeUtil.getOriginalName(getName(), key);


                if ((value instanceof Map)) {
                    Map<String, Object> childOptionsMap = new HashMap();


                    _proccessAttributes((Map) value, childOptionsMap);

                    newOptions.put(originalKey, childOptionsMap);


                } else if (_isEventAttribute(key)) {
                    _processEventAttribute(key, String.valueOf(value), afterEventOptionsMap, onEventOptionsMap);
                } else {
                    newOptions.put(originalKey, value);
                }
            }
        }
        if (afterEventOptionsMap.size() > 0) {
            newOptions.put("after", afterEventOptionsMap);
        }

        if (onEventOptionsMap.size() > 0) {
            newOptions.put("on", onEventOptionsMap);
        }
    }

    private void _processEventAttribute(String key, String value, Map<String, String> afterEventOptionsMap, Map<String, String> onEventsOptionsMap) {
        if (key.startsWith("after")) {
            String event = StringUtils.uncapitalize(key.replaceFirst("after", ""));


            afterEventOptionsMap.put(event, value);
        } else {
            String event = StringUtils.uncapitalize(key.replaceFirst("on", ""));


            onEventsOptionsMap.put(event, value);
        }
    }
}
