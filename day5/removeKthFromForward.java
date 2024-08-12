package day5;

public class removeKthFromForward {
    ListNode removekthElement (ListNode head, int k) {
		if(k == 1 ){
			return head.next ;
		}
	    // add your logic here
		int num = k ;
		ListNode curr = head ;
		while(head != null && num-1 > 1){
			num--;
			curr = curr.next ;
		}
		if(curr.next != null ){
			curr.next = curr.next.next ;
		}
		return head ;
	}
}
