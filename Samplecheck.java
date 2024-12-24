package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Samplecheck {

	public static void main(String[] args) 
	{     
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();		
		/* WebElement f1= driver.findElement(By.xpath("//span[.='Hello, sign in']"));
    	 Actions a1= new Actions(driver);
    	 a1.moveToElement(f1).perform();
    	WebElement m1= driver.findElement(By.xpath("//span[.='Your Wish List']"));
    	m1.click();*/
		/*WebElement r1=driver.findElement(By.id("nav-orders"));
		r1.click();*/
	/*	WebElement l1=	driver.findElement(By.id("icp-nav-flyout"));
		    Select s1=new Select(l1);
		    s1.selectByVisibleText("ಕನ್ನಡ");
		   /* WebElement e1=driver.findElement(By.linkText("ಕನ್ನಡ"));
		    e1.click();*/
		/* WebElement d1=driver.findElement(By.linkText("Best Sellers"));
    	 d1.click();*/
		/* WebElement l1=	driver.findElement(By.id("icp-nav-flyout"));
	      Actions a1= new Actions(driver)  ;
	      a1.moveToElement(l1).perform();
	     WebElement k1= driver.findElement(By.xpath("//span[.='తెలుగు']"));
	     k1.click();*/
		WebElement e1= driver.findElement(By.id("searchDropdownBox"));
    	Select s1=new Select(e1);
    	s1.selectByVisibleText("Books");
    	WebElement d1=driver.findElement(By.id("nav-search-submit-button"));
    	d1.sendKeys("Books");
    	d1.click();

	}

}
