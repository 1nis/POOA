import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String monFichier = "./texte.txt";
        FileInputStream fis = new FileInputStream(afficherFichier(monFichier));
        InputStreEst-il possible d'utiliser un BufferedWriter branché directement sur System.err pour écrire sur la console  (Vrai/Faux) ? amReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while (br.ready()) {
            System.out.println(br.readLine());
        }
    }

    public static File ecrireDansUnFichier(String unfichier, String autrefichier) throws FileNotFoundException {
        File file = new File(unfichier);
        if (file.exists()) {
            return file;
        } else {
            throw new FileNotFoundException();
        }
    }
}