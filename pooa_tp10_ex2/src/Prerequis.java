
import java.io.File;
import java.io.IOException;

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