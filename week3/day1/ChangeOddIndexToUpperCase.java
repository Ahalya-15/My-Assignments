package week3.day1;

public class ChangeOddIndexToUpperCase {

public static void main(String[] args) {
	

	 //Pseudo Code
	 
	 //* Declare String Input as Follow
	  
	  String text = "changeme";
	
	 //a) Convert the String to character array
	  char[] ch=text.toCharArray();
	   System.out.println(ch);
	 //* b) Traverse through each character (using loop)
	  for(int i=0;i<ch.length;i++) {
		  if((i%2)==0) {
			  char upper=Character.toUpperCase(ch[i]);
			  System.out.print(upper);
		  }else {
			  System.out.print(ch[i]);
		  }
	  }
	 
}
	
}
