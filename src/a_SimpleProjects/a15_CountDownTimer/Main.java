package a_SimpleProjects.a15_CountDownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to Count down from: ");
        int response = in.nextInt();

        final int[] count = {response};
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                System.out.println(count[0]);
                count[0]--;
                if (count[0] < 0){
                    System.out.println("Happy new Year");
                    timer.cancel();
                }

            }
        };
        timer.schedule(task,0,1000);
        in.close();
    }
}
