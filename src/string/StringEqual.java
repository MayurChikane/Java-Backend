package string;

public class StringEqual {
    public static void main(String[] args) {
        String s1 = "Technolearn";
        String s2 = "technolearn";

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("String are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}
