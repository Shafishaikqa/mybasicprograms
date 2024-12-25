package assert_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assert 
{
	WebDriver driver;
	@Test(dataProvider="data1")
    public void login_to_facebook(String username,String password) throws InterruptedException
    {
        driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement a1=	driver.findElement(By.name("email"));
	a1.sendKeys(username);
	WebElement a2=	driver.findElement(By.xpath("//input[@name='pass']"));
	a2.sendKeys(password);
	WebElement a3=	driver.findElement(By.name("login"));
	a3.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	}
		
		
		@DataProvider(name="data1")
		public Object[][] method3()
		
		{
			Object data[][]= new Object[2] [2];
		//1st set of data
		data[0][0]="shafilalla008@gmail.com";//right un
		data[0][1]="9493020200shafi";//right pwd
		//2ndset of data
		data[1][0]="shafilalla008@gmail.com";//right un
		data[1][1]="9493020200";//wrong pwd
		
		return data;
	
	
		}
	
	
	
	
}
