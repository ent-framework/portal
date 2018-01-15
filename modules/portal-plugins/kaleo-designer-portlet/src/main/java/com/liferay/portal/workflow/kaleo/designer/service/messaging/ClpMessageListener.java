package com.liferay.portal.workflow.kaleo.designer.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.workflow.kaleo.designer.service.ClpSerializer;
import com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionLocalServiceUtil;
import com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            KaleoDraftDefinitionLocalServiceUtil.clearService();

            KaleoDraftDefinitionServiceUtil.clearService();
        }
    }
}
