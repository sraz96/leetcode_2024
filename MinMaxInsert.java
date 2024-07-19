import java.util.Arrays;

public class MinMaxInsert {
    public static void main(String[] args) {
        int[] numbers = {23, 34, 54, 2, 23, 34, 56, 67, 78};
        int valueToInsert = 100;

        System.out.println("Original array: " + Arrays.toString(numbers));

        int minIndex = findMinIndex(numbers);
        int maxIndex = findMaxIndex(numbers);

        System.out.println("Minimum value: " + numbers[minIndex] + " at index " + minIndex);
        System.out.println("Maximum value: " + numbers[maxIndex] + " at index " + maxIndex);

        numbers = insertAfterIndex(numbers, minIndex, valueToInsert);
        maxIndex += 1; 
        numbers = insertAfterIndex(numbers, maxIndex, valueToInsert);

        System.out.println("Array after insertions: " + Arrays.toString(numbers));
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int[] insertAfterIndex(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index + 1) {
                newArray[i] = value;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }
}
