package sourcepackage;

public class Raven extends Bird {

    public Raven(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gak gak gak");
    }

    public void observePeople(){
        System.out.println("I am observing people around me!");
    }
}
