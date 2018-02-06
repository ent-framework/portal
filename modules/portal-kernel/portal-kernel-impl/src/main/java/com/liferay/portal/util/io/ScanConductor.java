package com.liferay.portal.util.io;

import java.io.File;

public abstract interface ScanConductor {
	public abstract ScanAction visitDirectory(String paramString, File paramFile);

	public abstract ScanAction visitFile(String paramString, File paramFile);

	public static enum ScanAction {
		ABORT,

		CONTINUE,

		NO_RECURSE,

		ABORT_DIRECTORY;

		private ScanAction() {
		}
	}
}
