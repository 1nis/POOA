package client;

import java.net.*;
import java.io.*;

public class TestClientTCP {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 4848);
            while (true) {
                InputStream entree = client.getInputStream();
                OutputStream sortie = client.getOutputStream();
                System.out.println(
                        "CLIENT : Adresse Port Locale : " + client.getLocalPort() + " " +
                                "Adresse Inet : " + client.getInetAddress() + " " +
                                "Adresse Socket Local : " + client.getLocalSocketAddress() + "\n"
                );
                client.close();
            }
        } catch (Exception e) { /* … */ }
    }
}
