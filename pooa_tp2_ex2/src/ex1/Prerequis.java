package ex1;

import java.io.*;

public class Prerequis {

    public static File GetOrCreateOutputFile(String fichier) {
        File file = new File(fichier);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
