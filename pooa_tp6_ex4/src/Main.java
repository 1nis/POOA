import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        Chrono unchrono = new Chrono();


        System.out.println(unchrono.isAlive());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Appuyez sur Entrée...");

        reader.readLine();
        unchrono.start();


        //reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        unchrono.interrupt();
    }
}