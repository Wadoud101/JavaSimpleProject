package a_CodeJAVA.a1025_TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskPractice {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Hellooooooo ");
                count--;
                if (count <= 0 ){
                    System.out.println("Task Completed");
                    timer.cancel();
                }
            }

        };

        timer.schedule(task, 1000, 2000);


    }
}
