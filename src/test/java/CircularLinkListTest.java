import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CircularLinkListTest {

	CircularLinkedList myList;
	
	@Before
	public void initialize() {	
		myList=new CircularLinkedList();
		myList.pushFront(10);
		myList.pushFront(15);
		myList.pushFront(20);
		System.out.print("Before:");
	}
	
//	@Test
//	public void InsertTest() {
//		assertEquals(3,myList.size);
//	}
	@Category(CircularLinkListTest.class)
	@Test
	public void pushFrontTest() {
		CircularLinkedList tempList;
		tempList=myList;
		int num=20;
		assertEquals(20,myList.head.key);
		assertEquals(15,myList.head.next.key);
		assertEquals(10,myList.head.next.next.key);
//		while (myList.head!=myList.head) {
//			assertEquals(num,myList.head.key);
//			myList.head=myList.head.next;
//			num-=5;
//		}
		myList=tempList;
	}
	@Test
	public void pushBackTest() {
		myList.pushBack(5);
		CircularLinkedList tempList;
		tempList=myList;
		int num=20;
		assertEquals(20,myList.head.key);
		assertEquals(15,myList.head.next.key);
		assertEquals(10,myList.head.next.next.key);
		assertEquals(5,myList.head.next.next.next.key);
//		while (myList.head!=myList.head) {
//			assertEquals(num,myList.head.key);
//			myList.head=myList.head.next;
//			num-=5;
//		}
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
		CircularLinkedList tempList;
		tempList=myList;
		int num=20;//20 and 15 remains
		assertEquals(20,myList.head.key);
		assertEquals(15,myList.head.next.key);
//		while (myList.head!=myList.head) {
//			assertEquals(num,myList.head.key);
//			myList.head=myList.head.next;
//			num-=5;
//		}
		myList=tempList;
	}
	@Test
	public void popTest() {
		myList.popFront();//20 is popped
		CircularLinkedList tempList;
		tempList=myList;
		int num=15;//15 and 10 remains
		assertEquals(15,myList.head.key);
		assertEquals(10,myList.head.next.key);
//		while (myList.head!=myList.head) {
//			assertEquals(num,myList.head.key);
//			myList.head=myList.head.next;
//			num-=10;
//		}
		myList=tempList;
	}
	@Test
	public void displayTest() {
		myList.display();
	}
	@Test
	public void displayTes1t() {
		myList.popFront();
		myList.popFront();
		myList.popFront();
		myList.display();
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		CircularLinkedList newList;
		newList=new CircularLinkedList();
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
