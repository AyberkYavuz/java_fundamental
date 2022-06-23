package applications;

import algorithms.BubbleSortHandler;

import java.util.Random;

public class SortingApplication {
    private static Random random = new Random();
    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers = initializeNumbers(numbers);
        System.out.println("Array");
        printArray(numbers);
        BubbleSortHandler bubbleSortHandler = new BubbleSortHandler(numbers);
        numbers = bubbleSortHandler.bubbleSort();
        System.out.println("Sorted Array");
        printArray(numbers);

    }

    private static int[] initializeNumbers(int numbers[]){
        for(int i=0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100000);
        }
        return numbers;
    }

    private static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
