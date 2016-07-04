package SortStack;

import java.util.Stack;
import static org.junit.Assert.*;
import org.junit.Test;

public class SortStackTest {

	@Test
	public void testSortStack() {
		Stack<Integer> a = new Stack<Integer>();
		a.push(10); a.push(2); a.push(5); a.push(8); a.push(3); a.push(1);
		SortStack.sortStack(a);
		
		assertEquals(new Integer(10), a.pop());
		assertEquals(new Integer(8), a.pop());
		assertEquals(new Integer(5), a.pop());
		assertEquals(new Integer(3), a.pop());
		assertEquals(new Integer(2), a.pop());
		assertEquals(new Integer(1), a.pop());
	}

}
