import java.util.Map.Entry;
import java.util.HashMap;

public class SingleNumber {
    public static int singleNumberUsingHashMap(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int count = hashMap.containsKey(nums[i]) ? hashMap.get(nums[i]) : 0;

            hashMap.put(nums[i], count + 1);
        }

        for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        System.out.println(hashMap);
        return 0;
    }

    public static int singleNumberUsingXOR(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            answer ^= num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 2, 1 };
        int[] nums2 = { 4, 1, 2, 1, 2 };
        int[] nums3 = { 1 };

        System.out.println(singleNumberUsingHashMap(nums1));
        System.out.println(singleNumberUsingHashMap(nums2));
        System.out.println(singleNumberUsingHashMap(nums3));

        System.out.println(singleNumberUsingXOR(nums1));
        System.out.println(singleNumberUsingXOR(nums2));
        System.out.println(singleNumberUsingXOR(nums3));
    }
}
