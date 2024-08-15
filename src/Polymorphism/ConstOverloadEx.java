package Polymorphism;

public class ConstOverloadEx {

    int rollno;
    String name;
    char grade;
    float per;
    long mobno;

    private ConstOverloadEx() {
        System.out.println("This is Default constructor .");
    }

    public ConstOverloadEx(int rn, String nm, char gr, float per) {
        rollno = rn;
        name = nm;
        grade = gr;
        this.per = per;
    }

    public ConstOverloadEx(char gr, float per, long mn) {
        grade = gr;
        this.per = per;
        mobno = mn;
    }

    public static void main(String[] args) {
        ConstOverloadEx c1 = new ConstOverloadEx();

        ConstOverloadEx c2 = new ConstOverloadEx(5, "Mayur", 'A', 89);
        System.out.println("roll no : " + c2.rollno + "\n" + "Name : " + c2.name + "\n" + "Grade : " + c2.grade + "\n"
                + "Percentage : " + c2.per);

        ConstOverloadEx c3 = new ConstOverloadEx('C', 85, 705770733);
        System.out.println("Grade : " + c3.grade + "\n" + "percentage : " + c3.per + "\n" + "Mobile no : " + c3.mobno);
    }
}
