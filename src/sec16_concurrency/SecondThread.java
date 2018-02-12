package sec16_concurrency;

import static sec16_concurrency.ThreadColor.ANSI_PURPLE;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Thread using Runnable. Name : " + Thread.currentThread().getName());
    }
}
