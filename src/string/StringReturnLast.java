package string;

public class StringReturnLast {
    public static void main(String[] args) {
        String s1 = "Technolearn Trainings";
        String s2 = s1.substring(16, 20);
        String s3 = s1.substring(0, 16);
        String s4 = s2 + s3;
        System.out.println(s4);
    }
}
