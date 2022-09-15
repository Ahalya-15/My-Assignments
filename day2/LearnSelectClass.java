package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      
      ChromeDriver driver=new ChromeDriver();
     // driver.get("https://leafground.com/select.xhtml");
      driver.manage().window().maximize();
      //WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
      //Select drop3=new Select(tool);
      //drop3.selectByVisibleText("Selenium");
       driver.get("https://www.amazon.in/");
      String text=driver.findElement(By.xpath("1700")).getText();       
      System.out.println(1700);
	
	}
	  
		// (type[]) collection.toArray(new type[collection.size()])ODO Auto-generated method stub

	}
	
	