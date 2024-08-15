package multithread;

public class ThreadOddNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        ThreadOddNumber t = new ThreadOddNumber();
        Thread th = new Thread(t);
        th.start();
    }
}