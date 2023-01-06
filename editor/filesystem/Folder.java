package editor.filesystem;

import editor.*;

public interface Folder {

	/**
	 * 
	 * @param filename
	 */
	Result createFile(String filename);

	/**
	 * 
	 * @param file if there exists filename in the current folder tree, then remove it
	 */
	Result removeFile(File file);

	/**
	 * 
	 * @param name
	 */
	Result createFolder(String name);

	/**
	 * 
	 * @param folder
	 */
	Result removeFolder(Folder folder);

	Folder[] getFiles();

	Folder[] getFolders();

}