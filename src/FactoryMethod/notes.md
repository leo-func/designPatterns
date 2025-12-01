Herança x Interface
=
* Herança (extends):
    - Uma classe herda da outra: métodos já definidos e com implementação, e atributos.
    - O "@Override" permite que a subclasse modifique ou especialize o comportamento de um método já definido na superclasse.
    - Uma classe só pode herdar métodos e atributos de uma única classe-pai.

    ```java
    // Super Class Vehicle
    public class Vehicle{
        public void move(){IO.println("Movendo!");}
    }
    ```
  
    ```java
    // Subclass Car
    public class Car extends Vehicle{
        @Override public void move() {
            IO.println("O carro está se movendo!");
        }
    }
    ```
    ```java
    // Main.java
    void main() {
        Vehicle v = new Vehicle();
        Vehicle c = new Car();  // Polimorfismo: referência do tipo Vehicle, objeto Car
    
        v.move(); // "Movendo!"
        c.move(); // "O carro está se movendo!"
    }
    
    ```


* Interface (implements):
    - Define apenas os métodos, sem implementação, ou seja, as subclasses são responsáveis pela implementação.
    - Toda classe que implementar uma interface deve fornecer uma implementação para todos os métodos definidos nela, ou seja, precisa escrever o código que define o comportamento de cada um desses métodos.
    - Uma classe pode implementar várias interfaces.
  
    ```java
    // Interface para veículos terrestres
    public interface Drivable{
          void drive();
    }
    ```
  
    ```java
    // Interface para veículos áereos
    public interface Flyable{
          void fly();
    }
    ```
  
    ```java
    // Interface para veículos aquáticos
    public interface Sailable{
          void sail();
    }
    ```
  
    ```java
      // Classe Vehicle implementa múltiplas interfaces
    public class Vehicle implements Drivable, Flyable, Sailable {
            public void drive(){IO.println("Dirigindo!");}
    
            public void fly(){IO.println("Voando!");}
            
            public void sail(){IO.println("Navegando!");}
    }
    ```
    
    ```java
    // Main.java
    void main(){
        Vehicle vehicle = new Vehicle();
        vehicle.drive(); // "Dirigindo!"
        vehicle.fly(); // "Voando!"
        vehicle.sail(); // "Navegando!" 
    }
    ```


