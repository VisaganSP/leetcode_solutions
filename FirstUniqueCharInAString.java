import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInAString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char letter : s.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        int ans = -1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                char uniq = entry.getKey();
                int index = s.indexOf(uniq);

                if (ans == -1 || index < ans) {
                    ans = index;
                }
            }
        }

        return ans;
    }

    public static int firstUniqCharOptimized(String s) {
        char[] arr = s.toCharArray();
        int[] cnt = new int[123];

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            System.out.println(index);
            cnt[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            if (cnt[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        // System.out.println(firstUniqChar(s1));
        // System.out.println(firstUniqChar(s2));
        // System.out.println(firstUniqChar(s3));

        System.out.println(firstUniqCharOptimized(s1));
        System.out.println(firstUniqCharOptimized(s2));
        System.out.println(firstUniqCharOptimized(s3));
    }
}
