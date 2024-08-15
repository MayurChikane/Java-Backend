package exception;

import java.io.*;

public class FileNotFoundExceptionEx {
    public static void main(String[] args) {
        try {
            FileInputStream fin;
            fin = new FileInputStream("C:\\Users\\Admin\\Desktop\\mytext.txt");
            System.out.println(fin);
        }

        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        System.out.println("End Of The Programm ..");
    }
}
