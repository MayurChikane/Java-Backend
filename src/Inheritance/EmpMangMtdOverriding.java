package Inheritance;

import java.util.Scanner;

class Employee {
	int HRA, TA, DA, PF, GS, BS, empno;
	Scanner sc = new Scanner(System.in);

	public void accpet()// accepting data
	{
		System.out.println("Enter Employee Number:");
		empno = sc.nextInt();
		System.out.println("Enter Employee Basic Salary:");
		BS = sc.nextInt();
	}

	public void calc() {
		HRA = BS * 40 / 100;
		TA = BS * 30 / 100;
		DA = BS * 20 / 100;
		PF = BS * 10 / 100;
		GS = BS + HRA + TA + DA - PF;
	}

	public void display() {
		System.out.println("Employee Number:" + empno);
		System.out.println("Employee Basic Salary:" + BS);
		System.out.println("Employee House Rent Allowance:" + HRA);
		System.out.println("Employee Travell Allowances:" + TA);
		System.out.println("Employee Dearneess Allowances:" + DA);
		System.out.println("Employee Providence Fund:" + PF);
		System.out.println("Employee Gross Salary:" + GS);
	}

}

class Manager extends Employee {
	String name;
	int mallow;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		super.accpet();
		System.out.println("Enter Manager Name:");
		name = sc.next();
		System.out.println("Enter Manager Allowances:");
		mallow = sc.nextInt();
	}

	public void calc() {
		super.calc();
	}
}

public class EmpMangMtdOverriding {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.accept();
		m1.calc();
		m1.display();
	}
}
