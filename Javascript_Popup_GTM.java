package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Popup_GTM {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		WebElement p1= driver.findElement(By.xpath("//button[.='Click ']"));
		p1.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//to accept the java script pop up
		//p1.click();		
		

	}

}
