package tutort.stack.Implementation;

public class StackUsingArray {// To make this stack generic(18:50) - //https://www.youtube.com/watch?v=Sh-8H3afq9g&list=PLYM2_EX_xVvX7_AmNY-Deacp3rT3MIXnE&index=12&ab_channel=LogicFirstTamil
    static final int MAX_SIZE = 30;
    int[] arr = new int[MAX_SIZE];
    int top; // captures the recent element's index position

    public StackUsingArray() {
        top = -1;
    }

    void push(int val) {
        if (top == MAX_SIZE - 1) {// edge case:: to check array size is full or not before push operation
            throw new IndexOutOfBoundsException("Stack overflow");// stack size is full!
        }
        arr[++top] = val;
    }

    int pop() {
        if (top == -1) {// edge case:: to check array is empty before pop operation
            throw new IndexOutOfBoundsException("Stack underflow");// stack size is empty!
        }
        return arr[top--];
    }

    int peek() {// returns the recent element(without deleting)
        return arr[top];
    }

    boolean isEmpty() {// to check stack is empty or not
        return top == -1;
    }
}
