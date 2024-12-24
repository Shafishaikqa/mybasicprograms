package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Noavalablerightclick_Sbi {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
        WebElement r1= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
        r1.click();
        WebElement username=driver.findElement(By.name("userName"));
        username.sendKeys("Shukur9999");
       WebElement  password=driver.findElement(By.name("password"));
       password.sendKeys("Gousiya@9999");
       WebElement  captcha=driver.findElement(By.id("loginCaptchaValue"));
       captcha.sendKeys("dr7er");
	}

}
