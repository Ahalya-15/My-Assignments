package week1.day1;

public class Mobile {
public void sendSms()  {
	System.out.println("Hi");
	String mobileModel="Samsung Galaxy";
    float mobileWeight=175.5f;
	
}
public void makeCall()  {
    System.out.println("Hello");
    boolean fullyCharged=true;
    int mobileCost=13000;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mobile class");
		Mobile obj=new Mobile();
		obj.sendSms();
		obj.makeCall();

	}

}
