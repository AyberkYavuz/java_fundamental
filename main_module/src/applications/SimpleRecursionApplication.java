package applications;

public class SimpleRecursionApplication {

    public static void main(String[] args) {
        sayHi(4);
    }

    private static void sayHi(int count){
        System.out.println("Hi!");
        // In recursion, you need to have an exit strategy in order not to get infinite loop exception.
        if(count <= 1){
            return;
        }
        // recursion means method calling itself.
        sayHi(count - 1);
    }
}
