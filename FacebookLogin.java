package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin
{


	public static void main(String[] args)
	
	{
		
	ChromeDriver	driver = new ChromeDriver ();
    	driver.get("https://www.facebook.com");
    	driver.manage().window().maximize();
    	WebElement username=driver.findElement(By.id("email"));
    	username.sendKeys("shafilalla008@gmail.com");
    	WebElement password=driver.findElement(By.id("pass"));
    	password.sendKeys("pass");
    	WebElement login=driver.findElement(By.name("login"));
    	login.click();
		

	}
		
		

	

}
