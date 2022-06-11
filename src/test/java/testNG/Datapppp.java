package testNG;

import org.testng.annotations.DataProvider;

public class Datapppp 
{ 
	@DataProvider(name="Test")
	public Object[][] getCredentials()
	{
		return new Object[][] {{"pjpradeep1994@gmail.com","Pkgas@2022"},{"pjpajaysudhar@gmail.com","Pkgas@20222"}};
	}

}
