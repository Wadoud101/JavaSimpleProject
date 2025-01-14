package a_CodeJAVA.a856_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter # of food you want:  ");

        int numOfFood = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i +": ");
            String food = in.nextLine();
            foods.add(food);

        }
        System.out.println(foods);




        in.close();

    }
}
