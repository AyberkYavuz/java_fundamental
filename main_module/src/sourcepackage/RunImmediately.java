package sourcepackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotations are kind of meta data (suplamental informatin) you can put in your Java code.
// They don't directly affect the code that you annotate but those annotations can be processed something else
// such as by the compiler or at run time with some code that you write yourself.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // you need to specify the type (method, class etc.). You can give more than 1 type in {}
public @interface RunImmediately {
    int times() default 1; // attribute of the annotation.
}
