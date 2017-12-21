package com.liferay.alloy.util;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang.StringUtils;






















public class DefaultValueUtil
{
  public static String getDefaultValue(String className, String value)
  {
    String defaultValue = "";
    
    if ((className.equals(ArrayList.class.getName())) || (className.equals(HashMap.class.getName())) || (className.equals(Object.class.getName())) || (className.equals(String.class.getName())))
    {



      if (!isValidStringValue(value)) {
        return defaultValue;
      }
      
      if (_EMPTY_STRINGS.contains(value)) {
        value = "";
      }
      else if ((className.equals(ArrayList.class.getName())) && (!StringUtil.startsWith(value.trim(), "[")))
      {


        value = "[]";
      }
      else if ((className.equals(HashMap.class.getName())) && (!StringUtil.startsWith(value.trim(), "{")))
      {


        value = "{}";
      }
      
      defaultValue = StringUtil.unquote(value);
    }
    else if ((className.equals(Boolean.TYPE.getName())) || (className.equals(Boolean.class.getName())))
    {

      defaultValue = String.valueOf(GetterUtil.getBoolean(value));
    }
    else if ((className.equals(Integer.TYPE.getName())) || (className.equals(Integer.class.getName())))
    {

      if (_INFINITY.contains(value)) {
        value = String.valueOf(Integer.MAX_VALUE);
      }
      
      defaultValue = String.valueOf(GetterUtil.getInteger(value));
    }
    else if ((className.equals(Double.TYPE.getName())) || (className.equals(Double.class.getName())))
    {

      if (_INFINITY.contains(value)) {
        value = String.valueOf(Double.MAX_VALUE);
      }
      
      defaultValue = String.valueOf(GetterUtil.getDouble(value));
    }
    else if ((className.equals(Float.TYPE.getName())) || (className.equals(Float.class.getName())))
    {

      if (_INFINITY.contains(value)) {
        value = String.valueOf(Float.MAX_VALUE);
      }
      
      defaultValue = String.valueOf(GetterUtil.getFloat(value));
    }
    else if ((className.equals(Long.TYPE.getName())) || (className.equals(Long.class.getName())))
    {

      if (_INFINITY.contains(value)) {
        value = String.valueOf(Long.MAX_VALUE);
      }
      
      defaultValue = String.valueOf(GetterUtil.getLong(value));
    }
    else if ((className.equals(Short.TYPE.getName())) || (className.equals(Short.class.getName())))
    {

      if (_INFINITY.contains(value)) {
        value = String.valueOf(32767);
      }
      
      defaultValue = String.valueOf(GetterUtil.getShort(value));
    }
    else if (className.equals(Number.class.getName())) {
      if (_INFINITY.contains(value)) {
        value = String.valueOf(Integer.MAX_VALUE);
      }
      
      defaultValue = String.valueOf(GetterUtil.getNumber(value));
    }
    
    return defaultValue;
  }
  
  public static boolean isValidStringValue(String value) {
    value = StringUtil.trim(GetterUtil.getString(value));
    
    if (Validator.isNull(value)) {
      return false;
    }
    
    if ((StringUtils.isAlpha(value)) || ((!StringUtils.containsIgnoreCase(value, "generated")) && (!StringUtils.isAlpha(value.substring(0, 1))) && (!StringUtils.endsWith(value, "."))))
    {



      return true;
    }
    
    return false;
  }
  
  private static final List<String> _EMPTY_STRINGS = Arrays.asList(new String[] { "", "''", "\"\"", "(empty)", "empty", "EMPTY_STR", "undefined", "WidgetStdMod.BODY", "HTMLTextNode" });
  

  private static final String _GENERATED = "generated";
  

  private static final List<String> _INFINITY = Arrays.asList(new String[] { "infinity", "Infinity", "INFINITY" });
}
