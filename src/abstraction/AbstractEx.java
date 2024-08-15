package abstraction;

import java.util.Scanner;

abstract class Fruits {
    public void show() {
        System.out.println("There are many fruits");
    }

    abstract public void display();
}

class Apple extends Fruits {
    public void display() {
        System.out.println("This Fruit is Apple");
    }
}

class Banana extends Fruits {
    public void display() {
        System.out.println("This Fruit is Banana");
    }
}

class Grapes extends Fruits {
    public void display() {
        System.out.println("This Fruit is Grapes");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Fruits ftr;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Apple \n2.Banana \n3.Grapes");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                ftr = new Apple();
                ftr.show();
                ftr.display();
                break;
            case 2:
                ftr = new Banana();
                ftr.show();
                ftr.display();
                break;
            case 3:
                ftr = new Grapes();
                ftr.show();
                ftr.display();
                break;

            default:
                System.out.println("Sorry wrong choice");
                break;
        }
        sc.close();
    }
}
