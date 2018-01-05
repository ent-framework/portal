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

package com.liferay.portal.scheduler.quartz;

import com.liferay.portal.dao.shard.ShardDataSourceTargetSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.InfrastructureUtil;

import java.sql.Connection;

import javax.sql.DataSource;

import org.quartz.utils.ConnectionProvider;

/**
 * @author Bruno Farache
 */
public class QuartzConnectionProvider implements ConnectionProvider {

	@Override
	public Connection getConnection() {
		Connection con = null;

		try {
			ShardDataSourceTargetSource shardDataSourceTargetSource =
				(ShardDataSourceTargetSource)
					InfrastructureUtil.getShardDataSourceTargetSource();

			if (shardDataSourceTargetSource != null) {
				shardDataSourceTargetSource.resetDataSource();
			}

			DataSource dataSource = InfrastructureUtil.getDataSource();

			con = dataSource.getConnection();
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return con;
	}

	@Override
	public void shutdown() {
	}

	private static final Logger _log = LoggerFactory.getLogger(
		QuartzConnectionProvider.class);

}