package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int num=34343;
            int tem=num;
            int rev=0;
            while (num>0) {
            	
            int rem=num % 10;
            rev=rev*10+rem;
            num=num/10;
            	
            }
            
	if(rev==tem) {
		System.out.println("This number is a palindrome");
	}
	else {
		System.out.println("This number is not a palindrome");
	}
	}

}
