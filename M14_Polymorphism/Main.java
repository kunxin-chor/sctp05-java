package M14_Polymorphism;
import java.util.Random;
import java.util.ArrayList;

// Imagine we doing a animal farm game where animals walk around on a farm
// and when you click on them they will make a noise
class Animal {
  public void speak() {
    System.out.println("<Generic Animal Noise>");
  }

  public void move() {
    System.out.println("<Generic Animal walk>");
  }
}

class Dog extends Animal {
    // Overriden
    public void speak() {
        System.out.println("Woof!");
    }
}

class  Cat extends Animal {
    // Overriden
    public void speak() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        d.move();

        Cat c = new Cat();
        c.speak();

        Animal a = new Animal();
        System.out.print("a.speak = ");
        a.speak(); // other children classes also have their own version speak()
                   // then Java will do polymorphism

        // 1. A variable of the parent class
        //can store an object of a child class
        // A MORE GENERIC VARIABLE CAN STORE A 
        // MORE SPECIFIC OBJECT
        Animal a2 = new Dog();
        a2.speak();  // <-- POLYMORPHISM
                     // when there at least one child class with the same method
                    // Java will wait till the code is run to decide which one is called
                    // depending on the SPECIFIC type of object it contains
 
  
        Animal a3;
        Random r = new Random();
        if (r.nextInt(1) == 0) {
            a3 = new Dog();
        } else {
            a3 = new Cat();
        }
        a3.speak();  // Java has no idea which version of speak() to  until
                     // this exact point in running the code

        // polymorphism happens when those two cases are met
        // 1. the variable data type is that type of a parent class (i.e has children)
        // 2. it calls a method that the children classes also have implemented (or have copies)
        //   --> overriden
        // don't confused with overloaded
        // overloaded = SAME CLASS SAME METHOD NAME DIFFERENT PARAMETERS
        // overriden = DIFFERENT CLASS SAME METHOD NAME SAME PARAMETERS

        // How can I have an array list that stores both cats and dogs
        ArrayList<Cat> cats = new ArrayList<>();
        //cats.add(new Dog()); // A dog is not a cat
        ArrayList<Dog> dogs = new ArrayList<>();
        // dogs.add(new Animal() // cannot -- animal is more generic than dog

        // Since ArrayList stores objects of Animal data type
        // it can also store objects of any child class of Animal
        ArrayList<Animal> farm = new ArrayList<>();
        farm.add(new Dog());
        farm.add(new Cat());
        farm.add(new Dog());

        for (Animal i : farm) {
            i.speak();
            i.move(); // <-- Java will know to call Animal's mvoe method at the time of compliation
        }

     }
}
