package file_handling;

import java.io.*;

public class CopyFilePasteUpperCase {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\mayur\\OneDrive\\Desktop\\cop.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\mayur\\OneDrive\\Desktop\\pas.txt");
        byte b[] = new byte[fin.available()];
        fin.read(b);
        String s1 = new String(b);
        s1 = s1.toUpperCase();
        b = s1.getBytes();
        fout.write(b);
        System.out.println("Writing data in uppercase inside file succesfully.." + b);
        fin.close();
        fout.close();
    }
}