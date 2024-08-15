package string;

public class IndexOfEx {
    public static void main(String[] args) {
        String s1 = new String("Hello World India");
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.indexOf('l', 6));

        System.out.println(s1.indexOf("India"));
    }
}
