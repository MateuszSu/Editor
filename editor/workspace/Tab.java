package editor.workspace;

import java.util.*;
import editor.filesystem.*;
import editor.*;

class Tab {

	private Collection<String> lines;
	private File file;
	private int firstLineTouched = -1;

	/**
	 * 
	 * @param file
	 */
	public Tab(FileImpl file) {
		// TODO - implement Tab.Tab
		throw new UnsupportedOperationException();
	}

	boolean load() {
		// TODO - implement Tab.load
		throw new UnsupportedOperationException();
	}

	boolean dump() {
		// TODO - implement Tab.dump
		throw new UnsupportedOperationException();
	}

	boolean isUnsaved() {
		// TODO - implement Tab.isUnsaved
		throw new UnsupportedOperationException();
	}

	Result save() {
		// TODO - implement Tab.save
		throw new UnsupportedOperationException();
	}

}