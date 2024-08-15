package multithread;

public class PriorityThreadRunnable implements Runnable 
{
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getId() + "\n" +
                    Thread.currentThread().getName() + "\n" + Thread
                            .currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        PriorityThreadRunnable p = new PriorityThreadRunnable();
        Thread t1 = new Thread(p);
        t1.setPriority(9);
        t1.setName("tt1");
        t1.start();
        Thread t2 = new Thread(p);
        t2.setPriority(6);
        t2.setName("tt2");
        t2.start();
        Thread t3 = new Thread(p);
        t3.setPriority(2);
        t3.setName("tt3");
        t3.start();
    }
}