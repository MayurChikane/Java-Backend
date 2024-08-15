package Constructor;

public class Defconst1 {

    int rollno;
    String name;
    char grade;

    public Defconst1() {
        rollno = 15;
        name = "Gayatri";
        grade = 'A';
    }

    public void disp() {
        System.out.println("The roll no of student is : " + rollno);
        System.out.println("The name of student is : " + name);
        System.out.println("The grade of student is : " + grade);
    }

    public static void main(String[] args) {
        Defconst1 d = new Defconst1();
        d.disp();
    }
}
