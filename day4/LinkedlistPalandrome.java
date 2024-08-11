package day4;

import java.util.Stack;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedlistPalandrome {
    boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null){
            return true;
        }
        ListNode slowp = head ;
        ListNode fastp = head ;
        Stack<Integer> stack = new Stack<>();

        while(fastp != null && fastp.next != null){
            stack.push(slowp.data);
            slowp = slowp.next ;
            fastp = fastp.next.next ;
        }
        // System.out.println(slowp.val);
        if(fastp != null ){
            slowp = slowp.next ;
        }

        while(slowp != null){
            if(stack.isEmpty()){
                return false ;
            }
            int top = stack.pop();
            if(top != slowp.data){
                return false;
            }
            slowp = slowp.next;
        }
        return true ;
	}
}
