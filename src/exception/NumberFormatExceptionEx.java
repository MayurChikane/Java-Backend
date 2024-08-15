package exception;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        try {
            String s1 = "Technolearn";
            int i = Integer.parseInt(s1);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println(e);
            // e.printStackTrace();
        }
        System.out.println("Error Exist But still output is there..");
    }

}
