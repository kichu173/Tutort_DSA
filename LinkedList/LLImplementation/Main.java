package tutort.LinkedList.LLImplementation;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtBegin(9);
        list.insertAtBegin(5);
        list.insertAtPosition(1, 7);// pos is index based
        list.insertAtPosition(2, 19);// pos is index based
        list.display();
        System.out.println("");
        list.deleteAtPosition(0);// pos is index based
        list.display();
        System.out.println("");
        for (Integer a : list) {
            System.out.print(a + " ");
        }
        System.out.println("");
        // To debug iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer next = itr.next();
            System.out.print("itr next- " + next + " ");
        }
        list.reverse();
    }
}
