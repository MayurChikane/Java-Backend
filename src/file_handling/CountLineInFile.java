package file_handling;

import java.io.*;

public class CountLineInFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\mayur\\OneDrive\\Desktop\\count.txt");
        if (f1.exists()) {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            int count = 0;
            String s1;

            while ((s1 = br.readLine()) != null) {
                count = count + 1;
                System.out.println(count + " : " + s1);
            }
            fr.close();
            br.close();
        } else {
            System.out.println("File Not Exist..");
        }
    }
}
