package file_handling;

import java.io.*;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\mayur\\OneDrive\\Desktop\\file.txt");
        if (f1.exists()) {
            System.out.println("File size is : " + f1.length());
            System.out.println("Fikle path is : " + f1.getPath());
            System.out.println("File is readable ? :" + f1.canRead());
            System.out.println("File is executable ? :" + f1.canExecute());
            System.out.println("File is writable ? :" + f1.canWrite());
            System.out.println("Absolute path of fike is : " + f1.getAbsolutePath());
            System.out.println("The name of file is : " + f1.getName());

        } else {
            System.out.println("File does not exist");
        }
    }
}
