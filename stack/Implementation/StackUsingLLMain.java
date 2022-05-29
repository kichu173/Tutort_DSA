package tutort.stack.Implementation;

public class StackUsingLLMain {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(9);

        System.out.println("popped " + stack.pop());
    }
}
