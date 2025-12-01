package Adapter.PaymentProcessorQuestion;

// Classe da API externa
public class QuickEatsAPI {
    // Método de processamento de pagamento da API externa
    public void processPayment(String name, double value){
        IO.println("Processando o pagamento de " + name + " no valor de " + value);
    }
}
