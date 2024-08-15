package exception;

public class NullPointerExceptionEx {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            String s1 = null;
            System.out.println(s1.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("The Programm Of Nullpointer Exception is there..");
    }
}
