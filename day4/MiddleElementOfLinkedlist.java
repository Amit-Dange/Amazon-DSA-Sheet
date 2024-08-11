package day4;

class ListNode {
	int data;
	ListNode next;

	ListNode (int data) {
		this.data = data;
	}
}

public class MiddleElementOfLinkedlist {
    int getMiddleElementOfLinkedList (ListNode list) {
		ListNode slowp = list ;
		ListNode fastp = list ;
		while(fastp != null && fastp.next != null && fastp.next.next != null ){
			slowp = slowp.next ;
			fastp = fastp.next.next ;
		}
		return slowp.data ;
		
	}
}
