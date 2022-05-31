package tutort.stack.ProbSolving;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

    public static void main(String[] args) {
        String res = removeDuplicates("abbaca");
        System.out.println(res);
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        String res = "";
        StringBuffer sb = new StringBuffer();// used StringBuffer to make use of inbuilt fn - reverse()
        for (char aChar : chars) {
            if (!stack.isEmpty() && aChar == stack.peek()) {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        sb.append(res);// convert string to StringBuffer(https://www.benchresources.net/how-to-convert-string-to-stringbuffer-and-vice-versa-in-java/)
        return sb.reverse().toString();// vice-versa (StringBuffer to string)
    }
}
