package editor;

import editor.parser.*;
import editor.workspace.*;

public class Editor {

	private SyntaxCheckerWrapper syntaxCheckerWrapper;
	private Config config;
	private Workspace workspace;

	Editor() {
		// TODO - implement Editor.Editor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result open(String path) {
		// TODO - implement Editor.open
		throw new UnsupportedOperationException();
	}

	public Result close() {
		// TODO - implement Editor.close
		throw new UnsupportedOperationException();
	}

	public Config getConfig() {
		return this.config;
	}

	public Editable edit() {
		// TODO - implement Editor.edit
		throw new UnsupportedOperationException();
	}

	public String[] getFiles() {
		// TODO - implement Editor.getFiles
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result createFile(String path) {
		// TODO - implement Editor.createFile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result deleteFile(String path) {
		// TODO - implement Editor.deleteFile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result createFolder(String path) {
		// TODO - implement Editor.createFolder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result deleteFolder(String path) {
		// TODO - implement Editor.deleteFolder
		throw new UnsupportedOperationException();
	}

	public String[] getOpenedFiles() {
		// TODO - implement Editor.getOpenedFiles
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result openFile(String path) {
		// TODO - implement Editor.openFile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param path
	 */
	public Result closeFile(String path) {
		// TODO - implement Editor.closeFile
		throw new UnsupportedOperationException();
	}

	public void save() {
		// TODO - implement Editor.save
		throw new UnsupportedOperationException();
	}

}