import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");
        File f3 = new File("sortie.txt");
        int char1;
        int char2;
        int nb = 1;

        BufferedReader bf1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
        BufferedReader bf2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2)));
        BufferedWriter bf3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f3)));
        while (((char1 = bf1.read()) != -1) && ((char2 = bf2.read()) != -1)) {
            for (int i = 0; i < nb; i++) {
                bf3.write(char1);
            }
            bf3.write(char2);
            nb += 1;
        }
        if (((char2 = bf2.read()) == -1) && ((char1 = bf1.read()) != -1)) {
            while (((char1 = bf1.read()) != -1)) {
                bf3.write(char1);
            }
            System.out.println("Fini de lire file 2 en premier");
        } else if (((char1 = bf1.read()) == -1) && ((char2 = bf2.read()) != -1)) {
            while (((char2 = bf2.read()) != -1)) {
                bf3.write(char2);
            }
            System.out.println("Fini de lire file 1 en dernier");
        } else if (((char1 = bf1.read()) == -1) && ((char2 = bf2.read()) == -1)) {
            System.out.println("Fini de lire en même temps");
        }


    }
}
