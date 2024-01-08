import java.util.*;
public class Main {

    private static void printArray(int[] array){
        int num;
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 10; j++){
                num = array[i];
                System.out.print("\t" + num);
            }
            System.out.println();
        }
    }

    private static int[] createRandomArray(Random random){
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100000) + 1;
        }return array;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int test[] = createRandomArray(random);
        printArray(test);

    }
}