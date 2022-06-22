package applications;

import objectoriented.Bird;
import objectoriented.Budgie;
import objectoriented.Raven;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class IteratorApplication {
    public static void main(String[] args){
        // Please take a look at UpCastingDownCastingApplication First

        Bird bird = new Bird("Serçecik");

        Budgie budgie = new Budgie("Boncuk");

        Raven raven = new Raven("Messenger");

        ArrayList<Bird> birdArrayList = new ArrayList<>();
        birdArrayList.add(bird);
        birdArrayList.add(budgie);
        birdArrayList.add(raven);

        /*
        Often, you will want to cycle through the elements in a collection.
        For example, you might want to display each element.
        The easiest way to do this is to employ an iterator,
        which is an object that implements either the Iterator or the ListIterator interface.

        Iterator enables you to cycle through a collection, obtaining or removing elements.
        ListIterator extends Iterator to allow bidirectional traversal of a list,
        and the modification of elements.

        Before you can access a collection through an iterator, you must obtain one.
        Each of the collection classes provides an iterator( ) method that returns an iterator to the start of the collection.
        By using this iterator object, you can access each element in the collection, one element at a time.
        */

        iteratorExample(birdArrayList);

        System.out.println("ListIterator Example");
        ListIterator<Bird> birdListIterator = birdArrayList.listIterator();
        Raven raven2 = new Raven("Messenger 2");
        birdListIterator.add(raven2); // raven2 will be added to birdArrayList
        while (birdListIterator.hasNext()){
            Bird birdTemp = birdListIterator.next();
            birdTemp.makeSound();
        }

    }

    private static void iteratorExample(ArrayList<Bird> birdArrayList){
        System.out.println("Iterator Example");
        Iterator<Bird> birdIterator = birdArrayList.iterator();

        while (birdIterator.hasNext()){
            Bird birdTemp = birdIterator.next();
            birdTemp.makeSound(); // Up Casting
            // Down Casting
            if(birdTemp instanceof Budgie){
                Budgie budgieTemp = (Budgie) birdTemp;
                budgieTemp.bounce();
            }
            else if(birdTemp instanceof Raven){
                Raven ravenTemp = (Raven) birdTemp;
                ravenTemp.observePeople();
            }
        }
    }
}
