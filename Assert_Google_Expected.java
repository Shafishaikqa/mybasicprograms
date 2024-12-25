package assert_concept;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert_Google_Expected
{
	   @Test
	   public void testcase1()
	   {
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		WebElement s1=   driver.findElement(By.name("q"));
		   s1.sendKeys("India"+Keys.ENTER);
		  
		   Assert.assertEquals(driver.getTitle(),"SRK - Google Search","Sorry please try again");
		  
	   
	   }

	
}
