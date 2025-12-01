package ChainOfResponsibility;

public class Dialog extends Container {
    public String wikiPageURL;

    @Override
    public void showHelp() {
        if (wikiPageURL != null) {
            System.out.println("Abrindo página de ajuda: " + wikiPageURL);
        } else {
            super.showHelp();
        }
    }
}
