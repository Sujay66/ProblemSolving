package DataStructures;

public class ListNode {
      private  int val;
      private ListNode next;
      public ListNode(){};
      ListNode(int x) { val = x; }
      public int getVal(){
          return this.val;
      }
      public void setVal(int x){
          this.val = x;
      }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
