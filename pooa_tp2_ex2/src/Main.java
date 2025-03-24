import java.io.*;

import static main.CopierImage.*;

import static ex1.Prerequis.*;


public class Main {
    private static File fichierSource;
    private static File fichierFinale;

    public static void main(String[] args) {

        fichierSource = new File("miage.png");

        fichierFinale = new File("copie.png");

        copierBin(fichierSource, fichierFinale);

    }
}