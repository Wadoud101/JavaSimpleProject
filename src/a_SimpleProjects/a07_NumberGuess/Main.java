package a_SimpleProjects.a07_NumberGuess;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,100);

        System.out.println("Number Guessing Game");

        do {
            System.out.print("Guess a number between 1 to 100: ");
            guess = in.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO lOW!");
            } else if (guess > randomNumber) {
                System.out.println(" TOO Big");

            }else {
                System.out.println("YOU Win");
                System.out.println("Correect Number is: " + randomNumber);
                System.out.println("After " + attempts +" attempts");
            }


        }while (guess != randomNumber);
    }
}
