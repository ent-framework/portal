package com.liferay.alloy.util;

import jodd.util.ReflectUtil;

import java.lang.reflect.Method;


public class AttributeUtil {
    public static Object getAttribute(Object obj, String key) {
        try {
            Method getAttribute = ReflectUtil.findMethod(obj.getClass(), "getAttribute");


            getAttribute.setAccessible(true);

            return getAttribute.invoke(obj, new Object[]{key});
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void setAttribute(Object obj, String key, Object value) {
        try {
            Method setAttribute = ReflectUtil.findMethod(obj.getClass(), "setAttribute");


            setAttribute.setAccessible(true);

            setAttribute.invoke(obj, new Object[]{key, value});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
