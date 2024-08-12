package day5;

public class rotateListInRange {
    ListNode reverseLinkedListRange(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head ;
		// System.out.println("here");
		ListNode leftprev = dummy ;
		ListNode curr = head ;
		for(int i = 0 ; i < left -1 ; i++){
			leftprev = curr ;
			curr = curr.next ;
		}
		// ListNode leftprev = prev ;
		ListNode prev = null ;
		
		for(int i = 0 ; i < right-left +1 ; i++){
			ListNode nxt = curr.next ;
			curr.next = prev ;
			prev = curr ;
			curr = nxt ;
		}
		leftprev.next.next = curr ;
		leftprev.next = prev ;
		return dummy.next ; 
	}
}
