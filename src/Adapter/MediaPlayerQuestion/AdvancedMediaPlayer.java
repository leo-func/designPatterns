package Adapter.MediaPlayerQuestion;

public class AdvancedMediaPlayer {
    private BasicMediaPlayer basicMediaPlayer = new BasicMediaPlayer();

    public void play(String mediaType, String fileName) {
        switch (mediaType) {
            case "mp4":
            case "vlc":
            case "avi":
                IO.println("Reproduzindo arquivo em " + mediaType + ": " + fileName);
                break;

            case "mp3":
                basicMediaPlayer.play(fileName);
                break;

            default:
                IO.println("Formato não suportado: " + mediaType);
                break;

        }
    }
}
