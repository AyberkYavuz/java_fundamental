package applications;

import objectoriented.Bird;
import objectoriented.Budgie;
import objectoriented.Raven;

public class UpCastingDownCastingApplication {

    public static void main(String[] args) {
        System.out.println("Upcasting!");
        // Upcasting is always working! It happens automatically.
        // Upcasting means sub-class to super class casting
        // The code below means creating a Budgie object and casting to Bird object
        Bird bird1 = new Budgie("Boncuk");

        Bird bird2 = new Raven("Messenger");

        // You cannot call bounce() method because only Budgie class has this method. Bird object doesn't have it.
        // bird1.bounce();

        upCastingOperation(bird1);
        upCastingOperation(bird2);

        System.out.println("Down Casting!");
        Budgie myBudgie = new Budgie("Maviş");
        downCastingOperation(myBudgie);
        Raven myRaven = new Raven("Big Boy");
        downCastingOperation(myRaven);
    }

    public static void upCastingOperation(Bird bird){
        // This method takes a bird.
        // When you call this method, you can send a bird object.
        // But you can also send any object that is subtype of bird. It can be a budgie or a raven.
        // This method doesn't know and doesn't really care or need to know what type of bird
        // it's being called with
        // You can only use the methods of Bird object. You can't use the methods of subtypes of Bird.
        bird.makeSound();
    }

    public static void downCastingOperation(Bird bird){
        // Downcasting doesn't happen automatically.
        // So you have to do it explicitly
        if(bird instanceof Budgie){
            Budgie budgie = (Budgie) bird;
            budgie.bounce();
        }
        else if(bird instanceof Raven){
            Raven raven = (Raven) bird;
            raven.observePeople();
        }
    }
}
