package string;

public class InsertString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Today Tuesday");
        sb.insert(5, "is");
        System.out.println(sb);
    }
}
