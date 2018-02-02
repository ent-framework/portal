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

import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.cluster.ClusterLink;
import com.liferay.portal.kernel.cluster.Priority;
import com.liferay.portal.kernel.cluster.messaging.ClusterForwardMessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.security.pacl.DoPrivileged;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PropsUtil;

import java.net.InetAddress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.jgroups.JChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Shuyang Zhou
 */
@DoPrivileged
public class ClusterLinkImpl extends ClusterBase implements ClusterLink {

	@Override
	public void destroy() {
		if (!isEnabled()) {
			return;
		}

		_transportChannel.close();

	}

	@Override
	public InetAddress getBindInetAddress() {
		return bindInetAddress;
	}

	@Override
	public List<Address> getLocalTransportAddresses() {
		if (!isEnabled()) {
			return Collections.emptyList();
		}

		return getAddresses(_transportChannel);
	}

	@Override
	public List<Address> getTransportAddresses(Priority priority) {
		if (!isEnabled()) {
			return Collections.emptyList();
		}
		return getAddresses(_transportChannel);
	}

	@Override
	public void initialize() {
		if (!isEnabled()) {
			return;
		}

		BaseReceiver baseReceiver = (BaseReceiver) _transportChannel.getReceiver();

		baseReceiver.openLatch();

	}

	@Override
	public void sendMulticastMessage(Message message, Priority priority) {
		if (!isEnabled()) {
			return;
		}

		try {
			sendJGroupsMessage(_transportChannel, null, message);
		} catch (Exception e) {
			_log.error("Unable to send multicast message " + message, e);
		}
	}

	@Override
	public void sendUnicastMessage(
			Address address, Message message, Priority priority) {

		if (!isEnabled()) {
			return;
		}

		org.jgroups.Address jGroupsAddress = (org.jgroups.Address) address.getRealAddress();

		try {
			sendJGroupsMessage(_transportChannel, jGroupsAddress, message);
		} catch (Exception e) {
			_log.error("Unable to send unicast message " + message, e);
		}
	}

	public void setClusterForwardMessageListener(ClusterForwardMessageListener clusterForwardMessageListener) {
		_clusterForwardMessageListener = clusterForwardMessageListener;
	}

	@Override
	protected void initChannels() throws Exception {

		if (_transportChannel==null) {
			return;
		}
		_transportChannel.setReceiver(new ClusterForwardReceiver(_transportChannel.getAddress(), _clusterForwardMessageListener));
		_transportChannel.connect(this.eurekaJChannel.getClusterName());
	}

	private static final Logger _log = LoggerFactory.getLogger(ClusterLinkImpl.class);

	private ClusterForwardMessageListener _clusterForwardMessageListener;

	private JChannel _transportChannel;
	private JGroupsTransport eurekaJChannel;

	@Autowired
	@Qualifier("liferay.transportChannel")
	public void setTransportChannel(JGroupsTransport jChannel) {
		this.eurekaJChannel = jChannel;
		this._transportChannel = jChannel.getChannel();
	}

}