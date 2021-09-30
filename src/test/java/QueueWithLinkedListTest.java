import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class QueueWithLinkedListTest {
	
	QueueWithLinkedList Q;
	
	@Before
	public void initialize() throws Exception{
		Q=new QueueWithLinkedList();
		Q.enqueue(5);
		Q.enqueue(6);
		Q.enqueue(7);
		Q.enqueue(5);
		Q.enqueue(1);
		Q.enqueue(2);
		Q.enqueue(3);
		Q.enqueue(4);
		
	}
	@Category(QueueWithLinkedListTest.class)
	@Test
	public void EnqueueTest() throws Exception {
		
		assertEquals(5,Q.head.key);
	}
	@Test
	public void SizeTest(){
		
		assertEquals(8,Q.size);
	}
	@Test
	public void DequeueTest() throws Exception{
		Q.dequeue();
		Q.dequeue();
		assertEquals(7,Q.dequeue());
	}
	@Test
	public void DequeueTest1() throws Exception{
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		int x=Q.dequeue();
		assertEquals(-1,x);
	}
	@Test
	public void displayTest() {
		Q.display();
	}

}
