package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();	
	WebElement e1=	driver.findElement(By.id("searchDropdownBox"));
	
	Select s1=new Select(e1);
	s1.selectByIndex(12);
	s1.selectByVisibleText("Books");
	s1.selectByValue("search-alias=stripbooks");
     WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
     
	search.sendKeys("Books");
	search.sendKeys(Keys.ENTER);
	
	
	
	
	}

}
