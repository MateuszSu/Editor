package editor.workspace;

import editor.filesystem.*;
import java.util.*;
import editor.parser.*;
import editor.*;

public class Workspace {

	private ActiveTab activeTab;
	private Folder root;
	private Collection<Tab> tabs;

	/**
	 * 
	 * @param root
	 * @param syntaxChecker
	 */
	public Workspace(FolderImpl root, SyntaxChecker syntaxChecker) {
		// TODO - implement Workspace.Workspace
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param file
	 */
	public Result openFile(File file) {
		// TODO - implement Workspace.openFile
		throw new UnsupportedOperationException();
	}

	public void saveAll() {
		// TODO - implement Workspace.saveAll
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tab
	 */
	void setActive(Tab tab) {
		// TODO - implement Workspace.setActive
		throw new UnsupportedOperationException();
	}

	public Tab[] getTabs() {
		// TODO - implement Workspace.getTabs
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tab
	 */
	public void closeTab(Tab tab) {
		// TODO - implement Workspace.closeTab
		throw new UnsupportedOperationException();
	}

	public void closeAll() {
		// TODO - implement Workspace.closeAll
		throw new UnsupportedOperationException();
	}

	public Result saveActive() {
		// TODO - implement Workspace.saveActive
		throw new UnsupportedOperationException();
	}

	public void closeActive() {
		// TODO - implement Workspace.closeActive
		throw new UnsupportedOperationException();
	}

	public Editable getActive() {
		// TODO - implement Workspace.getActive
		throw new UnsupportedOperationException();
	}

	public Folder getRoot() {
		return this.root;
	}

}