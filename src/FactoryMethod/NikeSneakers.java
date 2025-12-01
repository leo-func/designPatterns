package FactoryMethod;

// "NikeSneakers" implementa o contrato da interface Sneakers, então ela deve implementar
// todos os métodos da interface Sneakers com a implementação.
public class NikeSneakers implements Sneakers {
    public String getBrand() {return "Nike";}
    public String getColor() {return "Branco";}
    public String getModel() {return "Air Jordan 4";}
    public double getSize() {return 42.0;}
}