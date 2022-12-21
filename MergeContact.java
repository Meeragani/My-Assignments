package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
       ChromeDriver driver=new ChromeDriver();
    	   
       System.out.println(driver);
       
       
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 String windowHandle = driver.getWindowHandle();
		 System.out.println(windowHandle);
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String>window=new ArrayList<String>(windowHandles);
		 System.out.println(window);
		 driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//a[text()='anitha']")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		String windowHandle1 = driver.getWindowHandle();
		 System.out.println(windowHandle1);
		 Set<String> windowHandles1 = driver.getWindowHandles();
		 List<String>window1=new ArrayList<String>(windowHandles1);
		 System.out.println(window1);
		 driver.switchTo().window(window1.get(1));
		 driver.findElement(By.xpath("//a[text()='Praveena']")).click();
		driver.switchTo().window(window.get(0));
		 driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
			
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
			 
			 String title = driver.getTitle();
			 System.out.println(title);
		 
		
		

	}
	
}
