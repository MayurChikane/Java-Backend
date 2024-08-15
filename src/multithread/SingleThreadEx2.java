package multithread;

public class SingleThreadEx2 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);// 1000 milliseconds=1 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SingleThreadEx2 s1 = new SingleThreadEx2();
		s1.start();
	}

}