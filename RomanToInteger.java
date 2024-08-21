import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String example1 = "III";
        String example2 = "LVIII";
        String example3 = "MCMXCIV";

        System.out.println("Roman: " + example1 + ", Integer: " + romanToInt(example1));
        System.out.println("Roman: " + example2 + ", Integer: " + romanToInt(example2));
        System.out.println("Roman: " + example3 + ", Integer: " + romanToInt(example3));
    }

    static public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // for (Map.Entry<Character, Integer> m : map.entrySet()) {
        // System.out.println(m.getKey() + " " + m.getValue());
        // }

        int result = map.get(s.charAt(s.length() - 1));
        for (int letter = s.length() - 2; letter >= 0; letter--) {
            if (map.get(s.charAt(letter)) < map.get(s.charAt(letter + 1))) {
                result -= map.get(s.charAt(letter));
            } else {
                result += map.get(s.charAt(letter));
            }
        }

        return result;
    }
}
