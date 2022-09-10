package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      
      ChromeDriver driver=new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/main");
      driver.manage().window().maximize();
      driver.findElement(By.id("username")).sendKeys("demosalesmanager");
      
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      
      driver.findElement(By.className("decorativeSubmit")).click();
      
      String text = driver.findElement(By.tagName("h2")).getText();
      
      System.out.println(text);
      
        String title =driver.getTitle(); //ctrl+2+l //Leaftaps - TestLeaf Automation Platform
       
       System.out.println(title);
       
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ahalya");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vishnu");
       driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Latha");
       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
       driver.findElement(By.id("createLeadForm_description")).sendKeys("Best Tester");
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ahalyalatha1520@gmail.com");
       driver.findElement(By.name("submitButton")).click();
       System.out.println("The Title is:"+ driver.getTitle());
       
       
       
       
       	}
	
	
	}

