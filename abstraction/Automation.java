package org.abstraction;

public class Automation extends MultipleLanguage{
 
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium from Interface");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java from Interface");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby from Abstract");
	}
        public static void main(String[] args) {
			Automation obj=new Automation();
			obj.java();
			obj.ruby();
			obj.Selenium();
			obj.Python();
		}
}
