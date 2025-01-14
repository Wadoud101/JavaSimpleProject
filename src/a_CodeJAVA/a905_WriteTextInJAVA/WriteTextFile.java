package a_CodeJAVA.a905_WriteTextInJAVA;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {

        String address = "C:\\Users\\Wadoud\\IdeaProjects\\javaProjects\\src\\text.txt";
        String message = """
                Hey babe you 
                are doig good 
                and its well done 
                come on and write
                """;
        try (FileWriter write = new FileWriter(address)){

            write.write(message);
            System.out.println("I write it! ");

        }catch (IOException e){

            System.out.println("Exception Message: " + e);

        }
    }
}
