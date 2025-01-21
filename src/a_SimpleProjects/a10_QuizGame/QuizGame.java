package a_SimpleProjects.a10_QuizGame;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {"What is 10 plus 12?",
                              "What is 9 X 9 = ?",
                              "What is square roo of 64 ?",
                              "What is 5 to the power of 3 ?"};
        String[][] options = {{"1. 10", "2. 22", "3. I don't know"},
                              {"1. 18", "2. 27", "3. 81"},
                              {"1. 8", "2. 16", "3. 32"},
                              {"1. 25", "2. 125", "3. 15"}};

        int[] answers = {2, 3, 1, 2};

        Scanner in = new Scanner(System.in);
        int guess;
        int score = 0 ;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option: options[i]){
                System.out.println(option);
            }

            System.out.print("What is the correct Answer: ");
            guess = in.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT");
                score++;
            } else {
                System.out.println("WRONG");
            }

        }
        System.out.println("Your Score is " + score+ " out of " + questions.length + " question.");
    }
}
