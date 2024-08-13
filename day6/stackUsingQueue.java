package day6;

public class stackUsingQueue {
    /* Use this Queue class*/
class Queue {
	Queue (int capacity){};
	int size(){return -1;};
	boolean isEmpty(){return false;};
	int front(){return -1;};
	int back(){return -1;};
	void push(int element){};
	void pop(){};
};


// Implement the Stack class
class Stack {
	Queue q1 ;
	Queue q2 ;
	public Stack (int capacity) {
		q1 = new Queue(capacity);
		q2 = new Queue(capacity);
	}

	public boolean isEmpty() {
		return q1.isEmpty();
	}
	
	public int size() {
		return q1.size();
	}
	
	public int top() {
		return q1.front();
	}
	
	public void push(int element) {
		while(q1.size() > 0){
			int val = q1.front();
			q1.pop();
			q2.push(val);
		}
		q1.push(element);
		while(q2.size() > 0){
			int val = q2.front();
			q2.pop();
			q1.push(val);
		}
	}
	
	public void pop() {
		q1.pop();
	}
}
}
