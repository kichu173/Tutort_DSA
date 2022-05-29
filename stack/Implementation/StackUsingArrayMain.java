package tutort.stack.Implementation;

public class StackUsingArrayMain {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        //push
        stack.push(4);
        stack.push(8);
        //pop
        System.out.println("popped " + stack.pop());
    }
}
