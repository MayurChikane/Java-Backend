package string;

public class MaximumOcciNum {
    public static void main(String[] args) {
        int a[] = { 4, 8, 6, 2, 3, 7, 9, 4, 1, 5, 3, 4, 8, 5, 3 };
        int count[] = new int[40];
        for (int x : a) {
            count[x]++;
        }
        int max = 0;
        int p = 0;
        for (int x : a) {
            if (count[x] > max) {
                max = count[x];
                p = x;
            }
        }
        System.out.println("Maximum Occurence number :" + p);
    }
}
