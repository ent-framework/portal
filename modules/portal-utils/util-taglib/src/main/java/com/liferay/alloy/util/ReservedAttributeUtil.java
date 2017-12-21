package com.liferay.alloy.util;

import com.liferay.alloy.tools.model.Attribute;
import com.liferay.alloy.tools.model.Component;
import com.liferay.portal.kernel.util.StringUtil;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.StringUtils;
























public class ReservedAttributeUtil
{
  public static String getOriginalName(String componentName, String attributeName)
  {
    String originalName = StringUtils.uncapitalize(StringUtil.replaceFirst(attributeName, componentName.toLowerCase(), ""));
    


    if (isReserved(originalName)) {
      attributeName = originalName;
    }
    
    return attributeName;
  }
  
  public static String getSafeName(Attribute attribute) {
    String name = attribute.getName();
    
    Component component = attribute.getComponent();
    
    if ((isReserved(attribute)) && (component != null)) {
      String componentName = component.getName();
      
      name = componentName.toLowerCase().concat(StringUtils.capitalize(name));
    }
    

    return name;
  }
  
  public static boolean isReserved(Attribute attribute) {
    return isReserved(attribute.getName());
  }
  
  public static boolean isReserved(String attributeName) {
    return RESERVED_ATTRIBUTES.contains(attributeName);
  }
  
  public static final List<String> RESERVED_ATTRIBUTES = Arrays.asList(new String[] { "values", "value", "servletRequest", "servletResponse", "servletContext", "scopedAttribute", "scopedAttributes", "previousOut", "parent", "namespacedAttribute", "attributeNamespace", "bodyContent", "class", "dynamicAttribute", "dynamicAttributes", "id", "scriptPosition", "page", "locale" });
}
