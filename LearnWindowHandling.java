package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get("https://www.leafground.com/window.xhtml");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 driver.findElement(By.xpath("//span[text()='Open']")).click();
			 Set<String> windowHandle = driver.getWindowHandles();
			 List<String>window=new ArrayList<String>(windowHandle);
			 driver.switchTo().window(window.get(1));
			 System.out.println(driver.getTitle());
			 driver.close();
			driver.switchTo().window(window.get(0));
		    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
			 Set<String> windowsHandle1 = driver.getWindowHandles();
		     System.out.println("No of windows opened:"+windowsHandle1.size());
			 List<String>window1=new ArrayList<String>(windowsHandle1);
			 driver.switchTo().window(window1.get(1));
			 System.out.println(driver.getTitle());
			 driver.close();
		     driver.switchTo().window(window1.get(2));
		     System.out.println(driver.getTitle());
			 driver.close();
			driver.switchTo().window(window1.get(0));
			 System.out.println(driver.getTitle());
			 
			 
		driver.findElement(By.xpath("//span[text()='Close Windows')]")).click();
			 Set<String> windowHandle2 = driver.getWindowHandles();
			System.out.println("No of windows opened:"+windowHandle2.size());
			 List<String>window2=new ArrayList<String>(windowHandle2);
			 driver.switchTo().window(window2.get(1));
			 System.out.println(driver.getTitle());
			 driver.close();
			 driver.switchTo().window(window2.get(2));
			 System.out.println(driver.getTitle());
			 driver.close();
			 driver.switchTo().window(window2.get(3));
			 System.out.println(driver.getTitle());
			 driver.close();
			 driver.switchTo().window(window2.get(0));
			 
			driver.findElement(By.xpath("//span[text()='Open with delay')]")).click();
			 Set<String> windowHandle3 = driver.getWindowHandles();
			 System.out.println("No of windows opened:"+windowHandle3.size());
			 List<String>window3=new ArrayList<String>(windowHandle3);
			 driver.switchTo().window(window3.get(1));
			 System.out.println(driver.getTitle());
			 driver.close();
			 driver.switchTo().window(window3.get(2));
			 System.out.println(driver.getTitle());
			 driver.close();
			 driver.switchTo().window(window3.get(0));
			 System.out.println(driver.getTitle());
		 driver.quit();
			 

	}

}
