package assert_concept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals_Truefalse 
{
   @Test
   public void testcase1()
   {
	   Assert.assertEquals(true, false);
   }
	
}
