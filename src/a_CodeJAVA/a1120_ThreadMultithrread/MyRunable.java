package a_CodeJAVA.a1120_ThreadMultithrread;

public class MyRunable implements Runnable{

    @Override
    public void run(){

        int a = 5;
        for (int i = 0; i <= a; i++) {
            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println("You run out of time! ");

            }

            if(i==a){
                System.out.println("Time is up: ");
                System.exit(0);
            }
        }


    }
}
