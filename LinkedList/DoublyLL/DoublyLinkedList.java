package tutort.LinkedList.DoublyLL;

public class DoublyLinkedList {

    Node head;
    Node tail;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            data = val;
            prev = null;
            next = null;
        }
    }

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No values to display in list");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("No values to display in list");
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void insertAtPos(int pos, int val) {
        if (pos == 0) {
            insertAtBegin(val);
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("pos is invalid");
            }
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp == tail) {// boundary condition
            tail = newNode;
        } else {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) {// edge case
            System.out.println("list is empty and deletion cannot be made.");
            return;
        }

        if (pos == 0) {// boundary condition (deleteAtBeginning)
            head = head.next;
            if (head == null)
                tail = null;
            else
                head.prev = null;
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null)
                throw new IndexOutOfBoundsException("pos is invalid");
        }
        if (temp == tail) {// boundary condition
            prev.next = null;
            tail = prev;
        } else {
            prev.next = temp.next;
            temp.next.prev = prev;
        }
    }

    //InsertAtEnd,deleteAtEnd,Search,Contains,length
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    public void deleteAtEnd() {
        if (head == null) {// edge case
            System.out.println("list is empty and deletion cannot be made.");
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        tail = prev;
    }

    public void deleteFromBeginning() {
        if (head == null){
            System.out.println("list is empty and deletion cannot be made.");
            return;
        }
        head = head.next;
        if (head == null)
            tail = null;
        else
            head.prev = null;
    }

    public void length() {
        int size = 0;
        Node temp = head;
        while (temp.next != null) {
            ++size;
            temp = temp.next;
        }
        System.out.println("The size of list is " + size);
    }

    public void search (int data) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        int count = -1;
        while (temp.next != null) {
            count++;
            if (temp.data == data) {
                System.out.println("The data is found in the list at index "+ count);
                return;
            }
            temp = temp.next;
        }
        System.out.println("The data you are looking for is not found in the list");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.insertAtBegin(7);
        list.insertAtBegin(9);

        list.display();
        System.out.println("");
        list.displayReverse();

        list.insertAtPos(2, 10);
        System.out.println("");
        list.display();

        list.insertAtPos(5, 11);// boundary condition(end)
        System.out.println("");
        list.display();

        list.deleteAtPosition(5);
        System.out.println("");
        list.display();
        System.out.println("");
        list.displayReverse();

        list.insertAtEnd(11);
        System.out.println("");
        list.display();
        System.out.println("");
        list.displayReverse();

        list.deleteAtEnd();
        System.out.println("");
        list.display();
        System.out.println("");
        list.displayReverse();

        list.deleteFromBeginning();
        System.out.println("");
        list.display();
        System.out.println("");
        list.displayReverse();

        System.out.println();
        list.length();

        list.search(11);
    }
}
