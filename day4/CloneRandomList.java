package day4;

// You are given a linked list L1 of length n. 
// Each node contains an additional random pointer which 
// could point to any of the nodes in the list, or null.
// You need to create a deep copy of this list with n newly created nodes. 
// This will create a new linked list L2. All nodes of L2 will have the 
// same value as the corresponding node in L1. The next and random pointers will point to
//  nodes in L2 rather than L1.

// Return the head of L2.
class ListNode {
	int data;
	ListNode next;
    ListNode random;

	ListNode (int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class CloneRandomList {
	ListNode cloneTheLinkedList(ListNode head) {
		// add your logic here 
		ListNode temp = head ;
		while(temp != null){
			ListNode copyNode = new ListNode(temp.data);
			copyNode.next = temp.next ;
			temp.next = copyNode ;
			temp = temp.next.next ; 
		}
		temp = head ;
		while(temp != null){
			ListNode copyNode = temp.next ;
			if(temp.random != null){
				copyNode.random = temp.random.next ;
			}
			else{
				copyNode.random = null;
			}
			temp = temp.next.next ;
		}
		ListNode dummyhead = new ListNode(-1);
		ListNode res = dummyhead ;
		temp = head ;
		while(temp != null){
			res.next = temp.next ;
			temp.next = temp.next.next ;
			res = res.next ;
			temp = temp.next ;
		}
		return dummyhead.next ;
	}
}