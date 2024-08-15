package multithread;

class DigitThread extends Thread {
    int i;

    public void run() {
        for (i = 1; i <= 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CharacterThread extends Thread {
    char ch;

    public void run() {
        for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithThreadDigitChar {
    public static void main(String[] args) {
        DigitThread d = new DigitThread();
        d.start();
        CharacterThread c = new CharacterThread();
        c.start();
    }
}
