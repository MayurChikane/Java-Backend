package networking;

import java.io.*;
import java.net.*;

public class ClientExBuffer {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("Localhost", 2013);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Conncetion request sent..");

        while (true) {
            String str = br.readLine();
            dout.writeUTF(str);
            if (!str.equalsIgnoreCase(str))
                break;
        }
        s.close();
        dout.close();
        br.close();
    }
}
