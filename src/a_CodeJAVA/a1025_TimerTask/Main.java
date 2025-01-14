package a_CodeJAVA.a1025_TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hellooooooo ");
            }
        };

        timer.schedule(task, 1000, 2000);

    }
}
