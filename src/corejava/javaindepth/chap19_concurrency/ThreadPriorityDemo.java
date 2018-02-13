package corejava.javaindepth.chap19_concurrency;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread()); // name, priority, thread-group  ( Ref - EJ : Item - 73 )

        Thread t1 = new Thread(new EmailCampaign());
        Thread t2 = new Thread(new EmailAggregator());

        t1.setName("Email Campaign");
        t2.setName("Email Aggregator");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            //overloaded join(wait time in mili)
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside Main..");
    }
}

class EmailAggregator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            if (i==5){
                Thread.currentThread().yield();
            }
        }
    }
}

class EmailCampaign implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}