package Inheritance;

class Device {
	public void Elec() {
		System.out.println("Electronic Device here.");
	}
}

class Laptop extends Device {
	public void lap() {
		System.out.println("Laptop is Electronic Device.");
	}
}

class Computer extends Device {
	public void comp() {
		System.out.println("Computer is Electronic Device.");
	}
}

class Tablet extends Device {
	public void tab() {
		System.out.println("Tablet is Electronic Device.");
	}
}

class Mobile extends Device {
	public void mob() {
		System.out.println("Mobile is Electronic Device.");
	}
}

public class HierarchicalInherEx {

	public static void main(String[] args) {
		Laptop ob1 = new Laptop();
		Computer ob2 = new Computer();
		Tablet ob3 = new Tablet();
		Mobile ob4 = new Mobile();
		ob1.lap();
		ob1.Elec();
		ob2.comp();
		ob2.Elec();
		ob3.tab();
		ob3.Elec();
		ob4.mob();
		ob4.Elec();
	}

}
