package editor.workspace;

import editor.parser.*;

public class ActiveTab implements Editable {

	private SyntaxChecker syntaxChecker;
	private Tab file;

	/**
	 * 
	 * @param syntaxChecker
	 */
	public ActiveTab(SyntaxChecker syntaxChecker) {
		// TODO - implement ActiveTab.ActiveTab
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idx
	 */
	public void addLine(int idx) {
		// TODO - implement ActiveTab.addLine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idx
	 */
	public void removeLine(int idx) {
		// TODO - implement ActiveTab.removeLine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idx
	 * @param line
	 */
	public ProblemView[] modifyLine(int idx, String line) {
		// TODO - implement ActiveTab.modifyLine
		throw new UnsupportedOperationException();
	}

	public int getLinesCount() {
		// TODO - implement ActiveTab.getLinesCount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tab
	 */
	void set(Tab tab) {
		// TODO - implement ActiveTab.set
		throw new UnsupportedOperationException();
	}

	void unsetFile() {
		// TODO - implement ActiveTab.unsetFile
		throw new UnsupportedOperationException();
	}

}