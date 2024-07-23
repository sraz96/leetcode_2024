import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        // Use a LinkedHashSet to maintain the insertion order
        Set<Integer> set = new LinkedHashSet<>();
        
        // Add elements to the set (duplicates will be ignored)
        for (int num : nums) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 2, 4, 5};
        int[] result1 = removeDuplicates(arr1);
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Array after removing duplicates: " + Arrays.toString(result1));

        int[] arr2 = {1, 1, 1, 1, 1};
        int[] result2 = removeDuplicates(arr2);
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Array after removing duplicates: " + Arrays.toString(result2));
    }
}
