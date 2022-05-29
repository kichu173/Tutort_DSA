package tutort.stack.ProbSolving;

import java.util.Stack;

public class ValidParentheses {// https://leetcode.com/problems/valid-parentheses/

    public static boolean isValid(String s) { //TC:O(n) SC:n
        Stack<Character> st = new Stack<>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')// opening brackets put it into stack
                st.push(it);
            else {// closing brackets come here
                if (st.isEmpty()) {
                    return false;
                }
                char ch = st.pop();
                if ((it == ')' && ch == '(') || (it == ']' && ch == '[') || (it == '}' && ch == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {// algo:: https://www.youtube.com/watch?v=wkDfsKijrZ8&ab_channel=takeUforward
        String s = "()[{}()]"; // 2.[(()] // 3.[() // 4.]()
        if (isValid(s) == true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
