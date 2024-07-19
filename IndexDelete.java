import java.util.Arrays;

public class IndexDelete {
    public static void main(String[] args) {
        int numbers[] = {23, 34, 54, 2, 23, 34, 56, 67, 78};
        int valSearch = 2;

        System.out.println("Original array: " + Arrays.toString(numbers));
        int index = search(numbers, valSearch);

        if (index != -1) {
            System.out.println("Value " + valSearch + " found at index " + index);
            numbers = delete(numbers, index);
            System.out.println("Array after deletion: " + Arrays.toString(numbers));
        } else {
            System.out.println("Value " + valSearch + " not found");
        }
    }

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] delete(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return array;
        }

        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
}
