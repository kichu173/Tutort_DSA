package tutort.LinkedList.CircularLL;

public class CircularLinkedList<T> {
    Node last;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    CircularLinkedList() {
        last = null;
    }

    public void insertAtBegin(T val) {
        Node newNode = new Node(val);
        if (last == null) {
            last = newNode;
            newNode.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtLast(T val) {
        Node newNode = new Node(val);
        if (last == null) {
            last = newNode;
            newNode.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display() {
        if (last == null)
            return;
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
    }

    public void deleteAtBeginning() {
        if (last == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        }
        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    public void deleteAtEnd() {
        if (last == null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

    public void deleteVal(T val) {
        if (last == null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        if (last.next == last) {
            last = null;
        }
        Node temp = last.next;
        Node prev = null;
        do {
            prev = temp;
            temp = temp.next;
            if(prev.data == val) {
                if (prev.data == last.next.data) {
                    last.next = last;
                    return;
                }
            } else {
                if (prev.next.data == val){
                    if (prev.next == last) {
                        last = prev;
                    }
                    prev.next = temp.next;
                    return;
                }
            }
        } while (temp != last.next);
    }

    public void insertAfter(T val, T data) {
        Node newNode = new Node(data);
        Node temp = last.next;
        do {
            if (temp.data == val) {
                if (temp == last) {
                    last = newNode;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        } while (temp != last.next);
    }

    public void size() {
        int count = 0;
        Node temp = last.next;
        do {
            count++;
            temp = temp.next;
        }while (temp != last.next);
        System.out.println("The size of list is " + count);
    }


    public static void main(String[] args) {
        CircularLinkedList<String> list = new CircularLinkedList<>();
        list.insertAtBegin("Abi");
        list.insertAtBegin("Ram");
        list.insertAtBegin("Lax");
        list.display();
        System.out.println("");
        list.insertAtLast("Soumen");
        list.display();
        System.out.println("");
        list.deleteAtBeginning();
        list.display();
        System.out.println("");
        list.deleteAtEnd();
        list.display();
        System.out.println("");
        list.insertAtBegin("lax");
        list.insertAtLast("Soumen");
        list.display();
        System.out.println("");
        list.deleteVal("Soumen");
        list.display();
        System.out.println("");
        list.size();
        list.insertAfter("Ram", "Kiran");
        list.display();
        System.out.println("");
        list.size();
    }
}
