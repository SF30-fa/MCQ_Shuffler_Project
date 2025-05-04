package MCQ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class MCQShuffler {

	public static void main(String[] args) {
	
	Scanner kb = new Scanner(System.in);
	
	try {
	System.out.print("Enter the number of shuffled versions you would like: ");
	int numVersions = kb.nextInt();
	
	System.out.print("Enter the path to the file containing your initial MCQ: ");
	String initialPath = kb.next();
	
	System.out.print("Enter the output directory path (for example: /Users/YourNAME/Documents/MCQversions) : ");
	String outputDirectory = kb.next();
	
	//Parsing questions from the initial file given from the user
	List<MCQuestion> initialQuestions = FileParser.parseQuestionsFromFile(initialPath); 
	System.out.print("\nFile was successfully parsed, " + initialQuestions.size() + " questions were processed.");
	
	//Generating the amount of versions that the user wanted
	List<List<MCQuestion>> generateVersions = QuestionShuffler.generateVersions(initialQuestions,numVersions);
	
	//Separating each version from the generated version list, and then printing each version into a new file
	for (int i =0; i<generateVersions.size(); i++) {
		String outputFilePath = outputDirectory + "/MCQ_Version_" + (i + 1) + ".txt";
		MCQFileWriter.writeQuestionToNewFile(generateVersions.get(i), outputFilePath);
		System.out.print("\nGenerated version " + (i + 1) + " has been successfully stored in " + outputFilePath);
		
	}
	
	System.out.print("\n\n\nAll versions were generated successfully, go check out your output directory for the different versions.\nHave a wonderful day and thank you for using your friendly neighborhood MCQ Shuffler!");
	
	
	}catch(IOException e) {
		System.out.print(e.getMessage());
	}finally {
		kb.close();
	}
	
	
	}
}
