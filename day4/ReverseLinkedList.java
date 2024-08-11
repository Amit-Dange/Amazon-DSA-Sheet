package day4;

class ListNode {
	int data;
	ListNode next;

	ListNode (int data) {
		this.data = data;
	}
}

public class ReverseLinkedList {
    ListNode reverseLinkedList (ListNode head) {
		// add your logic here
		if(head == null){
			return head ;
		}
		ListNode prev = null ;
		ListNode curr = head ;
		ListNode nxt = head ;
		while(curr != null){
			nxt = curr.next ;
			curr.next = prev ;
			prev = curr ;
			curr = nxt ;
		}
		return prev ;
		
	}
}
