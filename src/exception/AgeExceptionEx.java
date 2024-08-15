package exception;

class AgeException extends Exception {
    public void age() {
        System.out.println("Invalid Age:");
    }
}

public class AgeExceptionEx {
    int age;

    AgeExceptionEx(int age) {
        this.age = age;
    }

    public void show() {
        try {
            if (age <= 18 || age >= 90) {
                throw new AgeException();
            }

            else {
                System.out.println("Valid Age:");
            }
            System.out.println("Age Is:" + age);
        } catch (AgeException a) {
            a.age();
        }
    }

    public static void main(String[] args) {
        AgeExceptionEx a1 = new AgeExceptionEx(15);
        a1.show();

    }
}
