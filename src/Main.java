import java.util.*;
public class Main {

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