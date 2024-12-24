package seleniumassignments1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Links {

	public static void main(String[] args) throws InterruptedException
	{
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	/*	driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		int count=links.size();
		System.out.println(count);
	/*	for(int i=0;i<count;i++)
		{
	         WebElement e4=  links.get(i);
	         `
	       System.out.println(e4.getText());*/
		
		
		
		}
		
	}

}
