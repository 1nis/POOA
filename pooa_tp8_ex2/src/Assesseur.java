public class Assesseur extends Thread {

    private Urne urne;
    private Candidat duke;
    private Candidat bugee;

    Assesseur(Urne urne, Candidat duke, Candidat bugee) {
        this.urne = urne;
        this.duke = duke;
        this.bugee = bugee;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            int bulletin = urne.bulletin();
            if (bulletin == 0) {
                bugee.addVoix();
            } else if (bulletin == 1) {
                duke.addVoix();
            }
        }
    }
}
