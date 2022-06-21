package applications;

import objectoriented.Bird;
import objectoriented.Budgie;
import objectoriented.Raven;

public class PolyMorphismApplication {
    public static void main(String[] args){
        // Poly: Many
        // Morphism: Form
        // Overloading and overriding are exampples of poly morphism
        // Take a look at Bird, Budgie and Raven Classes
        Bird bird = new Bird("Serçecik");
        bird.makeSound();

        Budgie budgie = new Budgie("Boncuk");
        budgie.makeSound();

        Raven raven = new Raven("Messenger");
        raven.makeSound();

        budgie.makeSound(3);

    }

}
