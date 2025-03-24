public class Candidat {
    private final String nom;
    private int nbVoix;

    public Candidat(String nom) {
        this.nom = nom;
        this.nbVoix = 0;
    }

    public synchronized void addVoix() {
        nbVoix += 1;
    }

    public int getVoix() {
        return nbVoix;
    }
}
