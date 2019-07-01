package Exam;

public class Item {
	private String question;
	private String rightAnswer;
	private String select="空";
//	private String select;
	private int score;
	
	public Item(String question, String rightAnswer) {
		super();
		this.question = question;
		this.rightAnswer = rightAnswer;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	@Override
	public String toString() {
		//return question + "\n"+"rightAnswer=" + rightAnswer + "\n"+"select=" + select +"\n"+ "score=" + score;
		return question;
	}
	
	
}
