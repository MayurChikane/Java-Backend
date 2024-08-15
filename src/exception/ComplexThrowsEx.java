package exception;

public class ComplexThrowsEx {
    int real;
    int img;
    int ans;

    ComplexThrowsEx(int r, int img) {
        real = r;
        this.img = img;
    }

    public void view() {
        try {
            ans = real / img;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        ComplexThrowsEx c = new ComplexThrowsEx(10, 0);
        c.view();
        System.out.println("After Try,Catch & Throws Keyword Programm Is End");
    }
}
