package FactoryMethod;

public class AdidasFactory extends SneakersFactory{

    public Sneakers createSneakers() {return new AdidasSneakers();}
}
