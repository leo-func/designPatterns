package FactoryMethod;

// Interface basicamente é um contrato: todas as classes que assinarem esse
// contrato devem implementar as mesmas funções dessa interface.
// Além disso, ela apenas define métodos que devem existir, mas não fornecem um corpo. ou seja,
// a implementação fica por conta de cada subclasse. Como é possível ver abaixo os métodos apenas estão definidos.

// Isso pode ser visto na prática dentro da classe "NikeSneakers"
public interface Sneakers {
     String getBrand();
     String getColor();
     String getModel();
     double getSize();
}
