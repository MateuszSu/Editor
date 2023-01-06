package editor.parser;

public class Problem implements ProblemView {

	private String correction;
	private String description;
	private int idxBegin;
	private int idxEnd;

	public int getIdxBegin() {
		return this.idxBegin;
	}

	public int getIdxEnd() {
		return this.idxEnd;
	}

	/**
	 * 
	 * @param idxBegin
	 * @param idxEnd
	 */
	Problem(int idxBegin, int idxEnd) {
		// TODO - implement Problem.Problem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param correction
	 */
	void setCorrection(String correction) {
		this.correction = correction;
	}

	/**
	 * 
	 * @param description
	 */
	void setDescription(String description) {
		this.description = description;
	}

	String getCorrection() {
		return this.correction;
	}

	String getDescription() {
		return this.description;
	}

	int getIndexBegin() {
		// TODO - implement Problem.getIndexBegin
		throw new UnsupportedOperationException();
	}

	int getIndexEnd() {
		// TODO - implement Problem.getIndexEnd
		throw new UnsupportedOperationException();
	}

}