import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DequeueTest {
	
	Dequeue Q;
	
	@Before
	public void initialize() throws Exception{
		Q=new Dequeue(10);
		
	}
	@Category(DequeueTest.class)
	@Test
	public void AddRightTest() throws Exception {
		Q.addRight(10);
		assertEquals(10,Q.array[9]);
	}
	@Test
	public void AddLeftTest() throws Exception {
		Q.addLeft(14);
		assertEquals(14,Q.array[0]);
	}
	@Test
	public void displayTest() throws Exception {
	Q.display();
	}


}
