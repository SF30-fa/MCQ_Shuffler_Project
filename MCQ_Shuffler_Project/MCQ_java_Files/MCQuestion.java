package MCQ;

//This class is the "Constructor Class", which represents a single Multiple Choice Question, out of the whole-
//-Set of questions the user will enter
public class MCQuestion {

	private String questionText;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	
	
	
	public MCQuestion(String questionText, String optionA, String optionB, String optionC, String optionD) {
		this.questionText = questionText;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
	}
	
	public String getQuestionText() {
		return this.questionText;
	}
	
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	public String getOptionA() {
		return this.optionA;
	}
	
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	
	public String getOptionB() {
		return this.optionB;
	}
	
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	
	public String getOptionC() {
		return this.optionC;
	}
	
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	
	public String getOptionD() {
		return this.optionD;
	}
	
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	//This method will display the questions in our desired format
	@Override
	public String toString() {
		
		StringBuilder fq = new StringBuilder();
		
		fq.append(this.getQuestionText()).append("\n");
		fq.append(" A. ").append(this.getOptionA()).append("\n");
		fq.append(" B. ").append(this.getOptionB()).append("\n");
		fq.append(" C. ").append(this.getOptionC()).append("\n");
		fq.append(" D. ").append(this.getOptionD()).append("\n");
		
		return fq.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
