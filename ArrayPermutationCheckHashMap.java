import java.util.HashMap;
import java.util.Map;

public class ArrayPermutationCheckHashMap {
    public static boolean arePermutations(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> frequencyMap1 = new HashMap<>();
        for (int num : arr1) {
            frequencyMap1.put(num, frequencyMap1.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> frequencyMap2 = new HashMap<>();
        for (int num : arr2) {
            frequencyMap2.put(num, frequencyMap2.getOrDefault(num, 0) + 1);
        }

        return frequencyMap1.equals(frequencyMap2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        System.out.println("Are arrays permutations of each other? " + arePermutations(arr1, arr2));

        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {4, 3, 2, 2};
        System.out.println("Are arrays permutations of each other? " + arePermutations(arr3, arr4));
    }
}
