package string;

public class ReplaceString1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tommorrow    Wednsday");
        sb.replace(10, 12, "will be");
        System.out.println(sb);
    }
}