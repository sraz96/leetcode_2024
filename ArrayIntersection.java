import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add elements of the first array to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check elements of the second array in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] result1 = findIntersection(arr1, arr2);
        System.out.println("Intersection of arr1 and arr2: " + Arrays.toString(result1));

        int[] arr3 = {4, 9, 5};
        int[] arr4 = {9, 4, 9, 8, 4};
        int[] result2 = findIntersection(arr3, arr4);
        System.out.println("Intersection of arr3 and arr4: " + Arrays.toString(result2));
    }
}
