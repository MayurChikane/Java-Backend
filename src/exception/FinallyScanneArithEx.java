package exception;

import java.util.Scanner;

public class FinallyScanneArithEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number one");
        int num1 = sc.nextInt();
        System.out.println("Enter Number second");
        int num2 = sc.nextInt();

        int ans = 0;

        try {
            ans = num1 / num2;
            System.out.println("Addition:" + ans);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            int a = 10, b = 30, r = 0;
            r = a * b;
            System.out.println("Multiplication:" + r);
            System.out.println("Multiplication done");
        }
        System.out.println("Finally come after try catch");
        sc.close();
    }
}
