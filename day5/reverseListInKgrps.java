package day5;

public class reverseListInKgrps {
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
	int len(ListNode head){
		int count = 0 ;
		while(head != null){
			count++;
			head = head.next ;
		}
		return count ;
	}
	ListNode reverseLinkedListKGroup(ListNode head, int k) {
		// add your logic here
		int n = len(head);
		int grps = n/k ;
		ListNode prevHead = null ;
		ListNode currHead = head ;
		ListNode ans = null ;
		
		for(int i =  0 ; i < grps ; i++){
			ListNode prev = null ;
			ListNode curr = currHead ;
			ListNode nxt = null ;
			for(int j = 0 ; j < k ; j++){
				if(curr == null) break ;
				nxt = curr.next ;
				curr.next = prev ;
				prev = curr ;
				curr = nxt ;
			}
			if(prevHead == null){
				ans = prev ;
			}
			else{
				prevHead.next = prev ;
			}
			prevHead = currHead ;
			currHead = curr;
		}
		 if (prevHead != null) {
            prevHead.next = currHead; // connect the last reversed group to the remaining list
        }

        return ans != null ? ans : head;
	}
}

}
