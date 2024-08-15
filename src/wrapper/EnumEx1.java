package wrapper;

public class EnumEx1 {
    enum collections {
        a, e, i, o, u
    };

    public static void main(String[] args) {
        for (collections c : collections.values()) {
            System.out.println(c);
        }
    }
}
