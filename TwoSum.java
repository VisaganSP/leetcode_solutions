import java.util.HashMap;

public class TwoSum {

    // Time complexity - O(n2)
    public static int[] twoSumBruteForceApproach(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };

        return new int[] {};
    }

    // Time complexity - O(n)
    public static int[] twoSumHashMapApproach(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = (Integer) (target - nums[i]);

            if (numsMap.containsKey(requiredNum))
                return new int[] { numsMap.get(requiredNum), i };

            numsMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void printResultArr(int[] resultArr, int testCaseNum) {
        System.out.print("TEST CASE " + testCaseNum + ": Resultant Two Sum Array: ");

        for (int i = 0; i < resultArr.length; i++)
            System.out.print(resultArr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] testCase1 = { 2, 7, 11, 15 };
        int[] testCase2 = { 3, 2, 4 };
        int[] testCase3 = { 3, 3 };

        int target1 = 9, target2 = 6;

        System.out.println("=================BRUTE FORCE APPROACH=================");
        printResultArr(twoSumBruteForceApproach(testCase1, target1), 1);
        printResultArr(twoSumBruteForceApproach(testCase2, target2), 2);
        printResultArr(twoSumBruteForceApproach(testCase3, target2), 3);

        System.out.println("=================HASH MAP APPROACH=================");
        printResultArr(twoSumHashMapApproach(testCase1, target1), 1);
        printResultArr(twoSumHashMapApproach(testCase2, target2), 2);
        printResultArr(twoSumHashMapApproach(testCase3, target2), 3);
    }
}
