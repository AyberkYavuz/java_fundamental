package sourcepackage;

public class Dog extends Animal implements MakingSound, Eating{

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    @RunImmediately(times = 3)
    public void makeSound() {
        System.out.println("Wof Wof Wof");
    }

    @Override
    public void eat() {
        System.out.println("Ham Ham Ham Ham");
    }
}
