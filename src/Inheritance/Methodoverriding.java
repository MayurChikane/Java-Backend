package Inheritance;

class Person {
    int pid;

    Person(int pid) {
        this.pid = pid;
    }

    public void show() {
        System.out.println("Person id : " + pid);
    }
}

class Human extends Person {
    String name;

    public Human(int pid, String name) {
        super(pid);
        this.name = name;
    }

    public void show() {
        super.show();
        System.out.println("Human name is id : " + name);
    }
}

public class Methodoverriding {

    public static void main(String[] args) {
        Human h = new Human(1, "Mayur");
        h.show();

    }
}
