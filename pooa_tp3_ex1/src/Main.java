import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String monFichier = "./texte.txt";
        FileInputStream fis = new FileInputStream(afficherFichier(monFichier));
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while (br.ready()) {
            System.out.println(br.readLine());
        }
    }

    public static File afficherFichier(String monFichier) throws FileNotFoundException {
        File file = new File(monFichier);
        if (file.exists()) {
            return file;
        } else {
            throw new FileNotFoundException();
        }
    }
}