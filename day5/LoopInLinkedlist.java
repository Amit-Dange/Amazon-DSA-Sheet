package day5;

class ListNode {
	int data;
	ListNode next;

	ListNode (int data) {
		this.data = data;
	}
}

public class LoopInLinkedlist {
    ListNode getStartingNodeOfLoop(ListNode list){
		// add your logic here
		if(list == null || list.next == null){
			return null ;
		}
		ListNode slowp = list ;
		ListNode fastp = list ;
		while( fastp != null && fastp.next != null){
			slowp = slowp.next ;
			fastp = fastp.next.next ;
			if(slowp == fastp){
				break ;
			}
		}
		if( slowp == null || fastp == null || fastp.next == null){
			return null ;
		}
		fastp = list ;
		while(slowp != fastp){
			slowp = slowp.next ;
			fastp = fastp.next ;
		}
		return slowp ;
	}
}
