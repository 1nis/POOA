package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClientTCP {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 4848);

            InputStreamReader entree = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader((entree));
            OutputStreamWriter sortie = new OutputStreamWriter(client.getOutputStream());
            // Informations client
            System.out.println(
                    "CLIENT : Adresse Port Locale : " + client.getLocalPort() + " " +
                            "Adresse Inet : " + client.getInetAddress() + " " +
                            "Adresse Socket Local : " + client.getLocalSocketAddress() + "\n"
            );

            // Lecture message
            System.out.println(br.readLine());

            client.close();
        } catch (Exception e) { /* … */ }
    }
}