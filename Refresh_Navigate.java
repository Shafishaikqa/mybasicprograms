package seleniumassignments1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Navigate {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}