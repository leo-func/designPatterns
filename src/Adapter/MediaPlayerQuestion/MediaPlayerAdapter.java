package Adapter.MediaPlayerQuestion;

public class MediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    String mediaType;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer, String mediaType) {
        this.advancedMediaPlayer = advancedMediaPlayer;
        this.mediaType = mediaType;
    }

    @Override
    public void play(String fileName) {
        advancedMediaPlayer.play(mediaType, fileName);
    }
}
