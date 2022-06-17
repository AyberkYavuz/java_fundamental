package subjects;

public class Cat extends Animal implements MakingSound{

    public Cat(int age, String name) {
        super(age, name);
    }

    public void setAge(int age){
        super.setAge(age);
    }

    public int getAge(){
        return super.getAge();
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
        return super.getName();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Meowww Meowww");
    }
}
