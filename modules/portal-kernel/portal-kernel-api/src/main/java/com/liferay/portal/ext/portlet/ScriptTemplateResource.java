package com.liferay.portal.ext.portlet;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Reader;

import com.liferay.portal.kernel.io.unsync.UnsyncStringReader;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class ScriptTemplateResource implements TemplateResource {

	/**
	 * The empty constructor is required by {@link java.io.Externalizable}. Do
	 * not use this for any other purpose.
	 */
	public ScriptTemplateResource() {
	}

	public ScriptTemplateResource( String templateContent) {

		if (Validator.isNull(templateContent)) {
			throw new IllegalArgumentException("Template content is null");
		}

		_templateContent = templateContent;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScriptTemplateResource)) {
			return false;
		}

		ScriptTemplateResource stringTemplateResource =
			(ScriptTemplateResource)obj;

		if (_templateContent.equals(stringTemplateResource._templateContent)) {

			return true;
		}

		return false;
	}

	public String getContent() {
		return _templateContent;
	}

	@Override
	public long getLastModified() {
		return _lastModified;
	}

	@Override
	public Reader getReader() {
		return new UnsyncStringReader(_templateContent);
	}

	@Override
	public String getTemplateId() {
		return StringPool.BLANK;
	}

	@Override
	public int hashCode() {
		return _templateContent.hashCode();
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		_lastModified = objectInput.readLong();
		_templateContent = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(_lastModified);
		objectOutput.writeUTF(_templateContent);
	}

	private long _lastModified = System.currentTimeMillis();
	private String _templateContent;
}
