package a_SimpleProjects.a02_ShoppingCardProg;

import java.util.Scanner;

public class ShoppingCard {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter items name: ");
        item = in.nextLine();
        System.out.print("What is the price for each: ");
        price = in.nextDouble();
        System.out.print("How many do you want: ");
        quantity = in.nextInt();

        total = price*quantity;
        System.out.println("****************************************");
        System.out.println("Your total item price for " + item + " will be: "+currency+ total);
        System.out.println("****************************************");


    }
}