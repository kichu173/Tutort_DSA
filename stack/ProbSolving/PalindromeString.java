package tutort.stack.ProbSolving;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {// Using stack TC:O(n) SC: n

    //Approach 1: reverse the string(src/kunal/firstJava/Palindrome.java).
    //Approach 2: Two pointers (while(i!=j) a[i] == a[j]i++,j--  -> https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/)
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string to test it is palindrome/not:: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String revStr = "";
        while(!stack.isEmpty()) {
            revStr += stack.pop();
        }

        if(input.equals(revStr)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("No! That's not a palindrome");
        }
    }

    //Approach 4: https://www.geeksforgeeks.org/check-whether-the-given-string-is-palindrome-using-stack/ TC:O(n) SC:n/2
}
