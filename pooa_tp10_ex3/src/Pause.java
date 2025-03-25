public class Pause extends EtatMusique{
    @Override
    public void play(AudioPlayer audioPlayer) {
        System.out.println("Play");
        audioPlayer.basculeEtat(new Play());
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        System.out.println("Stop");
        audioPlayer.basculeEtat(new Stop());
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        System.out.println("Stop");
        audioPlayer.basculeEtat(new Stop());
    }
}
