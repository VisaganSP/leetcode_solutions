public class RotateArray {
    public static void rotateWithNSpace(int[] nums, int k) {
        // O(n) -> Space and Time Complexity
        int n = nums.length;
        int[] rotatedArray = new int[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotatedArray[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void rotateWith1Space(int[] nums, int k) {
        // O(n) -> Time Complexity
        // O(1) -> Space Complexity
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] nums2 = { -1, -100, 3, 99 };

        int k1 = 3, k2 = 2;

        // O(n) -> Time and Space Complexity
        rotateWithNSpace(nums1.clone(), k1);
        rotateWithNSpace(nums2.clone(), k2);

        // O(n) -> Time Complexity
        // O(1) -> Space Complexity
        rotateWith1Space(nums1, k1);
        rotateWith1Space(nums2, k2);
    }
}
