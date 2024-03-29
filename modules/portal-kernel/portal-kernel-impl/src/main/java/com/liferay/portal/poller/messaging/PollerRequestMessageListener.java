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

package com.liferay.portal.poller.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.poller.PollerException;
import com.liferay.portal.kernel.poller.PollerProcessor;
import com.liferay.portal.kernel.poller.PollerRequest;
import com.liferay.portal.kernel.poller.PollerResponse;
import com.liferay.portal.poller.PollerProcessorUtil;
import com.liferay.portal.poller.PollerRequestResponsePair;

/**
 * @author Michael C. Han
 * @author Brian Wing Shun Chan
 */
public class PollerRequestMessageListener extends BaseMessageListener {

	@Override
	protected void doReceive(Message message) throws Exception {
		PollerRequestResponsePair pollerRequestResponsePair =
			(PollerRequestResponsePair)message.getPayload();

		PollerRequest pollerRequest =
			pollerRequestResponsePair.getPollerRequest();

		PollerResponse pollerResponse =
			pollerRequestResponsePair.getPollerResponse();

		String portletId = pollerRequest.getPortletId();

		PollerProcessor pollerProcessor =
			PollerProcessorUtil.getPollerProcessor(portletId);

		if (pollerRequest.isReceiveRequest()) {
			pollerResponse.createResponseMessage(message);

			try {
				pollerProcessor.receive(pollerRequest, pollerResponse);
			}
			catch (PollerException pe) {
				_log.error(
					"Unable to receive poller request " + pollerRequest, pe);

				pollerResponse.setParameter("pollerException", pe.getMessage());
			}
			finally {
				pollerResponse.close();
			}
		}
		else {
			try {
				pollerProcessor.send(pollerRequest);
			}
			catch (PollerException pe) {
				_log.error(
					"Unable to send poller request " + pollerRequest, pe);
			}
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		PollerRequestMessageListener.class);

}