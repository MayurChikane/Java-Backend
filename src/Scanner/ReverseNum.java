package Scanner;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int reverse = 0, digit;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("The reversed number is : " + reverse);
        sc.close();
    }
}
