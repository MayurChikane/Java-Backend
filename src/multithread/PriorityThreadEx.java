package multithread;

public class PriorityThreadEx extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName() + "\n"
                    + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        PriorityThreadEx p1 = new PriorityThreadEx();
        p1.setName("Thrd1");
        p1.setPriority(MAX_PRIORITY);// 10
        p1.start();
        PriorityThreadEx p2 = new PriorityThreadEx();
        p2.setName("Thrd2");
        p2.setPriority(NORM_PRIORITY);// 5
        p2.start();
        PriorityThreadEx p3 = new PriorityThreadEx();
        p3.setName("Thrd3");
        p3.setPriority(MIN_PRIORITY);// 1
        p3.start();
    }
}
