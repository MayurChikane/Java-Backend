package Scanner;

import java.util.Scanner;

public class EmployeeSal {
    Scanner sc = new Scanner(System.in);
    int empno;
    float hra, ta, da, bs, gs, pf;

    public void acc() {

        System.out.println("Enter the employee no");
        empno = sc.nextInt();
        System.out.println("Enter employee basic salary");
        bs = sc.nextFloat();

    }

    public void find() {
        hra = bs * 0.4f;
        ta = bs * 0.3f;
        da = bs * 0.3f;
        pf = bs * 0.1f;
        gs = bs + hra + ta + da + pf;

    }

    public void view() {
        System.out.println("Emplyee no : " + empno);
        System.out.println("Employee basic salary : " + bs);
        System.out.println("Employee housr rent allowance : " + hra);
        System.out.println("Employee gross salary: " + gs);
    }

    public static void main(String[] args) {

        EmployeeSal o = new EmployeeSal();
        o.acc();
        o.find();
        o.view();

    }
}
