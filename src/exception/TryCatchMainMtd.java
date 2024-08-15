package exception;

import java.util.Scanner;

public class TryCatchMainMtd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number Here:");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number Here:");
        int num2 = sc.nextInt();

        int num3 = 0;// garbage value arent enter in the variable

        try {
            num3 = num1 / num2;
            System.out.println("Division:" + num3);
        } catch (ArithmeticException e) {
            System.out.print(e);
        }
        System.out.println(("after the prog"));

        sc.close();
    }
}
