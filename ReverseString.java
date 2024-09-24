public class ReverseString {
    public static void reverseString(char[] string) {
        int start = 0, end = string.length - 1;

        while (start < end) {
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;

            start++;
            end--;
        }

        for (char letter : string) {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] string1 = { 'h', 'e', 'l', 'l', 'o' };
        char[] string2 = { 'H', 'a', 'n', 'n', 'a', 'h' };

        reverseString(string1);
        reverseString(string2);
    }
}
