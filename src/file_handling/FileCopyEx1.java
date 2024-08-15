package file_handling;

import java.io.*;
import java.io.IOException;

public class FileCopyEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\mayur\\OneDrive\\Desktop\\file.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\mayur\\OneDrive\\Desktop\\print.txt");

        int n;
        while ((n = fin.read()) != -1) {
            fout.write(n);
        }

        System.out.println("Written in print file successfully.");
        fin.close();
        fout.close();
    }
}
