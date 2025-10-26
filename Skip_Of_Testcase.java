package IRtryAnalyzer;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_Of_Testcase 
{
  @Test
  public void login()
  {
           Assert.assertTrue(false);
           
  }
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
	
	
	
}
