import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");

        Copier(f1, f2);
    }

    public static void Copier(File f1, File f2) throws IOException {

        BufferedReader bftest = new BufferedReader(new FileReader("s.txt"));
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
        BufferedReader bf2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2)));
        File sortieFile = new File("sortie.txt");
        int nb = 1;
        if (sortieFile.exists()) {
            System.out.println("Sortie existe déjà");
        } else {
            sortieFile = new File("sortie.txt");
        }
        BufferedWriter bf3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sortieFile)));
        String s1 = "";
        String s2 = "";

        while (bf1.ready()) {
            s1 += (char) bf1.read();
        }
        while (bf2.ready()) {
            s2 += (char) bf2.read();
        }

        System.out.println(s2);
        while ((s1.length() > 0) && (s2.length() > 0)) {
            for (int i = 0; i < nb && s1.length() > 0; i++) {
                bf3.write(s1.charAt(0));
                s1 = s1.substring(1);
            }
            bf3.write(s2.charAt(0));
            s2 = s2.substring(1);
            nb += 1;
        }

        if ((s2.length() == 0) && (s1.length() > 0)) {
            while (s1.length() > 0) {
                bf3.write(s1.charAt(0));
                s1 = s1.substring(1);
            }
            System.out.println("Ecriture fichier 2 en premier");
        } else if ((s1.length() == 0) && (s2.length() > 0)) {
            while (s2.length() > 0) {
                bf3.write(s2.charAt(0));
                s2 = s2.substring(1);
            }
            System.out.println("Ecriture fichier 1 en premier");
        } else if ((s2.length() == 0) && (s1.length() == 0)) {
            System.out.println("Ecriture fini en meme temps");
        }
        bf3.flush();
        bf3.close();


    }
}
