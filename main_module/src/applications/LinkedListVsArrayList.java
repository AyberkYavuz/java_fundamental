package applications;

import subjects.LinkedListHandler;
import subjects.ArrayListHandler;

public class LinkedListVsArrayList {

    public static void main(String[] args){
        // Both LinkedList and ArrayList implement List Interface

        // Please look at LinkedList.png
        // In LinkedList Data Structure, each node has a reference to next and prev node.
        LinkedListHandler linkedListHandler = new LinkedListHandler();
        linkedListHandler.addStringItem("Hello");
        linkedListHandler.addStringItem("Java");
        linkedListHandler.addStringItem("World");

        // Accessing elements in LinkedList is slower than accessing elements in ArrayList. Because, to get an element
        // in a LinkedList, you will iterate the nodes.
        System.out.println("LinkedList item: " + linkedListHandler.getStringItem(1));

        // When you add a new item to LinkedList, only references of the nodes change. Therefore, adding new item is faster
        // than ArrayList
        linkedListHandler.addStringItemByIndex(1, "Spring");

        // adding and removing elements in LinkedList is faster than ArrayList because of its structure. But, accessing
        // elements in ArrayList is faster than LinkedList

        // When you declare an array. It has a fixed size (3)
        String[] stringArray = new String[3];
        stringArray[0] = "Hello";
        stringArray[1] = "Java";
        stringArray[2] = "World";

        // When you declare an ArrayList, you can dynamically add new items.
        ArrayListHandler arrayListHandler = new ArrayListHandler();
        arrayListHandler.addStringItem("Hello");
        arrayListHandler.addStringItem("Java");
        arrayListHandler.addStringItem("World");

        // Accessing elements in ArrayList is faster than accessing elements in LinkedList
        System.out.println("ArrayList item: " + arrayListHandler.getStringItem(1));

        // {"Hello", "Java", "World"} array 1
        // copying array 1 to array 2 and add new item ("Spring")
        // {"Hello", "Spring" ,"Java", "World"}
        // Because of that reason, adding new item is slower than LinkedList
        arrayListHandler.addStringItemByIndex(1, "Spring");



    }
}
