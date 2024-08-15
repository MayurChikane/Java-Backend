package Scanner;

import java.util.Scanner;

public class SwitchConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Addition" + "\n" + "2:Substraction" + "\n" + "3:Multiply");

        System.out.println("Enter your choice :");
        int num = sc.nextInt();

        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        switch (num) {
            case 1:
                int op = first + second;
                System.out.println("addition is : " + op);

                break;

            case 2:
                op = first - second;
                System.out.println("substraction is : " + op);

                break;

            case 3:
                op = first * second;
                System.out.println("substraction is : " + op);

                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
