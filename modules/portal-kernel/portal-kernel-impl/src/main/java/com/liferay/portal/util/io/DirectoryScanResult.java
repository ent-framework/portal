package com.liferay.portal.util.io;

public class DirectoryScanResult {
	private final String[] filesAdded;

	private final String[] filesRemoved;

	public DirectoryScanResult(String[] filesAdded, String[] filesRemoved) {
		this.filesAdded = filesAdded;
		this.filesRemoved = filesRemoved;
	}

	public String[] getFilesAdded() {
		return this.filesAdded;
	}

	public String[] getFilesRemoved() {
		return this.filesRemoved;
	}
}
