public class Derive extends Thread {
private int borne = 20000;

    @Override
    public void run() {
        for (int i = borne; i > 0; i--) {
            System.out.println(this.getName() + " valeur : " + i);
        }
    }

    public int getBorne() {
        return borne;
    }
}
