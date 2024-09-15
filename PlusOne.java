public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void printPlusOneArray(int[] digits) {
        for (int i = 0; i < digits.length; i++)
            System.out.print(digits[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] digits1 = { 1, 2, 3 };
        int[] digits2 = { 4, 3, 2, 1 };
        int[] digits3 = { 9 };
        int[] digits4 = { 9, 9 };

        printPlusOneArray(plusOne(digits1));
        printPlusOneArray(plusOne(digits2));
        printPlusOneArray(plusOne(digits3));
        printPlusOneArray(plusOne(digits4));
    }
}