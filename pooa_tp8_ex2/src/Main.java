public class Main {
    public static void main(String[] args) throws InterruptedException {
        Urne uneUrne = new Urne();
        Candidat Duke = new Candidat("Duke");
        Candidat Bugee = new Candidat("Bugee");
        Assesseur Joe = new Assesseur(uneUrne, Duke, Bugee);
        Assesseur Averell = new Assesseur(uneUrne, Duke, Bugee);

        Joe.start();
        Averell.start();
        Joe.join();
        System.out.println(Duke.getVoix());
        Duke.compteur;
        Averell.join();

        System.out.println("Résultats Bugee : " + Bugee.getVoix());
        System.out.println("Résultats Duke : " + Duke.getVoix());

    }
}