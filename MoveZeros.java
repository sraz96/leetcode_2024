public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 1, 2};
        moveZerosToEnd(arr1);
        System.out.println(java.util.Arrays.toString(arr1)); 

        int[] arr2 = {2, 1, 0, 0, 3, 4};
        moveZerosToEnd(arr2);
        System.out.println(java.util.Arrays.toString(arr2)); 
    }
}
