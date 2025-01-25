package a_SimpleProjects.a11_RockScissorPaper;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String playerChoice = "";
        String[] choice = {"rock", "paper", "scissors"};
        String computerChoice;
        String playAgain = "yes";

        System.out.println("***********************************");
        System.out.println("Welcome To Rock Paper Scissor Game!");
        System.out.println("***********************************");

        do {
            System.out.print("Enter your mover: (Rock, Paper, Scissors): ");
            playerChoice = in.nextLine().toLowerCase();
            if (!playerChoice.equals("rock")  && !playerChoice.equals("paper")  && !playerChoice.equals("scissors") ){
                System.out.println("Invalid Move!!!!!");
                continue;

            }
            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);
            if(playerChoice.equals(computerChoice)){
                System.out.println("THAT'S A TIE, Enter again your move!!!!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")
                    || playerChoice.equals("paper") && computerChoice.equals("rock")
                    || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Win!!!!!");

            }else {
                System.out.println("You Loose!!!!");

            }
        } while (!playerChoice.equals("x"));
        System.out.println("Thanks for Playing, Bye!!!!!");


    }
}
