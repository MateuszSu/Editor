package editor.filesystem;

import java.util.*;
import editor.*;

public class FolderImpl implements FolderView, Folder {

	private Collection<File> files;
	private Collection<Folder> folders;
	private String path;
	private String name;

	/**
	 * 
	 * @param path
	 */
	public FolderImpl(String path) {
		// TODO - implement FolderImpl.FolderImpl
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param filename
	 */
	public Result createFile(String filename) {
		// TODO - implement FolderImpl.createFile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param file if there exists filename in the current folder tree, then remove it
	 */
	public Result removeFile(File file) {
		// TODO - implement FolderImpl.removeFile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public Result createFolder(String name) {
		// TODO - implement FolderImpl.createFolder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param folder
	 */
	public Result removeFolder(Folder folder) {
		// TODO - implement FolderImpl.removeFolder
		throw new UnsupportedOperationException();
	}

	public Folder getFiles() {
		// TODO - implement FolderImpl.getFiles
		throw new UnsupportedOperationException();
	}

	public Folder getFolders() {
		return this.folders;
	}

}