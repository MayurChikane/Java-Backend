package networking;

import java.io.*;
import java.net.*;

public class SocketServerEx1 {
	public static void main(String[] args) throws IOException {
		ServerSocket si = new ServerSocket(9123);
		Socket s = si.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String ss = din.readUTF();
			System.out.println(ss);
			if (ss.equalsIgnoreCase("exit"))
				break;
		}
		si.close();
		s.close();
		din.close();
		br.close();
	}
}