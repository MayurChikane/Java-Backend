package networking;

import java.net.*;

public class InetAddressEx {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress a1 = InetAddress.getLocalHost();
        System.out.println(" " + a1);
        InetAddress a12 = InetAddress.getByName("Localhost");
        System.out.println(a12);
        InetAddress a13[] = InetAddress.getAllByName("Localhost");

        for (int i = 0; i < a13.length; i++) {
            System.out.println(" " + a13[i]);
        }
    }
}
