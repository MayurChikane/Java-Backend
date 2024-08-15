package exception;

public class FinallyEx2 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("4");
            System.out.println("5");
        }
        System.out.println("End of the programm here,after try,catch,finally");
    }
}
