package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session2
{
	 @DataProvider(name="TestData")
	 public Object[] getInfo()
	 {
		 return new Object[] {"pjpradeep1994@gmail.com","Pkgas@2022"};
		 
	 }
	 
	@Test (dataProvider="TestData")   
   public void getData(String uname) 
   {       WebDriver driver;
	   WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(uname);
//		driver.findElement(By.id("pass")).sendKeys(pass);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		
//		Thread.sleep(5000);
		driver.close();
   }
}
