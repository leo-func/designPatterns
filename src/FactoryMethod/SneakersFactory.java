package FactoryMethod;

// Uma classe abstrata é aquela que não pode ser instaciada diretamente, ou seja,
// não pode usar o "new" nela. Ela serve como modelo base para outras classes herdarem.
// Além disso, para usar métodos abstratos a classe deve ser obrigatoriamente abstrata.

public abstract class SneakersFactory {

    // Um método abstrato é aquele que não contém nada dentro do seu corpo, ou seja,
    // ele permite que as subclasses decidam o que querem que seja executado dentro desse método.
    // Isso pode ser visto na prática na classes "NikeFactory" e "AdidasFactory"

    public abstract Sneakers createSneakers();

    public void showInfo(){
        Sneakers S = createSneakers();
        IO.println("Marca: " + S.getBrand());
        IO.println("Modelo: " + S.getModel());
        IO.println("Cor: " + S.getColor());
        IO.println("Tamanho: " + S.getSize());
    }
}

// Criei essa classe para centralizar todos os métodos genéricos para evitar repetição de código dentro de outras classes.
