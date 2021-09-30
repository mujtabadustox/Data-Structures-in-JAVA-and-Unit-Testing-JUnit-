import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class StackwithLinkedListTest {

	
	StackwithLinkedList myStack;
	
	@Before
	public void initialize() {	
		myStack=new StackwithLinkedList();
		myStack.push(3);
		myStack.push(6);
		myStack.push(9);
		
	}
	@Category(StackwithLinkedListTest.class)
	@Test
	public void InsertTest() {
		assertEquals(3,myStack.size);
	}
	@Test
	public void SizeTest() {
		assertEquals(3,myStack.getSize());
	}
	@Test
	public void TestPush(){
		int num=9;
		while (myStack.head!=null) {
			assertEquals(num,myStack.head.key);
			myStack.head=myStack.head.next;
			num-=3;
		}
		
	}
	@Test
	public void TestPop() {
		myStack.pop();
		assertEquals(6,myStack.pop());
	}
	@Test
	public void TestTop() {
		assertEquals(myStack.head.key,myStack.top());//head is at top
	}
	@Test
	public void TestTop1() {
		assertEquals(9,myStack.top());//head is at top
	}
	@Test
	public void TestEmpty() {
		myStack.pop();
		myStack.pop();
		myStack.pop();
		int x=myStack.top();
		assertEquals(-1,x);//head is at top
	}
	@Test
	public void TestEmpty1() {
		myStack.pop();
		myStack.pop();
		myStack.pop();
		int x=myStack.pop();
		assertEquals(-1,x);//head is at top
	}
	@Test
	public void displayTest() {
		myStack.display();
	}
	@Test(expected = NullPointerException.class)
	public void NullPointer() {
		myStack.head=null;
		assertEquals(20,myStack.head.key);
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		StackwithLinkedList newList;
		newList=new StackwithLinkedList();
		newList.push(5);
		newList.push(0);
		assertEquals(0,newList.head.next.key/newList.head.key);
	}


}
