import java.io.*;
import java.util.Scanner;

public class DeplacerFichier {

    public static void main(String[] args) throws IOException {

        Scanner myObj = new Scanner(System.in);
        String fileName;

        System.out.println("Entrez le nom du fichier à déplacer");
        fileName = myObj.nextLine();

        File f = new File(fileName);

        File destination = new File("Deplacement/" + fileName);

        if (f.exists()) {

            if (f.renameTo(destination)) {
                System.out.println("Le fichier a été renommé");
            } else {
                System.out.println("Le fichier n'a pas pu être renommé");
            }
        }
        else {
            System.out.println("Le fichier n'existe pas !");
        }
    }
}