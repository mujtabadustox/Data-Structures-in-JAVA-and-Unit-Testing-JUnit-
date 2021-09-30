import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ArrayInsertionTest {
	
	int[] myArr;
	ArrayInsertion obj;
	
	@Before
	public void initialize() {
		
		myArr=new int[6];
		obj=new ArrayInsertion();
	}
	@Category(ArrayInsertionTest.class)
	@Test
	public void InsertTest() {
		
		obj.insert(myArr,5,0);
		obj.insert(myArr,6,1);
		obj.insert(myArr,7,2);
		
		
		assertEquals(5,myArr[0]);
	}
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void OutOfBound() {
//		obj.insert(myArr,5,0);
//		obj.insert(myArr,6,1);
//		obj.insert(myArr,7,2);
//		obj.insert(myArr,8,3);
//		obj.insert(myArr,4,4);
//		obj.insert(myArr,4,5);
//		
//		assertEquals(4,myArr[4]);
//		
//	}
//	@Test(expected = ArrayIndexOutOfBoundsException.class)
//	public void NegativeIndex() {
//		obj.insert(myArr,20, -1);
//	}
//	@Test(expected = NegativeArraySizeException.class)
//	public void NegativeSizeArray() {
//		int negArr[]=new int[-10];
//		obj.insert(negArr,20, 5);
//	}
	@Test(expected = ArithmeticException.class)
	public void ArithmeticException() {
		obj.insert(myArr, 0, 0);
		obj.insert(myArr, 1, 1);
		assertEquals(0,myArr[1]/myArr[0]);
	}
}