package FactoryMethod;

// Aqui usamos o extends, para herdar da super-classe "SneakersFactory", os métodos contidos dentro dela.

public class NikeFactory extends SneakersFactory{

    // É possível retornar um objeto da classe "NikeSneakers", pois ele "assinou" o contrato da interface "Sneakers".
    // "NikeSneakers" é uma classe normal, mas agora também passa a ser vista como "Sneakers".
    // Com herança, o polimorfismo funciona do mesmo jeito: você pode declarar a variável ou retorno como superclasse, e instanciar uma subclasse.
    // ISSO É POLIMORFISMO (absolute cinema)

    public Sneakers createSneakers() {return new NikeSneakers();}
    // Todo método abstrato declarado em uma classe abstrata precisa ser implementado em alguma subclasse concreta antes de instanciar a subclasse.
    // Caso contrário, a classe continua abstrata ou dá erro de compilação.

}
