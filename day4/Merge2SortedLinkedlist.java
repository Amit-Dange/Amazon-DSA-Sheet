package day4;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Merge2SortedLinkedlist {
    ListNode mergeTwoSortedList (ListNode l1, ListNode l2) {
	    // add your logic here
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy ;
		while(l1 != null && l2 != null){
			int val1 = l1.data ;
			int val2 = l2.data ;
			
			if(val1 > val2){
				curr.next = l2 ;
				l2 = l2.next ;
			}
			else{
				curr.next = l1 ;
				l1 = l1.next ;
			}
			curr = curr.next;
		}
		if(l1 != null){
			curr.next = l1 ;
		}
		if(l2 != null){
			curr.next = l2 ;
		}
		return dummy.next ;
	}
}
