public class Horloge extends Thread {
    private int heure = 0;
    private int minute = 0;

    @Override
    public void run() {
        try {
            // Attends 1 sec
            sleep(100);
            // Vérification temps  paire ou pas
            minute += 5;
            if (minute > 60) {
                minute = 0;
                heure += 1;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getheure() {
        return (heure*60 + minute);
    }
}
