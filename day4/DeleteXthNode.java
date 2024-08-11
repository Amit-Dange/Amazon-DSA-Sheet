package day4;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class DeleteXthNode {
    ListNode removeXthNodeFromEnd(ListNode head, int x) {
		// add your logic here
		ListNode prev = null ;
		ListNode first = head ;
		ListNode second = head ;
		while(x > 0 && second != null){
			second = second.next ;
			x--;
		}
		if(second == null){
			if(x > 0){
				return head ;
			}
			if(x==0){
				ListNode temp = head ;
				head = head.next ;
				temp.next = null ;
				return head ;
			}
		}
		while(second != null){
			prev = first ;
			first = first.next ;
			second = second.next ;
		}
		prev.next = first.next ;
		first.next = null ;
		
		return head ;
	}
}
