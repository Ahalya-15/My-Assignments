package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		 
		
			String text = "We learn java basics as part of java sessions in java week1";		
		 //* b) Initialize an integer variable as count	  
			int count=0;
		 //* c) Split the String into array and iterate over it 
			String[] split=text.split(" ");
		 //* d) Initialize another loop to check whether the word is there in the array
			for(int i=0;i<split.length;i++) {
		//* e) if it is available then increase and count by 1.
				for(int j=i+1;j<split.length;j++) {	
			
	            if(split[i].equals(split[j])) {
					split[j]="";
					count++;
				}}
			}
		  
		 if(count>1)	{
			 for(int k=0;k<split.length;k++) {
				 System.out.println(split[k]);
			 }
		 }
		 
	}

}
