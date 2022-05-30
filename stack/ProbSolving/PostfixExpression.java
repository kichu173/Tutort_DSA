package tutort.stack.ProbSolving;

import java.util.Stack;

public class PostfixExpression {// https://leetcode.com/problems/evaluate-reverse-polish-notation/
    public static void main(String[] args) {
        int res = evalRPN(new String[]{"2", "1", "+", "3", "*"});// 1.["4","13","5","/","+"] 2.["10","6","9","3","+","-11","*","/","*","17","+","5","+"] 3.["3","2","+","2","4","5","*","-","+"]
        System.out.println(res);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int val = 0;
                int val1 = stack.pop();
                int val2 = stack.pop();
                if (token.equals("+")) val = val2 + val1;
                if (token.equals("-")) val = val2 - val1;
                if (token.equals("*")) val = val2 * val1;
                if (token.equals("/")) val = val2 / val1;
                stack.push(val);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}
