package editor.parser;

public interface ProblemView {

	String getCorrection();

	String getDescription();

	int getIndexBegin();

	int getIndexEnd();

}