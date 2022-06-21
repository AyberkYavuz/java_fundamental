package interfaces;
// When you use an interface with lambdas, you should define FunctionalInterface annotation.
// When you define FunctionalInterface annotation, you mean that Interface can only have one abstract method.
// In lambdas, you cannot use an interface having more than one abstract method.
@FunctionalInterface
public interface Printable {
    String print(String suffix);
}
