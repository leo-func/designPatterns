package ChainOfResponsibility;

abstract class Component implements HelperHandler{
    protected String tooltipText;
    protected Container container;

    @Override
    public void showHelp() {
        if  (tooltipText != null) {
            System.out.println("Tooltip: " + tooltipText);
        } else if (container != null) {
            container.showHelp(); // passa pra frente
        }
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }
}
