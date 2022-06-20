package applications;
import java.util.Scanner;
import sourcepackage.FibonacciHandler;

public class RecursiveFibonacciApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n term: ");

        String nString = input.nextLine();

        try{
            int n = Integer.parseInt(nString);
            if(n > 92){
                System.out.println("You should not enter the number bigger than 92 because of the limitation of long data type!");
            }
            else{
                FibonacciHandler fibonacciHandler = new FibonacciHandler(n);
                fibonacciHandler.displayFibonacciNumbers();
            }

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
