package Scanner;

import java.util.*;

public class Calc {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    public void accept() {
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
    }

    public void display() {
        c = a + b;
        System.out.println("sum : " + c);
        c = a * b;
        System.out.println("mul : " + c);
        c = a - b;
        System.out.println("sub : " + c);
        c = a / b;
        System.out.println("div : " + c);
        c = a % b;
        System.out.println("mod : " + c);
    }

    public static void main(String[] args) {
        Calc o = new Calc();
        o.accept();
        o.display();
    }
}
