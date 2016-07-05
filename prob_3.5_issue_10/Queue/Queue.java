package Queue;

import java.util.Stack;

public class Queue {
	Stack<Integer> in;
	Stack<Integer> out;
	
	public Queue() {
		in = new Stack<Integer>();
		out = new Stack<Integer>();
	}
	public void enqueue(int val) {
		in.push(val);
	}
	
	public int dequeue() {
		if(out.isEmpty()) {
			if(in.isEmpty()) {
				return -1;
			} else {
				do {
					out.push(in.pop());
				} while(!in.isEmpty());
			}
		}
		return out.pop();
		
		
	}
	
	public boolean isEmpty() {
		return in.isEmpty() && out.isEmpty();
	}
}
