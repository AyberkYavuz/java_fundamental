package applications;

import objectoriented.Dog;
import annotations.RunImmediately;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomAnnotationUsageApplication {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // You should check the makeSound() method of Dog Class.
        // Command + Click  RunImmediately Annotatoin
        Dog myDog = new Dog(12, "Papsi");

        for(Method method : myDog.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately customAnnotation = method.getAnnotation(RunImmediately.class);
                for(int i=0; i < customAnnotation.times(); i++){
                    method.invoke(myDog);
                }
            }
        }
    }

}
