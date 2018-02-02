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

package com.liferay.portal.cluster;

import com.liferay.portal.kernel.cluster.messaging.ClusterForwardMessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.jgroups.Address;
import org.jgroups.Message;

/**
 * @author Shuyang Zhou
 */
public class ClusterForwardReceiver extends BaseReceiver {

	public ClusterForwardReceiver(
			Address localTransportAddress,
			ClusterForwardMessageListener clusterForwardMessageListener) {

		_localTransportAddress = localTransportAddress;
		_clusterForwardMessageListener = clusterForwardMessageListener;
	}

	@Override
	protected void doReceive(Message message) {
		Object object = retrievePayload(message);

		if (object == null) {
			return;
		}

		if (!_localTransportAddress.equals(message.getSrc()) || (message.getDest() != null)) {
			_clusterForwardMessageListener.receive((com.liferay.portal.kernel.messaging.Message) object);
		} else {
			if (_log.isDebugEnabled()) {
				_log.debug("Block received message " + message);
			}
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(ClusterForwardReceiver.class);

	private ClusterForwardMessageListener _clusterForwardMessageListener;
	private Address _localTransportAddress;

}