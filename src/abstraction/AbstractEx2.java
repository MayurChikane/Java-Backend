package abstraction;

import java.util.Scanner;

abstract class Shape {
    float area;

    abstract public void show();
}

class Cir extends Shape {
    int rad;

    Cir(int rad) {
        this.rad = rad;
    }

    @Override
    public void show() {
        area = 3.14f * rad * rad;
        System.out.println("The area of circle is : " + area);
    }

}

class Rec extends Shape {
    int length, breadth;

    Rec(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void show() {
        area = length * breadth;
        System.out.println("The area of rectangle is : " + area);
    }

}

class Tri extends Shape {
    int base, height;

    Tri(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void show() {
        area = 0.5f * base * height;
        System.out.println("The area of triangle is : " + area);

    }

}

public class AbstractEx2 {
    public static void main(String[] args) {
        Shape sh;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                sh = new Cir(5);
                sh.show();
                break;

            case 2:
                sh = new Rec(5, 5);
                sh.show();
                break;

            case 3:
                sh = new Tri(5, 9);
                sh.show();
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        sc.close();
    }

}
