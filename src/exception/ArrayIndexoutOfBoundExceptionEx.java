package exception;

public class ArrayIndexoutOfBoundExceptionEx {
    public static void main(String[] args) {
        try {
            int a[] = new int[15];// syntax of array of java
            a[20] = 25;// ArrayIndexOutofBoundException
            System.out.println("Array Of Elements:" + a);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Above Example Of ArrayIndexOut Of BoundException");
    }
}
