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

package com.liferay.portal.servlet;

import com.liferay.portal.kernel.cache.Lifecycle;
import com.liferay.portal.kernel.cache.ThreadLocalCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.servlet.filters.compoundsessionid.CompoundSessionIdHttpSession;
import com.liferay.portal.kernel.servlet.filters.compoundsessionid.CompoundSessionIdSplitterUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.WebKeys;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Brian Wing Shun Chan
 */
public class PortalSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		if (CompoundSessionIdSplitterUtil.hasSessionDelimiter()) {
			CompoundSessionIdHttpSession compoundSessionIdHttpSession =
				new CompoundSessionIdHttpSession(httpSessionEvent.getSession());

			httpSessionEvent = new HttpSessionEvent(
				compoundSessionIdHttpSession);
		}

		new PortalSessionCreator(httpSessionEvent);

		HttpSession session = httpSessionEvent.getSession();

		PortalSessionActivationListener.setInstance(session);

		if (PropsValues.SESSION_MAX_ALLOWED > 0) {
			if (_counter.incrementAndGet() > PropsValues.SESSION_MAX_ALLOWED) {
				session.setAttribute(WebKeys.SESSION_MAX_ALLOWED, Boolean.TRUE);

				_log.error(
					"Exceeded maximum number of " +
						PropsValues.SESSION_MAX_ALLOWED + " sessions " +
							"allowed. You may be experiencing a DoS attack.");
			}
		}
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		if (CompoundSessionIdSplitterUtil.hasSessionDelimiter()) {
			CompoundSessionIdHttpSession compoundSessionIdHttpSession =
				new CompoundSessionIdHttpSession(httpSessionEvent.getSession());

			httpSessionEvent = new HttpSessionEvent(
				compoundSessionIdHttpSession);
		}

		new PortalSessionDestroyer(httpSessionEvent);

		ThreadLocalCacheManager.clearAll(Lifecycle.SESSION);

		if (PropsValues.SESSION_MAX_ALLOWED > 0) {
			_counter.decrementAndGet();
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		PortalSessionListener.class);

	private AtomicInteger _counter = new AtomicInteger();

}