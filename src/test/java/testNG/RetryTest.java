package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest 
{
	  @Test(invocationCount=5)
      public void method1()
  {
	 Assert.assertEquals(true, true);
  }
	  
	  @Test
      public void method2()
      {
    	 Assert.assertEquals(true, true);
      }
}
