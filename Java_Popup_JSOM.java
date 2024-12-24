package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Popup_JSOM {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/rashe/OneDrive/Documents/learningHTML1%20(1)%20-%20Copy.html");
		//driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		WebElement p2=driver.findElement(By.name("fname"));
		p2.sendKeys("Shafi");
		
		
		
		
		
		
		
	}

}
