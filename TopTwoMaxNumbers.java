public class TopTwoMaxNumbers {
    public static void findTopTwoMaxNumbers(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        System.out.println("The top two maximum numbers are: " + max1 + " and " + max2);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 2, 4, 8};
        findTopTwoMaxNumbers(arr1);

        int[] arr2 = {12, 34, 56, 78, 90};
        findTopTwoMaxNumbers(arr2);

        int[] arr3 = {9, 1, 2, 3, 7, 6};
        findTopTwoMaxNumbers(arr3);
    }
}
