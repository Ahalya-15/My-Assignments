package week1.day2;

public class LearnConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int age=36;
            if (age<18) {
            	System.out.println("not eligible to vote");
            }
            else if(age>=60) {
            	System.out.println("Senior Citizen");
            }
            else
            	System.out.println("Fail");
	}

}
