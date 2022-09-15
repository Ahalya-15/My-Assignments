package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	
	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
	
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("Ahalya");
		driver.findElement(By.name("lastname")).sendKeys("Vishnu");
		driver.findElement(By.name("reg_email__")).sendKeys("7296727272");
		driver.findElement(By.id("password_step_input")).sendKeys("leaf@AHAL");
		
		WebElement Day=driver.findElement(By.id("day"));
		Select obj=new Select(Day);
		obj.selectByVisibleText("15");
		
		WebElement Month=driver.findElement(By.id("month"));
		Select obj1=new Select(Month);
		obj1.selectByVisibleText("Sep");
		
		WebElement Year=driver.findElement(By.id("year"));
		Select obj2=new Select(Year);
		obj2.selectByVisibleText("1995");
		
		driver.findElement(By.name("sex")).click();
		
		
		
	
		
		
	
	}
}
