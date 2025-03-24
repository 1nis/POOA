public class Main {

    public static void main(String[] args) {
        Derive unederive = new Derive();
        int borneMain = (unederive.getBorne()/2);
        unederive.start();
        for (int i = borneMain; i > 0; i--) {
            System.out.println("Main valeur : " + i);
        }
    }
}
