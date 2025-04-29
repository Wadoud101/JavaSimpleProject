package a_SimpleProjects.a08_BankingProgram;

import java.util.Scanner;

public class BankingProgram {

    static Scanner in = new Scanner(System.in);
    static Double balance = 0.00;
    public static void main(String[] args) {


        boolean isRunning = true;
        int choice;

        System.out.println("*****************");
        System.out.println("BANKING PROGRAM !!");
        System.out.println("*****************");

        while (isRunning){
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please Enter Your CHOICE: ");
            choice = in.nextInt();

            System.out.println("***********************************");
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Enter Correct CHOICE!!");
            }

            System.out.println("***********************************");



        }
        System.out.println("Thanks for your business with us!!");
        System.out.println("***********************************");


    }

    static void showBalance(Double balance){
        System.out.println("Your BALANCE is: $" + balance);

    }

    static void deposit(){
        System.out.print("Enter your DEPOSIT amount: ");
        double depostAmount = in.nextDouble();
        if (depostAmount < 0){
            System.out.println("The amount can NOT be negative!!!!");
        }else {
            balance = balance + depostAmount;
            System.out.println("The amount of $" + depostAmount + " added to your Balance.");
        }


    }

    static void withdraw(){
        System.out.print("How much do you want to Withdraw: ");
        double withdrawAmount = in.nextDouble();
        if(withdrawAmount > balance){
            System.out.println("INSUFFICIENT BALANCE");
        }else if(withdrawAmount < 0){
            System.out.println("The amount can't be NEGATIVE");
        }else {
            balance = balance - withdrawAmount;
            System.out.println("The amount of $" + withdrawAmount + " is deducted from your Balance.");

        }


    }
}
