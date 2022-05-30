package tutort.stack.ProbSolving;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min_vals;

    public MinStack() {
        stack = new Stack<>();
        min_vals = new Stack<>();
    }

    public void push(int val) {
        if (min_vals.isEmpty() || val <= min_vals.peek()) {
            min_vals.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.peek().equals(min_vals.peek())) {
            min_vals.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_vals.peek();
    }

    //Driver code
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int param_1 = minStack.getMin();
        System.out.println("minStack.getMin()=> "+param_1);
        minStack.pop();
        int param_2 = minStack.top();
        System.out.println("minStack.top()=> "+param_2);
        int param_3 = minStack.getMin();
        System.out.println("minStack.getMin()=> "+param_3);
    }
}
