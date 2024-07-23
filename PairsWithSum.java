import java.util.HashSet;

public class PairsWithSum {
    public static void findPairs(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Pairs with sum " + targetSum + ":");

        for (int num : arr) {
            int complement = targetSum - num;
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 5, 7, 8, 9, 1};
        int targetSum1 = 10;
        findPairs(arr1, targetSum1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int targetSum2 = 10;
        findPairs(arr2, targetSum2);
    }
}
