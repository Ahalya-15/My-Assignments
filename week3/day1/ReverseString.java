package week3.day1;

import java.lang.reflect.Array;

public class ReverseString {

	public static void main(String[] args) {
		 String name="Ahalya";
		 char[] charArray = name.toCharArray();
		 for(int i=charArray.length-1;i>=0;i--) {
			 System.out.println(charArray[i]);
		 }

	}

}