public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int total = 0, leftTotal = 0, rightTotal = 0;

        // Getting the total
        for (int i = 0; i < nums.length; i++)
            total += nums[i];

        // Checking for the pivot index, if found return the index, else return -1
        for (int i = 0; i < nums.length; i++) {
            rightTotal = total - leftTotal - nums[i];

            if (rightTotal == leftTotal)
                return i;

            leftTotal += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 7, 3, 6, 5, 6 };
        int[] nums2 = { 1, 2, 3 };
        int[] nums3 = { 2, 1, -1 };

        System.out.println(pivotIndex(nums1));
        System.out.println(pivotIndex(nums2));
        System.out.println(pivotIndex(nums3));
    }
}
