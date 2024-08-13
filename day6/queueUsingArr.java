package day6;

import java.util.Arrays;

public class queueUsingArr {
    // Implement the Queue class
class Queue {
	int r ;
	int arr[] ;
	int capacity ;
	Queue (int capacity) {
		this.capacity = capacity ;
		arr = new int[capacity];
		Arrays.fill(arr , -1);
		this.r = 0 ;
	}

	boolean isEmpty() {
		return !(r>0) ;
	}
	
	int size() {
		return r ;
	}
	
	int front() {
		return arr[0];
	}
	
	int back() {
		if(r == 0){
			return -1 ;
		}
		return arr[r-1];
	}
	
	void push(int element) {
		arr[r] = element ;
		r++;
	}
	
	void pop() {
		if(r>0){
			for(int i = 1 ; i <= r ; i++){
				arr[i-1] = arr[i];
			}
			r--;
		}
	}
}
}
