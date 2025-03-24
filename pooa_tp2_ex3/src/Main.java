import java2.Prerequis;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Création du fichier
        File monFichier = Prerequis.GetOrCreateOutputFile("fichier.txt");

        // Initialisation de la liste avec les nombres
        int[] num = {77, 49, 45, 109, 105, 485, 103, -128};

        // Ecriture dans le fichier
        FileOutputStream fos = new FileOutputStream(monFichier);
        DataOutputStream dos = new DataOutputStream(fos);
        for (int numbers : num) {
            dos.writeInt(numbers);
        }
        dos.close();
        fos.close();

        // Lecture nombre sans modulo
        FileInputStream fis = new FileInputStream(monFichier);
        DataInputStream dis = new DataInputStream(fis);
        while (dis.available() > 0) {
            System.out.println(dis.readInt());
        }
        fis.close();
        dis.close();

        // Lecture nombre sans modulo et caster en CHAR
        FileInputStream fis2 = new FileInputStream(monFichier);
        DataInputStream dis2 = new DataInputStream(fis2);
        while (dis2.available() > 0) {
            System.out.println((char)dis2.readInt());
        }
        fis2.close();
        dis2.close();

        // Lecture nombre avec modulo et caster en CHAR
        FileInputStream fis3 = new FileInputStream(monFichier);
        DataInputStream dis3 = new DataInputStream(fis3);
        while (dis3.available() > 0) {
            System.out.println((char)(Math.abs((dis3.readInt())%256)));
        }
        fis3.close();
        dis3.close();

    }

}
