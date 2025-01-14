package a_CodeJAVA.a1120_ThreadMultithrread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyRunable runable = new MyRunable();
        Thread thread = new Thread(runable);
        thread.setDaemon(true);
        thread.start();


        System.out.println("You have got 10 second to Enter you name: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter You name: ");
        String name = in.nextLine();
        System.out.println("Hello Mr. " + name);

    }
}
