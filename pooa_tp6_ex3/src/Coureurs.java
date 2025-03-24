import java.util.Calendar;

public class Coureurs extends Thread{

    @Override
    public void run() {
        long calendar1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i < 10000; i++) {
            System.out.println(this.getName() + " valeur : " + i);
        }
        long calendar2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Temps : " + (calendar2-calendar1));
    }
}
