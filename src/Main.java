import java.util.*;
public class Main {

    private static void compareTimes(int[] array){
        int sequentialSearchTime = 0;
        int binarySearchTime = 0;
        int selectionSortTime = 0;
        int quickSortTime = 0;
        int mergeSortTime = 0;
        int target = 0;
        for(int i = 0; i < 3; i++){
            sequentialSearchTime += getSequentialSearchTime(array,target)/3;
            binarySearchTime += getBinarySearchTime(array, target)/3;
            selectionSortTime += getSelectionSortTime(array)/3;
            quickSortTime += getQuickSortTime(array)/3;
            mergeSortTime += getMergeSortTime(array)/3;
        }
        int searchDifference = binarySearchTime/sequentialSearchTime;
        int selectionQuickDifference = selectionSortTime/quickSortTime;
        int
    }

    private static long getCurrentTime() { return System.nanoTime(); }

    private static long getSequentialSearchTime(int[] array, int target) {
        long currentTime = getCurrentTime(); // the current time
        SSLib.sequentialSearch(array, target);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    private static long getBinarySearchTime(int[] array, int target) {
        int[] newArray = Arrays.copyOf(array, array.length);
        SSLib.quickSort(newArray, 0, newArray.length - 1);
        long currentTime = getCurrentTime(); // the current time
        SSLib.binarySearch(newArray, 0, newArray.length - 1, target);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    private static long getSelectionSortTime(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        long currentTime = getCurrentTime(); // the current time
        SSLib.selectionSort(newArray);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    private static long getQuickSortTime(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        long currentTime = getCurrentTime(); // the current time
        SSLib.quickSort(newArray, 0, newArray.length - 1);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    private static long getMergeSortTime(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        long currentTime = getCurrentTime(); // the current time
        SSLib.mergeSort(newArray, 0, newArray.length - 1);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }


    /** Method Name: createRandomArray
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Creates an array of 100,000 elements(integers 1-100,000)
     * @Parameters The object to randomize the integers
     * @Returns The filled array of random integers, Data Type: int[]
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static int[] createRandomArray(Random random){
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100000) + 1;
        }return array;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int test[] = createRandomArray(random);


    }
}
