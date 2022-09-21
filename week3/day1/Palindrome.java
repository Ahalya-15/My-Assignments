package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
	
		String str= "MadAm";
        String reversestr="";
        for(int i=str.length()-1;i>=0;i--) {
            reversestr=reversestr+str.charAt(i);
        }if(str.equalsIgnoreCase(reversestr)) {
            System.out.println("its the palindrome string");
        }else {
            System.out.println("its not palinrome string");
        }
		  

	}

}
