package multithread;

public class SingleThreadEx extends Thread {
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println("Technolearn");
        }
    }

    public static void main(String[] args) {
        SingleThreadEx s1 = new SingleThreadEx();
        s1.start();

        for (int i = 1; i < 3; i++) {
            System.out.println("training");
        }

    }
}
