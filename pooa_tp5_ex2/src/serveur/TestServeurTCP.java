package serveur;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServeurTCP {
    public static void main(String[] args) {
        try {
            InetAddress uneadresse = new InetSocketAddress("localhost", 4848).getAddress();
            ServerSocket ecoute = new ServerSocket(4848, 5, uneadresse);
            Socket service = null;
            // Affichage données serveur
            System.out.println(
                    "SERVEUR : Adresse Port Locale : " + ecoute.getLocalPort() + " " +
                            "Adresse Inet : " + ecoute.getInetAddress() + " " +
                            "Adresse Socket Local : " + ecoute.getLocalSocketAddress() + "\n"
            );
            while (true) {
                service = ecoute.accept();
                // Affichage données du client connecté au serveur
                System.out.println(
                        "CLIENT : Adresse Port Locale : " + service.getLocalPort() + " " +
                                "Adresse Inet : " + service.getInetAddress() + " " +
                                "Adresse Socket Local : " + service.getLocalSocketAddress()
                );

                OutputStreamWriter osw = new OutputStreamWriter(service.getOutputStream());
                InputStreamReader isr = new InputStreamReader(service.getInputStream());
                BufferedWriter br = new BufferedWriter(osw);
                br.write("Bienvenue");
                br.newLine();
                br.flush();

                ecoute.close();
            }
        } catch (Exception e) { /* … */ }
    }
}