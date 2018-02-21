package DataStructures;

public class LinkedList {
    public ListNode head;
    public int listCount;

    public LinkedList() {
        head = new ListNode();
        listCount = 0;
    }

    public void show() {
        ListNode current = head.getNext();
        while (current.getNext() != null) {
            System.out.print(current.getVal() + " -> ");
            current = current.getNext();
        }
        System.out.println(current.getVal());
    }

    public boolean add(int d) {

        ListNode end = new ListNode(d);
        ListNode current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(end);
        listCount++;
  //      System.out.println(d + " appended to tail!");
        return true;
    }

    public boolean add(int d, int index) {
        ListNode end = new ListNode(d);
        ListNode current = head;
        int jump;

        if (index > listCount || index < 1) {
            System.out.println("Add Failed: index out of bounds of size of linked list!!");
            return false;
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            end.getNext().setNext(current.getNext());
            current.getNext().setNext(end);
            listCount++;
            System.out.println("Success! " + d + " added at index " + index);
            return true;
        }
    }

    public boolean deleteNodeWithData(int d) {
        ListNode current = head;
        while (current.getNext() != null) {
            if (current.getNext().getVal() == d) {
                current.setNext(current.getNext().getNext());
                listCount--;
                System.out.println("Success! Node with data " + d + " deleted.");
                return true;
            }
            current = current.getNext();
        }
        System.out.println("Delete Failed: No node found with given data!");
        return false;
    }

    public boolean deleteNodeAtIndex(int index) {
        ListNode current = head;
        int jump;
        if (index > listCount || index < 1) {
            System.out.println("Delete Failed: index out of bounds of size of linked list!!");
            return false;
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            current.setNext(current.getNext().getNext());
            System.out.println("Success! Node at index " + index + " deleted.");
            listCount--;
            return true;
        }
    }
}