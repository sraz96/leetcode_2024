import java.util.Arrays;

public class KthSmallestElement {
    public static int findKthSmallest(int[] nums, int k) {
        if (k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("k is out of bounds");
        }

        Arrays.sort(nums);
        return nums[k - 1];   
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println(k1 + "rd smallest element is " + findKthSmallest(arr1, k1));

        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 4;
        System.out.println(k2 + "th smallest element is " + findKthSmallest(arr2, k2));
    }
}
