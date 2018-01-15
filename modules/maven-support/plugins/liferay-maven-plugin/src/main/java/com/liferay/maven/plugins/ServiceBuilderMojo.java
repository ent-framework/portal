/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.maven.plugins;

import com.liferay.maven.plugins.util.FileUtil;
import com.liferay.maven.plugins.util.StringUtil;
import com.liferay.maven.plugins.util.Validator;

import java.io.File;

import java.net.URI;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Builds Liferay Service Builder services.
 *
 * @author Mika Koivisto
 * @author Thiago Moreira
 * @goal   build-service
 */
public class ServiceBuilderMojo extends AbstractToolsLiferayMojo {

	protected void doExecute() throws Exception {
		String packaging = project.getPackaging();

		if (packaging.equals("pom")) {
			getLog().info("Skipping " + project.getArtifactId());

			return;
		}

		initProperties();

		if (Validator.isNull(serviceFileName)) {
			throw new MojoExecutionException(
				"Unable to find service.xml with path " + serviceFileName);
		}

		serviceFileName = StringUtils.remove(serviceFileName,"\t");
		serviceFileName = StringUtils.remove(serviceFileName,"\n");
        serviceFileName = StringUtils.remove(serviceFileName," ");

		String[] serviceFileNames = StringUtils.split(serviceFileName, ",");
		for (String fileName :serviceFileNames) {
			File inputFile = new File(fileName);

			if (!inputFile.exists()) {
				throw new MojoExecutionException(
						"Unable to find service.xml with path " +
								inputFile.getAbsolutePath());
			}
		}

		getLog().info("Building from " + serviceFileName);

		FileUtil.mkdirs(sqlDir);

		List<String> args = new ArrayList<>();
		args.add("service.input.file=" + serviceFileName);
		args.add("service.hbm.file=" + hbmFileName);
		args.add("service.orm.file=" + ormFileName);
		args.add("service.model.hints.file=" + modelHintsFileName);
		args.add("service.spring.file=" + springFileName);
		args.add("service.spring.base.file=");
		args.add("service.spring.cluster.file=");
		args.add("service.spring.dynamic.data.source.file=");
		args.add("service.spring.hibernate.file=");
		args.add("service.spring.infrastructure.file=");
		args.add("service.spring.shard.data.source.file=");
		args.add("service.api.dir=" + apiDir);
		args.add("service.impl.dir=" + implDir);
		args.add("service.json.file=");
		args.add("service.remoting.file=" + remotingFileName);
		args.add("service.sql.dir=" + sqlDir);
		args.add("service.sql.file=" + sqlFileName);
		args.add("service.sql.indexes.file=" + sqlIndexesFileName);
		args.add("service.sql.indexes.properties.file=" + sqlIndexesPropertiesFileName);
		args.add("service.sql.sequences.file=" + sqlSequencesFileName);
		args.add("service.auto.namespace.tables=" + autoNamespaceTables);
		args.add("service.bean.locator.util=" + beanLocatorUtil);
        args.add("service.props.util=" + propsUtil);
		args.add("service.target.entity.name=" + targetEntityName);
		args.add("service.test.dir=");
		args.add("service.build.number=");
		args.add("service.build.number.increment=");
		args.add("resouces.actions.dir=" + resourceActionsDir);

        if (!pluginType.equals("portal")) {
            args.add("service.plugin.name=" + pluginName);
        }

		executeTool(
			"com.liferay.portal.tools.servicebuilder.ServiceBuilderExecutor",
			getToolsClassLoader(), args.toArray(new String[args.size()]));
	}

	@Override
	protected List<String> getProjectClassPath() throws Exception {
		List<String> projectClassPath = super.getProjectClassPath();

		File file = new File(implResourcesDir);

		URI uri = file.toURI();

		URL url = uri.toURL();

		projectClassPath.add(0, url.toString());

		return projectClassPath;
	}

	protected void initPortalProperties() throws Exception {
		super.initPortalProperties();

		initProperties();
	}

	protected void initProperties() throws Exception {

	    pluginType =  StringUtils.trimToEmpty(pluginType);

	    if (!(PLUGIN_TYPE_PORTAL.equalsIgnoreCase(pluginType) || PLUGIN_TYPE_PORTLET.equalsIgnoreCase(pluginType))){
            throw new MojoExecutionException("Unsupported plugin Type :" + pluginType);
        }

        if (Validator.isNull(apiBaseDir)) {
            apiBaseDir = baseDir;
        }

        if (Validator.isNull(implBaseDir)) {
            implBaseDir = baseDir;
        }

		if (Validator.isNotNull(apiBaseDir)) {
			apiDir = apiBaseDir.concat("/src/main/java");
		}

		if (Validator.isNotNull(implBaseDir)) {
			implDir = implBaseDir.concat("/src/main/java");
			implResourcesDir = implBaseDir.concat("/src/main/resources");
		}

		if (Validator.isNull(sqlDir)) {
			sqlDir = implResourcesDir.concat("/dependencies/").concat(pluginType).concat("/sql");
		}

        if (Validator.isNull(sqlFileName)) {
            sqlFileName = pluginType.concat("-tables.sql");
        }

        if (Validator.isNull(hbmFileName)) {
            hbmFileName = implResourcesDir.concat("/META-INF/").concat(pluginType).concat("-hbm.xml");
        }

        if (Validator.isNull(ormFileName)) {
            ormFileName = implResourcesDir.concat("/META-INF/").concat(pluginType).concat("-orm.xml");
        }

        if (Validator.isNull(modelHintsFileName)) {
            modelHintsFileName = implResourcesDir.concat("/META-INF/").concat(pluginType).concat("-model-hints.xml");
        }

        if (Validator.isNull(springFileName)) {
            springFileName = implResourcesDir.concat("/META-INF/").concat(pluginType).concat("-spring.xml");
        }

        if (Validator.isNull(resourceActionsDir)) {
            resourceActionsDir = implResourcesDir;
        }

		if (pluginType.equals(PLUGIN_TYPE_PORTAL)) {
			pluginName = null;

		}
	}

	/**
	 * @parameter
	 */
	private String apiBaseDir;

	private String apiDir;

	/**
	 * @parameter default-value="true"
	 * @required
	 */
	private boolean autoNamespaceTables;

	/**
	 * @parameter default-value="${basedir}"
	 * @required
	 */
	private String baseDir;

	private String beanLocatorUtil = "com.liferay.portal.kernel.bean.PortalBeanLocatorUtil";

	/**
	 * @parameter
	 */
	private String hbmFileName;

	/**
	 * @parameter
	 */
	private String implBaseDir;

	private String implDir;

	private String implResourcesDir;

	private String modelHintsFileName;

	/**
	 * @parameter
	 */
	private String ormFileName;

	/**
	 * @parameter default-value="${project.artifactId}" expression="${pluginName}"
	 * @required
	 */
	private String pluginName;

	/**
	 * @parameter default-value="portlet" expression="${pluginType}"
	 * @required
	 */
	private String pluginType;

	/**
	 * @deprecated As of 6.1.0
	 * @parameter
	 */
	private List<String> postBuildGoals;


	private String propsUtil = "com.liferay.portal.kernel.util.PropsUtil";

	/**
	 * @parameter
	 */
	private String remotingFileName;

	/**
	 * @parameter default-value="" expression="${serviceFileName}"
	 */
	private String serviceFileName;

	/**
	 * @parameter
	 */

	private String springFileName;

	private String sqlDir;

	private String sqlFileName;

	private String sqlIndexesFileName = "indexes.sql";

	private String sqlIndexesPropertiesFileName = "indexes.properties";

	private String sqlSequencesFileName = "sequences.sql";

	/**
	 * @parameter
	 */
	private String targetEntityName;

	private String resourceActionsDir;

}