package networking;

import java.io.*;
import java.net.*;

public class ServerExBuffer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2013);// port match here
        Socket s = ss.accept();// accept request here..
        System.out.println("Connection Done Succesfully..");
        DataInputStream din = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = din.readUTF();
            System.out.println("Client Says:" + str);
            if (!str.equalsIgnoreCase(str))
                break;
        }
        ss.close();
        s.close();
        din.close();
        br.close();
    }
}