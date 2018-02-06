package com.liferay.portal.util.io;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nonnull;

public class Java7Support {
	private static final boolean IS_JAVA7;
	private static Method isSymbolicLink;
	private static Method delete;
	private static Method toPath;
	private static Method exists;
	private static Method toFile;
	private static Method readSymlink;
	private static Method createSymlink;
	private static Object emptyLinkOpts;
	private static Object emptyFileAttributes;

	static {
		boolean isJava7x = true;
		try {
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
			Class<?> files = cl.loadClass("java.nio.file.Files");
			Class<?> path = cl.loadClass("java.nio.file.Path");
			Class<?> fa = cl.loadClass("java.nio.file.attribute.FileAttribute");
			Class<?> linkOption = cl.loadClass("java.nio.file.LinkOption");
			isSymbolicLink = files.getMethod("isSymbolicLink", new Class[] { path });
			delete = files.getMethod("delete", new Class[] { path });
			readSymlink = files.getMethod("readSymbolicLink", new Class[] { path });

			emptyFileAttributes = Array.newInstance(fa, 0);
			Object o = emptyFileAttributes;
			createSymlink = files.getMethod("createSymbolicLink", new Class[] { path, path, o.getClass() });
			emptyLinkOpts = Array.newInstance(linkOption, 0);
			exists = files.getMethod("exists", new Class[] { path, emptyLinkOpts.getClass() });
			toPath = File.class.getMethod("toPath", new Class[0]);
			toFile = path.getMethod("toFile", new Class[0]);
		} catch (ClassNotFoundException e) {
			isJava7x = false;
		} catch (NoSuchMethodException e) {
			isJava7x = false;
		}
		IS_JAVA7 = isJava7x;
	}

	public static boolean isSymLink(@Nonnull File file) {
		try {
			Object path = toPath.invoke(file, new Object[0]);
			return ((Boolean) isSymbolicLink.invoke(null, new Object[] { path })).booleanValue();
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	@Nonnull
	public static File readSymbolicLink(@Nonnull File symlink) throws IOException {
		try {
			Object path = toPath.invoke(symlink, new Object[0]);
			Object resultPath = readSymlink.invoke(null, new Object[] { path });
			return (File) toFile.invoke(resultPath, new Object[0]);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	public static boolean exists(@Nonnull File file) throws IOException {
		try {
			Object path = toPath.invoke(file, new Object[0]);
			Object invoke = exists.invoke(null, new Object[] { path, emptyLinkOpts });
			return ((Boolean) invoke).booleanValue();
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw ((RuntimeException) e.getTargetException());
		}
	}

	@Nonnull
	public static File createSymbolicLink(@Nonnull File symlink, @Nonnull File target) throws IOException {
		try {
			if (!exists(symlink)) {
				Object link = toPath.invoke(symlink, new Object[0]);
				Object path = createSymlink.invoke(null, new Object[] { link, toPath.invoke(target, new Object[0]), emptyFileAttributes });
				return (File) toFile.invoke(path, new Object[0]);
			}
			return symlink;
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			Throwable targetException = e.getTargetException();
			if ((targetException instanceof IOException)) {
				throw ((IOException) targetException);
			}
			if ((targetException instanceof RuntimeException)) {

				throw ((RuntimeException) targetException);
			}

			throw new IOException(targetException.getClass() + ": " + targetException.getLocalizedMessage());
		}
	}

	public static void delete(@Nonnull File file) throws IOException {
		try {
			Object path = toPath.invoke(file, new Object[0]);
			delete.invoke(null, new Object[] { path });
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw ((IOException) e.getTargetException());
		}
	}

	public static boolean isJava7() {
		return IS_JAVA7;
	}

	public static boolean isAtLeastJava7() {
		return IS_JAVA7;
	}
}
