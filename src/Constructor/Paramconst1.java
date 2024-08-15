package Constructor;

public class Paramconst1 {

    int rollno;
    String name;
    char grade;
    float per;

    Paramconst1(int rollno, String nm, char grade, float p) {
        this.rollno = rollno;
        name = nm;
        this.grade = grade;
        per = p;
    }

    public void disp() {
        System.out.println("Roll no : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Grade : " + grade);
        System.out.println("Percentage : " + per);
    }

    public static void main(String[] args) {
        Paramconst1 p = new Paramconst1(1, "Mayur", 'A', 89.0f);
        p.disp();
    }
}
