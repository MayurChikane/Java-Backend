package multithread;

public class ThreadInfoEx implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getId() + "\n" +
                    Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadInfoEx t1 = new ThreadInfoEx();
        Thread t = new Thread(t1);
        t.setName("Thrd1");
        t.start();
        Thread tt = new Thread(t1);
        tt.setName("Thrd2");
        tt.start();
        Thread ttt = new Thread(t1);
        ttt.setName("Thrd3");
        ttt.start();
    }
}