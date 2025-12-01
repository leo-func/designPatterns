package ChainOfResponsibility;

public class Panel extends Container {
    public String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null){
            System.out.println("Painel (modal): " + modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
