package algorithms;

public class BubbleSortHandler {
    private int[] numbersArray;

    public BubbleSortHandler(int[] numbersArray) {
        if(numbersArray.length == 0){
            throw new IllegalArgumentException("numbersArray length cannot be 0!");
        }
        this.numbersArray = numbersArray;
    }

    /*
    The bubble sort algorithm is a reliable sorting algorithm.
    This algorithm has a worst-case time complexity of O(n2).
    The bubble sort has a space complexity of O(1).
    The number of swaps in bubble sort equals the number of inversion pairs in the given array.
    When the array elements are few and the array is nearly sorted, bubble sort is effective and efficient.
    */
    public int[] bubbleSort(){
        boolean flag = true;
        while (flag){
            flag = false;
            for(int i=0; i < numbersArray.length - 1; i++){
                if(numbersArray[i] > numbersArray[i + 1]){
                    flag = true;
                    int temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i + 1];
                    numbersArray[i + 1] = temp;
                }
            }
        }
        return numbersArray;
    }
}
