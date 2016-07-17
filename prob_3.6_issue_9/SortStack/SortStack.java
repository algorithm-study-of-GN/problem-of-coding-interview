package SortStack;

import java.util.Stack;

public class SortStack {
	public static void sortStack(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<Integer>();
		int val;
		
		while(!s1.isEmpty()) {
			val = s1.pop();
			while(!s2.isEmpty() && val > s2.peek()) {
				s1.push(s2.pop());
			}
			s2.push(val);
		}
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
	}
}
