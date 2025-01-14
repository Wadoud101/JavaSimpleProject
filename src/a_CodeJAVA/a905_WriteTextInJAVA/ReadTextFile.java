package a_CodeJAVA.a905_WriteTextInJAVA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {

        String textPath = "C:\\Users\\Wadoud\\IdeaProjects\\javaProjects\\src\\text.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(textPath))) {

            String message;

            while ((message = reader.readLine()) !=null){
                System.out.println(message);
            }
            System.out.println("*********");
            System.out.println(message);
            System.out.println("*********");

        }catch (IOException e){
            System.out.println("Exception Message: " + e);
        }
    }
}
