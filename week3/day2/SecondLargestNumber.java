package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = {3,2,11,4,6,7};
		List<Integer> list2 = new ArrayList<Integer>();
		for (Integer i : list1) {
			list2.add(i);
		}
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("The Second Largest Element is " + list2.get(list2.size()-2));
	}

}
