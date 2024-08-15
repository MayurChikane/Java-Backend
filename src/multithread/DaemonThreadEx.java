package multithread;

public class DaemonThreadEx extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("It is Daemon Thread");
        } else {
            System.out.println("Not a user Thread");
        }
    }

    public static void main(String[] args) {
        DaemonThreadEx d = new DaemonThreadEx();
        d.setDaemon(true);
        d.setName("tt");
        System.out.println(d);
        d.start();

        DaemonThreadEx d1 = new DaemonThreadEx();
        d1.setDaemon(false);
        d1.setName("tt");
        System.out.println(d1);
        d1.start();
    }
}
