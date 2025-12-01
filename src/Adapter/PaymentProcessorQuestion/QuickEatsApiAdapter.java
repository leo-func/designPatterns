package Adapter.PaymentProcessorQuestion;
// Classe do adaptar que vai permitir que o sistema simples da FoodNow utilize o sistema da QuickEats
public class QuickEatsApiAdapter implements FoodNowPaymentProcessor {
    // Criamos uma varíavel da classe QuickEatsAPI para poder acessar, posteriomente, o método de pagamento dela.
    private QuickEatsAPI quickEatsAPI;
    private String clientName;

    // CONSTRUTOR
    // Aqui nós apontamos para o QuickEatsAPI receber o valor passado (new QuickEatsAPI()) dentro do parâmetro da função.
    // Poderíamos evitar isso apenas instanciando o objeto aqui dentro da própria classe.
    public QuickEatsApiAdapter(QuickEatsAPI quickEatsAPI, String clientName) {
        this.quickEatsAPI = quickEatsAPI;
        this.clientName = clientName;
    }

    // Aqui que acontece a mágica. Usamos o método padrão do FoodNow e dentro dele chamamos a função do QuickEats,
    // E o "value" que está como parâmentro da função "processPayment" é passada para ocupar o segundo argumento da função do QuickEatsAPI.
    // E como resultado conseguimos adaptar a função antiga do FoodNow para a nova função de pagamento da QuickEats.

    public void processPayment(double value) {
        quickEatsAPI.processPayment(clientName, value);
    }
}
