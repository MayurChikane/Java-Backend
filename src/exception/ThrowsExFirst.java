package exception;

import java.io.*;

public class ThrowsExFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The String");
        String s1 = br.readLine();
        System.out.println(s1);
    }
}
