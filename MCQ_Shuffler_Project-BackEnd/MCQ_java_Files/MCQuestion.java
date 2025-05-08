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
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    //This method will display the questions in our desired format
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(questionText).append("\n");
        sb.append("A.").append(this.getOptionA()).append("\n");
        sb.append("B.").append(this.getOptionB()).append("\n");
        sb.append("C.").append(this.getOptionC()).append("\n");
        sb.append("D.").append(this.getOptionD()).append("\n");

        return sb.toString();
    }
}
