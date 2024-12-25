package assert_concept;
import org.testng.Assert;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert_Amazon_Shoes
{
	@Test
	public void method1()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement s2=driver.findElement(By.id("twotabsearchtextbox"));
		s2.sendKeys("shoe");
		s2.sendKeys(Keys.ENTER);
		
		List<WebElement> shoes=driver.findElements(By.xpath("a-section aok-relative s-image-tall-aspect"));
		Assert.assertEquals(shoes.size(),71 ,"sorry test case failed");
	
	}
	
	
	
	
	
}
