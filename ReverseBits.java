public class ReverseBits {
    public static int reverseBitsUsingTwoPointers(int n) {
        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        char[] nToString = binaryString.toCharArray();

        int start = 0, end = nToString.length - 1;

        while (start < end) {
            char temp = nToString[start];
            nToString[start] = nToString[end];
            nToString[end] = temp;
            start++;
            end--;
        }

        System.out.println("Original Bit: " + n);
        System.out.println("Reversed Bit: " + new String(nToString));

        return Integer.parseUnsignedInt(new String(nToString), 2);
    }

    public static int reverseBitsInBuiltMethod(int n) {
        return Integer.reverse(n);
    }

    public static int reverseBits(int n) {
        // Reverse bits in the integer n
        int reversed = 0;

        for (int i = 0; i < 32; i++) {
            // Shift reversed to the left to make space for the next bit
            reversed <<= 1;
            // Add the least significant bit of n to reversed
            reversed |= (n & 1);
            // Shift n to the right to process the next bit
            n >>= 1;
        }

        return reversed; // Returning the reversed integer
    }

    public static void main(String[] args) {
        int n1 = 0b00000010100101000001111010011100;
        int n2 = 0b11111111111111111111111111111101;

        // System.out.println(Integer.toBinaryString(n1));
        // System.out.println(reverseBitsUsingTwoPointers(n1));
        // System.out.println(reverseBitsUsingTwoPointers(n2));
        System.out.println(reverseBitsInBuiltMethod(n1));
        System.out.println(reverseBitsInBuiltMethod(n2));
    }
}
