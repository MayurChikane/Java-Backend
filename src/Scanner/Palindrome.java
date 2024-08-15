package Scanner;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int originalnum = num;

        int reverse = 0, digit;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (originalnum == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}
