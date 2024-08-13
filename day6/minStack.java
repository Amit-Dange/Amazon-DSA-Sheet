package day6;

import java.util.Stack;

public class minStack {
    Stack<Integer> stack ;
	Stack<Integer> ministack ;
	
	public minStack(){
		stack = new Stack<>();
		ministack = new Stack<>();
	}
    void push(int x) {
		if(ministack.size() == 0){
			ministack.push(x);
		}
		else{
			if(ministack.peek() >= x){
				ministack.push(x);
			}
		}
		stack.push(x);
    }
    void pop() {
	    int val = stack.pop();
		if(val == ministack.peek()){
			ministack.pop();
		}
    }
    int top() {
	    int val = stack.pop();
		stack.push(val);
		return val ;
    }
    int getMin() {
	    return ministack.peek();
    }
}
