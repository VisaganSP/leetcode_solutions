public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        // System.out.println("Array at last: ");
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        // System.out.println();
        return index;
    }

    public static void main(String[] args) {
        int[] testCase1 = {3, 2, 2, 3};
        int[] testCase2 = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println("TEST CASE 1: Length of the array removal of given element is " + removeElement(testCase1, 3));
        System.out.println("TEST CASE 2: Length of the array removal of given element is " + removeElement(testCase2, 2));
    }
}