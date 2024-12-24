package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_Gmail {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		WebElement gmail_link= driver.findElement(By.linkText("Gmail"));
	Actions a1 = new Actions (driver);
     
	a1.doubleClick(gmail_link).perform();
;		
		Thread.sleep(2000);
		
		
		

	}

}
