package seleniumassignments1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Aito_suggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		
	List<WebElement>	e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	Thread.sleep(2000);
	for(int i=0; i<e2.size();i++)
	{	     
		
		WebElement e3= e2.get(i);
			System.out.println(e3.getText());
	}
;;
	}

}
