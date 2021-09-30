import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ArrayTest {

	
	Array myArr;
	
	@Before
	public void initialize() {	
		myArr=new Array();
		myArr.insert(1, 0);
		myArr.insert(2, 1);
		myArr.insert(7, 2);
		myArr.insert(9, 3);
		myArr.insert(5, 4);
		myArr.insert(4, 5);
		myArr.insert(3, 6);
		myArr.insert(10, 7);
		System.out.print("Before:");
		myArr.display();
	}
	
	
	@Category(ArrayTest.class)
	@Test
	public void InsertTest() {
		assertEquals(5,myArr.array[4]);
	}
	@Test
	public void DeleteTest() {
		myArr.delete(0);
		assertEquals(2,myArr.array[0]);
	}
	@Test
	public void LinearSearchTest() {
		boolean check=myArr.linearSearch(5);
		assertTrue(check);
	}
	@Test
	public void LinearSearchTest1() {
		boolean check=myArr.linearSearch(6);
		assertFalse(check);
	}
	@Test
	public void Dt() {
		myArr.display();
		//assertFalse(check);
	}

	@Test
	public void BubbleSortTest() {
		myArr.bubbleSort();
		assertEquals(1,myArr.array[0]);
		assertEquals(2,myArr.array[1]);
		assertEquals(3,myArr.array[2]);
		assertEquals(4,myArr.array[3]);
		assertEquals(5,myArr.array[4]);
		assertEquals(7,myArr.array[5]);
		assertEquals(9,myArr.array[6]);
		assertEquals(10,myArr.array[7]);
		
	}
	@Test
	public void BinarySearchTest() {
		boolean check=myArr.binarySearch(5, 0, myArr.size);
		assertTrue(check);
	}
	@Test
	public void BinarySearchTest1() {
		myArr.delete(4);
		boolean check=myArr.binarySearch(5, 0, myArr.size);
		assertFalse(check);
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void OutOfBound() {
		myArr.insert(15, 101);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void NegativeIndex() {
		myArr.insert(20, -1);
	}
	@Test(expected = NegativeArraySizeException.class)
	public void NegativeSizeArray() {
		Array newArr;
		newArr=new Array();
		int negArr[]=new int[-10];
		newArr.array=negArr;
	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		Array newArr;
		newArr=new Array();
		newArr.insert(10, 0);
		newArr.insert(0, 1);
		assertEquals(0,newArr.array[0]/newArr.array[1]);
	}
	
	@Test(expected = AssertionError.class)
	public void AssertionError() {
		Array newArr=null;
		assertEquals(0,newArr.array[0]);
	}

	@After
	public void DisplayTest() {
		System.out.print("After:");
		myArr.display();
		System.out.println("\n");
	}

}
