package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_GTM_Radio {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("male"))  ;
		e1.click();
		boolean b1=e1.isSelected();
		System.out.println(b1);
		
		
		
		
		
	}

}
