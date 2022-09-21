package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {
 
	public static void main(String[] args) {
		
		// * a) Declare An array for {3,2,11,4,6,7};
		int[] arr={3,2,11,4,6,7};
		 //* b) Declare another array for {1,2,8,4,9,7};
		int[] arr1={1,2,8,4,9,7};
		 //* c) Declare for loop iterator from 0 to array length
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		  for(Integer i :arr) {
			  list1.add(i);
		  }
		  for(Integer j :arr1) {
			  list2.add(j);
		  }
		 //* d) Declare a nested for another array from 0 to array length
		
		for (int i = 0; i < list1.size(); i++) {
		
		for (int j = 0; j < list2.size(); j++) {
			//* e) Compare Both the arrays using a condition statement
			 if(list1.get(i)==list2.get(j)) {
				 System.out.println(list1.get(i));
			 }
		}
		 
		}
		 
	}
	
	
	 
}
