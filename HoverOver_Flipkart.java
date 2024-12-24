package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Flipkart {

	public static void main(String[] args)
    {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();		
		
		WebElement login=driver.findElement(By.xpath("(//a[@class='_1TOQfO'])[1]"));
		
		Actions a1= new Actions(driver);
		a1.moveToElement(login).perform();	
		
	WebElement p1=	driver.findElement(By.xpath("(//a[@class='yx2hEq'])[1]"));
		
		p1.sendKeys(Keys.ENTER);
		
		

	}

}
