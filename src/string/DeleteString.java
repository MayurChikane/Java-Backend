package string;

public class DeleteString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pune Mumbai Pune");
        System.out.println(sb.delete(12, 16));
    }
}
