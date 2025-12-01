package Adapter.MediaPlayerQuestion;

public class BasicMediaPlayer implements MediaPlayer {
    public void play(String fileName) {
        IO.println("Reproduzindo arquivo em mp3: " + fileName);
    }
}
