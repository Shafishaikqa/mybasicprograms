package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Forward_google {

	public static void main(String[] args)
	{
		
		
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		//driver.navigate().forward();
		driver.findElement(By.name("q")).sendKeys("india");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	

}

	private static void sendkeys(Keys enter) {
		// TODO Auto-generated method stub
		
	}
}