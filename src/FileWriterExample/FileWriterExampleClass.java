package FileWriterExample;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExampleClass {
    public void fileWriter() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Solveen\\IdeaProjects\\newjava\\src\\FileReaderExample\\Java Reader and Writer File");
            //File ma user input lina lai
            System.out.println("Entry your thoughts");
            Scanner scanner = new Scanner(System.in);
            fileWriter.write(scanner.nextLine());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
