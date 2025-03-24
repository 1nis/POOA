import java.nio.file.*;
import java.io.*;

public class Backup {

    public static void createBackup(Path fichierSource) {
        if( Files.exists(fichierSource)) {
            if (Files.createDirectory(Paths.get("path/backup"))) {
                System.out.println("Dossier Backup Crée");
            }
        }

    }
}