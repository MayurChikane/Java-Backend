package pattern;

public class RowAlphabate {
    public static void main(String[] args) {
        int let = 64;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) (let + i) + " ");
            }
            System.out.println();
        }
    }
}