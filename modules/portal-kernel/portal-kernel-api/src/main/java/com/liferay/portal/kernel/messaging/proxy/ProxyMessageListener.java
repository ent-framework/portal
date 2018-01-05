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

package com.liferay.portal.kernel.messaging.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Micha Kiener
 * @author Michael C. Han
 * @author Brian Wing Shun Chan
 * @author Igor Spasic
 */
public class ProxyMessageListener implements MessageListener {

	@Override
	public void receive(Message message) {
		ProxyResponse proxyResponse = new ProxyResponse();

		try {
			Object payload = message.getPayload();

			if (payload == null) {
				throw new Exception("Payload is null");
			}
			else if (!ProxyRequest.class.isAssignableFrom(payload.getClass())) {
				throw new Exception(
					"Payload " + payload.getClass() + " is not of type " +
						ProxyRequest.class.getName());
			}
			else {
				ProxyRequest proxyRequest = (ProxyRequest)payload;

				Object result = proxyRequest.execute(_manager);

				proxyResponse.setResult(result);
			}
		}
		catch (Exception e) {
			proxyResponse.setException(e);
		}
		finally {
			String responseDestinationName =
				message.getResponseDestinationName();

			Exception proxyResponseException = proxyResponse.getException();

			if (Validator.isNotNull(responseDestinationName)) {
				Message responseMessage = MessageBusUtil.createResponseMessage(
					message);

				responseMessage.setPayload(proxyResponse);

				if (_log.isDebugEnabled() && (proxyResponseException != null)) {
					_log.debug(proxyResponseException.getMessage(), proxyResponseException);
				}

				_messageBus.sendMessage(
					responseDestinationName, responseMessage);
			}
			else {
				if (proxyResponseException != null) {
					if (_log.isWarnEnabled()) {
						_log.warn(
							proxyResponseException.getMessage(), proxyResponseException);
					}
				}

				message.setResponse(proxyResponse);
			}
		}
	}

	public void setManager(Object manager) {
		_manager = manager;
	}

	public void setMessageBus(MessageBus messageBus) {
		_messageBus = messageBus;
	}

	private static final Logger _log = LoggerFactory.getLogger(ProxyMessageListener.class);

	private Object _manager;
	private MessageBus _messageBus;

}