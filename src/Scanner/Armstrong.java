package Scanner;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int originalNumber = num;
        int n = 0;
        int result = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }

}
