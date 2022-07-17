package tutort.queue;

import java.util.Arrays;

public class QueueUsingArrays2 {// without using front pointer/variable
    static final int MAX_QUEUE_SIZE = 30;
    int[] arr;
    int rear;

    QueueUsingArrays2() {
        arr = new int[MAX_QUEUE_SIZE];
        rear = -1;
    }

    public void enqueue(int val) {// O(1)
        if (rear == MAX_QUEUE_SIZE - 1) {
            throw new IndexOutOfBoundsException("Queue size is full");
        }
        arr[++rear] = val;
    }

    public int dequeue() {// O(n) -- to overcome space waste, but time complexity increases
        if (rear == -1) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int temp = arr[0];
        //shifting process
        for (int i = 1; i <= rear; i++) {
            arr[i - 1] = arr[i];
        }
        rear--;
        return temp;
    }

    @Override
    public String toString() {
        return "QueueUsingArrays2{" +
                "arr=" + Arrays.toString(arr) +
                ", rear=" + rear +
                '}';
    }

    public static void main(String[] args) {
        QueueUsingArrays2 q = new QueueUsingArrays2();
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(9);

        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());
//        System.out.println("dequeued " + queue.dequeue()); // boundary condition

        System.out.println(q);

        q.enqueue(5);
        q.enqueue(8);

        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());

        System.out.println(q);
    }
}
