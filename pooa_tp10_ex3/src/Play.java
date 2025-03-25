import java.sql.SQLOutput;

public class Play extends EtatMusique {

    @Override
    public void play(AudioPlayer audioPlayer) {
        System.out.println("Reste en mode play");
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        System.out.println("Pause");
        audioPlayer.basculeEtat(new Pause());
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        System.out.println("Stop");
        audioPlayer.basculeEtat(new Stop());
    }
}
