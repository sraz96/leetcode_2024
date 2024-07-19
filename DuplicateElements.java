import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "orange", "apple", "pear"};
        String[] arr2 = {"apple", "grape", "banana", "kiwi", "pear"};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<String> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<String> duplicates = new HashSet<>(set1);
        duplicates.retainAll(set2);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements in both arrays: " + duplicates);
        }
    }
}
