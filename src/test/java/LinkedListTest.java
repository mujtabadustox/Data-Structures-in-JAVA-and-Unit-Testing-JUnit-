import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LinkedListTest {

	LinkedList myList;
	
	@Before
	public void initialize() {	
		myList=new LinkedList();
		myList.pushFront(10);
		myList.pushFront(15);
		myList.pushFront(20);
		System.out.print("Before:");
	}
	@Category(LinkedListTest.class)
	@Test
	public void InsertTest() {
		assertEquals(3,myList.size);
	}
	@Test
	public void pushFrontTest() {
		LinkedList tempList;
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
	public void pushBackTest() {
		myList.pushBack(5);
		LinkedList tempList;
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
	public void popFrontTest() {
		myList.popFront();//20 is popped,so now 15 is at front
		assertEquals(15,myList.head.key);
	}
	@Test
	public void popBackTest() {
		myList.popBack();//10 is popped
		LinkedList tempList;
		tempList=myList;
		int num=20;//20 and 15 remains
		while (myList.head!=null) {
			assertEquals(num,myList.head.key);
			myList.head=myList.head.next;
			num-=5;
		}
		myList=tempList;
	}
	@Test
	public void popTest() {
		myList.pop(1);//15 is popped
		LinkedList tempList;
		tempList=myList;
		int num=20;//20 and 10 remains
		while (myList.head!=null) {
			assertEquals(num,myList.head.key);
			myList.head=myList.head.next;
			num-=10;
		}
		myList=tempList;
	}
	@Test
	public void displayTest() {
		myList.display();
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		LinkedList newList;
		newList=new LinkedList();
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
