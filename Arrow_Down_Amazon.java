package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrow_Down_Amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes");
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ENTER);
		

	}

}