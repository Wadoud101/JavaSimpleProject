package a_SimpleProjects.a05_TemperatureConverter;

import java.util.Scanner;

public class WeightConverter2 {
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("Welcome to Weight Converter Program!!!");
        System.out.println("**************************************");
        System.out.println("Select a choice!!!!");

        Scanner in = new Scanner(System.in);
        int choice = 0;


        double fern=0;
        double celc=0;

        while (choice != 9)
        {

            System.out.println("****************************");
            System.out.println("( 1 ) For changing F to C.");
            System.out.println("( 2 ) For changing C to F.");
            System.out.println("****************************");
            System.out.print("Your Choice: ");
            choice = in.nextInt();

            if (choice == 9 ){
                break;
            }

            if (choice == 1) {
                System.out.print("Enter a Temp Degree in Fernhide: ");
                fern = in.nextDouble();
                celc = (fern - 32) * 5 / 9;
                System.out.println(fern + " fernhide is equal to " + celc + " in degree.");
            } else if (choice == 2) {
                System.out.print("Enter a degree in Celcius: ");
                celc = in.nextDouble();
                fern = (9 * celc / 5) + 32;
                System.out.println(celc + " celcius is equal to " + fern + " fernhide");

            } else {
                System.out.println("Wrong choice!!!");
            }
            System.out.println("Please re-enter your choice or 9 for exit.");
        }
        System.out.println("Bye!!!");


    }
}
