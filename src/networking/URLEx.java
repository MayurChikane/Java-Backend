package networking;

import java.io.IOException;
import java.net.*;

public class URLEx {
	public static void main(String[] args) throws IOException, UnknownHostException {
		try {
			URL url = new URL("http://www.google.com");
			System.out.println("Protocol Of The URL:" + url.getProtocol());
			System.out.println("Host Name Of The URL:" + url.getHost());
			System.out.println("Port Number Of The URL:" + url.getPort());
			System.out.println("File Name Of The Url Is:" + url.getFile());
			System.out.println("Path Of The URL File:" + url.getPath());
			System.out.println("Object Of The Info:" + url.toString());
			System.out.println(url.getContent());
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}