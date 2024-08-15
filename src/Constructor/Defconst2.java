package Constructor;

public class Defconst2 {

    int age;
    char gen;
    float per;

    Defconst2() {
        age = 20;
        gen = 'F';
        per = 80.9f;

        System.out.println("Age : " + age + "\n" + "Gender : " + gen + "\n" + "Percentage" + per);
    }

    public static void main(String[] args) {
        Defconst2 d = new Defconst2();

    }
}
