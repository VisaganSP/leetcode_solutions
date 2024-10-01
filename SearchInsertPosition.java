public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return mid + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };

        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 8;
        int target5 = 4;

        System.out.println(searchInsert(nums, target1));
        System.out.println(searchInsert(nums, target2));
        System.out.println(searchInsert(nums, target3));
        System.out.println(searchInsert(nums, target4));
        System.out.println(searchInsert(nums, target5));
    }
}
