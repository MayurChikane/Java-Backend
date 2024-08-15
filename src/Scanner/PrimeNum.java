package Scanner;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether prime or not");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("Number is Prime");
        }
        sc.close();
    }
}
