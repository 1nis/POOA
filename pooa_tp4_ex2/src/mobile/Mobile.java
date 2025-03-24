package mobile;

import java.io.*;
import java.util.*;

public class Mobile implements Serializable {
    private String modèle;
    private int nbPixelsFront;
    private transient long mémoire;
    private boolean capacité;
    private transient float prix;
    static final long serialVersionUID = 13L;
    private int masse;
    public Mobile(String modèle, int NbPixelsFront, long Mémoire, boolean Capacité, float Prix) {
        this.modèle = modèle;
        this.nbPixelsFront = NbPixelsFront;
        this.mémoire = Mémoire;
        this.capacité = Capacité;
        this.prix = Prix;
    }

    @Override
    public String toString() {
        System.out.println(prix);
        return null;
    }

    private void readObject(ObjectInputStream flux) throws IOException, ClassNotFoundException {
        flux.defaultReadObject();
        this.prix = ((int)(Math.random() * 100) + 1);
    }


}