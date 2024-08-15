package Encapsulation;

public class SingletonEx1 {
	static SingletonEx1 s1 = null;

	private SingletonEx1() {
		System.out.println("Program of Singleton class...");
	}

	public static SingletonEx1 get() {
		if (s1 == null) {
			s1 = new SingletonEx1();
		}
		return s1;
	}

	public static void main(String[] args) {
		SingletonEx1 s2 = SingletonEx1.get();

	}

}
