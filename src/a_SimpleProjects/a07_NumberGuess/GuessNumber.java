package a_SimpleProjects.a07_NumberGuess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int guess;
        int randomNum = random.nextInt(1,100);
        int attempt = 0;

        System.out.println("Number Guess Game");

        do {
            System.out.println("Guess a number between 1 to 100!");
            guess = in.nextInt();
            attempt++;

            if(guess < randomNum){
                System.out.println("TOO LOW!");

            } else if (guess > randomNum) {
                System.out.println("TOO BIG!");

            }else {
                System.out.println("You Win!!");
                System.out.println("Correct number is: "+randomNum);
                System.out.println("After " + attempt + " attempts.");

            }

        }while (randomNum != guess);


    }
}
