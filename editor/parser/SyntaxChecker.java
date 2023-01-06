package editor.parser;

public interface SyntaxChecker {

	/**
	 * 
	 * @param line
	 */
	ProblemView[] check(String line);

}