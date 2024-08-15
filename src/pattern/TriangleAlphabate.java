package pattern;

public class TriangleAlphabate {
    public static void main(String[] args) {
        char let = 65;
        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (let++) + " ");
            }
            System.out.println();
        }
    }
}