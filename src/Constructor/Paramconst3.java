package Constructor;

public class Paramconst3 {

    int sno;
    long mno;
    double acno;
    String aname;

    Paramconst3(int sno, long mno, double acno, String aname) {
        this.sno = sno;
        this.mno = mno;
        this.acno = acno;
        this.aname = aname;
    }

    public static void main(String[] args) {
        Paramconst3 p = new Paramconst3(11, 70577073, 1155632565, "Mayur");
        System.out.println(p.sno + "\n" + p.mno + "\n" + p.acno + "\n" + p.aname);
        Paramconst3 pp = new Paramconst3(12, 365555862, 12255556, "Nikhil");
        System.out.println(pp.sno + "\n" + pp.mno + "\n" + pp.acno + "\n" + pp.aname);
    }
}
