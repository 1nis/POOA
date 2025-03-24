import javax.xml.crypto.dsig.CanonicalizationMethod;
import java.util.Calendar;

public class Chrono extends Thread{
    private int i = 0;
    long calendar1 = Calendar.getInstance().getTimeInMillis();

    @Override
    public void run() {
        while(!this.isInterrupted()) {
            //while((Calendar.getInstance().getTimeInMillis()-calendar1) < 500) {}

            i+=1;
            System.out.println(this.getName() + " valeur : " + i);
            //calendar1 = Calendar.getInstance().getTimeInMillis();
        }
        if (i%10==0) {
            System.out.println("bravo");
        }
        else {
            System.out.println("Perdu");
        }

    }

    public int getI() {
        return i;
    }
}
