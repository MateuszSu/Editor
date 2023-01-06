package editor.parser;

abstract interface Checker {

	/**
	 * 
	 * @param line
	 */
	abstract ProblemView[] check(String line);

}