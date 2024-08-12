package day5;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class RemoveLinkedlist {
    void removeLoop(ListNode list) {
	    if(list == null || list.next == null){
			return ;
		}
		ListNode slowp = list ;
		ListNode prev = null ;
		ListNode fastp = list ;
		while( fastp != null && fastp.next != null){
			prev = slowp ;
			slowp = slowp.next ;
			fastp = fastp.next.next ;
			if(slowp == fastp){
				break ;
			}
		}
		if( slowp == null || fastp == null || fastp.next == null){
			return ;
		}
		fastp = list ;
		while(slowp != fastp){
			prev = slowp ;
			slowp = slowp.next ;
			fastp = fastp.next ;
		}
		prev.next = null ;
		// return slowp ;
	}
}
