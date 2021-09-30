import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MyStackTest {

	
	MyStack myStack;
	
	@Before
	public void initialize() {	
		myStack=new MyStack(6);
		
	}
	@Category(MyStackTest.class)
	@Test
	public void TestPush() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		assertEquals(1,myStack.pop());
	}
	@Test
	public void TestPop() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		myStack.pop();
		assertEquals(4,myStack.top());
	}
	@Test
	public void TestTop() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.push(9);
		assertEquals(9,myStack.top());
	}
	@Test
	public void TestSize() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.push(9);
		assertEquals(3,myStack.size());
	}
	@Test(expected = Exception.class)
	public void StackFull() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		myStack.push(1);
		myStack.push(1);
		myStack.push(1);
		myStack.push(8);
		assertEquals(1,myStack.pop());
	}
	@Test(expected = Exception.class)
	public void StackEmpty() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.pop();
		myStack.pop();
		
		assertEquals(1,myStack.pop());
	}
	@Test(expected = Exception.class)
	public void NoTop() throws Exception {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		assertEquals(1,myStack.top());
	}
	@Test(expected = NegativeArraySizeException.class)
	public void NegativeSizeArray() throws Exception {
		MyStack newStack=new MyStack(-6);
		newStack.push(5);
		assertEquals(5,myStack.top());
		
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() throws Exception{
		MyStack newStack=new MyStack(5);
		newStack.push(5);
		myStack.push(0);
		assertEquals(0,newStack.pop()/myStack.pop());
	}


}
