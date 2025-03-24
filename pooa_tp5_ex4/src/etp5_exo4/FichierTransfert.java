package etp5_exo4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

public class FichierTransfert implements Serializable {
  private static final long serialVersionUID = 1L;
  private String nom;
  private byte[] data;

  public FichierTransfert(File fichier) {
    this.nom = fichier.getName();
    this.data = lireFichier(fichier);
  }

  private byte[] lireFichier(File fichier) {
    try (FileInputStream fis = new FileInputStream(fichier)) {
      byte[] contenu = new byte[(int) fichier.length()];
      fis.read(contenu);
      return contenu;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public String getNom() {
    return nom;
  }

  public byte[] getData() {
    return data;
  }
}