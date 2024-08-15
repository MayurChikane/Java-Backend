package file_handling;

import java.io.*;

public class FilewriterEx1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\mayur\\OneDrive\\Desktop\\count.txt");
            fw.write("Technolearn Training..");
            fw.write("Institute");
            fw.write("######");
            fw.append("Pune");
            System.out.println("Writing succesfully inside the file..");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}