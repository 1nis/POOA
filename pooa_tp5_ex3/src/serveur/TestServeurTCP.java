package serveur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
            System.out.println("SERVEUR : Adresse Port Locale : " + ecoute.getLocalPort() + " " + "Adresse Inet : " + ecoute.getInetAddress() + " " + "Adresse Socket Local : " + ecoute.getLocalSocketAddress() + "\n");
            while (true) {
                service = ecoute.accept();
                // Affichage données du client connecté au serveur
                System.out.println("CLIENT : Adresse Port Locale : " + service.getLocalPort() + " " + "Adresse Inet : " + service.getInetAddress() + " " + "Adresse Socket Local : " + service.getLocalSocketAddress());

                OutputStreamWriter osw = new OutputStreamWriter(service.getOutputStream());
                InputStreamReader isr = new InputStreamReader(service.getInputStream());
                BufferedWriter brw = new BufferedWriter(osw);
                BufferedReader bri = new BufferedReader(isr);

                brw.write("Bienvenue dans le serveur perroquet\n" + "\n" + "Le serveur va recopier tout ce que vous direz\n" + "\n" + "Tapez '*' pour sortir\n" + "\n" + "A vous :");
                brw.newLine();
                brw.flush();

                while(true) {
                    String message = bri.readLine();
                    System.out.println(message);
                    if (message.equals("0")){
                        System.out.println("Client Fini");
                        break;
                    }
                    brw.write(message);
                    brw.newLine();
                    brw.flush();
                }
                ecoute.close();

            }
        } catch (Exception e) { /* … */ }
    }
}