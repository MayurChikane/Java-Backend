package Scanner;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number ");
        int i = sc.nextInt();
        for (int j = 1; j <= i; j++) {
            fact = fact * j;
        }
        System.out.println("The factorial is : " + fact);

        sc.close();
    }
}
