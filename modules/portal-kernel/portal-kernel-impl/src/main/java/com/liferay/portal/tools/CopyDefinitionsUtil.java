package com.liferay.portal.tools;

import java.beans.Introspector;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import jodd.util.StringPool;

import com.liferay.portal.kernel.util.ClearThreadLocalUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.EntityResolver;
import com.liferay.portal.util.InitUtil;

public class CopyDefinitionsUtil {

	public CopyDefinitionsUtil(String defintionDestDir) {

		if (!defintionDestDir.endsWith(StringPool.SLASH)) {
			_defintionDestDir = defintionDestDir + StringPool.SLASH;
		} else {
			_defintionDestDir = defintionDestDir;
		}

		FileUtil.mkdirs(_defintionDestDir);
	}

	public void copy() {

		ClassLoader classLoader = getClass().getClassLoader();

		KeyValuePair[] publicIds = EntityResolver.PUBLIC_IDS;

		for (int i = 0; i < publicIds.length; i++) {
			KeyValuePair kvp = publicIds[i];

			InputStream is = classLoader.getResourceAsStream(EntityResolver.DEFINITIONS_PATH + kvp.getValue());

			if (is == null) {
				is = classLoader.getResourceAsStream(kvp.getValue());
			}

			if (is != null) {
				File dest = new File(_defintionDestDir + kvp.getValue());
				try {
					System.out.println("copy definition file: " + kvp.getValue() + " to" + _defintionDestDir);
					FileUtil.write(dest, FileUtil.getBytes(is));
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (is != null) {
						try {
							is.close();
						} catch (IOException e) {
						}
					}
				}
			}

		}
	}

	public String _defintionDestDir;

	public static void main(String[] args) {
		Map<String, String> arguments = ArgumentsUtil.parseArguments(args);

		InitUtil.initWithSpring(true);

		String defintionDestDir = arguments.get("defintion.dest.dir");

		if (Validator.isNull(defintionDestDir)) {
			System.out.println("${defintion.dest.dir} is not set.");
			return;
		}
		
		CopyDefinitionsUtil util = new CopyDefinitionsUtil(defintionDestDir);
		util.copy();

		try {
			ClearThreadLocalUtil.clearThreadLocal();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Introspector.flushCaches();
	}

}
