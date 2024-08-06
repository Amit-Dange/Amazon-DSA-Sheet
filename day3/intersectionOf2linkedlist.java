/**
 * Intersection of Two Linked Lists
Given two linked lists, find the node at which they intersect.
 * **/


//  This is the ListNode class definition
class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class intersectionOf2linkedlistn {
	ListNode getIntersectionNode(ListNode A, ListNode B) {
		// add your logic here
		int alen = 0 ;
		int blen = 0 ;
		ListNode currA = A ;
		ListNode currB = B ;
		while(currA != null){
			currA = currA.next ;
			alen++;
		}
		while(currB != null){
			currB = currB.next ;
			blen++;
		}
		while(alen>blen){
			A = A.next ;
			alen--;
		}
		while(blen>alen){
			B = B.next ;
			blen--;
		}
		while(A != B){
			A = A.next ;
			B = B.next ;
		}
		return A ;
		
	}
}

