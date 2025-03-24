public class Compteur1 extends Thread {
    @Override
    public void run() {
        System.out.println("je m'appelle " + this.getName() + " et je vais compter jusqu' à 100 ");
        for (int i = 1; i <= 100; i++) {
            System.out.println("[" + this.getName() + "]: " + i);
        }
        System.out.println("[" + this.getName() + "]: J'ai fini !! ");
    }
}
