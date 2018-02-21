package Medium;

import DataStructures.LinkedList;
import DataStructures.ListNode;

public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        LinkedList c1 = new LinkedList();
        LinkedList c2 = new LinkedList();
  //      LinkedList sentinel = new LinkedList();
        LinkedList d = new LinkedList();
            c1.add(2);
            c1.add(4);
            c1.add(3);

            c2.add(5);
            c2.add(6);
            c2.add(4);

        c1.show();
        c2.show();
        int sum = 0;
        c1.head = c1.head.getNext();
        c2.head = c2.head.getNext();
        while (c1.head != null || c2.head != null) {
            sum /= 10;
            if (c1.head != null) {
                sum += c1.head.getVal();
                c1.head = c1.head.getNext();
            }
            if (c2.head != null) {
                sum += c2.head.getVal();
                c2.head = c2.head.getNext();
            }
            d.add(sum%10) ;
        }
        if (sum / 10 == 1) d.add(1);
         d.show();
    }
}
