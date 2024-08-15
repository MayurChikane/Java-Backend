package Scanner;

import java.util.Scanner;

public class StudentResult {
    int rollno, phy, chem, math;
    float tot, per;

    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter student roll no :");
        rollno = sc.nextInt();
        System.out.println("Enter three subject marks : ");
        phy = sc.nextInt();
        chem = sc.nextInt();
        math = sc.nextInt();
    }

    public void calc() {
        tot = phy + chem + math;
        per = tot / 3;
    }

    public void show() {
        System.out.println("The roll no of student : " + rollno);
        System.out.println("Physics marks : " + phy);
        System.out.println("Chemistry marks : " + chem);
        System.out.println("Maths marks : " + math);
        System.out.println("Total marks : " + tot);
        System.out.println("Percentage : " + per);
    }

    public static void main(String[] args) {
        StudentResult s = new StudentResult();
        s.accept();
        s.calc();
        s.show();
    }

}