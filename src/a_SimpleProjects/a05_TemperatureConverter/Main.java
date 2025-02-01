package a_SimpleProjects.a05_TemperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temperature;
        String  choice;
        double newTemp;
        System.out.print("Enter the temperature: ");
        temperature = in.nextDouble();
        System.out.print("Convert to C or F: ");
        choice = in.next().toUpperCase();

        newTemp = (choice.equals("C")) ? (temperature-32)*5/9 : (temperature*9/5)+32;

        System.out.println("The temp is: " + newTemp);


    }
}
