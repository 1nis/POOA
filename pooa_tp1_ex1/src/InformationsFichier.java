import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class InformationsFichier {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String fileName;

        // Entrer nom fichier
        System.out.println("Entrez le nom du fichier");
        fileName = myObj.nextLine();

        File f = new File(fileName);

        if (f.exists()) {
            // Vérification si Dossier ou Fichier
            if (f.isDirectory()) {
                System.out.println(fileName + " est un dossier");
                System.out.println(f.getAbsolutePath());
                System.out.println("Droit de lecture : " + f.canRead());
                System.out.println("Droit d'écriture : " + f.canWrite());
            } else {
                System.out.println(fileName + " est un fichier");
                System.out.println("Nom du fichier " + f.getName());
                System.out.println("Taille fichier : " + f.length());
                System.out.println("Droit de lecture : " + f.canRead());
                System.out.println("Droit d'écriture : " + f.canWrite());
                // Conversion des millisecondes en Date
                Date dateFile = new Date(f.lastModified());
                System.out.println("Date de dernière modification : " + dateFile);
                System.out.println(f.getParent());


                System.out.println("Chemin Fichier dans le projet actuel : " + f.getPath());
                System.out.println("Chemin Absolu du fichier : " + f.getAbsolutePath());

            }

        } else {
            System.out.println(fileName + " n'existe pas.");
        }

    }
}