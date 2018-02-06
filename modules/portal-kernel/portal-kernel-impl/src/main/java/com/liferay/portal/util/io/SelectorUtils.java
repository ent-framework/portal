package com.liferay.portal.util.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.annotation.Nonnull;

public final class SelectorUtils {
	private static final String PATTERN_HANDLER_PREFIX = "[";
	public static final String PATTERN_HANDLER_SUFFIX = "]";
	public static final String REGEX_HANDLER_PREFIX = "%regex[";
	public static final String ANT_HANDLER_PREFIX = "%ant[";

	public static boolean matchPatternStart(String pattern, String str) {
		return matchPatternStart(pattern, str, true);
	}

	public static boolean matchPatternStart(String pattern, String str, boolean isCaseSensitive) {
		if (isRegexPrefixedPattern(pattern)) {

			return true;
		}

		if (isAntPrefixedPattern(pattern)) {
			pattern = pattern.substring("%ant[".length(), pattern.length() - "]".length());
		}

		String altPattern = pattern.replace('\\', '/');
		String altStr = str.replace('\\', '/');

		return matchAntPathPatternStart(altPattern, altStr, "/", isCaseSensitive);
	}

	private static boolean matchAntPathPatternStart(String pattern, String str, String separator, boolean isCaseSensitive) {
		if (separatorPatternStartSlashMismatch(pattern, str, separator)) {
			return false;
		}

		List<String> patDirs = tokenizePath(pattern, separator);
		List<String> strDirs = tokenizePath(str, separator);

		int patIdxStart = 0;
		int patIdxEnd = patDirs.size() - 1;
		int strIdxStart = 0;
		int strIdxEnd = strDirs.size() - 1;

		while ((patIdxStart <= patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			String patDir = (String) patDirs.get(patIdxStart);
			if ("**".equals(patDir)) {
				break;
			}

			if (!match(patDir, (String) strDirs.get(strIdxStart), isCaseSensitive)) {
				return false;
			}
			patIdxStart++;
			strIdxStart++;
		}

		return (strIdxStart > strIdxEnd) || (patIdxStart <= patIdxEnd);
	}

	public static boolean matchPath(String pattern, String str) {
		return matchPath(pattern, str, true);
	}

	public static boolean matchPath(String pattern, String str, boolean isCaseSensitive) {
		if ((pattern.length() > "%regex[".length() + "]".length() + 1) && (pattern.startsWith("%regex[")) && (pattern.endsWith("]"))) {

			pattern = pattern.substring("%regex[".length(), pattern.length() - "]".length());

			return str.matches(pattern);
		}

		if ((pattern.length() > "%ant[".length() + "]".length() + 1) && (pattern.startsWith("%ant[")) && (pattern.endsWith("]"))) {

			pattern = pattern.substring("%ant[".length(), pattern.length() - "]".length());
		}

		return matchAntPathPattern(pattern, str, isCaseSensitive);
	}

	private static boolean matchAntPathPattern(String pattern, String str, boolean isCaseSensitive) {
		if (str.startsWith(File.separator) != pattern.startsWith(File.separator)) {
			return false;
		}

		List<String> patDirs = tokenizePath(pattern, File.separator);
		List<String> strDirs = tokenizePath(str, File.separator);

		int patIdxStart = 0;
		int patIdxEnd = patDirs.size() - 1;
		int strIdxStart = 0;
		int strIdxEnd = strDirs.size() - 1;

		while ((patIdxStart <= patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			String patDir = (String) patDirs.get(patIdxStart);
			if ("**".equals(patDir)) {
				break;
			}

			if (!match(patDir, (String) strDirs.get(strIdxStart), isCaseSensitive)) {
				return false;
			}
			patIdxStart++;
			strIdxStart++;
		}
		if (strIdxStart > strIdxEnd) {

			for (int i = patIdxStart; i <= patIdxEnd; i++) {
				if (!"**".equals(patDirs.get(i))) {
					return false;
				}
			}
			return true;
		}

		if (patIdxStart > patIdxEnd) {

			return false;
		}

		while ((patIdxStart <= patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			String patDir = (String) patDirs.get(patIdxEnd);
			if ("**".equals(patDir)) {
				break;
			}

			if (!match(patDir, (String) strDirs.get(strIdxEnd), isCaseSensitive)) {
				return false;
			}
			patIdxEnd--;
			strIdxEnd--;
		}
		if (strIdxStart > strIdxEnd) {

			for (int i = patIdxStart; i <= patIdxEnd; i++) {
				if (!"**".equals(patDirs.get(i))) {
					return false;
				}
			}
			return true;
		}

		while ((patIdxStart != patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			int patIdxTmp = -1;
			for (int i = patIdxStart + 1; i <= patIdxEnd; i++) {
				if ("**".equals(patDirs.get(i))) {
					patIdxTmp = i;
					break;
				}
			}
			if (patIdxTmp == patIdxStart + 1) {

				patIdxStart++;

			} else {
				int patLength = patIdxTmp - patIdxStart - 1;
				int strLength = strIdxEnd - strIdxStart + 1;
				int foundIdx = -1;
				label490: for (int i = 0; i <= strLength - patLength; i++) {
					for (int j = 0; j < patLength; j++) {
						String subPat = (String) patDirs.get(patIdxStart + j + 1);
						String subStr = (String) strDirs.get(strIdxStart + i + j);
						if (!match(subPat, subStr, isCaseSensitive)) {
							break label490;
						}
					}

					foundIdx = strIdxStart + i;
					break;
				}

				if (foundIdx == -1) {
					return false;
				}

				patIdxStart = patIdxTmp;
				strIdxStart = foundIdx + patLength;
			}
		}
		for (int i = patIdxStart; i <= patIdxEnd; i++) {
			if (!"**".equals(patDirs.get(i))) {
				return false;
			}
		}

		return true;
	}

	public static boolean match(String pattern, String str) {
		return match(pattern, str, true);
	}

	public static boolean match(String pattern, String str, boolean isCaseSensitive) {
		char[] patArr = pattern.toCharArray();
		char[] strArr = str.toCharArray();
		int patIdxStart = 0;
		int patIdxEnd = patArr.length - 1;
		int strIdxStart = 0;
		int strIdxEnd = strArr.length - 1;

		boolean containsStar = false;
		for (char aPatArr : patArr) {
			if (aPatArr == '*') {
				containsStar = true;
				break;
			}
		}

		if (!containsStar) {

			if (patIdxEnd != strIdxEnd) {
				return false;
			}
			for (int i = 0; i <= patIdxEnd; i++) {
				char ch = patArr[i];
				if ((ch != '?') && (!equals(ch, strArr[i], isCaseSensitive))) {
					return false;
				}
			}
			return true;
		}

		if (patIdxEnd == 0) {
			return true;
		}

		char ch;

		while (((ch = patArr[patIdxStart]) != '*') && (strIdxStart <= strIdxEnd)) {

			if ((ch != '?') && (!equals(ch, strArr[strIdxStart], isCaseSensitive))) {
				return false;
			}
			patIdxStart++;
			strIdxStart++;
		}
		if (strIdxStart > strIdxEnd) {

			for (int i = patIdxStart; i <= patIdxEnd; i++) {
				if (patArr[i] != '*') {
					return false;
				}
			}
			return true;
		}

		while (((ch = patArr[patIdxEnd]) != '*') && (strIdxStart <= strIdxEnd)) {

			if ((ch != '?') && (!equals(ch, strArr[strIdxEnd], isCaseSensitive))) {
				return false;
			}
			patIdxEnd--;
			strIdxEnd--;
		}
		if (strIdxStart > strIdxEnd) {

			for (int i = patIdxStart; i <= patIdxEnd; i++) {
				if (patArr[i] != '*') {
					return false;
				}
			}
			return true;
		}

		while ((patIdxStart != patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			int patIdxTmp = -1;
			for (int i = patIdxStart + 1; i <= patIdxEnd; i++) {
				if (patArr[i] == '*') {
					patIdxTmp = i;
					break;
				}
			}
			if (patIdxTmp == patIdxStart + 1) {

				patIdxStart++;

			} else {
				int patLength = patIdxTmp - patIdxStart - 1;
				int strLength = strIdxEnd - strIdxStart + 1;
				int foundIdx = -1;
				label489: for (int i = 0; i <= strLength - patLength; i++) {
					for (int j = 0; j < patLength; j++) {
						ch = patArr[(patIdxStart + j + 1)];
						if ((ch != '?') && (!equals(ch, strArr[(strIdxStart + i + j)], isCaseSensitive))) {
							break label489;
						}
					}

					foundIdx = strIdxStart + i;
					break;
				}

				if (foundIdx == -1) {
					return false;
				}

				patIdxStart = patIdxTmp;
				strIdxStart = foundIdx + patLength;
			}
		}

		for (int i = patIdxStart; i <= patIdxEnd; i++) {
			if (patArr[i] != '*') {
				return false;
			}
		}
		return true;
	}

	private static boolean equals(char c1, char c2, boolean isCaseSensitive) {
		if (c1 == c2) {
			return true;
		}
		if (!isCaseSensitive) {

			if ((Character.toUpperCase(c1) == Character.toUpperCase(c2)) || (Character.toLowerCase(c1) == Character.toLowerCase(c2))) {

				return true;
			}
		}
		return false;
	}

	private static List<String> tokenizePath(String path, String separator) {
		List<String> ret = new ArrayList();
		StringTokenizer st = new StringTokenizer(path, separator);
		while (st.hasMoreTokens()) {
			ret.add(st.nextToken());
		}
		return ret;
	}

	static boolean matchAntPathPatternStart(@Nonnull MatchPattern pattern, @Nonnull String str, @Nonnull String separator, boolean isCaseSensitive) {
		return (!separatorPatternStartSlashMismatch(pattern, str, separator)) && (matchAntPathPatternStart(pattern.getTokenizedPathString(), str, separator, isCaseSensitive));
	}

	private static String[] tokenizePathToString(@Nonnull String path, @Nonnull String separator) {
		List<String> ret = new ArrayList();
		StringTokenizer st = new StringTokenizer(path, separator);
		while (st.hasMoreTokens()) {
			ret.add(st.nextToken());
		}
		return (String[]) ret.toArray(new String[ret.size()]);
	}

	private static boolean matchAntPathPatternStart(@Nonnull String[] patDirs, @Nonnull String str, @Nonnull String separator, boolean isCaseSensitive) {
		String[] strDirs = tokenizePathToString(str, separator);
		return matchAntPathPatternStart(patDirs, strDirs, isCaseSensitive);
	}

	private static boolean matchAntPathPatternStart(@Nonnull String[] patDirs, @Nonnull String[] tokenizedFileName, boolean isCaseSensitive) {
		int patIdxStart = 0;
		int patIdxEnd = patDirs.length - 1;
		int strIdxStart = 0;
		int strIdxEnd = tokenizedFileName.length - 1;

		while ((patIdxStart <= patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			String patDir = patDirs[patIdxStart];
			if (patDir.equals("**")) {
				break;
			}

			if (!match(patDir, tokenizedFileName[strIdxStart], isCaseSensitive)) {
				return false;
			}
			patIdxStart++;
			strIdxStart++;
		}

		return (strIdxStart > strIdxEnd) || (patIdxStart <= patIdxEnd);
	}

	private static boolean separatorPatternStartSlashMismatch(@Nonnull MatchPattern matchPattern, @Nonnull String str, @Nonnull String separator) {
		return str.startsWith(separator) != matchPattern.startsWith(separator);
	}

	private static boolean separatorPatternStartSlashMismatch(String pattern, String str, String separator) {
		return str.startsWith(separator) != pattern.startsWith(separator);
	}

	static boolean matchAntPathPattern(String[] patDirs, String[] strDirs, boolean isCaseSensitive) {
		int patIdxStart = 0;
		int patIdxEnd = patDirs.length - 1;
		int strIdxStart = 0;
		int strIdxEnd = strDirs.length - 1;

		while ((patIdxStart <= patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			String patDir = patDirs[patIdxStart];
			if (patDir.equals("**")) {
				break;
			}

			if (!match(patDir, strDirs[strIdxStart], isCaseSensitive)) {
				return false;
			}
			patIdxStart++;
			strIdxStart++;
		}
		if (strIdxStart > strIdxEnd) {

			for (int i = patIdxStart; i <= patIdxEnd; i++) {
				if (!patDirs[i].equals("**")) {
					return false;
				}
			}
			return true;
		}

		if (patIdxStart > patIdxEnd) {

			return false;
		}

		while ((patIdxStart <= patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			String patDir = patDirs[patIdxEnd];
			if (patDir.equals("**")) {
				break;
			}

			if (!match(patDir, strDirs[strIdxEnd], isCaseSensitive)) {
				return false;
			}
			patIdxEnd--;
			strIdxEnd--;
		}
		if (strIdxStart > strIdxEnd) {

			for (int i = patIdxStart; i <= patIdxEnd; i++) {
				if (!patDirs[i].equals("**")) {
					return false;
				}
			}
			return true;
		}

		while ((patIdxStart != patIdxEnd) && (strIdxStart <= strIdxEnd)) {
			int patIdxTmp = -1;
			for (int i = patIdxStart + 1; i <= patIdxEnd; i++) {
				if (patDirs[i].equals("**")) {
					patIdxTmp = i;
					break;
				}
			}
			if (patIdxTmp == patIdxStart + 1) {

				patIdxStart++;

			} else {
				int patLength = patIdxTmp - patIdxStart - 1;
				int strLength = strIdxEnd - strIdxStart + 1;
				int foundIdx = -1;
				label376: for (int i = 0; i <= strLength - patLength; i++) {
					for (int j = 0; j < patLength; j++) {
						String subPat = patDirs[(patIdxStart + j + 1)];
						String subStr = strDirs[(strIdxStart + i + j)];
						if (!match(subPat, subStr, isCaseSensitive)) {
							break label376;
						}
					}

					foundIdx = strIdxStart + i;
					break;
				}

				if (foundIdx == -1) {
					return false;
				}

				patIdxStart = patIdxTmp;
				strIdxStart = foundIdx + patLength;
			}
		}
		for (int i = patIdxStart; i <= patIdxEnd; i++) {
			if (!patDirs[i].equals("**")) {
				return false;
			}
		}

		return true;
	}

	static boolean isRegexPrefixedPattern(String pattern) {
		return (pattern.length() > "%regex[".length() + "]".length() + 1) && (pattern.startsWith("%regex[")) && (pattern.endsWith("]"));
	}

	static boolean isAntPrefixedPattern(String pattern) {
		return (pattern.length() > "%ant[".length() + "]".length() + 1) && (pattern.startsWith("%ant[")) && (pattern.endsWith("]"));
	}

	static boolean matchAntPathPattern(@Nonnull MatchPattern matchPattern, @Nonnull String str, @Nonnull String separator, boolean isCaseSensitive) {
		if (separatorPatternStartSlashMismatch(matchPattern, str, separator)) {
			return false;
		}
		String[] patDirs = matchPattern.getTokenizedPathString();
		String[] strDirs = tokenizePathToString(str, separator);
		return matchAntPathPattern(patDirs, strDirs, isCaseSensitive);
	}
}
