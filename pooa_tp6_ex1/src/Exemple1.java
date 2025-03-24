public class Exemple1 {
    public static void main(String[] args) {
        Compteur1 Chronos = new Compteur1();
        Compteur2 Kairos = new Compteur2();
        Chronos.setName("Chronos");
        Kairos.setName("Kairos");
        Chronos.start();
        Kairos.start();

    }
}
