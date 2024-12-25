package assert_concept;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assert_Amazon_Displaysearch{
     @Test
     public void testcase1()
     {

	 ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    WebElement accountandlist=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement signin=driver.findElement(By.linkText("Sign in"));
     signin.click();
	
     }
	
	
}
