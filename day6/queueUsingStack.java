package day6;


public class queueUsingStack {
    /* Use this Stack class */
class Stack {
	Stack (int capacity){};
	int size(){return -1;};
	boolean isEmpty(){return false;};
	int top(){return -1;};
	void push(int element){};
	void pop(){};
}


// Implement the Queue class
class Queue {
	Stack stack1 ;
	Stack stack2 ;
	int capacity ;
	Queue (int capacity) {
		stack1 = new Stack(capacity);
		stack2 = new Stack(capacity);
		this.capacity = capacity ;
	}

	boolean isEmpty() {
		return stack1.size() == 0;
	}
	
	int size() {
		return stack1.size();
	}
	
	int front() {
		while(stack1.size() > 0){
			stack2.push(stack1.top());
			stack1.pop();
		}
		int var = stack2.top();
		while(stack2.size() > 0){
			stack1.push(stack2.top());
			stack2.pop();
		}
		return var ;
	}
	
	int back() {
		int var = stack1.top();
		return var ;
	}
	
	void push(int element) {
		stack1.push(element);
	}
	
	void pop() {
		while(stack1.size() > 0){
			stack2.push(stack1.top());
			stack1.pop();
		}
		stack2.pop();
		while(stack2.size() > 0){
			stack1.push(stack2.top());
			stack2.pop();
		}
	}
}
}
