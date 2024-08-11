package day4;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Add2NumberAsList {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// add your logic here
		ListNode sumList = new ListNode(-1);
        ListNode dummy = sumList ;
        int carry = 0 ;
        while(l1 != null || l2 != null || carry != 0){
            int val1 = 0 ;
            int val2 = 0 ;
            if(l1 != null){
                val1 = l1.data ;
                l1 = l1.next ;
            }
            if(l2 != null){
                val2 = l2.data ;
                l2 = l2.next ;
            }
            int sum = val1 + val2 + carry ;
            if(sum < 10){
                carry = 0 ;
            }
            else{
                carry = 1 ;
            }
            sum = sum%10 ;
            ListNode num = new ListNode(sum);
            sumList.next = num ;
            sumList = sumList.next;
        }
        return dummy.next ;
	}
}
