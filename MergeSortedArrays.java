import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = merge(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6};
        int[] mergedArray2 = merge(arr3, arr4);
        System.out.println("Merged array: " + Arrays.toString(mergedArray2));
    }
}
