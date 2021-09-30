import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LinkedListImplementationTest {

	LinkedListImplementation myList1;
	
	@Before
	public void initialize() {	
		myList1=new LinkedListImplementation();
		System.out.print("Before:");
	}
	@Category(LinkedListImplementationTest.class)
	@Test
	public void pushFrontTest() {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
		LinkedListImplementation tempList;
		tempList=myList1.headPointer;
		assertEquals(20,tempList.data);
	}
	@Test
	public void pushBackTest() {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
		myList1.pushBack(5);
		LinkedListImplementation tempList;
		tempList=myList1.tailPointer;
		assertEquals(5,tempList.data);
	}
	@Test
	public void popFrontTest() throws Exception {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
		myList1.popFront();//20 is popped,so now 15 is at front
		assertEquals(15,myList1.headPointer.data);
	}
	@Test
	public void topFrontTest() throws Exception {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
		int x=myList1.topFront();
		assertEquals(20,x);
	}

//	@Test
//	public void addTest() {
//		myList1.pushFront(10);
//		myList1.pushFront(15);
//		myList1.pushFront(20);
//		myList1.add(5);
//		LinkedListImplementation tempList;
//		tempList=myList1.tailPointer;
//		assertEquals(5,tempList.data);
//	}
	@Test
	public void topBackTest() throws Exception {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
		int x=myList1.topBack();
		assertEquals(10,x);//we added 5 at back,it is picking the new list,
		//if u run this separate it wont work since 10 will be at last
	}
	@Test
	public void SizeTest() throws Exception {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
		System.out.println("size"+myList1.size());
		assertEquals(3,myList1.size());//we are doing 18 pushes and one add = 19
	}

	@Test(expected = Exception.class)
	public void StackEmpty() throws Exception {
		myList1.pushFront(10);
		myList1.pushFront(15);
		myList1.pushFront(20);
	myList1.popFront();
	myList1.popFront();
	myList1.popFront();
	myList1.topFront();
	//assertEquals(1,myList1.topFront());
	}
	
	@Test(expected = Exception.class)
	public void StackEmpty1() throws Exception {
	
	myList1.popFront();
	myList1.popFront();
	myList1.popFront();
	myList1.popFront();
	myList1.popFront();
	myList1.popFront();
	myList1.popFront();
	System.out.println("LAAAAAAA:");
	myList1.display();
	myList1.topBack();
	}
	@Test
	public void displayTest(){
		myList1.display();
	}

	
	@After
	public void DisplayTest() {
		System.out.print("After:");;
		System.out.println("\n");
	}

}
