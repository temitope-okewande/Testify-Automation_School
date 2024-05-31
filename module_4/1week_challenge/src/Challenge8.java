import java.util.Arrays;

public class Challenge8 {
    public static void main(String[] args) {
        // Generate a sample array of 1 million integers ranging between 1 and 9
        int[] array = generateRandomArray(1000000, 1, 9);

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Sort the array
        int[] sortedArray = countingSort(array, 1, 9);

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

    }
    public static int[] countingSort(int[] array, int min, int max) {
        int[] count = new int[max - min + 1];

        for (int num : array) {
            count[num - min]++;
        }

        int[] sortedArray = new int[array.length];
        int sortedIndex = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sortedArray[sortedIndex++] = i + min;
                count[i]--;
            }
        }

        return sortedArray;
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }


}
