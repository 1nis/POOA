package main;

import java.io.*;
import mobile.Mobile;
public class Main {

    public void save(String nomFichier, Mobile unMobile) {
        try
        {
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(new FileOutputStream(nomFichier));
            oos.writeObject(unMobile);
            oos.close();
        }
        catch (Exception e) {e.printStackTrace();}
    }

    public Mobile load(String nomFichier) {
        Mobile m = null;
        try
        {
            ObjectInputStream ois = null;
            ois = new ObjectInputStream(new FileInputStream(nomFichier));
            m = (Mobile) ois.readObject();
            ois.close();
        }
        catch (Exception e) {e.printStackTrace();}
        return m;
    }



}
