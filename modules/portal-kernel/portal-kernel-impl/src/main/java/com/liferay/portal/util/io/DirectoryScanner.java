package com.liferay.portal.util.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DirectoryScanner {
	public static final String[] DEFAULTEXCLUDES = { "**/*~", "**/#*#", "**/.#*", "**/%*%", "**/._*", "**/CVS", "**/CVS/**", "**/.cvsignore", "**/.svn", "**/.svn/**", "**/.arch-ids",
			"**/.arch-ids/**", "**/.bzr", "**/.bzr/**", "**/.MySCMServerInfo", "**/.DS_Store", "**/.metadata", "**/.metadata/**", "**/.hg", "**/.hg/**", "**/.git", "**/.git/**", "**/BitKeeper",
			"**/BitKeeper/**", "**/ChangeSet", "**/ChangeSet/**", "**/_darcs", "**/_darcs/**", "**/.darcsrepo", "**/.darcsrepo/**", "**/-darcs-backup*", "**/.darcs-temp-mail" };

	private File basedir;

	private String[] includes;

	private String[] excludes;

	private MatchPatterns excludesPatterns;

	private MatchPatterns includesPatterns;

	private List<String> filesIncluded;

	private List<String> filesNotIncluded;

	private List<String> filesExcluded;

	private List<String> dirsIncluded;

	private List<String> dirsNotIncluded;

	private List<String> dirsExcluded;

	private boolean haveSlowResults = false;

	private boolean isCaseSensitive = true;

	private boolean followSymlinks = true;

	private ScanConductor scanConductor = null;

	private ScanConductor.ScanAction scanAction = null;

	public void setBasedir(String basedir) {
		setBasedir(new File(basedir.replace('/', File.separatorChar).replace('\\', File.separatorChar)));
	}

	public void setBasedir(@Nonnull File basedir) {
		this.basedir = basedir;
	}

	public File getBasedir() {
		return this.basedir;
	}

	public void setCaseSensitive(boolean isCaseSensitiveParameter) {
		this.isCaseSensitive = isCaseSensitiveParameter;
	}

	public void setFollowSymlinks(boolean followSymlinks) {
		this.followSymlinks = followSymlinks;
	}

	public void setIncludes(String... includes) {
		if (includes == null) {
			this.includes = null;
		} else {
			this.includes = new String[includes.length];
			for (int i = 0; i < includes.length; i++) {

				String pattern = includes[i].trim().replace('/', File.separatorChar).replace('\\', File.separatorChar);
				if (pattern.endsWith(File.separator)) {
					pattern = pattern + "**";
				}
				this.includes[i] = pattern;
			}
		}
	}

	public void setExcludes(String... excludes) {
		if (excludes == null) {
			this.excludes = null;
		} else {
			this.excludes = new String[excludes.length];
			for (int i = 0; i < excludes.length; i++) {

				String pattern = excludes[i].trim().replace('/', File.separatorChar).replace('\\', File.separatorChar);
				if (pattern.endsWith(File.separator)) {
					pattern = pattern + "**";
				}
				this.excludes[i] = pattern;
			}
		}
	}

	public void setScanConductor(ScanConductor scanConductor) {
		this.scanConductor = scanConductor;
	}

	public void scan() throws IllegalStateException {
		if (this.basedir == null) {
			throw new IllegalStateException("No basedir set");
		}
		if (!this.basedir.exists()) {
			throw new IllegalStateException("basedir " + this.basedir + " does not exist");
		}
		if (!this.basedir.isDirectory()) {
			throw new IllegalStateException("basedir " + this.basedir + " is not a directory");
		}

		setupDefaultFilters();
		setupMatchPatterns();

		this.filesIncluded = new ArrayList();
		this.filesNotIncluded = new ArrayList();
		this.filesExcluded = new ArrayList();
		this.dirsIncluded = new ArrayList();
		this.dirsNotIncluded = new ArrayList();
		this.dirsExcluded = new ArrayList();
		this.scanAction = ScanConductor.ScanAction.CONTINUE;

		if (isIncluded("")) {
			if (!isExcluded("")) {
				if (this.scanConductor != null) {
					this.scanAction = this.scanConductor.visitDirectory("", this.basedir);

					if ((ScanConductor.ScanAction.ABORT.equals(this.scanAction)) || (ScanConductor.ScanAction.ABORT_DIRECTORY.equals(this.scanAction))
							|| (ScanConductor.ScanAction.NO_RECURSE.equals(this.scanAction))) {

						return;
					}
				}

				this.dirsIncluded.add("");
			} else {
				this.dirsExcluded.add("");
			}

		} else {
			this.dirsNotIncluded.add("");
		}
		scandir(this.basedir, "", true);
	}

	public DirectoryScanResult diffIncludedFiles(String... oldFiles) {
		if (this.filesIncluded == null) {

			scan();
		}

		return diffFiles(oldFiles, (String[]) this.filesIncluded.toArray(new String[this.filesIncluded.size()]));
	}

	public static DirectoryScanResult diffFiles(@Nullable String[] oldFiles, @Nullable String[] newFiles) {
		Set<String> oldFileSet = arrayAsHashSet(oldFiles);
		Set<String> newFileSet = arrayAsHashSet(newFiles);

		List<String> added = new ArrayList();
		List<String> removed = new ArrayList();

		for (String oldFile : oldFileSet) {
			if (!newFileSet.contains(oldFile)) {
				removed.add(oldFile);
			}
		}

		for (String newFile : newFileSet) {
			if (!oldFileSet.contains(newFile)) {
				added.add(newFile);
			}
		}

		String[] filesAdded = (String[]) added.toArray(new String[added.size()]);
		String[] filesRemoved = (String[]) removed.toArray(new String[removed.size()]);

		return new DirectoryScanResult(filesAdded, filesRemoved);
	}

	private static <T> Set<T> arrayAsHashSet(@Nullable T[] array) {
		if ((array == null) || (array.length == 0)) {
			return Collections.emptySet();
		}

		Set<T> set = new HashSet(array.length);
		Collections.addAll(set, array);

		return set;
	}

	void slowScan() {
		if (this.haveSlowResults) {
			return;
		}

		String[] excl = (String[]) this.dirsExcluded.toArray(new String[this.dirsExcluded.size()]);

		String[] notIncl = (String[]) this.dirsNotIncluded.toArray(new String[this.dirsNotIncluded.size()]);

		for (String anExcl : excl) {
			if (!couldHoldIncluded(anExcl)) {
				scandir(new File(this.basedir, anExcl), anExcl + File.separator, false);
			}
		}

		for (String aNotIncl : notIncl) {
			if (!couldHoldIncluded(aNotIncl)) {
				scandir(new File(this.basedir, aNotIncl), aNotIncl + File.separator, false);
			}
		}

		this.haveSlowResults = true;
	}

	void scandir(@Nonnull File dir, @Nonnull String vpath, boolean fast) {
		String[] newfiles = dir.list();

		if (newfiles == null) {

			newfiles = new String[0];
		}

		if (!this.followSymlinks) {
			newfiles = doNotFollowSymbolicLinks(dir, vpath, newfiles);
		}

		for (String newfile : newfiles) {
			String name = vpath + newfile;
			File file = new File(dir, newfile);
			if (file.isDirectory()) {
				if (isIncluded(name)) {
					if (!isExcluded(name)) {
						if (this.scanConductor != null) {
							this.scanAction = this.scanConductor.visitDirectory(name, file);

							if ((ScanConductor.ScanAction.ABORT.equals(this.scanAction)) || (ScanConductor.ScanAction.ABORT_DIRECTORY.equals(this.scanAction))) {

								return;
							}
						}

						if (!ScanConductor.ScanAction.NO_RECURSE.equals(this.scanAction)) {
							this.dirsIncluded.add(name);
							if (fast) {
								scandir(file, name + File.separator, fast);

								if (ScanConductor.ScanAction.ABORT.equals(this.scanAction)) {
									return;
								}
							}
						}
						this.scanAction = null;

					} else {
						this.dirsExcluded.add(name);
						if ((fast) && (couldHoldIncluded(name))) {
							scandir(file, name + File.separator, fast);
							if (ScanConductor.ScanAction.ABORT.equals(this.scanAction)) {
								return;
							}
							this.scanAction = null;
						}

					}

				} else if ((fast) && (couldHoldIncluded(name))) {
					if (this.scanConductor != null) {
						this.scanAction = this.scanConductor.visitDirectory(name, file);

						if ((ScanConductor.ScanAction.ABORT.equals(this.scanAction)) || (ScanConductor.ScanAction.ABORT_DIRECTORY.equals(this.scanAction))) {

							return;
						}
					}
					if (!ScanConductor.ScanAction.NO_RECURSE.equals(this.scanAction)) {
						this.dirsNotIncluded.add(name);

						scandir(file, name + File.separator, fast);
						if (ScanConductor.ScanAction.ABORT.equals(this.scanAction)) {
							return;
						}
					}
					this.scanAction = null;
				}

				if (!fast) {
					scandir(file, name + File.separator, fast);
					if (ScanConductor.ScanAction.ABORT.equals(this.scanAction)) {
						return;
					}
					this.scanAction = null;
				}
			} else if (file.isFile()) {
				if (isIncluded(name)) {
					if (!isExcluded(name)) {
						if (this.scanConductor != null) {
							this.scanAction = this.scanConductor.visitFile(name, file);
						}

						if ((ScanConductor.ScanAction.ABORT.equals(this.scanAction)) || (ScanConductor.ScanAction.ABORT_DIRECTORY.equals(this.scanAction))) {

							return;
						}

						this.filesIncluded.add(name);
					} else {
						this.filesExcluded.add(name);
					}

				} else {
					this.filesNotIncluded.add(name);
				}
			}
		}
	}

	private String[] doNotFollowSymbolicLinks(File dir, String vpath, String[] newfiles) {
		List<String> noLinks = new ArrayList();
		for (String newfile : newfiles) {
			try {
				if (isSymbolicLink(dir, newfile)) {
					String name = vpath + newfile;
					File file = new File(dir, newfile);
					if (file.isDirectory()) {
						this.dirsExcluded.add(name);
					} else {
						this.filesExcluded.add(name);
					}
				} else {
					noLinks.add(newfile);
				}
			} catch (IOException ioe) {
				String msg = "IOException caught while checking for links, couldn't get cannonical path!";

				System.err.println("IOException caught while checking for links, couldn't get cannonical path!");
				noLinks.add(newfile);
			}
		}
		newfiles = (String[]) noLinks.toArray(new String[noLinks.size()]);
		return newfiles;
	}

	boolean isIncluded(String name) {
		return this.includesPatterns.matches(name, this.isCaseSensitive);
	}

	boolean couldHoldIncluded(@Nonnull String name) {
		return this.includesPatterns.matchesPatternStart(name, this.isCaseSensitive);
	}

	boolean isExcluded(@Nonnull String name) {
		return this.excludesPatterns.matches(name, this.isCaseSensitive);
	}

	public String[] getIncludedFiles() {
		if (this.filesIncluded == null) {
			return new String[0];
		}
		return (String[]) this.filesIncluded.toArray(new String[this.filesIncluded.size()]);
	}

	public String[] getNotIncludedFiles() {
		slowScan();
		return (String[]) this.filesNotIncluded.toArray(new String[this.filesNotIncluded.size()]);
	}

	public String[] getExcludedFiles() {
		slowScan();
		return (String[]) this.filesExcluded.toArray(new String[this.filesExcluded.size()]);
	}

	public String[] getIncludedDirectories() {
		return (String[]) this.dirsIncluded.toArray(new String[this.dirsIncluded.size()]);
	}

	public String[] getNotIncludedDirectories() {
		slowScan();
		return (String[]) this.dirsNotIncluded.toArray(new String[this.dirsNotIncluded.size()]);
	}

	public String[] getExcludedDirectories() {
		slowScan();
		return (String[]) this.dirsExcluded.toArray(new String[this.dirsExcluded.size()]);
	}

	public void addDefaultExcludes() {
		int excludesLength = this.excludes == null ? 0 : this.excludes.length;

		String[] newExcludes = new String[excludesLength + DEFAULTEXCLUDES.length];
		if (excludesLength > 0) {
			System.arraycopy(this.excludes, 0, newExcludes, 0, excludesLength);
		}
		for (int i = 0; i < DEFAULTEXCLUDES.length; i++) {
			newExcludes[(i + excludesLength)] = DEFAULTEXCLUDES[i].replace('/', File.separatorChar).replace('\\', File.separatorChar);
		}

		this.excludes = newExcludes;
	}

	boolean isSymbolicLink(File parent, String name) throws IOException {
		if (Java7Support.isAtLeastJava7()) {
			return Java7Support.isSymLink(parent);
		}
		File resolvedParent = new File(parent.getCanonicalPath());
		File toTest = new File(resolvedParent, name);
		return !toTest.getAbsolutePath().equals(toTest.getCanonicalPath());
	}

	private void setupDefaultFilters() {
		if (this.includes == null) {

			this.includes = new String[1];
			this.includes[0] = "**";
		}
		if (this.excludes == null) {
			this.excludes = new String[0];
		}
	}

	private void setupMatchPatterns() {
		this.includesPatterns = MatchPatterns.from(this.includes);
		this.excludesPatterns = MatchPatterns.from(this.excludes);
	}
}
