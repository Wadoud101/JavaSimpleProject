package a_SimpleProjects.a09_DiceRollerProgram;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int numDice;
        int total = 0;

        System.out.print("Please Enter the number of Dice to roll: ");
        numDice = in.nextInt();

        if (numDice > 0) {
            for (int i = 0; i < numDice; i++) {

                int roll = random.nextInt(1,7);
                System.out.println("You Rolled: " + roll);
                total = total + roll;

                asciiOfDice(roll);
            }
            System.out.println("The Sum of " + numDice + " Rolls are " + total);
        }else {
            System.out.println("Number of Dice must be grater than 0 !!!");
        }

    }

    private static void asciiOfDice(int roll) {

        String dice1 = """
                 _________
                |         |
                |    ●    |
                |         |
                 ---------
                """;


        String dice2 = """
                 _________
                |  ●      |
                |         |
                |      ●  |
                 ---------
                """;

        String dice3 = """
                 _________
                |  ●      |
                |    ●    |
                |      ●  |
                 ---------
                """;

        String dice4 = """
                 _________
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                """;

        String dice5 = """
                 _________
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                """;

        String dice6 = """
                 _________
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                """;


        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}
