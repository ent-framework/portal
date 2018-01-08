package com.liferay.portal.tools.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import com.liferay.portal.kernel.nio.charset.CharsetEncoderUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.SystemProperties;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.PwdGenerator;

public class FileImpl {

	public static FileImpl getInstance(){
		return new FileImpl();
	}

	public String getExtension(String fileName) {
		if (fileName == null) {
			return null;
		}

		int pos = fileName.lastIndexOf(CharPool.PERIOD);

		if (pos > 0) {
			return StringUtil.toLowerCase(
				fileName.substring(pos + 1, fileName.length()));
		}
		else {
			return StringPool.BLANK;
		}
	}
	
	public String getAbsolutePath(File file) {
		return StringUtil.replace(
			file.getAbsolutePath(), CharPool.BACK_SLASH, CharPool.SLASH);
	}
	
	public String read(File file) throws IOException {
		return read(file, false);
	}

	public byte[] getBytes(File file) throws IOException {
		if ((file == null) || !file.exists()) {
			return null;
		}

		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");

		byte[] bytes = new byte[(int)randomAccessFile.length()];

		randomAccessFile.readFully(bytes);

		randomAccessFile.close();

		return bytes;
	}
	
	public String read(String fileName) throws IOException {
		return read(new File(fileName));
	}
	
	public boolean exists(File file) {
		return file.exists();
	}
	
	public boolean exists(String fileName) {
		return exists(new File(fileName));
	}
	
	public String read(File file, boolean raw) throws IOException {
		byte[] bytes = getBytes(file);

		if (bytes == null) {
			return null;
		}

		String s = new String(bytes, StringPool.UTF8);

		if (raw) {
			return s;
		}
		else {
			return StringUtil.replace(
				s, StringPool.RETURN_NEW_LINE, StringPool.NEW_LINE);
		}
	}
	
	public void write(File file, byte[] bytes) throws IOException {
		write(file, bytes, 0, bytes.length, false);
	}


	public void write(File file, byte[] bytes, boolean append)
		throws IOException {

		write(file, bytes, 0, bytes.length, append);
	}

	public void write(File file, byte[] bytes, int offset, int length)
		throws IOException {

		write(file, bytes, offset, bytes.length, false);
	}

	public void write(
			File file, byte[] bytes, int offset, int length, boolean append)
		throws IOException {

		mkdirsParentFile(file);

		FileOutputStream fileOutputStream = new FileOutputStream(file, append);

		fileOutputStream.write(bytes, offset, length);

		fileOutputStream.close();
	}

	public void write(File file, InputStream is) throws IOException {
		mkdirsParentFile(file);

		StreamUtil.transfer(is, new FileOutputStream(file));
	}

	public void write(File file, String s) throws IOException {
		write(file, s, false);
	}

	public void write(File file, String s, boolean lazy) throws IOException {
		write(file, s, lazy, false);
	}

	public void write(File file, String s, boolean lazy, boolean append)
		throws IOException {

		if (s == null) {
			return;
		}

		mkdirsParentFile(file);

		if (lazy && file.exists()) {
			String content = read(file);

			if (content.equals(s)) {
				return;
			}
		}

		Writer writer = new OutputStreamWriter(
			new FileOutputStream(file, append), StringPool.UTF8);

		writer.write(s);

		writer.close();
	}

	public void write(String fileName, byte[] bytes) throws IOException {
		write(new File(fileName), bytes);
	}

	public void write(String fileName, InputStream is) throws IOException {
		write(new File(fileName), is);
	}

	public void write(String fileName, String s) throws IOException {
		write(new File(fileName), s);
	}

	public void write(String fileName, String s, boolean lazy)
		throws IOException {

		write(new File(fileName), s, lazy);
	}

	public void write(String fileName, String s, boolean lazy, boolean append)
		throws IOException {

		write(new File(fileName), s, lazy, append);
	}

	public void write(String pathName, String fileName, String s)
		throws IOException {

		write(new File(pathName, fileName), s);
	}

	public void write(String pathName, String fileName, String s, boolean lazy)
		throws IOException {

		write(new File(pathName, fileName), s, lazy);
	}

	public void write(
			String pathName, String fileName, String s, boolean lazy,
			boolean append)
		throws IOException {

		write(new File(pathName, fileName), s, lazy, append);
	}
	
	protected void mkdirsParentFile(File file) throws IOException {
		File parentFile = file.getParentFile();

		if (parentFile == null) {
			return;
		}

		try {
			mkdirs(parentFile);
		}
		catch (SecurityException se) {

			// We may have the permission to write a specific file without
			// having the permission to check if the parent file exists

		}
	}
	
	public void mkdirs(File file) throws IOException {
		FileUtils.forceMkdir(file);
	}
	
	public Properties toProperties(FileInputStream fis) {
		Properties properties = new Properties();

		try {
			properties.load(fis);
		}
		catch (IOException ioe) {
		}

		return properties;
	}

	public Properties toProperties(String fileName) {
		try {
			return toProperties(new FileInputStream(fileName));
		}
		catch (IOException ioe) {
			return new Properties();
		}
	}
	
	public String[] listDirs(File file) {
		List<String> dirs = new ArrayList<String>();

		File[] fileArray = file.listFiles();

		for (int i = 0; (fileArray != null) && (i < fileArray.length); i++) {
			if (fileArray[i].isDirectory()) {
				dirs.add(fileArray[i].getName());
			}
		}

		return dirs.toArray(new String[dirs.size()]);
	}
	
	public String[] listDirs(String fileName) {
		return listDirs(new File(fileName));
	}
	
	public boolean delete(File file) {
		if (file != null) {
			boolean exists = true;

			try {
				exists = file.exists();
			}
			catch (SecurityException se) {

				// We may have the permission to delete a specific file without
				// having the permission to check if the file exists

			}

			if (exists) {
				return file.delete();
			}
		}

		return false;
	}

	public boolean delete(String file) {
		return delete(new File(file));
	}
	public File createTempFile() {
		return createTempFile(StringPool.BLANK);
	}

	public File createTempFile(byte[] bytes) throws IOException {
		File file = createTempFile(StringPool.BLANK);

		write(file, bytes, false);

		return file;
	}

	public File createTempFile(InputStream is) throws IOException {
		File file = createTempFile(StringPool.BLANK);

		write(file, is);

		return file;
	}

	public File createTempFile(String extension) {
		return new File(createTempFileName(extension));
	}

	public File createTempFile(String prefix, String extension) {
		return new File(createTempFileName(prefix, extension));
	}

	public String createTempFileName() {
		return createTempFileName(null, null);
	}

	public String createTempFileName(String extension) {
		return createTempFileName(null, extension);
	}

	public String createTempFileName(String prefix, String extension) {
		StringBundler sb = new StringBundler();

		sb.append(SystemProperties.get(SystemProperties.TMP_DIR));
		sb.append(StringPool.SLASH);

		if (Validator.isNotNull(prefix)) {
			sb.append(prefix);
		}

		sb.append(Time.getTimestamp());
		sb.append(PwdGenerator.getPassword(8, PwdGenerator.KEY2));

		if (Validator.isFileExtension(extension)) {
			sb.append(StringPool.PERIOD);
			sb.append(extension);
		}

		return sb.toString();
	}

	public File createTempFolder() throws IOException {
		File file = new File(createTempFileName());

		mkdirs(file);

		return file;
	}
	
	public boolean isSameContent(File file, byte[] bytes, int length) {
		FileChannel fileChannel = null;

		try {
			FileInputStream fileInputStream = new FileInputStream(file);

			fileChannel = fileInputStream.getChannel();

			if (fileChannel.size() != length) {
				return false;
			}

			byte[] buffer = new byte[1024];

			ByteBuffer byteBuffer = ByteBuffer.wrap(buffer);

			int bufferIndex = 0;
			int bufferLength = -1;

			while (((bufferLength = fileChannel.read(byteBuffer)) > 0) &&
				   (bufferIndex < length)) {

				for (int i = 0; i < bufferLength; i++) {
					if (buffer[i] != bytes[bufferIndex++]) {
						return false;
					}
				}

				byteBuffer.clear();
			}

			if ((bufferIndex != length) || (bufferLength != -1)) {
				return false;
			}
			else {
				return true;
			}
		}
		catch (Exception e) {
			return false;
		}
		finally {
			if (fileChannel != null) {
				try {
					fileChannel.close();
				}
				catch (IOException ioe) {
				}
			}
		}
	}

	public boolean isSameContent(File file, String s) {
		ByteBuffer byteBuffer = CharsetEncoderUtil.encode(StringPool.UTF8, s);

		return isSameContent(file, byteBuffer.array(), byteBuffer.limit());
	}
}
