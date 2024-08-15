package string;

public class StringEachCharReverse {
    public static void main(String[] args) {
        String s1 = "Technolearn Training Pune";
        String arr[] = s1.split("//s");
        String s2 = null;

        for (String temp : arr) {
            StringBuilder sb = new StringBuilder(temp);
            sb.reverse();
            if (s2 == null) {
                s2 = sb.toString();
            } else {
                s2 = s2 + " " + sb.toString();
            }
        }
        System.out.println(s2);
    }
}
