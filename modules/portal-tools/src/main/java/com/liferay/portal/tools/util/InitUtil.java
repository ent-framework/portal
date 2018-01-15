package com.liferay.portal.tools.util;

import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portal.kernel.xml.UnsecureSAXReaderUtil;
import com.liferay.portal.model.ModelHintsUtil;
import com.liferay.portal.security.permission.ResourceActionsUtil;
import com.liferay.portal.tools.xml.SAXReaderImpl;
import com.liferay.portal.util.FastDateFormatFactoryImpl;

public class InitUtil {
	
	public static void init(String modelHintsFileName, String resoucesActionDir) {
		
		com.liferay.portal.kernel.util.PropsUtil.setProps(new PropsImpl());

		UnsecureSAXReaderUtil unsaxReaderUtil = new UnsecureSAXReaderUtil();
		SAXReaderImpl unReader  = new SAXReaderImpl();
		unReader.setSecure(false);
		unsaxReaderUtil.setSAXReader(unReader);
		
//		SAXReaderUtil saxReaderUtil = new SAXReaderUtil();
//		SAXReaderImpl reader  = new SAXReaderImpl();
//		reader.setSecure(true);
//		saxReaderUtil.setSAXReader(unReader);
		
		FastDateFormatFactoryUtil fastDateFormatFactoryUtil = new FastDateFormatFactoryUtil();
		fastDateFormatFactoryUtil.setFastDateFormatFactory(new FastDateFormatFactoryImpl());

		ModelHintsImpl modelHints = new ModelHintsImpl();
		modelHints.setSAXReader(unReader);
		modelHints.init(modelHintsFileName);
		new ModelHintsUtil().setModelHints(modelHints);

		new ResourceActionsUtil().setResourceActions(new ResourceActionsImpl().init(resoucesActionDir));
	}

}
