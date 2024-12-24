package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown_Amazon_Powerbook {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();	
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
	for (int i=1;i<=12;i++)
		{  
		     Thread.sleep(500);
		     e1.sendKeys(Keys.ARROW_DOWN);
		}
		
		WebElement book=driver.findElement(By.id("twotabsearchtextbox"));
		book.sendKeys("power of subconsious mind");
		book.sendKeys(Keys.ENTER);
		
		
		
		

	}

}
