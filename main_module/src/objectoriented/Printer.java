package objectoriented;

// Generics are used for preventing the code duplication.
// T stands for type of the object.
public class Printer <T>{
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}
