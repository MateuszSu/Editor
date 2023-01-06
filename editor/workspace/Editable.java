package editor.workspace;

import editor.parser.*;

public interface Editable {

	/**
	 * 
	 * @param idx
	 */
	void addLine(int idx);

	/**
	 * 
	 * @param idx
	 */
	void removeLine(int idx);

	/**
	 * 
	 * @param idx
	 * @param line
	 */
	ProblemView[] modifyLine(int idx, String line);

	int getLinesCount();

}