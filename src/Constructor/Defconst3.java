package Constructor;

public class Defconst3 {

    int sal;
    long mobno;
    String add;

    Defconst3() {
        sal = 20000;
        mobno = 705770733;
        add = "Mumbai";
    }

    public static void main(String[] args) {
        Defconst3 d = new Defconst3();
        System.out.println("Salary : " + d.sal + "\n" + "Mobile no : " + d.mobno + "\n" + "Address : " + d.add);
    }
}
