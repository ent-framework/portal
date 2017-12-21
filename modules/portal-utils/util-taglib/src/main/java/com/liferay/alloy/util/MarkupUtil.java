package com.liferay.alloy.util;

import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.PwdGenerator;





public class MarkupUtil
{
  public static String getClassName(Object... args)
  {
    Object[] classes = new Object[args.length + 1];
    
    ArrayUtil.combine(new String[] { "aui" }, args, classes);
    

    return StringUtil.merge(classes, "-");
  }
  
  public static String getUniqueId() {
    return PwdGenerator.getPassword("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 5);
  }
}
