package seleniumassignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Copy_Paste_GTM {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();	
	   
	  WebElement fname =driver.findElement(By.id("fname"))	;
	  fname.sendKeys("shafi");
		
	  WebElement lname =driver.findElement(By.id("lname"))	;
		lname.sendKeys("shaik");
		
		 WebElement email =driver.findElement(By.name("email"));
		  email.sendKeys("shafi.ahmed7022@gmail.com");
		 
		WebElement pwd=  driver.findElement(By.name("password"));
		pwd.sendKeys("9493020200");
		
		WebElement gender=driver.findElement(By.id("male"));
		gender.click();
		
		WebElement skills=driver.findElement(By.id("Skills"));
		Select a1= new Select (skills);
		a1.selectByIndex(1);
		
	 WebElement con =driver.findElement(By.id("Country"))	;
	   Select s1 =new Select (con);
	   s1.selectByVisibleText("India");
		
	   WebElement pin =driver.findElement(By.id("Pincode"))	;
	   pin.sendKeys("503230");
	   
	   WebElement rel =driver.findElement(By.id("Relegion"))	;
	   Select r1 =new Select(rel);
	   r1.selectByVisibleText("Muslim");
		
    WebElement presentadd=    driver.findElement(By.id("Present-Address"));
       presentadd.sendKeys(" 8-187, jawahar nagar, balaji nagar ,Hyderabad, Telangana");
       presentadd.sendKeys(Keys.CONTROL+"a");
       presentadd.sendKeys(Keys.CONTROL+"c");
       
       WebElement permanentadd=    driver.findElement(By.id("Permanent-Address"));
       permanentadd.sendKeys(Keys.CONTROL+"v");
       
		WebElement choosefile= driver.findElement(By.id("file"));
		choosefile.sendKeys("C:\\Users\\rashe\\OneDrive\\Documents\\RASHEED DOCS");
		
	WebElement relocate =	driver.findElement(By.xpath("(//input[@id='relocate'])"));
		relocate.click();
		//boolean b1=relocate.isSelected();
		//System.out.println(b1);
		
		WebElement sub=driver.findElement(By.name("Submit"));
		sub.click();
	}

}
