package seleniumassignments1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion_Google {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement a1=driver.findElement(By.name("q"));
		a1.sendKeys("india"); 
		Thread.sleep(2000);
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=auto.size();
		System.out.println(count);
		auto.get(9).click();		
	}

}
