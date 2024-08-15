package string;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";
        char ch1[] = s1.toLowerCase().toCharArray();
        char ch2[] = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Strings are Anagrams to each other.");
        } else {
            System.out.println("Strings are not Anagrams to each other.");
        }
    }
}
