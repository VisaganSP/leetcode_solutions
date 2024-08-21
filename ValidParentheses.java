import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> bracks = new Stack<Character>();

        if (s.length() <= 1)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)) {
                bracks.push(s.charAt(i));
            } else {
                char top = bracks.peek();

                if (bracks.isEmpty())
                    return false;

                if ((')' == s.charAt(i) && top == '(') || (']' == s.charAt(i) && top == '[')
                        || ('}' == s.charAt(i) && top == '{'))
                    bracks.pop();
                else
                    return false;
            }
        }

        return bracks.isEmpty();
    }

    public static boolean isValidWithoutStack(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "[";
        String s5 = "((";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));

        System.out.println();

        System.out.println(isValidWithoutStack(s1));
        System.out.println(isValidWithoutStack(s2));
        System.out.println(isValidWithoutStack(s3));
        System.out.println(isValidWithoutStack(s4));
        System.out.println(isValidWithoutStack(s5));
    }
}
