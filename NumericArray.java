import java.util.Arrays;

public class NumericArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 87, 5,3};
        
        System.out.println("Original Array :" + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Sorted arrays :" + Arrays.toString(arr));
    }
    
}
