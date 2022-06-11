package testNG;

import org.testng.annotations.DataProvider;

public class DataPro 
{
	@DataProvider(name="EmailPassword")
   public Object[][] getCredentials()
   {
	   return new Object[][] {{"pjpradeep@gmail.com","Pradeep123"},{"pjp@yahoo.com","Pjp@1998"}};
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
