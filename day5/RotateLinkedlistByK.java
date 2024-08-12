package day5;

public class RotateLinkedlistByK {
    ListNode rotateListByK(ListNode head, int k) {
		if(head == null || k==0){
			return head ;
		}
		int size = 0 ;
		ListNode slowp = head ;
		while(slowp.next != null){
			size++;
			slowp = slowp.next ;
		}
		size++;
		slowp.next = head ;
		int rots =size - k%size;
		slowp = head ;
		for(int i = 1 ; i < rots ; i++){
			slowp = slowp.next;
		}
		head = slowp.next ;
		slowp.next = null ;
		return head ;
	}
}
