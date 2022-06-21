package applications;

import interfaces.Printable;

public class LambdasApplication {
    public static void main(String[] args){
        // Lambda means user defined function
        // Here we can define the implementation of print method of Printable interface.
        Printable printableImplementation1 = (suffix) -> "Meow " + suffix;
        System.out.println(printableImplementation1.print("!"));

        Printable printableImplementation2 = (suffix) -> "Meow " + suffix + " Meow " + suffix;
        System.out.println(printableImplementation2.print("!"));

    }

}
