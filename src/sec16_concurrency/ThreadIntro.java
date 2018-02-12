package sec16_concurrency;

import static sec16_concurrency.ThreadColor.ANSI_BLUE;
import static sec16_concurrency.ThreadColor.ANSI_GREEN;
import static sec16_concurrency.ThreadColor.ANSI_RED;

public class ThreadIntro {
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "Name : " + Thread.currentThread().getName());
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "This is from the annonymous inner class");
            }
        }.start();
        System.out.println(ANSI_BLUE + "From main again");

        Thread myRunnableClass = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "This is from the annonymous inner class(Runnable)");
            }
        });
        myRunnableClass.start();
    }
}
