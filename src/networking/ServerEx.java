package networking;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class ServerEx
{
	public static void main(String[] args) 
	{
       try 
       {
		ServerSocket ss=new ServerSocket(4865);//match port number
		Socket s=ss.accept();
		System.out.println("Connected.....");
		DataInputStream din=new DataInputStream(s.getInputStream());
		String str=din.readUTF();
		System.out.println(str);
		ss.close();
		s.close();
		din.close();
	  }
       catch(IOException e) {
    	   
       }
	}
}