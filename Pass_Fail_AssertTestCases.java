package IRtryAnalyzer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pass_Fail_AssertTestCases
{
       @Test
       public void testcase1()
       {
    	 //  Assert.assertTrue(true);
    	  // Assert.assertTrue(false);
    	 //  Assert.assertFalse(false);
    	 //  Assert.assertFalse(true);
    	//   Assert.assertEquals(false, false);
    	  // Assert.assertEquals(true, false);
    	 //  Assert.assertEquals(1, 0);
    	   Assert.assertEquals(false, true, "sorry but please try again");
    	   
       }
	
	
	
}
