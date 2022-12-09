package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
         System.out.println("driver");
         driver.get("http://leaftaps.com/opentaps");
         driver.manage().window().maximize();
         driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meera");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gani");
			driver.findElement(By.className("inputBox")).sendKeys("Testing");
			driver.findElement(By.name("description")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("meerashalina@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			String title=driver.getTitle();
			System.out.println(title);
			//driver.close();
			  
	}
}
		
	


