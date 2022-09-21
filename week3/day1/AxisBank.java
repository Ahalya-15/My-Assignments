package week3.day1;

public class AxisBank extends BankInfo {

	
	public void deposit(int amount) {
		System.out.println("The deposit amount is"+" "+ amount);
	}
	public static void main(String[] args) {
		 AxisBank info=new AxisBank();
		 info.deposit(50000);
		 info.fixed(5.8f);
		 info.savings(6.5f);
		 
		
	}

}
