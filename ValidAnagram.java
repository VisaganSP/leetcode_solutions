import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), 1);
            } else {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
        }
        // System.out.println(sMap);

        for (int i = 0; i < t.length(); i++) {
            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), 1);
            } else {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
        }

        // System.out.println(tMap);

        return sMap.equals(tMap);
    }

    public static boolean isAnagramUsingSorting(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static boolean isAnagramUsingOneHashMapMethod(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";
        String s3 = "danger", t3 = "garden";
        String s4 = "nameless", t4 = "salesmen";

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
        System.out.println(isAnagram(s3, t3));
        System.out.println(isAnagram(s4, t4));

        System.out.println();

        System.out.println(isAnagramUsingSorting(s1, t1));
        System.out.println(isAnagramUsingSorting(s2, t2));
        System.out.println(isAnagramUsingSorting(s3, t3));
        System.out.println(isAnagramUsingSorting(s4, t4));

        System.out.println();

        System.out.println(isAnagramUsingOneHashMapMethod(s1, t1));
        System.out.println(isAnagramUsingOneHashMapMethod(s2, t2));
        System.out.println(isAnagramUsingOneHashMapMethod(s3, t3));
        System.out.println(isAnagramUsingOneHashMapMethod(s4, t4));
    }
}
