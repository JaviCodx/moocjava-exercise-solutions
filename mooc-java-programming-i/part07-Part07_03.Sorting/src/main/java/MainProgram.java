
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int counter = -1;

        for (int number : array) {
            counter++;
            if (number == smallest(array)) {
                return counter;
            }
        }

        return -1;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int startIndexforSubArray = startIndex;
        int[] subArray = new int[table.length - startIndex];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = table[startIndexforSubArray];
            startIndexforSubArray++;
        }
        return startIndex + indexOfSmallest(subArray);

    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }

    }

}
