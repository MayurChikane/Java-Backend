package pattern;

public class PalindromePattern {

    public static void palindrome(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        palindrome(5);
    }
}
