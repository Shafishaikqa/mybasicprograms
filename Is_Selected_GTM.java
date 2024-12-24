package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_GTM {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
        
		WebElement e1=driver.findElement(By.xpath("//input[@id='vehicle2'][1]"));
	    e1.click();
		boolean b1=e1.isSelected();
		System.out.println(b1);
		
	}

}
