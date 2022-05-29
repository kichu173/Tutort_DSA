package tutort.stack.Implementation;

public class StackUsingLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int val) {// O(1)
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {// check if stack is empty, before pop operation
            throw new IndexOutOfBoundsException("Stack underflow");
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

}
