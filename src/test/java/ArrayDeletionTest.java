import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ArrayDeletionTest {
	
	int[] myArr = {1,2,34,5,6,7};
	ArrayDeletion AD;
	
	@Before
	public void initialize() {
		
		AD=new ArrayDeletion();
		
		
	}
	@Category(ArrayDeletionTest.class)
	@Test
	public void DeleteTest() {
			myArr=AD.delete(myArr,4);
			assertEquals(7,myArr[4]);
	}
	@Test
	public void DeleteTest1() {
			int [] newArr;
			newArr=AD.delete(myArr,-3);
			assertEquals(myArr,newArr);
	}
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void OutOfBound() {
//		assertEquals(4,myArr[6]);
//		
//	}
//	@Test(expected = ArrayIndexOutOfBoundsException.class)
//	public void NegativeIndex() {
//		assertEquals(7,myArr[-4]);
//	}
//	@Test(expected = NegativeArraySizeException.class)
//	public void NegativeSizeArray() {
//		int negArr[]=new int[-10];
//		AD.delete(negArr, 2);
//	}
//	@Test(expected = ArithmeticException.class)
//	public void ArithmeticException() {
//		int newArr[]= {0,5};
//		assertEquals(0,newArr[1]/newArr[0]);
//	}

}
