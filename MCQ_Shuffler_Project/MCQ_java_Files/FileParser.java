package MCQ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

//This Class is named "FileParser", and it is called, it will "analyze" the text file entered by the user-
//-To turn the whole chunks into individual sets of Multiple choice questions in our desired format;
//Our "Constructor Class" is key to this FileParser Class
public class FileParser {

	public static List<MCQuestion> parseQuestionsFromFile(String filePath) throws IOException{
		
		List<MCQuestion> questions = new ArrayList<MCQuestion>();
		List<String> eachLine = Files.readAllLines(Paths.get(filePath))	;	
		
		StringBuilder currentQuestionText = new StringBuilder();
		String optionA = null;
		String optionB = null;
		String optionC = null;
		String optionD = null;
		boolean readingQuestion = false;
		
		for (int i = 0; i< eachLine.size(); i++) {
			
			String currentLine = eachLine.get(i).trim();
			
			
			
			if (currentLine.length() == 0) {
				continue;
			}
			
			
			
			if (currentLine.matches("\\d+\\..*") || currentLine.matches("\\d+\\-.*")) {
				
				if (readingQuestion && optionD != null) {
					questions.add( new MCQuestion(currentQuestionText.toString().trim(), optionA.trim(), optionB.trim(), optionC.trim(), optionD.trim()));
				}
			
				currentQuestionText = new StringBuilder(currentLine.replaceFirst("\\d+\\.", ""));
				optionA = optionB = optionC = optionD = null; 
				readingQuestion = true;
				
			} else if(readingQuestion) {
				
				if (currentLine.startsWith("A.")) {
					optionA = currentLine.substring(2);
				} else if (currentLine.startsWith("B.")) {
					optionB = currentLine.substring(2);
				} else if (currentLine.startsWith("C.")) {
					optionC = currentLine.substring(2);
				} else if (currentLine.startsWith("D.")) {
					optionD = currentLine.substring(2);
				} else if (currentQuestionText.length() > 0) {
					currentQuestionText.append("\n").append(currentLine);
				}
							
			}
			
		}
		
		if (readingQuestion && optionD != null) {
			questions.add( new MCQuestion(currentQuestionText.toString().trim(), optionA.trim(), optionB.trim(), optionC.trim(), optionD.trim()));
		}
		
		return questions;
		
		}
	}
