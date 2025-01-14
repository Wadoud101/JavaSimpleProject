package a_CodeJAVA.a000_Projects.a03_CompoundInterestCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double principal;
        double rate;
        int timeCompound;
        int years;
        double amount;

        System.out.print("Inter the Principal amount: ");
        principal = in.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = in.nextDouble() / 100;
        System.out.print("Enter the # of times compound per year: ");
        timeCompound = in.nextInt();
        System.out.print("Enter the # of years: ");
        years = in.nextInt();

        amount = principal * Math.pow(1+rate/timeCompound, timeCompound*years);

        System.out.println("The amount is: " + amount);


    }
}
