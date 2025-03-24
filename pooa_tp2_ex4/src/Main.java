import java2.Prerequis;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File monFichier = new File("./nombres.txt");
        FileInputStream fis = new FileInputStream(monFichier);
        DataInputStream dis = new DataInputStream(fis);
        long startTime = System.currentTimeMillis();
        while (dis.available() > 0) {
            int i = dis.readInt();
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        fis.close();
        dis.close();

        FileInputStream fis2 = new FileInputStream(monFichier);
        BufferedInputStream bis2 = new BufferedInputStream(fis2);
        DataInputStream dis2 = new DataInputStream(bis2);
        long startTime2 = System.currentTimeMillis();
        while (dis2.available() > 0) {
            int i2 = dis2.readInt();
            System.out.println(i2);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Temps sans buffer : "+ (endTime - startTime));
        System.out.println("Temps avec buffer : "+ (endTime2 - startTime2));
        fis2.close();
        bis2.close();
        dis2.close();

    }
}