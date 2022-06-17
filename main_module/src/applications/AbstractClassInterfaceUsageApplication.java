package applications;

import sourcepackage.Cat;
import sourcepackage.Dog;

public class AbstractClassInterfaceUsageApplication {

    public static void main(String[] args){
        // You cannot create objects using Abstract Classes
        // try to create an object Animal
        // throws an error
        // Animal animal = new Animal();

        // An abstract class can have both the regular methods and abstract methods.

        // Sub class Cat only extends one Abstract Class. But it can implements many Interfaces.
        // Sub class - Abstract Class: 1 to 1
        // Sub class - Interface: 1 to Many
        Cat cat = new Cat(1, "Kereviz");
        System.out.println(cat.toString());

        cat.setAge(2);
        cat.setName("Yumi");
        System.out.println(cat.toString());

        cat.makeSound();

        Dog dog = new Dog(1, "Zeyna");
        System.out.println(dog.toString());

        dog.setAge(3);
        dog.setName("Bully");
        System.out.println(dog.toString());

        dog.makeSound();
        dog.eat();


    }

}
