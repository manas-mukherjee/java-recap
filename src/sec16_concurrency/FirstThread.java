package sec16_concurrency;

import static sec16_concurrency.ThreadColor.ANSI_CYAN;

public class FirstThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Name : " + Thread.currentThread().getName());
    }
}
