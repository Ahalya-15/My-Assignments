package week3.day1;

public class BankInfo {

	public void savings(float interest) {
		System.out.println("The saving interest percentage is"+" "+ interest);
	}
	public void fixed(float interest) {
		System.out.println("The fixed interest percentage is"+" "+ interest);
	}
	public void deposit(int amount) {
		System.out.println("The deposit amount is"+" "+ amount);
	}
	public static void main(String[] args) {
		 
		BankInfo info=new BankInfo();
		info.savings(6.5f);
		info.fixed(5.8f);
		info.deposit(50000);
	}

}
