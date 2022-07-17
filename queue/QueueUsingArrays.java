package tutort.queue;

public class QueueUsingArrays {
    static final int MAX_QUEUE_SIZE = 30;
    int[] arr;
    int front, rear;

    QueueUsingArrays() {
        arr = new int[MAX_QUEUE_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int val) {// O(1)
        if (rear == MAX_QUEUE_SIZE - 1) {
            throw new IndexOutOfBoundsException("Queue size is full");
        }
        if (front == -1) {
            front++;
        }
        arr[++rear] = val;
    }

    public int dequeue() {// O(1) -- but wasting space
        if (front == -1 || front > rear) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return arr[front++];
    }

    public static void main(String[] args) {
        QueueUsingArrays queue = new QueueUsingArrays();
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(9);

        System.out.println("dequeued " + queue.dequeue());
        System.out.println("dequeued " + queue.dequeue());
        System.out.println("dequeued " + queue.dequeue());
//        System.out.println("dequeued " + queue.dequeue()); // boundary condition (front > rear)

        queue.enqueue(5);
        queue.enqueue(8);

        System.out.println("dequeued " + queue.dequeue());
        System.out.println("dequeued " + queue.dequeue());
    }
}
