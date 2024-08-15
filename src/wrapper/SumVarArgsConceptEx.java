package wrapper;

public class SumVarArgsConceptEx {
    int sum = 0;

    public void varargs(int... n) {
        for (int x : n) {
            sum = sum + x;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumVarArgsConceptEx s = new SumVarArgsConceptEx();
        s.varargs(10, 11, 12, 23, 34, 45, 67, 8);
        s.varargs(20, 30);
    }
}
