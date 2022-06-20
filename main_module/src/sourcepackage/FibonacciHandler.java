package sourcepackage;

public class FibonacciHandler {
    // Example fibonacci nuumbers;
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    private int n;
    // fibonacciCach will be used for memoization
    // https://en.wikipedia.org/wiki/Memoization#:~:text=In%20computing%2C%20memoization%20or%20memoisation,the%20same%20inputs%20occur%20again.
    private long[] fibonacciCach;

    public FibonacciHandler(int n) {
        this.n = n;
        fibonacciCach = new long[this.n + 1];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        fibonacciCach = new long[this.n + 1];
    }

    public long fibonacci(int n){
        if(n <= 1){
          return n;
        }
        if(fibonacciCach[n] != 0){
            return fibonacciCach[n];
        }
        long nMinusOne = fibonacci(n - 1);
        long nMinusTwo = fibonacci(n - 2);
        long nthFibonacciNumber = nMinusOne + nMinusTwo;
        fibonacciCach[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }

    public void displayFibonacciNumbers(){
        for(int i=0; i <= this.n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }


}
