package a_SimpleProjects.a06_SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1, num2;
        double result = 0;
        char operator;
        boolean operation = true;

        System.out.print("Enter the first number: ");
        num1 = in.nextDouble();
        System.out.print("Chose an operator (+, -, *, /, ^): ");
        operator = in.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = in.nextDouble();


        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Number cant not be divided by Zero!");
                    operation = false;
                }else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Please enter correct value!");
                operation = false;
            }
        }

        if (operation){
            System.out.println("The result is: " + result);
        }

    }
}
