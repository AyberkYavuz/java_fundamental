package applications;
import sourcepackage.Printer;

import java.util.ArrayList;
import java.util.List;

import sourcepackage.Cat;

public class GenericsApplication {
    public static void main(String[] args){
        // Take a look at Printer Class
        System.out.println("Printer Operations");
        Printer<Integer> integerPrinter = new Printer<>(3);
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(3.5);
        doublePrinter.print();

        // ArrayList is a good example of Generics.
        ArrayList<Cat> catArrayList = new ArrayList<>();
        Cat cat1 = new Cat(1, "AY Cat");
        Cat cat2 = new Cat(11, "Mişka");
        catArrayList.add(cat1);
        catArrayList.add(cat2);

        // take a look at shout methods below.
        System.out.println("shout1 calls");
        shout1("Ayberk");
        shout1(3);
        shout1(cat1);

        System.out.println("shout2 calls");
        shout2(3, cat1);

        System.out.println("printList calls");
        printList(catArrayList);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        printList(intArrayList);

    }

    private static <T> void shout1(T thingToShout){
        System.out.println(thingToShout + "!!!");
    }

    private static <T, V> void shout2(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }

    // ?: widcard (unknown)
    // It means that hey Java i've got this method here and i want it to be able to take in a list
    // of anything but i don't know what it is going to be a list of
    private static void printList(List<?> myList){
        for (Object o : myList) {
            System.out.println(o);
        }
    }
}
