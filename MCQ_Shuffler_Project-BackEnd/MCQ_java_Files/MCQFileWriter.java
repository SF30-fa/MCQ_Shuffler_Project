import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

//This FileWriter method will make different output files, which will consist of the different versions-
//-Of the initial Multiple Choice Question sheet that the user pushed forward to the program
public class MCQFileWriter {

    public static void writeQuestionToNewFile(List<MCQuestion> questions, String outputFilePath) throws IOException{

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
//For loop that inserts a spaces between every question, but firstly writes each into a new output file
            for (int i = 0; i< questions.size(); i++) {
                bw.write((i + 1) + "." + questions.get(i).toString());
                bw.write("\n\n");
            }

        }
    }

}
