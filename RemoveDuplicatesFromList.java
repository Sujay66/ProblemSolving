
public class RemoveDuplicatesFromList {
		public static void main(String[] args){
				ListNode head = new ListNode(10);
				
				ListNode cur = head;
				ListNode next = head.next;
				
				while(next!=null){
					if(cur.val == next.val){
						cur.next = next.next;
						cur = cur.next;
					}else{
						cur = next;
						next = next.next;
					}
				}
				
				System.out.println(head);
			
		}
}


