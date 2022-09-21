package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The Id is"+"  "+ id );
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The Id is"+"  "+ id );
		System.out.println("the name is"+"  "+ name);
	}
	public void getStudentInfo(String emailid,long phonenumber) {
		System.out.println("The email id is"+"  "+ emailid);
		System.out.println("The phonenumber is"+"  "+ phonenumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Students info=new Students();
        info.getStudentInfo(145);
        info.getStudentInfo(60,"lavanya");
        info.getStudentInfo("ahallava@gmail.com", 9475782543L);
        
	}
	

}
