package networking;

import java.io.*;
import java.net.*;

public class SocketClientEx1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("Localhost", 9123);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s1 = br.readLine();
			dout.writeUTF(s1);
			System.out.println("Connected Here.." + dout);
			if (s1.equalsIgnoreCase("exit"))
				break;
		}
		s.close();
	}
}