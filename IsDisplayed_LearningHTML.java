package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_LearningHTML {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/rashe/Downloads/learningHTML1%20(2).html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("121"));
	System.out.println(e1.isDisplayed());
	System.out.println(e1.isEnabled());
		
		
		

	}

}
