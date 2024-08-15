package Inheritance;

class Student {
	public void learn() {
		System.out.println("Student needs to learn new technology..");
	}
}

class Teacher extends Student {
	public void teach() {
		System.out.println("Teacher teach the student new technology..");
	}
}

public class SingleInhEx {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.teach();
		t1.learn();

	}

}
