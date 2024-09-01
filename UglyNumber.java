public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n < 1)
            return false;

        if (n <= 3 && n > 0)
            return true;

        if (n % 2 == 0)
            return isUgly(n / 2);

        if (n % 3 == 0)
            return isUgly(n / 3);

        if (n % 5 == 0)
            return isUgly(n / 5);

        return false;
    }

    public static void main(String[] args) {
        int num1 = 6; // true
        int num2 = 1; // true
        int num3 = 14; // false
        int num4 = 17; // false

        System.out.println(isUgly(num1));
        System.out.println(isUgly(num2));
        System.out.println(isUgly(num3));
        System.out.println(isUgly(num4));
    }
}
