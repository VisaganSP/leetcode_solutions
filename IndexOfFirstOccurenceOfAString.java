public class IndexOfFirstOccurenceOfAString {

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            System.out.println("Index: " + i);
            if (haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        String haystack3 = "hellovisagan";
        String needle3 = "visagan";

        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
    }
}
