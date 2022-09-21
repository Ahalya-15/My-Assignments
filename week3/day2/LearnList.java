package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	
	public static void main(String[] args) {
		List<String>lst=new ArrayList<String>();
		 lst.add("Adam");
		 lst.add("Ben");
		 lst.add("Zara");
		 lst.add("Adam");
		 lst.add("Charlie");
		 lst.add("James");
		 lst.add("Ben");
		 lst.add(3,"Ahalya");
		 System.out.println(lst);
		 lst.remove(3);
		 System.out.println(lst);
		 System.out.println(lst.contains("Ahalya"));
		 System.out.println(lst.get(3));
		 System.out.println(lst.size());
		 lst.clear();
		 System.out.println(lst);
		 System.out.println(lst.isEmpty());
		 
		 
	}
}
