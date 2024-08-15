package Scanner;

import java.util.Scanner;

public class StudData {
    Scanner sc = new Scanner(System.in);

    int roll;
    String name;
    char per;

    public void accept() {
        System.out.println("Enter the roll of the student");
        roll = sc.nextInt();

        System.out.println("Enter the name of the student");
        name = sc.next();

        System.out.println("Enter the student grade");
        per = sc.next().charAt(0);
    }

    public void disp() {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + roll);
        System.out.println("per : " + per);

    }

    public static void main(String[] args) {
        StudData s = new StudData();
        s.accept();
        s.disp();
    }
}
