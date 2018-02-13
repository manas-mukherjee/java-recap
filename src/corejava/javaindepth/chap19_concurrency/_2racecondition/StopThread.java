package corejava.javaindepth.chap19_concurrency._2racecondition;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static volatile boolean stop;
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!stop){
                    System.out.println("inside maze : " + ++counter);
                }
            }
        }).start();

        TimeUnit.MILLISECONDS.sleep(500);

        stop = true;
    }
}
