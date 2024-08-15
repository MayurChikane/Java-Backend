package multithread;

public class SingleCharThreadEx extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SingleCharThreadEx s1 = new SingleCharThreadEx();
        s1.start();
    }
}
