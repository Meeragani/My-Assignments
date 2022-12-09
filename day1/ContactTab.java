package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactTab {

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
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Meera");
        driver.findElement(By.id("lastNameField")).sendKeys("Sintha");
        driver.findElement(By.className("smallSubmit")).click();
        System.out.println(driver.getTitle());
		 WebElement firstName=driver.findElement(By.id("firstNameField"));
		 String name =firstName.getAttribute("value");
		 System.out.println(name);
		 driver.close();
		


	
        
	}

}
