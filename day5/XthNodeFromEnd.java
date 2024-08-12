package day5;

public class XthNodeFromEnd {
    ListNode xthNodeFromEnd(ListNode head, int x) {
		// add your logic here
		ListNode slowp = head ;
		ListNode fastp = head ;
		for(int i = 0 ; i < x ; i++){
			if(fastp == null)return null ;
			fastp = fastp.next ;
		}
		while(fastp != null){
			fastp = fastp.next ;
			slowp = slowp.next ;
		}
		return slowp ;
	}
}
