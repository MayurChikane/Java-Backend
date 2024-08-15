package file_handling;

import java.io.*;

public class FileInputStreamEx {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\mayur\\OneDrive\\Desktop\\file.txt");

        // int i = fin.read();
        // System.out.println((char) i);
        // System.out.println();

        int j;
        while ((j = fin.read()) != -1) {
            {
                System.out.print((char) j);
            }

        }
        fin.close();
    }
}
