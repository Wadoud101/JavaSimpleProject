package a_SimpleProjects.a14_HangManGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Wadoud\\IdeaProjects\\javaProjects\\src\\text.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) !=null){
                words.add(line.trim());
            }

        }catch (IOException e){
            System.out.println("Could not find the file");
        }

        Random random = new Random();
        String choice = words.get(random.nextInt(words.size()));

        Scanner in = new Scanner(System.in);
        ArrayList<Character> word = new ArrayList<>();
        int wrongGuess = 0;
        for (int i = 0; i < choice.length(); i++) {
            word.add('_');
        }
        System.out.println("***********************");
        System.out.println("Welcome To JAVA Hangman");
        System.out.println("***********************");

        while (wrongGuess < 6){

            System.out.println(getHangmanArt(wrongGuess));

            System.out.print("Word: ");
            for (char c : word){
                System.out.print(c+" ");
            }
            System.out.println();

            System.out.print("Guess a Letter: ");
            char guess = in.next().toLowerCase().charAt(0);

            if(choice.indexOf(guess)>=0){
                System.out.println("Correct Guess ");

                for (int i = 0; i < choice.length(); i++) {
                    if(choice.charAt(i) == guess){
                        word.set(i, guess);
                    }

                }
                if(!word.contains('_')){
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("Number of Wrong Guesses: " + wrongGuess);
                    System.out.println("You Win");
                    System.out.println("THe word was: " + choice);
                    break;
                }

            } else {
                wrongGuess++;
                System.out.println("Wrong Guess !!!! ");
            }


        }
        if (wrongGuess == 6 ){
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + choice);

        }

    }
    static String getHangmanArt(int wrongGuesses){

        return switch (wrongGuesses){
            case 0 -> """
                                  
                    """;
            case 1 -> """
                    O
                    
                    
                    """;
            case 2 -> """
                    O
                    |  
                    
                    """;
            case 3 -> """
                    O
                   /|
                    
                    """;
            case 4 -> """
                    O
                   /|\\ 
                    
                    """;
            case 5 -> """
                    O
                   /|\\ 
                   /  
                    """;
            case 6 -> """
                    O
                   /|\\ 
                   / \\  
                    """;
            default -> "";
        };

    }
}
