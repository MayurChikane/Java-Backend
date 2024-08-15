package Constructor;

public class Paramconst2 {

    int age;
    String address;
    char gen;
    float sal;

    Paramconst2(int age1, String add, char gen, float sal) {
        age = age1;
        address = add;
        this.gen = gen;
        this.sal = sal;

        System.out.println(
                "Age : " + age + "\n" + "Address : " + address + "\n" + "Gender : " + gen + "\n" + "Salary : " + sal);
    }

    public static void main(String[] args) {
        Paramconst2 p = new Paramconst2(25, "Mumbai", 'M', 500000);
    }
}
