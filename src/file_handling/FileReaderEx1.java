package file_handling;

import java.io.*;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\mayur\\OneDrive\\Desktop\\count.txt");
        // int i=fr.read();
        // System.out.println((char)i);
        int j;
        while ((j = fr.read()) != -1) {
            System.out.print((char) j);
        }
        fr.close();
    }
}
