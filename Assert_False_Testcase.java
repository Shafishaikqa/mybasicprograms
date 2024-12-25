package assert_concept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_False_Testcase
{    
	@Test
	public void testcase1()
	{
		Assert.assertFalse(false);
	}

}
