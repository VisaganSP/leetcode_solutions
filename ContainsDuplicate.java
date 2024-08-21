import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    // time complexity of this approach is O(n^2)
    public static boolean containsDuplicateBruteForceMethod(int[] nums) {
        int total = nums.length;

        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // time complexity of this approach is O(n log n)
    public static boolean containsDuplicateSortingMethod(int[] nums) {
        Arrays.sort(nums);
        int total = nums.length;

        for (int i = 1; i < total; i++)
            if (nums[i] == nums[i - 1])
                return true;

        return false;
    }

    // time complexity of this approach is O(n)
    public static boolean containsDuplicateHashSetMethod(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int total = nums.length;

        for (int i = 0; i < total; i++) {
            if (seen.contains(nums[i]))
                return true;

            seen.add(nums[i]);
        }
        return false;
    }

    // time complexity of this approach is O(n)
    public static boolean containsDuplicateHashMapMethod(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;

            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testCase1 = { 1, 2, 3, 1 };
        int[] testCase2 = { 1, 2, 3, 4 };
        int[] testCase3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println("METHOD1 TestCase1: " + containsDuplicateBruteForceMethod(testCase1));
        System.out.println("METHOD1 TestCase2: " + containsDuplicateBruteForceMethod(testCase2));
        System.out.println("METHOD1 TestCase3: " + containsDuplicateBruteForceMethod(testCase3));
        System.out.println();
        System.out.println("METHOD2 TestCase1: " + containsDuplicateSortingMethod(testCase1));
        System.out.println("METHOD2 TestCase2: " + containsDuplicateSortingMethod(testCase2));
        System.out.println("METHOD2 TestCase3: " + containsDuplicateSortingMethod(testCase3));
        System.out.println();
        System.out.println("METHOD3 TestCase1: " + containsDuplicateHashSetMethod(testCase1));
        System.out.println("METHOD3 TestCase2: " + containsDuplicateHashSetMethod(testCase2));
        System.out.println("METHOD3 TestCase3: " + containsDuplicateHashSetMethod(testCase3));
        System.out.println();
        System.out.println("METHOD4 TestCase1: " + containsDuplicateHashMapMethod(testCase1));
        System.out.println("METHOD4 TestCase2: " + containsDuplicateHashMapMethod(testCase2));
        System.out.println("METHOD4 TestCase3: " + containsDuplicateHashMapMethod(testCase3));
    }
}