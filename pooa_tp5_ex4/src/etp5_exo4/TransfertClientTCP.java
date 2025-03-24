package etp5_exo4;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TransfertClientTCP {
  public static void main(String[] args) {
    String serveur = "localhost";
    int port = 4848;
    String dossierClient = "./src/etp5_exo4/repertoireClient";

    try (Socket socket = new Socket(serveur, port)) {
      System.out.println("Connecté au serveur " + serveur + ":" + port);

      // Création des flux
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      Scanner scanner = new Scanner(System.in);

      // Lecture et affichage de la liste des fichiers
      DirView dirView = (DirView) in.readObject();
      dirView.afficherRepertoire();

      // Choix du fichier
      System.out.print("Entrez le numéro du fichier à télécharger : ");
      int choix = scanner.nextInt();
      out.writeInt(choix);
      out.flush();

      // Réception du fichier
      FichierTransfert fichier = (FichierTransfert) in.readObject();
      if (fichier != null) {
        File fichierRecu = new File(dossierClient + "/" + fichier.getNom());
        try (FileOutputStream fos = new FileOutputStream(fichierRecu)) {
          fos.write(fichier.getData());
        }
        System.out.println("Fichier reçu et sauvegardé sous : " + fichierRecu.getAbsolutePath());
      }

      // Fermeture des flux
      scanner.close();
      in.close();
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}