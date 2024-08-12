package day5;

public class add1ToList {
   // 	with recurssion
	int helper(ListNode head ){
		if(head == null ){
			return 1 ;
		}
		int sum = head.data + helper(head.next);
		if(sum < 10 ){
			head.data = sum ;
			return 0 ;
		}
		head.data = sum%10 ;
		return 1 ;
	}
	ListNode addOneToList(ListNode head){
		int carry = helper(head);
		if(carry == 1){
			ListNode temp = new ListNode(1);
			temp.next = head ;
			return temp ;
		}
		return head ;
	}
	
	
// ---------------------------------------------------------------------------------
	// With reverse LinkedList 
	// ListNode reverse(ListNode head ){
	// 	ListNode curr = head ;
	// 	ListNode prev = null ;
	// 	ListNode nxt = head ;
	// 	while(curr != null ){
	// 		ListNode temp = curr.next ;
	// 		curr.next = prev ;
	// 		prev = curr ;
	// 		curr = temp ;
	// 	}
	// 	return prev ;
	// }
	// ListNode addOneToList(ListNode head) {
	// 	// add your logic here
	// 	ListNode list = reverse(head) ;
	// 	ListNode dummy = list ;
	// 	ListNode prev = null ;
	// 	int one = 1 ; 
	// 	int carry = 0 ;
	// 	while(list != null ){
	// 		int val = list.data ;
	// 		int sum = val + carry + one ;  
	// 		carry = (sum)/10;
	// 		if(one == 1){
	// 			one--;
	// 		}
	// 		list.data = sum%10 ;
	// 		// if(carry == 1 && list.next == null){
	// 		// 	ListNode temp = new ListNode(1);
	// 		// 	list.next = temp; 
	// 		// 	carry--;
	// 		// }
	// 		prev = list ;
	// 		list = list.next ;
	// 	}
	// 	if(carry == 1 ){
	// 		ListNode temp = new ListNode(1);
	// 		prev.next = temp; 
	// 		carry--;
	// 	}
	// 	return reverse(dummy);
	// } 
}
