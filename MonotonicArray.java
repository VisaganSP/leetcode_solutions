public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] > nums[index + 1])
                isIncreasing = false;

            if (nums[index] < nums[index + 1])
                isDecreasing = false;
        }
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        // * true case
        int[] nums1 = { 1, 2, 2, 3 };
        // * true case
        int[] nums2 = { 6, 5, 4, 4 };
        // * false case
        int[] nums3 = { 1, 3, 2 };

        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
        System.out.println(isMonotonic(nums3));
    }
}
