import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {

        String str = "{({[]})}";
        System.out.println(check(str));

        String str2 = "{({[a+q]})}";
        System.out.println(check(str2));

        String str3 = "{({[a+b}-1]})}";
        System.out.println(check(str3));

    }

    static boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (isOpening(cur)) {
                stack.push(cur);
            } else if (!isBrackets(cur)) {
                continue;
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(stack.peek(), cur)) {

                    return false;
                }

                else {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }

    static boolean isOpening(char c) {

        return (c == '(' || c == '{' || c == '[');
    }

    static boolean isMatching(char a, char b) {

        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

    static boolean isBrackets(char b) {
        return (b == '(' || b == ')' || b == '[' || b == ']' || b == '{' || b == '}');
    }
}
