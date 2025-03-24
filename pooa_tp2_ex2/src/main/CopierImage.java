package main;

import java.io.*;
import java.util.NoSuchElementException;

import com.sun.jdi.InvalidTypeException;
import ex1.*;

public class CopierImage {

    public static void copierBin(File source, File dest) {
        try {

            // Vérification si le fichier est un png et que la copie n'existe pas au préalable
            String extension = GetFileExtension(source.getName());
            if (!(extension.equals("png"))) {
                throw new IllegalArgumentException("Erreur : L'extension doit être un png !");
            } else if (dest.exists()) {
                throw new IllegalStateException("Erreur : Le fichier ne devrait pas exister !");
            }

            // Création des flux
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);

            // Copie du contenu du fichier source vers le destination
            while (fis.available() > 0) {
                int o = fis.read();
                fos.write(o);
            }
            fos.close();
            fis.close();

            // Erreur si le fichier source n'existe pas
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Fonction qui récupère l'extension fichier et ne retourne rien si aucune extension n'est trouvée
    public static String GetFileExtension(String nomFichier) {
        int point = nomFichier.lastIndexOf(".");

        if (point >= 0) {
            return nomFichier.substring(point + 1);
        }
        return "";
    }
}
