package networking;

import java.net.*;
import java.io.*;

public class WebBufferedReaderEx {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Website Name Here:");

        try {
            String s1 = br.readLine();
            InetAddress i1 = InetAddress.getByName(s1);
            System.out.println("InetAddress Is:" + i1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
