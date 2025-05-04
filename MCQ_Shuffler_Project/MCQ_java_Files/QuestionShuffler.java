package MCQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

//This class will handle shuffling the initial questions entered by the User, with the help of two static methods;
//The first one shuffles questions, and the second one will use the first method to return the different versions of the initial set of questions
public class QuestionShuffler {

	public static List<MCQuestion> shuffleQuestions(List<MCQuestion> unshuffledQuestions){
		
		List<MCQuestion> shuffledQuestions = new ArrayList<MCQuestion>(unshuffledQuestions);
		Collections.shuffle(shuffledQuestions);
		return shuffledQuestions;
		
	}
	
	public static List<List<MCQuestion>> generateVersions(List<MCQuestion> unshuffledQuestions, int numVersions){
		List<List<MCQuestion>> differentVersions = new ArrayList<>();
		
		for (int i = 0; i<numVersions; i++) {
			differentVersions.add(shuffleQuestions(unshuffledQuestions));
		}
		
		return differentVersions;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
