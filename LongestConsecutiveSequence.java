import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSequence(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) { 
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + findLongestConsecutiveSequence(arr1));

        int[] arr2 = {1, 9, 3, 10, 4, 20, 2};
        System.out.println("Longest consecutive sequence length: " + findLongestConsecutiveSequence(arr2));
    }
}
