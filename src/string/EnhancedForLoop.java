package string;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int sum = 0;
        int a[] = { 2, 6, 8, 4, 9, 2, 4, 7, 9, 1, 3 };
        for (int x : a) {
            sum = sum + x;
            System.out.println(sum);
        }
    }
}
