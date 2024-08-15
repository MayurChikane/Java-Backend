package Encapsulation;

public class GarbageEx {
	String name = "TechnoLearn Training";
	char grade = 'A';

	GarbageEx() {
		System.out.println("After Object creation Constructor is called...");
	}

	protected void finalize() // predefine
	{
		System.out.println("Unused Object destroyed here..");
	}

	public static void main(String[] args) {
		GarbageEx g = new GarbageEx();
		g = null;
		GarbageEx g1 = new GarbageEx();
		g1 = null;
		GarbageEx g2 = new GarbageEx();
		System.out.println(g2.name + "\n" + g2.grade);
		System.gc(); // call to garbage collector --predefined

	}

}
