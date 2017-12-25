package com.liferay.alloy.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.text.MessageFormat;


public class MessageUtil {
    private static Log _log = LogFactoryUtil.getLog(MessageUtil.class);

    public static String substitute(String pattern, Object[] arguments) {
        String value = null;
        try {
            if (arguments != null) {
                pattern = StringUtil.replace(pattern, "'", "''");


                value = MessageFormat.format(pattern, arguments);
            } else {
                value = pattern;
            }
        } catch (Exception e) {
            if (_log.isWarnEnabled()) {
                _log.warn(e, e);
            }
        }

        return value;
    }
}
