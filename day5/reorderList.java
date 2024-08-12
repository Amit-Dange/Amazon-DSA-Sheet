package day5;

public class reorderList {
    /** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
**/
class Solution {
	ListNode reverse(ListNode head ){
		ListNode curr = head ;
		ListNode prev = null ;
		while(curr != null ){
			ListNode temp = curr.next ;
			curr.next = prev ;
			prev = curr ;
			curr = temp ;
		}
		return prev ;
	}
	ListNode reorderList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null){
			return head ;
		}
		ListNode slowp = head ;
		ListNode fastp = head ;
		while(fastp != null && fastp.next != null){
			slowp = slowp.next ;
			fastp = fastp.next.next ;
		}
		ListNode addele = slowp.next ;
		slowp.next = null ;
		addele = reverse(addele);
		slowp = head ;
		
		while(slowp != null && addele != null ){
			ListNode temp1 = slowp.next ;
			ListNode temp2 = addele.next ;
			slowp.next = addele ;
			addele.next = temp1 ;
			addele = temp2 ;
			slowp = temp1;
		}
		
		return head ;
	}
}
}
