import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LinkedListSwapNodesTest {

	LinkedListSwapNodes myList;
	
	@Before
	public void initialize() {	
		myList=new LinkedListSwapNodes();
		myList.pushFront(10);
		myList.pushFront(15);
		myList.pushFront(20);
		System.out.print("Before:");
	}
	@Category(LinkedListSwapNodesTest.class)
	@Test
	public void pushFrontTest() {
		LinkedListSwapNodes tempList;
		tempList=myList;
		int num=20;//20 is first and 10 is last
		while (myList.head!=null) {
			assertEquals(num,myList.head.key);
			myList.head=myList.head.next;
			num-=5;
		}
		myList=tempList;
	}
	@Test
	public void pushBackTest() {
		myList.pushBack(5);
		LinkedListSwapNodes tempList;
		tempList=myList;
		int num=20;
		while (myList.head!=null) {
			assertEquals(num,myList.head.key);
			myList.head=myList.head.next;
			num-=5;
		}
		myList=tempList;
	}
	@Test
	public void swapTest() {
		myList.swap();
		int num=10;//now 10 is first and 20 is last
		while (myList.head!=null) {
			assertEquals(num,myList.head.key);
			myList.head=myList.head.next;
			num+=5;
		}
		
	}
	@Test
	public void displayTest() {
		myList.display();
	}
	@Test(expected = NullPointerException.class)
	public void NullPointer() {
		myList.head=null;
		assertEquals(20,myList.head.key);
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		LinkedListSwapNodes newList;
		newList=new LinkedListSwapNodes();
		newList.pushBack(5);
		newList.pushBack(0);
		assertEquals(0,myList.head.key/myList.head.next.key);
	}
	
	
	@After
	public void DisplayTest() {
		System.out.print("After:");;
		System.out.println("\n");
	}

}
