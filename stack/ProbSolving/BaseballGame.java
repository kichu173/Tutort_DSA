package tutort.stack.ProbSolving;

import java.util.Stack;

public class BaseballGame {// https://leetcode.com/problems/baseball-game/

    public static void main(String[] args) {
        int res = calPoints(new String[]{"5", "2", "C", "D", "+"});// 1.["5","-2","4","C","D","9","+","+"] 2.["1","C"]
        System.out.println(res);
    }

    public static int calPoints(String[] ops) {//TC: O(n) SC:n
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (String op : ops) {
            if (op.equals("+") || op.equals("C") || op.equals("D")) {
                int val;
                int val1;
                int val2;
                if (op.equals("+")) {
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2);
                    stack.push(val1);
                    val = val2 + val1;
                    stack.push(val);
                } else if(op.equals("C")) {
                    stack.pop();
                } else {
                    val1 = stack.peek();
                    val = 2 * val1;
                    stack.push(val);
                }
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }

    public static int calPoints1(String[] ops) {// Using switch case
        Integer topEl = null;
        Integer secondtopEl= null;
        Stack<Integer> st = new Stack<Integer>();
        for(String op : ops){
            switch(op.toCharArray()[0]){
                case 'C' : st.pop();
                    break;
                case 'D' :  topEl = st.peek();
                    st.push(2*topEl);
                    break;
                case '+' :  topEl = st.pop();
                    secondtopEl = st.peek();
                    st.push(topEl);
                    st.push(topEl+secondtopEl);
                    break;
                default: st.push(Integer.parseInt(op));
                    break;

            }
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans  = ans + st.pop();
        }
        return ans;
    }
}
