public class ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;
        boolean isNegative = false;

        if (x < 0) {
            x *= -1;
            isNegative = true;
        }

        while (x > 0) {
            int remainder = x % 10;

            if (reverse > (Integer.MAX_VALUE - remainder) / 10)
                return 0;

            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        return isNegative ? reverse * -1 : reverse;
    }

    public static void main(String[] args) {
        int num1 = 123;
        int num2 = -123;
        int num3 = 120;

        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
        System.out.println(reverse(num3));
    }
}
