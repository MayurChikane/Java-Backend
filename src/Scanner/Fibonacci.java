package Scanner;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terrms in fibonacci series");
        int n = sc.nextInt();
        int first = 0, second = 1, temp = 0;
        System.out.println("Fibonacci series :");
        for (int i = 1; i <= n; i++) {
            System.out.println(first + "\n");
            temp = first + second;
            first = second;
            second = temp;

        }
        sc.close();
    }
}
