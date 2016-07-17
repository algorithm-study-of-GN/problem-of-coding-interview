package Queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue q;
	public void testing(Object expected, Object actual) {
		assertEquals(expected, actual);
	}
	
	@Before
	public void setup() {
		q = new Queue();
		q.enqueue(10);
		q.enqueue(5);
		q.enqueue(1);
		q.enqueue(4);
	}
	
	@Test
	public void testQueue() {
		
		testing(10, q.dequeue());
		q.enqueue(8);
		testing(5, q.dequeue());
		testing(1, q.dequeue());
		testing(4, q.dequeue());
		testing(8, q.dequeue());
		q.enqueue(15);
		testing(15, q.dequeue());
		
	}

	@Test
	public void testIsEmpty() {
		assertFalse(q.isEmpty());
	}

}
