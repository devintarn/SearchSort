/*
 * Author: Devin Tran
 * Purpose: A library that contains several searches and sorts
 * Date of Creation: December 20th, 2023
 */

public class SSLib {

    /** Method Name: selectionSort
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Sorts array using selection sort
     * @Parameters array - array to be sorted
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static void selectionSort(int[] array) {
        int arraySize = array.length; // the size of the array
        for (int i = 0; i < arraySize - 1; i++) {
            int minIndex = i; // the minimum index in the array
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex]; // temp variable for swapping
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /** Method Name: selectionSort
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Sorts array using selection sort
     * @Parameters array - array to be sorted
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static void selectionSort(String[] array) {
        int arraySize = array.length; // the size of the array
        for (int i = 0; i < arraySize - 1; i++) {
            int minIndex = i; // the minimum index in the array
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = array[minIndex]; // temp variable for swapping
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /** Method Name: quickSort
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Sorts array using quick sort
     * @Parameters array - array to be sorted, low - lowest index in array, high - highest index in arra
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, low, high); // the partition of the array
            quickSort(array, low, partition - 1);
            quickSort(array, partition + 1, high);
        }
    }

    /** Method Name: quickSort
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Sorts array using quick sort
     * @Parameters array - array to be sorted, low - lowest index in array, high - highest index in array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, low, high); // the partition of the array
            quickSort(array, low, partition - 1);
            quickSort(array, partition + 1, high);
        }
    }

    /** Method Name: partition
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Partitions the array for quicksort
     * @Parameters array - array to be sorted, low - lowest index in array, high - highest index in array
     * @Returns Index of the pivot, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // the pivot point
        int i = low - 1; // the smallest element in the array
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i]; // temp variable for swapping
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1]; // temp variable for swapping
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    /** Method Name: partition
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Partitions the array for quicksort
     * @Parameters array - array to be sorted, low - lowest index in array, high - highest index in array
     * @Returns Index of the pivot, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static int partition(String[] array, int low, int high) {
        String pivot = array[high]; // the pivot point
        int i = low - 1; // the smallest element in the array
        for (int j = low; j < high; j++) {
            if (!(array[j].compareTo(pivot) > 0)) {
                i++;
                String temp = array[i]; // temp variable for swapping
                array[i] = array[j];
                array[j] = temp;
            }
        }
        String temp = array[i + 1]; // temp variable for swapping
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    /** Method Name: mergeSort
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Runs merge sort on array
     * @Parameters array - array to be sorted, left - left most point of array, right - right most point of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // the middle index
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    /** Method Name: mergeSort
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Runs merge sort on array
     * @Parameters array - array to be sorted, left - left most point of array, right - right most point of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static void mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // the middle index
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    /** Method Name: merge
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Makes sub arrays in merge sort and sorts them
     * @Parameters array - array to be sorted, left - left most point of array, middle - the middle index of the array,right - right most point of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static void merge(int[] array, int left, int middle, int right) {
        int sizeLeft = middle - left + 1; // the size of the left sub array
        int sizeRight = right - middle; // the size of the right sub array
        int[] leftArray = new int[sizeLeft]; // the left subarray
        int[] rightArray = new int[sizeRight]; // the right subarray
        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < sizeRight; i++) {
            rightArray[i] = array[middle + 1 + i];
        }
        int i = 0, j = 0; // indexes of the first and second sub arrays
        int k = left; // index of the merged sub array
        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < sizeLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < sizeRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /** Method Name: merge
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Makes sub arrays in merge sort and sorts them
     * @Parameters array - array to be sorted, left - left most point of array, middle - the middle index of the array,right - right most point of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static void merge(String[] array, int left, int middle, int right) {
        int sizeLeft = middle - left + 1; // the size of the left sub array
        int sizeRight = right - middle; // the size of the right sub array
        String[] leftArray = new String[sizeLeft]; // the left subarray
        String[] rightArray = new String[sizeRight]; // the right subarray
        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < sizeRight; i++) {
            rightArray[i] = array[middle + 1 + i];
        }
        int i = 0, j = 0; // indexes of the first and second sub arrays
        int k = left; // index of the merged sub array
        while (i < sizeLeft && j < sizeRight) {
            if (!(leftArray[i].compareTo(rightArray[j]) > 0)) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < sizeLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < sizeRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /** Method Name: sequentialSearch
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Searches for an element using sequential search
     * @Parameters array - array to be searched, target - target being looked for
     * @Returns Index of the target, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == target) {
                return i;
            }
        } return -1;
    }

    /** Method Name: sequentialSearch
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Searches for an element using sequential search
     * @Parameters array - array to be searched, target - target being looked for
     * @Returns Index of the target, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static int sequentialSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        } return -1;
    }

    /** Method Name: binarySearch
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Searches for an element using binary search
     * @Parameters array - array to be searched, left - left index of the array, right - right index of the array, target - target being looked for
     * @Returns Index of the target, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static int binarySearch(int[] array, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2; // the middle index
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                return binarySearch(array, left, mid - 1, target);
            } return binarySearch(array, mid + 1, right, target);
        } return -1;
    }

    /** Method Name: binarySearch
     * @Author Devin Tran
     * @Date December 20th, 2023
     * @Modified December 20th, 2023
     * @Description Searches for an element using binary search
     * @Parameters array - array to be searched, left - left index of the array, right - right index of the array, target - target being looked for
     * @Returns Index of the target, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public static int binarySearch(String[] array, int left, int right, String target) {
        if (right >= left) {
            int mid = left + (right - left) / 2; // the middle index
            if (array[mid].equals(target)) {
                return mid;
            }
            if (array[mid].compareTo(target) < 0) {
                return binarySearch(array, left, mid - 1, target);
            } return binarySearch(array, mid + 1, right, target);
        } return -1;
    }
}
