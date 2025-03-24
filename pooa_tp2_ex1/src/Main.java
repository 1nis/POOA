import java2.Prerequis;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File monFichier = Prerequis.GetOrCreateOutputFile("fichier.txt");
        int[] num = {77, 49, 45, 109, 105, 485, 103, -128};
        FileOutputStream fos = new FileOutputStream(monFichier);
        for (int numbers : num) {
            fos.write(numbers);
        }
        fos.close();
        FileInputStream fis = new FileInputStream(monFichier);
        while (fis.available() > 0) {
            System.out.println(fis.read());
        }
        fis.close();

    }

}
