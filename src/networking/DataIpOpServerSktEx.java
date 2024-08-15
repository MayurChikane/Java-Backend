package networking;

import java.io.*;
import java.net.*;

public class DataIpOpServerSktEx {
    public static void main(String[] args) throws IOException {
        ServerSocket s1 = new ServerSocket(3012);// port number matched
        Socket ss = s1.accept();// request accepted
        DataInputStream din = new DataInputStream(ss.getInputStream());
        DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = " ", str2 = " ";
        while (!str1.equals("stop")) {
            str1 = din.readUTF();
            System.out.println("Client Says:" + str1);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        s1.close();
        ss.close();
        din.close();
        dout.close();
        br.close();
    }
}
