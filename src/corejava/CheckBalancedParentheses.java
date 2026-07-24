package corejava;

//14. Check Balanced Parentheses- Write a function that checks if a given string of parentheses is balanced.

import java.util.Stack;

public class CheckBalancedParentheses {
    static void main() {
        String str="{{{[]}}}";
        System.out.println(check(str));

    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) return false;
                char top=stack.pop();
                if(c=='{' && top != '}' || c=='[' && top != ']' || c=='(' && top != ')' ){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }

}
