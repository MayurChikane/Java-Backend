package string;

public class StringArraySort {
    public static void main(String[] args) {
        String s1[] = { "nikhil", "mayur", "saniya", "pooja", "sanket", "akash", "siddhesh", "omkar" };
        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].compareTo(s1[j]) > 0) {
                    String temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
            for (i = 0; i < s1.length; i++) {
                System.out.println(s1[i]);
            }
        }
    }
}
