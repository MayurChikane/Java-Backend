package pattern;

public class DiamondAlpha {

    public static void diamond(int n) {
        for (int i = 1; i < n; i++) {
            // spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(5);
    }
}
