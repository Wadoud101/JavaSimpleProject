package a_SimpleProjects.a04_WeightConverter;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Whight Converson Program");

        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Plese Enter your choice: ");
        double weight;
        double newWeeight;
        double choice = in.nextDouble();
       if( choice ==1 ){
           System.out.print("Enter the weight in lbs:");
           weight = in.nextDouble();
           newWeeight = weight/2.20462;
           System.out.println("the new weight in kg is: " + newWeeight);
       } else if (choice == 2) {
           System.out.print("Enter the weight in kgs:");
           weight = in.nextDouble();
           newWeeight = weight *2.20462;
           System.out.print("The weight in lbs is: " + newWeeight);

       }else {
           System.out.println("Chose 1 or 2, its wrong choice");
       }

    }


}
