public class Stop extends EtatMusique{
    @Override
    public void play(AudioPlayer audioPlayer) {
        System.out.println("Lecture");
        audioPlayer.basculeEtat(new Play());
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        System.out.println("Déjà Stop (Pause)");
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        System.out.println("Déjà Stop (Stop)");
    }
}
