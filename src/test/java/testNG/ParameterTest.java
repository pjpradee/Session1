package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest 
{
	
   @DataProvider(name="Test Data1")
	public Object[] getData()
	{
		return new Object[] {"pjpradeep1994@gmail.com","Pjprade@yahoo.com"};
	}
    @Test(dataProvider="EmailPassword",dataProviderClass=DataPro.class)
 public  void  main (String uname,String pass)
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys(uname.toString());
	 driver.findElement(By.id("pass")).sendKeys(pass.toString());
	 driver.findElement(By.name("login")).click();
	 
	 driver.close();
 }
}
