import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.Date;

public class Horloge extends JLabel implements Runnable {
    private DateFormat timeFormat = DateFormat.getTimeInstance();
    public void run() {
        try {
            while (true) {
                this.setText(timeFormat.format(new Date()));
                Thread.sleep(1000);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public Horloge() {
        this.setText(timeFormat.format(new Date()));
        this.setAlignment(Label.CENTER);
// Création d’un thread basé sur l’horloge créée.
        (new Thread(this)).start();
    }
}
