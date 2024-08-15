package networking;
import java.net.*;
import java.io.*;
public class ClientEx
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
     Socket s=new Socket("localhost",4865);
     DataOutputStream dout=new DataOutputStream(s.getOutputStream());
     dout.writeUTF("Advanced Java");
     dout.flush();
      s.close();
      dout.close();
     
	}
}