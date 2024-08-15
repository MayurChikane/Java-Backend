package multithread;

public class ThreadAliveOrNot extends Thread {

    public void run() {
        if (Thread.currentThread().isAlive()) {
            System.out.println("Thread Is Alive");
        } else {
            System.out.println("Thread Is Dead");
        }
    }

    public static void main(String[] args) {
        ThreadAliveOrNot t = new ThreadAliveOrNot();
        t.start();
    }
}
