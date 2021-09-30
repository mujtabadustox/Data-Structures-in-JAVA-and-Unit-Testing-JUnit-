import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class StackwithArrayTest {

	
	StackwithArray myStack;
	
	@Before
	public void initialize() {	
		myStack=new StackwithArray();
		
	}
	@Category(StackwithArrayTest.class)
	@Test
	public void TestPush()  {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		assertEquals(1,myStack.pop());
	}
	@Test
	public void TestPop()  {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		myStack.pop();
		assertEquals(4,myStack.pop());
	}
	@Test
	public void TestSize()  {
		myStack.push(7);
		myStack.push(4);
		myStack.push(9);
		assertEquals(3,myStack.size);
	}
	@Test()
	public void StackFullTest() {
		int negArr[]=new int[1];
		myStack.array=negArr;
		myStack.push(1);
		myStack.push(2);//2 didnt enter
		assertEquals(1,myStack.pop());
	}
	@Test
	public void displayTest() {
		myStack.push(7);
		myStack.push(4);
		myStack.push(1);
		myStack.display();
	}
	@Test
	public void displayTest1() {
		myStack.display();
	}
	@Test
	public void TestEmpty() {
		myStack.pop();
		myStack.pop();
		myStack.pop();
		int x=myStack.pop();
		assertEquals(-1,x);//head is at top
	}
	@Test(expected = NegativeArraySizeException.class)
	public void NegativeSizeArray() {
		int negArr[]=new int[-10];
		myStack.array=negArr;
		assertEquals(-10,myStack.size);
	}
	@Test
	public void EmptyStackTest() {
		int negArr[]=new int[0];
		myStack.array=negArr;
		assertEquals(0,myStack.size);
		
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		myStack.push(5);
		myStack.push(0);
		int x=myStack.pop();
		int y=myStack.pop();
		System.out.println(x);
		System.out.println(y);
		assertEquals(0,y/x);
	}

}
