package a_CodeJAVA.a000_Projects.a01_madLibsGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjecive3;

        System.out.print("Enter a n adjective: ");
        adjective1 = in.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = in.nextLine();
        System.out.print("Enter a adjective: ");
        adjective2 = in.nextLine();
        System.out.print("Enter a verb ending ing: ");
        verb1 = in.nextLine();
        System.out.print("Enter a n adjective: ");
        adjecive3 = in.nextLine();

        System.out.println("Today i went to " + adjective1 + " zoo.");
        System.out.println("In an exhibit a saw a "+ noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjecive3 + "!");

    }
}
