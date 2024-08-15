package wrapper;

public class UnBoxing {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Integer i1 = new Integer(100);// object type
        int i = i1;// data type --primitive type
        System.out.println("Primitive type data:" + i);
    }
}
