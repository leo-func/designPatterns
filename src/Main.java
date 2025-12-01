import Adapter.MediaPlayerQuestion.AdvancedMediaPlayer;
import Adapter.MediaPlayerQuestion.MediaPlayerAdapter;
import Adapter.PaymentProcessorQuestion.QuickEatsAPI;
import Adapter.PaymentProcessorQuestion.QuickEatsApiAdapter;
import ChainOfResponsibility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Aqui pode ser usado tanto "SneakersFactory" quanto a própria classe do tênis
    // mas a diferença é que quando você usa a classe génerica (SneakersFactory), você
    // pega apenas métodos definidos dentro dessa classe. Já quando você usa a própria classe
    // do tênis ele pega os métodos definidos dentro de SneakersFactory e os métodos da classe do tênis, pois ele herda da super classe.
    // Por exemplo: NikeFactory nikeFactory = new NikeFactory();
    // Pega métodos da super classe (SneakersFactory) e da classe, se tiver, "NikeFactory".

    /*
    SneakersFactory nikeFactory = new NikeFactory();
    nikeFactory.showInfo();
    SneakersFactory adidasFactory = new AdidasFactory();
    adidasFactory.showInfo();
    */

    /*
    QuickEatsAPI quickEatsAPI = new QuickEatsAPI();
    QuickEatsApiAdapter quickEatsApiAdapter = new QuickEatsApiAdapter(quickEatsAPI, "Leo");
    quickEatsApiAdapter.processPayment(20.0);

    AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
    MediaPlayerAdapter mp4 = new MediaPlayerAdapter(advancedMediaPlayer, "mp4");
    MediaPlayerAdapter vlc = new MediaPlayerAdapter(advancedMediaPlayer, "vlc");
    MediaPlayerAdapter avi = new MediaPlayerAdapter(advancedMediaPlayer, "avi");
    MediaPlayerAdapter wav = new MediaPlayerAdapter(advancedMediaPlayer, "wav");
    MediaPlayerAdapter mp3 = new MediaPlayerAdapter(advancedMediaPlayer, "mp3");

    mp4.play("video.mp4");
    vlc.play("video.vlc");
    avi.play("video.avi");
    wav.play("video.wav");
    mp3.play("song.mp3");
    */

    Dialog dialog = new Dialog();
    dialog.wikiPageURL = "http://meu-wiki.com/dialog-ajuda";

    Panel panel = new Panel();


    Button ok = new Button();
    ok.setTooltipText("Esse botão confirma a operação");

    Button cancel = new Button();

    panel.add(ok);
    panel.add(cancel);
    dialog.add(panel);

    // Chamadas
    System.out.println("=== ok.showHelp() ===");
    ok.showHelp();          // Deve imprimir a tooltip do botão

    System.out.println("=== cancel.showHelp() ===");
    cancel.showHelp();

    System.out.println("=== dialog.showHelp() ===");
    dialog.showHelp();      // Deve imprimir o wikiPageURL da Dialog


}
