package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClientTCP {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 4848);

            InputStreamReader entree = new InputStreamReader(client.getInputStream());
            InputStreamReader lecture = new InputStreamReader(System.in);
            BufferedReader brl = new BufferedReader(lecture);
            BufferedReader br = new BufferedReader((entree));

            OutputStreamWriter sortie = new OutputStreamWriter(client.getOutputStream());
            BufferedWriter bw = new BufferedWriter(sortie);
            br.readLine();
            // Lecture message
            String blocs = "";
            while (br.ready()) {
                blocs += br.readLine() + "\n";
            }
            System.out.println(blocs);

            while (true) {
                String input = brl.readLine();
                bw.write(input);
                bw.newLine();
                bw.flush();

                String reponse = br.readLine();
                if (reponse == "*" || reponse == null) {
                    break;
                }

            }
            client.close();
        } catch (Exception e) { /* … */ }
    }
}