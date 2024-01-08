/*
 * Author: Devin Tran
 * Purpose: A library that contains several searches and sorts
 * Date of Creation: December 20th, 2023
 */

public class SSLib {

    public void selectionSort(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, low, high);

            // Recursively sort the elements before and after the partition index
            quickSort(array, low, partition - 1);
            quickSort(array, partition + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (put the pivot element in its correct position)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    public static void mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
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

    public static void merge(String[] array, int left, int middle, int right) {
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

    public static int sequentialSort(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if(array[i] == target) {
                return i;
            }
        } return -1;
    }

    public static int sequentialSort(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        } return -1;
    }

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
