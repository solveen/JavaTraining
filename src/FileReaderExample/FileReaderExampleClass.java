package FileReaderExample;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleClass {
    public void fileReader() {

        try {
            FileReader fileReader = new FileReader("C:\\Users\\Solveen\\IdeaProjects\\newjava\\src\\FileReaderExample\\Java Reader and Writer File");
            int character;

            while ((character = fileReader.read()) != -1) {
                System.out.println((char) character);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }


    }
}
