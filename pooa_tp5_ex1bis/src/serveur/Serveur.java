package serveur;

import java.io.*;
import java.net.*;

public class Serveur {
    public static void main(String[] args) {
        try {
            InetAddress adresse = new InetSocketAddress("localhost", 4848).getAddress();
            ServerSocket ecoute = new ServerSocket(4848, 1, adresse);
            Socket service = (Socket) null;
            System.out.println(
                    "SERVEUR : Adresse Port Locale : " + ecoute.getLocalPort() + " " +
                            "Adresse Inet : " + ecoute.getInetAddress() + " " +
                            "Adresse Socket Local : " + ecoute.getLocalSocketAddress() + "\n"
            );
            while(true) {
                service = ecoute.accept();
                System.out.println(
                        "CLIENT : Adresse Port Locale : " + service.getLocalPort() + " " +
                                "Adresse Inet : " + service.getInetAddress() + " " +
                                "Adresse Socket Local : " + service.getLocalSocketAddress()
                );
                OutputStream os = service.getOutputStream();
                InputStream is = service.getInputStream();
                service.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
