/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.bi.reporting.messaging;

import com.liferay.portal.kernel.bi.reporting.ReportDesignRetriever;
import com.liferay.portal.kernel.bi.reporting.ReportEngine;
import com.liferay.portal.kernel.bi.reporting.ReportGenerationException;
import com.liferay.portal.kernel.bi.reporting.ReportRequest;
import com.liferay.portal.kernel.bi.reporting.ReportResultContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;

/**
 * @author Michael C. Han
 */
public class ReportRequestMessageListener extends BaseMessageListener {

	public void setReportEngine(ReportEngine reportEngine) {
		_reportEngine = reportEngine;
	}

	public void setReportResultContainer(
		ReportResultContainer reportResultContainer) {

		_reportResultContainer = reportResultContainer;
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		ReportRequest reportRequest = (ReportRequest)message.getPayload();

		ReportDesignRetriever reportDesignRetriever =
			reportRequest.getReportDesignRetriever();

		ReportResultContainer reportResultContainer =
			_reportResultContainer.clone(reportDesignRetriever.getReportName());

		try {
			_reportEngine.execute(reportRequest, reportResultContainer);
		}
		catch (ReportGenerationException rge) {
			_log.error("Unable to generate report", rge);

			reportResultContainer.setReportGenerationException(rge);
		}
		finally {
			Message responseMessage = MessageBusUtil.createResponseMessage(
				message);

			responseMessage.setPayload(reportResultContainer);

			MessageBusUtil.sendMessage(
				responseMessage.getDestinationName(), responseMessage);
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		ReportRequestMessageListener.class);

	private ReportEngine _reportEngine;
	private ReportResultContainer _reportResultContainer;

}