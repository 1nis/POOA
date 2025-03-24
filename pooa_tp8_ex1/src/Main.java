import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception{
        MonThread starter = new MonThread();
        Coureurs coureur1 = new Coureurs();
        Coureurs coureur2 = new Coureurs();
        coureur1.setName("Coureur 1");
        coureur2.setName("Coureur 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Appuyez sur Entrée...");
        if(reader.readLine().length() == 0) {
            starter.start();
            starter.join();
            coureur1.start();
            coureur2.start();
        }
    }
}