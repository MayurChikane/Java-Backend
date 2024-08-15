package multithread;

public class SinglEvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 2)// i=i+2
        {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SinglEvenThread s = new SinglEvenThread();
        s.start();
    }

}