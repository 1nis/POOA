import java.io.*;
import java.util.Calendar;

public class Logger {

    private static Logger instance = null;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    private Long t = Calendar.getInstance().getTimeInMillis();
    private static File monFichier = new File("./src/logs.dat");

    public void log(String message) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(monFichier, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bw.write("["+t+"] " + message);
        bw.newLine();
        bw.flush();
        bw.close();

    }

    public String readLogs() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(monFichier));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return br.readLine();
    }
}
