package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int num=13;
            int a=0;
            for(int i=2;i<=(num-1);i++) {
            if (num%i==0) {
            	  a++;
            
            }
            
            }
            if (a>0) {
            	System.out.println("Not prime");
            }
            else {
            	System.out.println("Its a prime number");
            }
	}
	

}
