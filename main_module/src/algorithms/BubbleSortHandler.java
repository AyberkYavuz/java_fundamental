package algorithms;

public class BubbleSortHandler {
    private int[] numbersArray;

    public BubbleSortHandler(int[] numbersArray) {
        if(numbersArray.length == 0){
            throw new IllegalArgumentException("numbersArray length cannot be 0!");
        }
        this.numbersArray = numbersArray;
    }

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
