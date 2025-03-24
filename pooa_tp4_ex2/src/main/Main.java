package main;

import java.io.*;

import mobile.Mobile;

public class Main {

    public static void main(String[] args) {
        Mobile unMobile = new Mobile("iPhone 15 PRO MAX", 1024, 256, true, 1300f);
        save("test", unMobile);
        Mobile mobileLoad = load("test");
        System.out.println(mobileLoad.toString());
    }

    public static void save(String nomFichier, Mobile unMobile) {
        try {
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(new FileOutputStream(nomFichier));
            oos.writeObject(unMobile);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Mobile load(String nomFichier) {
        Mobile m = null;
        try {
            ObjectInputStream ois = null;
            ois = new ObjectInputStream(new FileInputStream(nomFichier));
            m = (Mobile) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }

}
