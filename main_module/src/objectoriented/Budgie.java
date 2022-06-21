package objectoriented;

public class Budgie extends Bird{

    public Budgie(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("şü şü şü şü");
    }

    // method overloading
    // the same method name (makeSound) with the parent class. But, different parameters.
    public void makeSound(int numberOfTimes){
        for(int i=0; i<= numberOfTimes; i++){
            System.out.println("şü şü şü şü");
        }
    }

    public void bounce(){
        System.out.println("I am bouncing!");
    }
}
