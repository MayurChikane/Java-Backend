package wrapper;

public class EnumEx2 {
    enum colors {
        red, green, blue
    };

    public static void main(String[] args) {
        for (colors c : colors.values()) {
            System.out.println(c);
        }
    }
}
