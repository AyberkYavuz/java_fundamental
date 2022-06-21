package applications;

import objectoriented.Employee;
import datastructres.HashMapHandler;


public class HashMapApplication {

    public static void main(String[] args){
        // The Map is an interface in Java used to map the key-pair values. It is used to insert, update, remove the elements.
        // Whereas the HashMap is a class of Java collection framework.

        // The Map interface can be implemented by using the implementing class. Consider the below example:

        Employee employee1 = new Employee("Ayberk", "Yavuz", "ML Engineer");
        Employee employee2 = new Employee("Selin", "Perk", "Operational Specialist");
        Employee employee3 = new Employee("Yağmur Ezgi", "Tuna", "Demand Planner");


        HashMapHandler hashMapHandler = new HashMapHandler();
        hashMapHandler.addItem(1, employee1);
        hashMapHandler.addItem(2, employee2);
        hashMapHandler.addItem(3, employee3);

        hashMapHandler.showItems();
    }


}
