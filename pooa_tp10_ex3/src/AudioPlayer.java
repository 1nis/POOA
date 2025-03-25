public class AudioPlayer {
    private EtatMusique etatCourant;
    public AudioPlayer() {
        this.etatCourant = new Pause();
    }
    public void basculeEtat(EtatMusique e) {
        etatCourant = e;
    }

    public void pause(){
        this.etatCourant.pause(this);
    }
    public void play(){
        this.etatCourant.play(this);
    }
    public void stop(){
        this.etatCourant.stop(this);
    }
}