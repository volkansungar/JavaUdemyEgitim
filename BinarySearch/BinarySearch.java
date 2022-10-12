package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {-5,-10,7,3,82,5};
        selectionSort(numbers);
        printArray(numbers);
        int result = binarySearch(numbers, -5);
        System.out.println("result: "+result);

    }


    public static int binarySearch(int[] array, int searchedNumber){
        int indMin = 0;
        int indMax = array.length - 1;

        while(indMax >= indMin) {
            int mean = (indMin + indMax) / 2;
            if (array[mean] == searchedNumber) {
                return mean;
            }
            else if (array[mean] > searchedNumber)
                indMax = mean - 1;
            else if (array[mean] < searchedNumber)
                indMin = mean + 1;
        }
        return -1;
    }


    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int mSmall = array[i];
            int mSmallIndex = i;
            for(int j = i+1; j < array.length; j++){
                if(mSmall > array[j]){
                    mSmall = array[j];
                    mSmallIndex = j;
                }
            }
            if(mSmallIndex != i){
                array[mSmallIndex] = array[i];
                array[i] = mSmall;
            }
        }
    }


    public static void printArray(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }
}