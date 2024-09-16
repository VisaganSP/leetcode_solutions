public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama"; // true
        String s2 = "race a car"; // false
        String s3 = " "; // true
        String s4 = "malayalam"; // true
        String s5 = "madam"; // true
        String s6 = "0P"; // false
        String s7 = "a"; // true

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
        System.out.println(isPalindrome(s5));
        System.out.println(isPalindrome(s6));
        System.out.println(isPalindrome(s7));
    }
}
