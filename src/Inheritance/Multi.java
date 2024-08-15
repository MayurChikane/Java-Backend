package Inheritance;

class AddSub {
	int a = 10, b = 20, c = 0;

	public void add() {
		c = a + b;
		System.out.println("Addition: " + c);
	}

	public void sub() {
		c = a - b;
		System.out.println("Substraction: " + c);
	}
}

class MulDiv extends AddSub {
	int p = 80, q = 20, r = 0;

	public void mul() {
		r = p * q;
		System.out.println("Multiplication: " + r);
	}

	public void div() {
		r = p / q;
		System.out.println("Division: " + r);
	}
}

class Modulus extends MulDiv {
	int x = 45, y = 8, z = 0;

	public void mod() {
		z = x % y;
		System.out.println("Modulus: " + z);
	}
}

public class Multi {
	public static void main(String[] args) {
		Modulus m = new Modulus();
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.mod();
	}
}
