package etp5_exo4;

import java.io.*;
import java.net.*;

public class TransfertServeurTCP {
  public static void main(String[] args) {
    int port = 4848;
    String dossierServeur = "./src/etp5_exo4/repertoireServeur";

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("Serveur en attente sur le port " + port + "...");

      while (true) {
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connecté : " + clientSocket.getInetAddress());

        // Création des flux
        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
        DataInputStream in = new DataInputStream(clientSocket.getInputStream());

        // Création de la liste des fichiers et envoi au client
        DirView dirView = new DirView(dossierServeur);
        out.writeObject(dirView);
        out.flush();

        // Lecture du choix du client
        int choixFichier = in.readInt();
        System.out.println("Client demande le fichier : " + choixFichier);

        // Envoi du fichier
        FichierTransfert fichier = dirView.getFichier(choixFichier);
        if (fichier != null) {
          out.writeObject(fichier);
          out.flush();
          System.out.println("Fichier envoyé : " + fichier.getNom());
        } else {
          System.out.println("Fichier non valide");
        }

        // Fermeture des flux et socket
        in.close();
        out.close();
        clientSocket.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}