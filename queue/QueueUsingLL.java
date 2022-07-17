package tutort.queue;

public class QueueUsingLL {
    Node front,rear;
    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    QueueUsingLL() {
        front = null;
        rear = null;
    }

    public void enqueue(int val) {// O(1)
        Node newNode = new Node(val);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int dequeue() {// O(1)
        if (front == null) {// no node in Q
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {// deleted last node and now Q is empty
            rear = null;
        }
        return temp;
    }

    public boolean isEmpty() {// O(1)
        return front == null;
    }

    public int peek() {// get element at front -  O(1)
        if (front == null) {// no node in Q
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        return front.data;
    }



    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(9);

        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());
//        System.out.println("dequeued " + q.dequeue()); // boundary condition

        q.enqueue(5);
        q.enqueue(8);

        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());


        System.out.println("Queue is empty: " + q.isEmpty());
    }
}
