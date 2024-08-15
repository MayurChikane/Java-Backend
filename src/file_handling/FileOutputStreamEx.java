package file_handling;

import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\mayur\\OneDrive\\Desktop\\print.txt");
        // fout.write(89);
        // System.out.println(fout);

        String s = "Technolearn Training Institute Pune";
        byte b[] = s.getBytes();
        fout.write(b);
        System.out.println("Writing successfully done in the print file ...");
        fout.close();
    }
}
