import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class QueueTest {
	
	Queue Q;
	
	@Before
	public void initialize() throws Exception{
		Q=new Queue(10);
		Q.enqueue(5);
		Q.enqueue(6);
		Q.enqueue(7);
		Q.enqueue(5);
		Q.enqueue(1);
		Q.enqueue(2);
		Q.enqueue(3);
		Q.enqueue(4);
		
	}
	@Category(QueueTest.class)
	@Test
	public void EnqueueTest() throws Exception {
		
		assertEquals(5,Q.array[0]);
	}
	@Test
	public void SizeTest(){
		
		assertEquals(8,Q.size());
	}
	@Test
	public void DequeueTest() throws Exception{
		Q.dequeue();
		Q.dequeue();
		assertEquals(7,Q.dequeue());
	}	@Test
	public void isEmpty() throws Exception{
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		boolean check=Q.empty();
		assertTrue(check);
	}
	@Test
	public void isEmpty1() throws Exception{
		Q.dequeue();
		Q.dequeue();

		boolean check=Q.empty();
		assertFalse(check);
	}
	@Test
	public void displayTest() {
		Q.display();
	}
	@Test
	public void displayTest1() throws Exception {
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.display();
	}
	@Test(expected = Exception.class)
	public void QueueFull() throws Exception {
		Q.enqueue(3);
		Q.enqueue(4);
		Q.enqueue(3);
		assertEquals(1,Q.array[9]);
	}
	@Test(expected = Exception.class)
	public void QueueEmpty() throws Exception {
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		assertEquals(1,Q.array[9]);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void NegativeIndex() {
		assertEquals(1,Q.array[-9]);
	}
	@Test(expected = NegativeArraySizeException.class)
	public void NegativeSizeArray() {
		Array newArr;
		newArr=new Array();
		int negArr[]=new int[-10];
		Q.array=negArr;
	}



}
