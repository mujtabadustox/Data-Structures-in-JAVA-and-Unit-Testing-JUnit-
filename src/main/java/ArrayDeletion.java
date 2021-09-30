//Program to delete an element at a given index.
// array = {1,2,3,4,5}, index = 3;
// after deletion of 3rd element : array = {1,2,3,5,-1}

import java.util.*;
public class ArrayDeletion{
	//this function takes two arguments - array to delete in and index of the element to delete.
	public static int [] delete(int [] array, int indextodeleteAt){
		//check if index is valid.
		if(indextodeleteAt<0 || indextodeleteAt>array.length-1){
			return array;
		}
		
		//shift elements towards left from last element till indextodeleteAt.	
		for(int i=indextodeleteAt; i<array.length-1; i++){
			array[i]=array[i+1];
		}
		array[array.length-1] = -1;
		return array;
	}

	
}
	
		